package com.ctgstw.logisticsmic.entity.po;

import java.util.Date;

public class LogisticsWaybillHeadSet {
    private Integer id;

    private String preSet;

    private Date createTime;

    private Integer companyId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPreSet() {
        return preSet;
    }

    public void setPreSet(String preSet) {
        this.preSet = preSet == null ? null : preSet.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
}