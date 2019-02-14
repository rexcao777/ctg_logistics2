package com.ctgstw.logisticsmic.common.enums;

/**
 * 功能:
 * 创建日期:2019/1/29-15:28
 * 创建人:薛陈
 */
public enum PlatformKeyEnum {
    URM("ctgStw_dragon@d4a1ccc71ER45GHHdcfdf2", "CTG_URM"), MANUFACTURER("ctgStw_dog7782UURMK537%^@HQPKD*esc", "CTG_MAKER");

    // 成员变量
    private String key;
    private String platform;

    // 构造方法
    PlatformKeyEnum(String key, String platform) {
        this.key = key;
        this.platform = platform;
    }

    public String getKey() {
        return key;
    }

    public String getPlatform() {
        return platform;
    }
}
