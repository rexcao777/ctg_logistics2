package com.ctgstw.logisticsmic.entity.po;

import java.util.Date;

public class LogisticsWaybillNumberUse {
    private Integer id;

    private Integer companyId;

    private Integer hadUseNumber;

    private Date useDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getHadUseNumber() {
        return hadUseNumber;
    }

    public void setHadUseNumber(Integer hadUseNumber) {
        this.hadUseNumber = hadUseNumber;
    }

    public Date getUseDate() {
        return useDate;
    }

    public void setUseDate(Date useDate) {
        this.useDate = useDate;
    }
}