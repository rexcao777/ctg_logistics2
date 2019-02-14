package com.ctgstw.logisticsmic.common.enums;

/**
 * 功能:
 * 创建日期:2018/7/12-16:24
 * 创建人:薛陈
 */
public enum CompanyIndustryEnum {
    MANUFACTURER("MANUFACTURER", "制造商"), AGENCY("AGENCY", "经销商"), AUTO4S("AUTO4S", "4S店"),
    REPAIRSHOP("REPAIRSHOP", "修理厂"), INSURANCE("INSURANCE", "保险业"), LOGISTICS("LOGISTICS", "物流业"),
    MALLIANCE("MALLIANCE", "制造商联盟"), AALLIANCE("AALLIANCE", "经销商联盟"),
    CAR_DISMANTLING("CAR_DISMANTLING", "拆车件");
    // 成员变量
    private String name;
    private String description;

    // 构造方法
    CompanyIndustryEnum(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // get set 方法
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public static String getChineseNameByEnglish(String englishName) {
        switch (englishName) {
            case "MANUFACTURER":
                return MANUFACTURER.getDescription();

            case "AGENCY":
                return AGENCY.getDescription();

            case "AUTO4S":
                return AUTO4S.getDescription();

            case "REPAIRSHOP":
                return REPAIRSHOP.getDescription();

            case "INSURANCE":
                return INSURANCE.getDescription();

            case "LOGISTICS":
                return LOGISTICS.getDescription();

            case "MALLIANCE":
                return MALLIANCE.getDescription();

            case "AALLIANCE":
                return AALLIANCE.getDescription();

            case "CAR_DISMANTLING":
                return CAR_DISMANTLING.getDescription();

            default:
                return MANUFACTURER.getDescription();

        }
    }
}
