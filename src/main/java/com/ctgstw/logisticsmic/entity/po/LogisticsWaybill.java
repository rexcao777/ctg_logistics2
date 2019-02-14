package com.ctgstw.logisticsmic.entity.po;

import java.math.BigDecimal;
import java.util.Date;

public class LogisticsWaybill {
    private Integer id;

    private Integer logisticsCompanyId;

    private String waybillNumber;

    private String sendCompanyName;

    private Integer sendCompanyId;

    private Integer sendCustomerId;

    private String sendName;

    private Integer sendConId;

    private String sendPhone;

    private String sendProvince;

    private String sendCity;

    private String sendDistrict;

    private String sendDetailaddress;

    private Integer sendDelId;

    private String receiveCompanyName;

    private Integer receiveCompanyId;

    private Integer receiveCustomerId;

    private String receiveName;

    private Integer receiveConId;

    private String receivePhone;

    private String receiveProvince;

    private String receiveCity;

    private String receiveDistrict;

    private String receiveDetailaddress;

    private Integer receiveDelId;

    private Integer routeId;

    private Integer frequencyId;

    private Integer driverId;

    private BigDecimal insteadGoodsPayment;

    private BigDecimal insteadServiceCharge;

    private BigDecimal doorGetPayment;

    private String doorGetTime;

    private BigDecimal goodsStatementValue;

    private BigDecimal insuranceCharge;

    private BigDecimal packingCharge;

    private BigDecimal otherCharge;

    private BigDecimal totalAccount;

    private BigDecimal freightCharge;

    private BigDecimal serviceCharge;

    private BigDecimal totalCharge;

    private Integer paymentType;

    private Date createTime;

    private String isCheck;

    private String isNoUse;

    private BigDecimal actualGet;

    private String isEBusiness;

    private String driverRemark;

    private BigDecimal actualInsteadGet;

    private String isBalance;

    private String isBalanceInstead;

    private String isGiveOut;

    private Integer operatorId;

    private String logisticsCompanyName;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLogisticsCompanyId() {
        return logisticsCompanyId;
    }

    public void setLogisticsCompanyId(Integer logisticsCompanyId) {
        this.logisticsCompanyId = logisticsCompanyId;
    }

    public String getWaybillNumber() {
        return waybillNumber;
    }

    public void setWaybillNumber(String waybillNumber) {
        this.waybillNumber = waybillNumber == null ? null : waybillNumber.trim();
    }

    public String getSendCompanyName() {
        return sendCompanyName;
    }

    public void setSendCompanyName(String sendCompanyName) {
        this.sendCompanyName = sendCompanyName == null ? null : sendCompanyName.trim();
    }

    public Integer getSendCompanyId() {
        return sendCompanyId;
    }

    public void setSendCompanyId(Integer sendCompanyId) {
        this.sendCompanyId = sendCompanyId;
    }

    public Integer getSendCustomerId() {
        return sendCustomerId;
    }

    public void setSendCustomerId(Integer sendCustomerId) {
        this.sendCustomerId = sendCustomerId;
    }

    public String getSendName() {
        return sendName;
    }

    public void setSendName(String sendName) {
        this.sendName = sendName == null ? null : sendName.trim();
    }

    public Integer getSendConId() {
        return sendConId;
    }

    public void setSendConId(Integer sendConId) {
        this.sendConId = sendConId;
    }

    public String getSendPhone() {
        return sendPhone;
    }

    public void setSendPhone(String sendPhone) {
        this.sendPhone = sendPhone == null ? null : sendPhone.trim();
    }

    public String getSendProvince() {
        return sendProvince;
    }

    public void setSendProvince(String sendProvince) {
        this.sendProvince = sendProvince == null ? null : sendProvince.trim();
    }

    public String getSendCity() {
        return sendCity;
    }

    public void setSendCity(String sendCity) {
        this.sendCity = sendCity == null ? null : sendCity.trim();
    }

    public String getSendDistrict() {
        return sendDistrict;
    }

    public void setSendDistrict(String sendDistrict) {
        this.sendDistrict = sendDistrict == null ? null : sendDistrict.trim();
    }

    public String getSendDetailaddress() {
        return sendDetailaddress;
    }

    public void setSendDetailaddress(String sendDetailaddress) {
        this.sendDetailaddress = sendDetailaddress == null ? null : sendDetailaddress.trim();
    }

    public Integer getSendDelId() {
        return sendDelId;
    }

    public void setSendDelId(Integer sendDelId) {
        this.sendDelId = sendDelId;
    }

    public String getReceiveCompanyName() {
        return receiveCompanyName;
    }

    public void setReceiveCompanyName(String receiveCompanyName) {
        this.receiveCompanyName = receiveCompanyName == null ? null : receiveCompanyName.trim();
    }

    public Integer getReceiveCompanyId() {
        return receiveCompanyId;
    }

    public void setReceiveCompanyId(Integer receiveCompanyId) {
        this.receiveCompanyId = receiveCompanyId;
    }

    public Integer getReceiveCustomerId() {
        return receiveCustomerId;
    }

    public void setReceiveCustomerId(Integer receiveCustomerId) {
        this.receiveCustomerId = receiveCustomerId;
    }

