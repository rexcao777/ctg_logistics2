package com.ctgstw.logisticsmic.common.enums;

/**
 * 功能: 短信验证码
 * 创建日期:2018/12/19-14:26
 * 创建人:薛陈
 */
public enum SmsCodeEnum {
    REGISTER("1", "注册使用"), PASSWORD_FORGET("2", "忘记密码"), INVITE_REGISTER("4", "邀请注册"), INVITE_JOIN_COMPANY("5", "邀请创建或加入企业"),
    INVITE_JOIN_ALLIANCE("6", "邀请加入联盟");

    // 成员变量
    private String status;
    private String description;

    // 构造方法
    SmsCodeEnum(String status, String description) {
        this.status = status;
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }
}
