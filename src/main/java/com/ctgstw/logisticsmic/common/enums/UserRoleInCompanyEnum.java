package com.ctgstw.logisticsmic.common.enums;

/**
 * 功能: 员工在企业中到底是创建者还是加入者 目前之分这两种情况 后续如果有详细的权限划分 可以重新设计
 * 创建日期:2019/1/10-14:08
 * 创建人:薛陈
 */
public enum UserRoleInCompanyEnum {
    COMPANY_CREATOR("company_creator", "企业创建者"), COMPANY_MEMBER("company_member", "企业加入者");

    // 成员变量
    private String roleName;
    private String description;

    // 构造方法
    UserRoleInCompanyEnum(String roleName, String description) {
        this.roleName = roleName;
        this.description = description;
    }

    public String getRoleName() {
        return roleName;
    }

    public String getDescription() {
        return description;
    }
}
