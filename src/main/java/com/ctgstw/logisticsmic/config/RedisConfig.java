package com.ctgstw.logisticsmic.config;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.*;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @Author: 黄方健
 * @Description:
 * @Date: 创建于 2018/6/19 上午10:32
 */
@Component
@Slf4j
public class RedisConfig {

    private StringRedisTemplate stringRedisTemplate;

    private RedisTemplate redisTemplate;

    @Autowired
    public RedisConfig(StringRedisTemplate stringRedisTemplate, RedisTemplate redisTemplate) {
        Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        objectMapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        jackson2JsonRedisSerializer.setObjectMapper(objectMapper);
        // 设置value的序列化规则和 key的序列化规则
        redisTemplate.setValueSerializer(jackson2JsonRedisSerializer);
        redisTemplate.setHashKeySerializer(jackson2JsonRedisSerializer);
        redisTemplate.setHashValueSerializer(jackson2JsonRedisSerializer);
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.afterPropertiesSet();
        this.stringRedisTemplate = stringRedisTemplate;
        this.redisTemplate = redisTemplate;
    }

    private static RedisConfig redisUtil;

    @PostConstruct
    public void init() {
        redisUtil = this;
        redisUtil.stringRedisTemplate = this.stringRedisTemplate;
        redisUtil.redisTemplate = this.redisTemplate;
    }

    /**
     * 设置key的有效期，单位是秒
     *
     * @param key
     * @param exTime
     * @return
     */
    public static Boolean expire(String key, int exTime) {
        boolean result = false;
        try {
            result = redisUtil.stringRedisTemplate.expire(key, exTime, TimeUnit.SECONDS);
        } catch (Exception e) {
            log.error("写入redis缓存失败！错误信息为：" + e.getMessage());
        }
        return result;

    }

    /**
     * 设置key的有效期，单位是小时
     *
     * @param key
     * @param timeout
     */
    public static void setExpireHour(String key, long timeout) {
        try {
            redisUtil.redisTemplate.expire(key, timeout, TimeUnit.HOURS);
        } catch (Exception e) {
            log.error("redis设置key过期时间(单位:小时)失败" + e.getMessage());
        }
    }

    /**
     * 设置key的有效期，单位是秒
     *
     * @param key
     * @param timeout
     */
    public static void setExpireSeconds(String key, long timeout) {
        try {
            redisUtil.redisTemplate.expire(key, timeout, TimeUnit.SECONDS);
        } catch (Exception e) {
            log.error("redis设置key过期时间(单位:秒)失败" + e.getMessage());
        }
    }


    //exTime的单位是秒
    public static void setEx(String key, String value, int exTime) {
        try {
            ValueOperations<String, String> operations = redisUtil.stringRedisTemplate.opsForValue();
            operations.set(key, value, exTime, TimeUnit.SECONDS);
        } catch (Exception e) {
            log.error("setex key:{} value:{} , error", key, value, e);
        }
    }

    public static void set(String key, String value) {
        try {
            ValueOperations<String, String> operations = redisUtil.stringRedisTemplate.opsForValue();
            operations.set(key, value);
        } catch (Exception e) {
            log.error("set key:{} value:{} , error", key, value, e);
        }
    }

    public static void setAndExpire(String key, String value) {
        try {
            Long expire = redisUtil.stringRedisTemplate.getExpire(key);
            ValueOperations<String, String> operations = redisUtil.stringRedisTemplate.opsForValue();
            operations.set(key, value, expire, TimeUnit.SECONDS);
        } catch (Exception e) {
            log.error("set key:{} value:{} , error", key, value, e);
        }
    }

    public static String get(String key) {
        String result = "";
        try {
            ValueOperations<String, String> operations = redisUtil.stringRedisTemplate.opsForValue();
            result = operations.get(key);
        } catch (Exception e) {
            log.error("get key:{} , error", key, e);
        }
        return result;
    }


