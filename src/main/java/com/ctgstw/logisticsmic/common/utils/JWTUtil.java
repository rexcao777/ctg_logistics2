package com.ctgstw.logisticsmic.common.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.ctgstw.urmmicro.common.constant.Const;
import com.ctgstw.urmmicro.common.entity.TokenInfo;
import com.ctgstw.urmmicro.config.RedisConfig;
import com.ctgstw.urmmicro.entity.po.SysHMAC256;
import com.ctgstw.urmmicro.entity.po.SysHMAC256Example;
import com.ctgstw.urmmicro.mapper.SysHMAC256Mapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

/**
 * @Author: 黄方健
 * @Description:
 * @Date: 创建于 2018/6/15 下午7:01
 */
@Component
@Slf4j
public class JWTUtil {

    private SysHMAC256Mapper sysHMAC256Mapper;

    @Autowired
    public JWTUtil(SysHMAC256Mapper sysHMAC256Mapper) {
        this.sysHMAC256Mapper = sysHMAC256Mapper;
    }

    private static JWTUtil jwtUtil;

    @PostConstruct
    public void init() {
        jwtUtil = this;
        jwtUtil.sysHMAC256Mapper = this.sysHMAC256Mapper;
    }

    public static boolean verify(String token) {
        try {
            String sec;
            DecodedJWT jwt = JWT.decode(token);
            List<String> audienceList = jwt.getAudience();
            String aud;
            if (audienceList != null && audienceList.size() > 0) {
                aud = audienceList.get(0);
            } else {
                return false;
            }
            String redisKey = Const.REDIS_CTGSECRET_PREFIX + aud;
            String encodeAppkey = RedisConfig.get(redisKey);
            if (StringUtils.isNotBlank(encodeAppkey)) {
                sec = CtgUtil.decodeAppkey(encodeAppkey);
            } else {
                //万一redis中没有，则去数据库中取
                SysHMAC256Example example = new SysHMAC256Example();
                SysHMAC256Example.Criteria criteria = example.createCriteria();
                criteria.andTargetEqualTo(aud);
                List<SysHMAC256> sysHMAC256s = jwtUtil.sysHMAC256Mapper.selectByExample(example);
                if (sysHMAC256s != null && sysHMAC256s.size() > 0) {
                    sec = sysHMAC256s.get(0).getAppkey();
                } else {
                    return false;
                }
            }
            Algorithm algorithm = Algorithm.HMAC256(sec);
            JWTVerifier verifier = JWT.require(algorithm)
                    .withIssuer("urm.ctgoe.com")
                    .build();
            DecodedJWT verifyJWT = verifier.verify(token);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    /**
     * 获得token中的信息无需secret解密也能获得
     *
     * @return token中包含的用户名
     */
    public static String getUsername(String token) {
        try {
            DecodedJWT jwt = JWT.decode(token);
            return jwt.getClaim("username").asString();
        } catch (JWTDecodeException e) {
            return null;
        }
    }

    /**
     * 获得token中的信息无需secret解密也能获得
     *
     * @return token中包含的用户真实姓名
     */
    public static String getRealName(String token) {
        try {
            DecodedJWT jwt = JWT.decode(token);
            return jwt.getClaim("realName").asString();
        } catch (JWTDecodeException e) {
            return null;
        }
    }

    /**
     * 获得token中的信息无需secret解密也能获得
     *
     * @return token中包含的用户ID
     */
    public static Integer getUserID(String token) {
        try {
            DecodedJWT jwt = JWT.decode(token);
            return jwt.getClaim("userID").asInt();
        } catch (JWTDecodeException e) {
            return null;
        }
    }

    /**
     * 获得token中的信息无需secret解密也能获得
     *
     * @return token中包含的公司ID
     */
    public static String getPlatform(String token) {
        try {
            DecodedJWT jwt = JWT.decode(token);
            List<String> audienceList = jwt.getAudience();
            String aud = "";
            if (audienceList != null && audienceList.size() > 0) {
                aud = audienceList.get(0);
            } else {
                return null;
            }
            return aud;
        } catch (JWTDecodeException e) {
            return null;
        }
    }

    public static Integer getCompanyID(String token) {
        try {
            DecodedJWT jwt = JWT.decode(token);
            return jwt.getClaim("companyID").asInt();
        } catch (JWTDecodeException e) {
            return null;
        }
    }

    public static TokenInfo getTokenInfo(String token) {
        try {
            DecodedJWT jwt = JWT.decode(token);
            TokenInfo tokenInfo = new TokenInfo();
            Integer companyID = jwt.getClaim("companyID").asInt();
            Integer userID = jwt.getClaim("userID").asInt();
            String realName = jwt.getClaim("realName").asString();
            String cellPhone = jwt.getClaim("username").asString();
            String platform = jwt.getClaim("platform").asString();
            tokenInfo.setPlatform(platform);
            tokenInfo.setUserId(userID);
            tokenInfo.setRealName(realName);
            tokenInfo.setTelephone(cellPhone);
            return tokenInfo;
        } catch (JWTDecodeException e) {
            log.info(e.getMessage());
            return null;
        }
    }

    public static String getTokenFromRequest(HttpServletRequest request) {
        String jwtToken = request.getHeader("Authorization");
        if (StringUtils.startsWithIgnoreCase(jwtToken, "Bearer")) {
            if (jwtToken.length() > 7) {
                jwtToken = jwtToken.substring(7);
            }
        }
        if (StringUtils.isBlank(jwtToken)) {
            jwtToken = request.getHeader("token");
        }
        return jwtToken;
    }

    public static String createToken(TokenInfo tokenInfo) {
        try {
            String secret = tokenInfo.getSecret();
            String platform = tokenInfo.getPlatform();
            String cellPhone = tokenInfo.getTelephone();
            Integer userID = tokenInfo.getUserId();
            String realName = tokenInfo.getRealName();
            Algorithm algorithm = Algorithm.HMAC256(secret);
            return JWT.create()
                    .withIssuer("urm.ctgoe.com")
                    .withIssuedAt(new Date())
                    .withAudience(platform)
                    .withClaim("username", cellPhone)
                    .withClaim("userID", userID)
                    .withClaim("realName", realName)
                    .withClaim("platform", platform)
                    .sign(algorithm);
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJDVEdfV0VCIiwicmVhbE5hbWUiOiLpu4TmiL_pl7QiLCJpc3MiOiJ3d3cuY3Rnb2UuY29tIiwiaWF0IjoxNTM2MjE2NTU0LCJ1c2VySUQiOjEsInVzZXJuYW1lIjoiMTM1ODQxODgzMjYifQ.7OUGSUJ4Qz12IGVo6T8blWFTU1uGWulcOctN8u61dVw";
        DecodedJWT jwt = JWT.decode(token);
        List<String> audienceList = jwt.getAudience();
        String aud = "";
        String sec = "ctgStw_turtleQdbijHc9762pz!HELLO88";
        if (audienceList != null && audienceList.size() > 0) {
            aud = audienceList.get(0);
        } else {
            return;
        }
        Algorithm algorithm = Algorithm.HMAC256(sec);
        JWTVerifier verifier = JWT.require(algorithm)
                .withIssuer("www.ctgoe.com")
                .build();
        System.out.println(true);
    }

}
