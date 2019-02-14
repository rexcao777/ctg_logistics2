package com.ctgstw.logisticsmic.common.utils;

import com.ctgstw.logisticsmic.common.constant.Const;
import com.ctgstw.logisticsmic.common.entity.UserLoginStateBean;
import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 功能:
 * 创建日期:2019/1/29-15:21
 * 创建人:薛陈
 */
public class RedisUtil {

    public static void handleUserLoginInfoToRedis(String platform, Integer userID, Integer companyID, String token) {
        handleAccountRepeatLogin(platform, userID);
        String userIDKey = Const.REDIS_USERID_PREFIX + userID + "_" + platform;
        String userLogkey = Const.REDIS_USERLOG_PREFIX + userID + "_" + platform;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String loginTime = dateFormat.format(new Date());
        String endTime = loginTime;
        UserLoginStateBean userStateBean = new UserLoginStateBean();
        userStateBean.setLoginTime(loginTime);
        userStateBean.setEndTime(endTime);
        com.ctgstw.logisticsmic.config.RedisConfig.leftPushToList(userLogkey, userStateBean);
        com.ctgstw.logisticsmic.config.RedisConfig.setEx(userIDKey, token, Const.REDIS_SESSION_EXTIME);
        com.ctgstw.logisticsmic.config.RedisConfig.setEx(token, "1", Const.REDIS_SESSION_EXTIME);
        if (companyID != null) {
            com.ctgstw.logisticsmic.config.RedisConfig.setForHash(Const.REDIS_COMPANYID_PREFIX + companyID, userIDKey, token);
        }
    }

    private static void handleAccountRepeatLogin(String platform, int userID) {
        String userKey;
        userKey = Const.REDIS_USERID_PREFIX + userID + "_" + platform;
        String token = com.ctgstw.logisticsmic.config.RedisConfig.get(userKey);
        if (StringUtils.isBlank(token)) {
            return;
        }
        String userState = com.ctgstw.logisticsmic.config.RedisConfig.get(token);
        if (StringUtils.isBlank(userState)) {
            return;
        }
        com.ctgstw.logisticsmic.config.RedisConfig.setAndExpire(token, "-1");
    }
}