    public static boolean exists(String key) {
        boolean result = false;
        try {
            result = redisUtil.stringRedisTemplate.hasKey(key);
        } catch (Exception e) {
            log.error("判断redis缓存中是否有对应的key失败！错误信息为：" + e.getMessage());
        }
        return result;
    }

    public static Set<String> getKeysStartWith(String startStr) {
        Set<String> keys = null;
        try {
            keys = redisUtil.redisTemplate.keys(startStr + "*");
        } catch (Exception e) {
            log.error("getKeysStartWith , error", e);
        }
        return keys;
    }

    public static Set<String> getKeysEndWith(String endStr) {
        Set<String> keys = null;
        try {
            keys = redisUtil.redisTemplate.keys("*" + endStr);
        } catch (Exception e) {
            log.error("getKeysEndWith , error", e);
        }
        return keys;
    }

    public static Set<String> getKeysWithStartAndEnd(String start, String end) {
        Set<String> keys = null;
        try {
            keys = redisUtil.redisTemplate.keys(start + "*" + end);
        } catch (Exception e) {
            log.error("getKeysEndWith , error", e);
        }
        return keys;
    }

    public static boolean delete(String key) {
        boolean result = false;
        try {
            if (exists(key)) {
                redisUtil.stringRedisTemplate.delete(key);
            }
            result = true;
        } catch (Exception e) {
            log.error("redis根据key删除对应的value失败！错误信息为：" + e.getMessage());
        }
        return result;
    }

//    public static boolean delForRedisTemplate(String key){
//        boolean result = false;
//        try {
//            Boolean aBoolean = redisUtil.redisTemplate.hasKey(key);
//            if(aBoolean){
//                redisUtil.redisTemplate.delete(key);
//            }
//            result = true;
//        } catch (Exception e) {
//            log.error("redis根据key删除对应的value失败！错误信息为：" + e.getMessage());
//        }
//        return result;
//    }

    public static void setForHash(String key, String hashKey, Object value) {
        try {
            HashOperations<Object, Object, Object> hashOperations = redisUtil.redisTemplate.opsForHash();
            hashOperations.put(key, hashKey, value);
        } catch (Exception e) {
            log.error("setForHash出错， key:{} hashKey:{} value:{} , error", key, hashKey, value, e);
        }
    }

    public static void putAll(String key, Map map) {
        try {
            HashOperations<Object, Object, Object> hashOperations = redisUtil.redisTemplate.opsForHash();
            hashOperations.putAll(key, map);
        } catch (Exception e) {
            log.error("setForHashMap出错,error", e);
        }
    }

    public static String getHashValue(String key, String hashKey) {
        try {
            HashOperations<Object, Object, Object> hashOperations = redisUtil.redisTemplate.opsForHash();
            Object o = hashOperations.get(key, hashKey);
            if (o != null) {
                return JSON.toJSONString(o);
            }
            return null;
        } catch (Exception e) {
            log.error("getHashValue 出错,error", e);
        }
        return null;
    }

    /**
     * 同时获取Hash集合中的多个值
     *
     * @param key
     * @param hashKeys
     * @return
     */
    public static List<Object> multiGet(String key, List<Object> hashKeys) {
        try {
            HashOperations<Object, Object, Object> hashOperations = redisUtil.redisTemplate.opsForHash();
            List<Object> objects = hashOperations.multiGet(key, hashKeys);
            return objects;
        } catch (Exception e) {
            log.error("multiGet 出错,error", e);
        }
        return null;
    }

    public static Map<Object, Object> getEntries(String key) {
        try {
            HashOperations<Object, Object, Object> hashOperations = redisUtil.redisTemplate.opsForHash();
            Map<Object, Object> entries = hashOperations.entries(key);
            return entries;
        } catch (Exception e) {
            log.error("getEntries 出错,error", e);
        }
        return null;
    }

