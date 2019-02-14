package com.ctgstw.logisticsmic.common.entity;

import lombok.Data;

/**
 * @Author: 黄方健
 * @Description:
 * @Date: 创建于 2018/9/6 下午3:18
 */
@Data
public class TokenInfo {

    private Integer userId;

    private String realName;

    private String telephone;

    private String platform;

    private String secret;

    private Integer companyId;
}
