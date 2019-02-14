package com.ctgstw.logisticsmic.common.utils;

import java.util.UUID;

public class UuidUtil {
    public static String getUUid() {
        String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");
        return uuid;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(UuidUtil.getUUid());
        }

    }
}
