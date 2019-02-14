package com.ctgstw.logisticsmic.common.utils;

import org.apache.shiro.crypto.hash.SimpleHash;

/**
 * 功能:
 * 创建日期:2018/12/18-17:02
 * 创建人:薛陈
 */
public class ShiroUtil {

    //根据用户名和明文密码生成密文密码
    public static String encryptPassword(String userName, String password) {
        SimpleHash simpleHash = new SimpleHash("MD5", password, userName, 2);
        String encryptedPassword = simpleHash.toHex();
        return encryptedPassword;
    }
}
