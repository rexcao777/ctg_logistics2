package com.ctgstw.logisticsmic.common.enums;

/**
 * 功能:账号状态
 * 创建日期:2018/12/18-17:26
 * 创建人:薛陈
 */
public enum UserStatusEnum {
    NORMAL((byte) 1, "账号正常");

    // 成员变量
    private Byte status;
    private String description;

    // 构造方法
    UserStatusEnum(Byte status, String description) {
        this.status = status;
        this.description = description;
    }

    public Byte getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }
}