    public String getReceiveName() {
        return receiveName;
    }

    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName == null ? null : receiveName.trim();
    }

    public Integer getReceiveConId() {
        return receiveConId;
    }

    public void setReceiveConId(Integer receiveConId) {
        this.receiveConId = receiveConId;
    }

    public String getReceivePhone() {
        return receivePhone;
    }

    public void setReceivePhone(String receivePhone) {
        this.receivePhone = receivePhone == null ? null : receivePhone.trim();
    }

    public String getReceiveProvince() {
        return receiveProvince;
    }

    public void setReceiveProvince(String receiveProvince) {
        this.receiveProvince = receiveProvince == null ? null : receiveProvince.trim();
    }

    public String getReceiveCity() {
        return receiveCity;
    }

    public void setReceiveCity(String receiveCity) {
        this.receiveCity = receiveCity == null ? null : receiveCity.trim();
    }

    public String getReceiveDistrict() {
        return receiveDistrict;
    }

    public void setReceiveDistrict(String receiveDistrict) {
        this.receiveDistrict = receiveDistrict == null ? null : receiveDistrict.trim();
    }

    public String getReceiveDetailaddress() {
        return receiveDetailaddress;
    }

    public void setReceiveDetailaddress(String receiveDetailaddress) {
        this.receiveDetailaddress = receiveDetailaddress == null ? null : receiveDetailaddress.trim();
    }

    public Integer getReceiveDelId() {
        return receiveDelId;
    }

    public void setReceiveDelId(Integer receiveDelId) {
        this.receiveDelId = receiveDelId;
    }

    public Integer getRouteId() {
        return routeId;
    }

    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }

    public Integer getFrequencyId() {
        return frequencyId;
    }

    public void setFrequencyId(Integer frequencyId) {
        this.frequencyId = frequencyId;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public BigDecimal getInsteadGoodsPayment() {
        return insteadGoodsPayment;
    }

    public void setInsteadGoodsPayment(BigDecimal insteadGoodsPayment) {
        this.insteadGoodsPayment = insteadGoodsPayment;
    }

    public BigDecimal getInsteadServiceCharge() {
        return insteadServiceCharge;
    }

    public void setInsteadServiceCharge(BigDecimal insteadServiceCharge) {
        this.insteadServiceCharge = insteadServiceCharge;
    }

    public BigDecimal getDoorGetPayment() {
        return doorGetPayment;
    }

    public void setDoorGetPayment(BigDecimal doorGetPayment) {
        this.doorGetPayment = doorGetPayment;
    }

    public String getDoorGetTime() {
        return doorGetTime;
    }

    public void setDoorGetTime(String doorGetTime) {
        this.doorGetTime = doorGetTime == null ? null : doorGetTime.trim();
    }

    public BigDecimal getGoodsStatementValue() {
        return goodsStatementValue;
    }

    public void setGoodsStatementValue(BigDecimal goodsStatementValue) {
        this.goodsStatementValue = goodsStatementValue;
    }

    public BigDecimal getInsuranceCharge() {
        return insuranceCharge;
    }

    public void setInsuranceCharge(BigDecimal insuranceCharge) {
        this.insuranceCharge = insuranceCharge;
    }

    public BigDecimal getPackingCharge() {
        return packingCharge;
    }

    public void setPackingCharge(BigDecimal packingCharge) {
        this.packingCharge = packingCharge;
    }

    public BigDecimal getOtherCharge() {
        return otherCharge;
    }

    public void setOtherCharge(BigDecimal otherCharge) {
        this.otherCharge = otherCharge;
    }

    public BigDecimal getTotalAccount() {
        return totalAccount;
    }

    public void setTotalAccount(BigDecimal totalAccount) {
        this.totalAccount = totalAccount;
    }

    public BigDecimal getFreightCharge() {
        return freightCharge;
    }

    public void setFreightCharge(BigDecimal freightCharge) {
        this.freightCharge = freightCharge;
    }

    public BigDecimal getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(BigDecimal serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public BigDecimal getTotalCharge() {
        return totalCharge;
    }

    public void setTotalCharge(BigDecimal totalCharge) {
        this.totalCharge = totalCharge;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(String isCheck) {
        this.isCheck = isCheck == null ? null : isCheck.trim();
    }

    public String getIsNoUse() {
        return isNoUse;
    }

    public void setIsNoUse(String isNoUse) {
        this.isNoUse = isNoUse == null ? null : isNoUse.trim();
    }

    public BigDecimal getActualGet() {
        return actualGet;
    }

    public void setActualGet(BigDecimal actualGet) {
        this.actualGet = actualGet;
    }

    public String getIsEBusiness() {
        return isEBusiness;
    }

    public void setIsEBusiness(String isEBusiness) {
        this.isEBusiness = isEBusiness == null ? null : isEBusiness.trim();
    }

    public String getDriverRemark() {
        return driverRemark;
    }

    public void setDriverRemark(String driverRemark) {
        this.driverRemark = driverRemark == null ? null : driverRemark.trim();
    }

    public BigDecimal getActualInsteadGet() {
        return actualInsteadGet;
    }

    public void setActualInsteadGet(BigDecimal actualInsteadGet) {
        this.actualInsteadGet = actualInsteadGet;
    }

    public String getIsBalance() {
        return isBalance;
    }

    public void setIsBalance(String isBalance) {
        this.isBalance = isBalance == null ? null : isBalance.trim();
    }

    public String getIsBalanceInstead() {
        return isBalanceInstead;
    }

    public void setIsBalanceInstead(String isBalanceInstead) {
        this.isBalanceInstead = isBalanceInstead == null ? null : isBalanceInstead.trim();
    }

    public String getIsGiveOut() {
        return isGiveOut;
    }

    public void setIsGiveOut(String isGiveOut) {
        this.isGiveOut = isGiveOut == null ? null : isGiveOut.trim();
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public String getLogisticsCompanyName() {
        return logisticsCompanyName;
    }

    public void setLogisticsCompanyName(String logisticsCompanyName) {
        this.logisticsCompanyName = logisticsCompanyName == null ? null : logisticsCompanyName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}