package com.ctgstw.logisticsmic.entity.po;

import java.math.BigDecimal;

public class LogisticsWaybillGoods {
    private Integer id;

    private Integer waybillId;

    private String goodsName;

    private BigDecimal goodsAccount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(Integer waybillId) {
        this.waybillId = waybillId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public BigDecimal getGoodsAccount() {
        return goodsAccount;
    }

    public void setGoodsAccount(BigDecimal goodsAccount) {
        this.goodsAccount = goodsAccount;
    }
}