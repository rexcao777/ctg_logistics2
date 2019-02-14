package com.ctgstw.logisticsmic.common.enums;

/**
 * 功能:
 * 创建日期:2018/8/30-16:49
 * 创建人:薛陈
 */
public enum ChatGroupUsageTypeEnum {
    CLIENT_LINKMAN(1, "商友/外部联系人"), CLIENT_COMPANY(2, "企业客户");
    // 成员变量
    private Integer code;
    private String description;

    // 构造方法
    ChatGroupUsageTypeEnum(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    // get set 方法
    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
