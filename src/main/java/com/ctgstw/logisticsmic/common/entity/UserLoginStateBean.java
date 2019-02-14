package com.ctgstw.logisticsmic.common.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: 黄方健
 * @Description:
 * @Date: 创建于 2018/9/6 下午11:06
 */
@Data
public class UserLoginStateBean implements Serializable {

    private String loginTime;

    private String endTime;

}