    public static Boolean hasKey(String key, String hashKey) {
        Boolean result = false;
        try {
            HashOperations<Object, Object, Object> hashOperations = redisUtil.redisTemplate.opsForHash();
            result = hashOperations.hasKey(key, hashKey);
        } catch (Exception e) {
            log.error("getHashValue 出错,error", e);
        }
        return result;
    }

    public static Set<Object> hashKeys(String key) {
        Set<Object> keys = null;
        try {
            HashOperations<Object, Object, Object> hashOperations = redisUtil.redisTemplate.opsForHash();
            keys = hashOperations.keys(key);
        } catch (Exception e) {
            log.error("getHashValue 出错,error", e);
        }
        return keys;
    }


    public static Long delHashValue(String key, String hashKey) {
        Long delete = 0L;
        try {
            HashOperations<Object, Object, Object> hashOperations = redisUtil.redisTemplate.opsForHash();
            delete = hashOperations.delete(key, hashKey);
        } catch (Exception e) {
            log.error("getHashValue 出错,error", e);
        }
        return delete;
    }

    public static Long leftPushToList(String key, Object object) {
        Long num = 0L;
        try {
            ListOperations listOperations = redisUtil.redisTemplate.opsForList();
            num = listOperations.leftPush(key, object);
        } catch (Exception e) {
            log.error("addValueToList 出错,error", e);
        }
        return num;
    }

    public static Long leftPushAllToList(String key, Collection collection) {
        Long num = 0L;
        try {
            ListOperations listOperations = redisUtil.redisTemplate.opsForList();
            num = listOperations.leftPushAll(key, collection);
        } catch (Exception e) {
            log.error("setForList 出错,error", e);
        }
        return num;
    }

    public static Object leftPop(String key) {
        Object o = null;
        try {
            ListOperations listOperations = redisUtil.redisTemplate.opsForList();
            o = listOperations.leftPop(key);
        } catch (Exception e) {
            log.error("addValueToList 出错,error", e);
        }
        return o;
    }

    public static String getValueFromList(String key, int index) {
        String result = "";
        try {
            ListOperations listOperations = redisUtil.redisTemplate.opsForList();
            Object value = listOperations.index(key, index);
            result = JSON.toJSONString(value);
        } catch (Exception e) {
            log.error("getValueFromList 出错,error", e);
        }
        return result;
    }

    public static String getList(String key) {
        String result = "";
        try {
            ListOperations listOperations = redisUtil.redisTemplate.opsForList();
            Long size = listOperations.size(key);
            Object value = listOperations.range(key, 0, size);
            result = JSON.toJSONString(value);
        } catch (Exception e) {
            log.error("getList 出错,error", e);
        }
        return result;
    }


    //统一用上面的三个,下面的三个暂不开放


    /**
     * @param key
     * @param hashKey
     * @param value
     */
//    public static void setForStringHash(String key,String hashKey,String value){
//        try {
//            HashOperations<String, Object, Object> opsForHash = redisUtil.stringRedisTemplate.opsForHash();
//            opsForHash.put(key,hashKey,value);
//        } catch (Exception e) {
//            log.error("setForStringHash出错， key:{} hashKey:{} value:{} , error",key,hashKey,value,e);
//        }
//    }
//
//    public static <K, V> void setForStringHashMap(String key,Map<K,V> map){
//        try {
//            HashOperations<String, K, V> opsForHash = redisUtil.stringRedisTemplate.opsForHash();
//            opsForHash.putAll(key,map);
//        } catch (Exception e) {
//            log.error("setMapForStringHash出错, error",key,e);
//        }
//    }
//
//    public static String getStringHashValue(String key,String hashKey){
//        try {
//            HashOperations<String, Object, Object> hashOperations = redisUtil.stringRedisTemplate.opsForHash();
//            Object o = hashOperations.get(key, hashKey);
//            return JSON.toJSONString(o);
//        } catch (Exception e) {
//            log.error("getStringHashValue 出错,error",e);
//        }
//        return null;
//    }

}
