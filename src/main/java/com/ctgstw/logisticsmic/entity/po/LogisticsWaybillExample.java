package com.ctgstw.logisticsmic.entity.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogisticsWaybillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogisticsWaybillExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIdIsNull() {
            addCriterion("logistics_company_id is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIdIsNotNull() {
            addCriterion("logistics_company_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIdEqualTo(Integer value) {
            addCriterion("logistics_company_id =", value, "logisticsCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIdNotEqualTo(Integer value) {
            addCriterion("logistics_company_id <>", value, "logisticsCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIdGreaterThan(Integer value) {
            addCriterion("logistics_company_id >", value, "logisticsCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("logistics_company_id >=", value, "logisticsCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIdLessThan(Integer value) {
            addCriterion("logistics_company_id <", value, "logisticsCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("logistics_company_id <=", value, "logisticsCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIdIn(List<Integer> values) {
            addCriterion("logistics_company_id in", values, "logisticsCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIdNotIn(List<Integer> values) {
            addCriterion("logistics_company_id not in", values, "logisticsCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("logistics_company_id between", value1, value2, "logisticsCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("logistics_company_id not between", value1, value2, "logisticsCompanyId");
            return (Criteria) this;
        }

        public Criteria andWaybillNumberIsNull() {
            addCriterion("waybill_number is null");
            return (Criteria) this;
        }

        public Criteria andWaybillNumberIsNotNull() {
            addCriterion("waybill_number is not null");
            return (Criteria) this;
        }

        public Criteria andWaybillNumberEqualTo(String value) {
            addCriterion("waybill_number =", value, "waybillNumber");
            return (Criteria) this;
        }

        public Criteria andWaybillNumberNotEqualTo(String value) {
            addCriterion("waybill_number <>", value, "waybillNumber");
            return (Criteria) this;
        }

        public Criteria andWaybillNumberGreaterThan(String value) {
            addCriterion("waybill_number >", value, "waybillNumber");
            return (Criteria) this;
        }

        public Criteria andWaybillNumberGreaterThanOrEqualTo(String value) {
            addCriterion("waybill_number >=", value, "waybillNumber");
            return (Criteria) this;
        }

        public Criteria andWaybillNumberLessThan(String value) {
            addCriterion("waybill_number <", value, "waybillNumber");
            return (Criteria) this;
        }

        public Criteria andWaybillNumberLessThanOrEqualTo(String value) {
            addCriterion("waybill_number <=", value, "waybillNumber");
            return (Criteria) this;
        }

        public Criteria andWaybillNumberLike(String value) {
            addCriterion("waybill_number like", value, "waybillNumber");
            return (Criteria) this;
        }

        public Criteria andWaybillNumberNotLike(String value) {
            addCriterion("waybill_number not like", value, "waybillNumber");
            return (Criteria) this;
        }

        public Criteria andWaybillNumberIn(List<String> values) {
            addCriterion("waybill_number in", values, "waybillNumber");
            return (Criteria) this;
        }

        public Criteria andWaybillNumberNotIn(List<String> values) {
            addCriterion("waybill_number not in", values, "waybillNumber");
            return (Criteria) this;
        }

        public Criteria andWaybillNumberBetween(String value1, String value2) {
            addCriterion("waybill_number between", value1, value2, "waybillNumber");
            return (Criteria) this;
        }

        public Criteria andWaybillNumberNotBetween(String value1, String value2) {
            addCriterion("waybill_number not between", value1, value2, "waybillNumber");
            return (Criteria) this;
        }

        public Criteria andSendCompanyNameIsNull() {
            addCriterion("send_company_name is null");
            return (Criteria) this;
        }

        public Criteria andSendCompanyNameIsNotNull() {
            addCriterion("send_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andSendCompanyNameEqualTo(String value) {
            addCriterion("send_company_name =", value, "sendCompanyName");
            return (Criteria) this;
        }

        public Criteria andSendCompanyNameNotEqualTo(String value) {
            addCriterion("send_company_name <>", value, "sendCompanyName");
            return (Criteria) this;
        }

        public Criteria andSendCompanyNameGreaterThan(String value) {
            addCriterion("send_company_name >", value, "sendCompanyName");
            return (Criteria) this;
        }

        public Criteria andSendCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("send_company_name >=", value, "sendCompanyName");
            return (Criteria) this;
        }

        public Criteria andSendCompanyNameLessThan(String value) {
            addCriterion("send_company_name <", value, "sendCompanyName");
            return (Criteria) this;
        }

        public Criteria andSendCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("send_company_name <=", value, "sendCompanyName");
            return (Criteria) this;
        }

        public Criteria andSendCompanyNameLike(String value) {
            addCriterion("send_company_name like", value, "sendCompanyName");
            return (Criteria) this;
        }

        public Criteria andSendCompanyNameNotLike(String value) {
            addCriterion("send_company_name not like", value, "sendCompanyName");
            return (Criteria) this;
        }

        public Criteria andSendCompanyNameIn(List<String> values) {
            addCriterion("send_company_name in", values, "sendCompanyName");
            return (Criteria) this;
        }

        public Criteria andSendCompanyNameNotIn(List<String> values) {
            addCriterion("send_company_name not in", values, "sendCompanyName");
            return (Criteria) this;
        }

        public Criteria andSendCompanyNameBetween(String value1, String value2) {
            addCriterion("send_company_name between", value1, value2, "sendCompanyName");
            return (Criteria) this;
        }

        public Criteria andSendCompanyNameNotBetween(String value1, String value2) {
            addCriterion("send_company_name not between", value1, value2, "sendCompanyName");
            return (Criteria) this;
        }

        public Criteria andSendCompanyIdIsNull() {
            addCriterion("send_company_id is null");
            return (Criteria) this;
        }

        public Criteria andSendCompanyIdIsNotNull() {
            addCriterion("send_company_id is not null");
            return (Criteria) this;
        }

        public Criteria andSendCompanyIdEqualTo(Integer value) {
            addCriterion("send_company_id =", value, "sendCompanyId");
            return (Criteria) this;
        }

        public Criteria andSendCompanyIdNotEqualTo(Integer value) {
            addCriterion("send_company_id <>", value, "sendCompanyId");
            return (Criteria) this;
        }

        public Criteria andSendCompanyIdGreaterThan(Integer value) {
            addCriterion("send_company_id >", value, "sendCompanyId");
            return (Criteria) this;
        }

        public Criteria andSendCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_company_id >=", value, "sendCompanyId");
            return (Criteria) this;
        }

        public Criteria andSendCompanyIdLessThan(Integer value) {
            addCriterion("send_company_id <", value, "sendCompanyId");
            return (Criteria) this;
        }

        public Criteria andSendCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("send_company_id <=", value, "sendCompanyId");
            return (Criteria) this;
        }

        public Criteria andSendCompanyIdIn(List<Integer> values) {
            addCriterion("send_company_id in", values, "sendCompanyId");
            return (Criteria) this;
        }

        public Criteria andSendCompanyIdNotIn(List<Integer> values) {
            addCriterion("send_company_id not in", values, "sendCompanyId");
            return (Criteria) this;
        }

        public Criteria andSendCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("send_company_id between", value1, value2, "sendCompanyId");
            return (Criteria) this;
        }

        public Criteria andSendCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("send_company_id not between", value1, value2, "sendCompanyId");
            return (Criteria) this;
        }

        public Criteria andSendCustomerIdIsNull() {
            addCriterion("send_customer_id is null");
            return (Criteria) this;
        }

        public Criteria andSendCustomerIdIsNotNull() {
            addCriterion("send_customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andSendCustomerIdEqualTo(Integer value) {
            addCriterion("send_customer_id =", value, "sendCustomerId");
            return (Criteria) this;
        }

        public Criteria andSendCustomerIdNotEqualTo(Integer value) {
            addCriterion("send_customer_id <>", value, "sendCustomerId");
            return (Criteria) this;
        }

        public Criteria andSendCustomerIdGreaterThan(Integer value) {
            addCriterion("send_customer_id >", value, "sendCustomerId");
            return (Criteria) this;
        }

        public Criteria andSendCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_customer_id >=", value, "sendCustomerId");
            return (Criteria) this;
        }

        public Criteria andSendCustomerIdLessThan(Integer value) {
            addCriterion("send_customer_id <", value, "sendCustomerId");
            return (Criteria) this;
        }

        public Criteria andSendCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("send_customer_id <=", value, "sendCustomerId");
            return (Criteria) this;
        }

        public Criteria andSendCustomerIdIn(List<Integer> values) {
            addCriterion("send_customer_id in", values, "sendCustomerId");
            return (Criteria) this;
        }

        public Criteria andSendCustomerIdNotIn(List<Integer> values) {
            addCriterion("send_customer_id not in", values, "sendCustomerId");
            return (Criteria) this;
        }

        public Criteria andSendCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("send_customer_id between", value1, value2, "sendCustomerId");
            return (Criteria) this;
        }

        public Criteria andSendCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("send_customer_id not between", value1, value2, "sendCustomerId");
            return (Criteria) this;
        }

        public Criteria andSendNameIsNull() {
            addCriterion("send_name is null");
            return (Criteria) this;
        }

        public Criteria andSendNameIsNotNull() {
            addCriterion("send_name is not null");
            return (Criteria) this;
        }

        public Criteria andSendNameEqualTo(String value) {
            addCriterion("send_name =", value, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameNotEqualTo(String value) {
            addCriterion("send_name <>", value, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameGreaterThan(String value) {
            addCriterion("send_name >", value, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameGreaterThanOrEqualTo(String value) {
            addCriterion("send_name >=", value, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameLessThan(String value) {
            addCriterion("send_name <", value, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameLessThanOrEqualTo(String value) {
            addCriterion("send_name <=", value, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameLike(String value) {
            addCriterion("send_name like", value, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameNotLike(String value) {
            addCriterion("send_name not like", value, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameIn(List<String> values) {
            addCriterion("send_name in", values, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameNotIn(List<String> values) {
            addCriterion("send_name not in", values, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameBetween(String value1, String value2) {
            addCriterion("send_name between", value1, value2, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameNotBetween(String value1, String value2) {
            addCriterion("send_name not between", value1, value2, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendConIdIsNull() {
            addCriterion("send_con_id is null");
            return (Criteria) this;
        }

        public Criteria andSendConIdIsNotNull() {
            addCriterion("send_con_id is not null");
            return (Criteria) this;
        }

        public Criteria andSendConIdEqualTo(Integer value) {
            addCriterion("send_con_id =", value, "sendConId");
            return (Criteria) this;
        }

        public Criteria andSendConIdNotEqualTo(Integer value) {
            addCriterion("send_con_id <>", value, "sendConId");
            return (Criteria) this;
        }

        public Criteria andSendConIdGreaterThan(Integer value) {
            addCriterion("send_con_id >", value, "sendConId");
            return (Criteria) this;
        }

        public Criteria andSendConIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_con_id >=", value, "sendConId");
            return (Criteria) this;
        }

        public Criteria andSendConIdLessThan(Integer value) {
            addCriterion("send_con_id <", value, "sendConId");
            return (Criteria) this;
        }

        public Criteria andSendConIdLessThanOrEqualTo(Integer value) {
            addCriterion("send_con_id <=", value, "sendConId");
            return (Criteria) this;
        }

        public Criteria andSendConIdIn(List<Integer> values) {
            addCriterion("send_con_id in", values, "sendConId");
            return (Criteria) this;
        }

        public Criteria andSendConIdNotIn(List<Integer> values) {
            addCriterion("send_con_id not in", values, "sendConId");
            return (Criteria) this;
        }

        public Criteria andSendConIdBetween(Integer value1, Integer value2) {
            addCriterion("send_con_id between", value1, value2, "sendConId");
            return (Criteria) this;
        }

        public Criteria andSendConIdNotBetween(Integer value1, Integer value2) {
            addCriterion("send_con_id not between", value1, value2, "sendConId");
            return (Criteria) this;
        }

        public Criteria andSendPhoneIsNull() {
            addCriterion("send_phone is null");
            return (Criteria) this;
        }

        public Criteria andSendPhoneIsNotNull() {
            addCriterion("send_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSendPhoneEqualTo(String value) {
            addCriterion("send_phone =", value, "sendPhone");
            return (Criteria) this;
        }

        public Criteria andSendPhoneNotEqualTo(String value) {
            addCriterion("send_phone <>", value, "sendPhone");
            return (Criteria) this;
        }

        public Criteria andSendPhoneGreaterThan(String value) {
            addCriterion("send_phone >", value, "sendPhone");
            return (Criteria) this;
        }

        public Criteria andSendPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("send_phone >=", value, "sendPhone");
            return (Criteria) this;
        }

        public Criteria andSendPhoneLessThan(String value) {
            addCriterion("send_phone <", value, "sendPhone");
            return (Criteria) this;
        }

        public Criteria andSendPhoneLessThanOrEqualTo(String value) {
            addCriterion("send_phone <=", value, "sendPhone");
            return (Criteria) this;
        }

        public Criteria andSendPhoneLike(String value) {
            addCriterion("send_phone like", value, "sendPhone");
            return (Criteria) this;
        }

        public Criteria andSendPhoneNotLike(String value) {
            addCriterion("send_phone not like", value, "sendPhone");
            return (Criteria) this;
        }

        public Criteria andSendPhoneIn(List<String> values) {
            addCriterion("send_phone in", values, "sendPhone");
            return (Criteria) this;
        }

        public Criteria andSendPhoneNotIn(List<String> values) {
            addCriterion("send_phone not in", values, "sendPhone");
            return (Criteria) this;
        }

        public Criteria andSendPhoneBetween(String value1, String value2) {
            addCriterion("send_phone between", value1, value2, "sendPhone");
            return (Criteria) this;
        }

        public Criteria andSendPhoneNotBetween(String value1, String value2) {
            addCriterion("send_phone not between", value1, value2, "sendPhone");
            return (Criteria) this;
        }

        public Criteria andSendProvinceIsNull() {
            addCriterion("send_province is null");
            return (Criteria) this;
        }

        public Criteria andSendProvinceIsNotNull() {
            addCriterion("send_province is not null");
            return (Criteria) this;
        }

        public Criteria andSendProvinceEqualTo(String value) {
            addCriterion("send_province =", value, "sendProvince");
            return (Criteria) this;
        }

        public Criteria andSendProvinceNotEqualTo(String value) {
            addCriterion("send_province <>", value, "sendProvince");
            return (Criteria) this;
        }

        public Criteria andSendProvinceGreaterThan(String value) {
            addCriterion("send_province >", value, "sendProvince");
            return (Criteria) this;
        }

        public Criteria andSendProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("send_province >=", value, "sendProvince");
            return (Criteria) this;
        }

        public Criteria andSendProvinceLessThan(String value) {
            addCriterion("send_province <", value, "sendProvince");
            return (Criteria) this;
        }

        public Criteria andSendProvinceLessThanOrEqualTo(String value) {
            addCriterion("send_province <=", value, "sendProvince");
            return (Criteria) this;
        }

        public Criteria andSendProvinceLike(String value) {
            addCriterion("send_province like", value, "sendProvince");
            return (Criteria) this;
        }

        public Criteria andSendProvinceNotLike(String value) {
            addCriterion("send_province not like", value, "sendProvince");
            return (Criteria) this;
        }

        public Criteria andSendProvinceIn(List<String> values) {
            addCriterion("send_province in", values, "sendProvince");
            return (Criteria) this;
        }

        public Criteria andSendProvinceNotIn(List<String> values) {
            addCriterion("send_province not in", values, "sendProvince");
            return (Criteria) this;
        }

        public Criteria andSendProvinceBetween(String value1, String value2) {
            addCriterion("send_province between", value1, value2, "sendProvince");
            return (Criteria) this;
        }

        public Criteria andSendProvinceNotBetween(String value1, String value2) {
            addCriterion("send_province not between", value1, value2, "sendProvince");
            return (Criteria) this;
        }

        public Criteria andSendCityIsNull() {
            addCriterion("send_city is null");
            return (Criteria) this;
        }

        public Criteria andSendCityIsNotNull() {
            addCriterion("send_city is not null");
            return (Criteria) this;
        }

        public Criteria andSendCityEqualTo(String value) {
            addCriterion("send_city =", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityNotEqualTo(String value) {
            addCriterion("send_city <>", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityGreaterThan(String value) {
            addCriterion("send_city >", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityGreaterThanOrEqualTo(String value) {
            addCriterion("send_city >=", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityLessThan(String value) {
            addCriterion("send_city <", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityLessThanOrEqualTo(String value) {
            addCriterion("send_city <=", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityLike(String value) {
            addCriterion("send_city like", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityNotLike(String value) {
            addCriterion("send_city not like", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityIn(List<String> values) {
            addCriterion("send_city in", values, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityNotIn(List<String> values) {
            addCriterion("send_city not in", values, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityBetween(String value1, String value2) {
            addCriterion("send_city between", value1, value2, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityNotBetween(String value1, String value2) {
            addCriterion("send_city not between", value1, value2, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendDistrictIsNull() {
            addCriterion("send_district is null");
            return (Criteria) this;
        }

        public Criteria andSendDistrictIsNotNull() {
            addCriterion("send_district is not null");
            return (Criteria) this;
        }

        public Criteria andSendDistrictEqualTo(String value) {
            addCriterion("send_district =", value, "sendDistrict");
            return (Criteria) this;
        }

        public Criteria andSendDistrictNotEqualTo(String value) {
            addCriterion("send_district <>", value, "sendDistrict");
            return (Criteria) this;
        }

        public Criteria andSendDistrictGreaterThan(String value) {
            addCriterion("send_district >", value, "sendDistrict");
            return (Criteria) this;
        }

        public Criteria andSendDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("send_district >=", value, "sendDistrict");
            return (Criteria) this;
        }

        public Criteria andSendDistrictLessThan(String value) {
            addCriterion("send_district <", value, "sendDistrict");
            return (Criteria) this;
        }

        public Criteria andSendDistrictLessThanOrEqualTo(String value) {
            addCriterion("send_district <=", value, "sendDistrict");
            return (Criteria) this;
        }

        public Criteria andSendDistrictLike(String value) {
            addCriterion("send_district like", value, "sendDistrict");
            return (Criteria) this;
        }

        public Criteria andSendDistrictNotLike(String value) {
            addCriterion("send_district not like", value, "sendDistrict");
            return (Criteria) this;
        }

        public Criteria andSendDistrictIn(List<String> values) {
            addCriterion("send_district in", values, "sendDistrict");
            return (Criteria) this;
        }

        public Criteria andSendDistrictNotIn(List<String> values) {
            addCriterion("send_district not in", values, "sendDistrict");
            return (Criteria) this;
        }

        public Criteria andSendDistrictBetween(String value1, String value2) {
            addCriterion("send_district between", value1, value2, "sendDistrict");
            return (Criteria) this;
        }

        public Criteria andSendDistrictNotBetween(String value1, String value2) {
            addCriterion("send_district not between", value1, value2, "sendDistrict");
            return (Criteria) this;
        }

        public Criteria andSendDetailaddressIsNull() {
            addCriterion("send_detailaddress is null");
            return (Criteria) this;
        }

        public Criteria andSendDetailaddressIsNotNull() {
            addCriterion("send_detailaddress is not null");
            return (Criteria) this;
        }

        public Criteria andSendDetailaddressEqualTo(String value) {
            addCriterion("send_detailaddress =", value, "sendDetailaddress");
            return (Criteria) this;
        }

        public Criteria andSendDetailaddressNotEqualTo(String value) {
            addCriterion("send_detailaddress <>", value, "sendDetailaddress");
            return (Criteria) this;
        }

        public Criteria andSendDetailaddressGreaterThan(String value) {
            addCriterion("send_detailaddress >", value, "sendDetailaddress");
            return (Criteria) this;
        }

        public Criteria andSendDetailaddressGreaterThanOrEqualTo(String value) {
            addCriterion("send_detailaddress >=", value, "sendDetailaddress");
            return (Criteria) this;
        }

        public Criteria andSendDetailaddressLessThan(String value) {
            addCriterion("send_detailaddress <", value, "sendDetailaddress");
            return (Criteria) this;
        }

        public Criteria andSendDetailaddressLessThanOrEqualTo(String value) {
            addCriterion("send_detailaddress <=", value, "sendDetailaddress");
            return (Criteria) this;
        }

        public Criteria andSendDetailaddressLike(String value) {
            addCriterion("send_detailaddress like", value, "sendDetailaddress");
            return (Criteria) this;
        }

        public Criteria andSendDetailaddressNotLike(String value) {
            addCriterion("send_detailaddress not like", value, "sendDetailaddress");
            return (Criteria) this;
        }

        public Criteria andSendDetailaddressIn(List<String> values) {
            addCriterion("send_detailaddress in", values, "sendDetailaddress");
            return (Criteria) this;
        }

        public Criteria andSendDetailaddressNotIn(List<String> values) {
            addCriterion("send_detailaddress not in", values, "sendDetailaddress");
            return (Criteria) this;
        }

        public Criteria andSendDetailaddressBetween(String value1, String value2) {
            addCriterion("send_detailaddress between", value1, value2, "sendDetailaddress");
            return (Criteria) this;
        }

        public Criteria andSendDetailaddressNotBetween(String value1, String value2) {
            addCriterion("send_detailaddress not between", value1, value2, "sendDetailaddress");
            return (Criteria) this;
        }

        public Criteria andSendDelIdIsNull() {
            addCriterion("send_del_id is null");
            return (Criteria) this;
        }

        public Criteria andSendDelIdIsNotNull() {
            addCriterion("send_del_id is not null");
            return (Criteria) this;
        }

        public Criteria andSendDelIdEqualTo(Integer value) {
            addCriterion("send_del_id =", value, "sendDelId");
            return (Criteria) this;
        }

        public Criteria andSendDelIdNotEqualTo(Integer value) {
            addCriterion("send_del_id <>", value, "sendDelId");
            return (Criteria) this;
        }

        public Criteria andSendDelIdGreaterThan(Integer value) {
            addCriterion("send_del_id >", value, "sendDelId");
            return (Criteria) this;
        }

        public Criteria andSendDelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_del_id >=", value, "sendDelId");
            return (Criteria) this;
        }

        public Criteria andSendDelIdLessThan(Integer value) {
            addCriterion("send_del_id <", value, "sendDelId");
            return (Criteria) this;
        }

        public Criteria andSendDelIdLessThanOrEqualTo(Integer value) {
            addCriterion("send_del_id <=", value, "sendDelId");
            return (Criteria) this;
        }

        public Criteria andSendDelIdIn(List<Integer> values) {
            addCriterion("send_del_id in", values, "sendDelId");
            return (Criteria) this;
        }

        public Criteria andSendDelIdNotIn(List<Integer> values) {
            addCriterion("send_del_id not in", values, "sendDelId");
            return (Criteria) this;
        }

        public Criteria andSendDelIdBetween(Integer value1, Integer value2) {
            addCriterion("send_del_id between", value1, value2, "sendDelId");
            return (Criteria) this;
        }

        public Criteria andSendDelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("send_del_id not between", value1, value2, "sendDelId");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyNameIsNull() {
            addCriterion("receive_company_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyNameIsNotNull() {
            addCriterion("receive_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyNameEqualTo(String value) {
            addCriterion("receive_company_name =", value, "receiveCompanyName");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyNameNotEqualTo(String value) {
            addCriterion("receive_company_name <>", value, "receiveCompanyName");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyNameGreaterThan(String value) {
            addCriterion("receive_company_name >", value, "receiveCompanyName");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("receive_company_name >=", value, "receiveCompanyName");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyNameLessThan(String value) {
            addCriterion("receive_company_name <", value, "receiveCompanyName");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("receive_company_name <=", value, "receiveCompanyName");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyNameLike(String value) {
            addCriterion("receive_company_name like", value, "receiveCompanyName");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyNameNotLike(String value) {
            addCriterion("receive_company_name not like", value, "receiveCompanyName");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyNameIn(List<String> values) {
            addCriterion("receive_company_name in", values, "receiveCompanyName");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyNameNotIn(List<String> values) {
            addCriterion("receive_company_name not in", values, "receiveCompanyName");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyNameBetween(String value1, String value2) {
            addCriterion("receive_company_name between", value1, value2, "receiveCompanyName");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyNameNotBetween(String value1, String value2) {
            addCriterion("receive_company_name not between", value1, value2, "receiveCompanyName");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyIdIsNull() {
            addCriterion("receive_company_id is null");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyIdIsNotNull() {
            addCriterion("receive_company_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyIdEqualTo(Integer value) {
            addCriterion("receive_company_id =", value, "receiveCompanyId");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyIdNotEqualTo(Integer value) {
            addCriterion("receive_company_id <>", value, "receiveCompanyId");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyIdGreaterThan(Integer value) {
            addCriterion("receive_company_id >", value, "receiveCompanyId");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("receive_company_id >=", value, "receiveCompanyId");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyIdLessThan(Integer value) {
            addCriterion("receive_company_id <", value, "receiveCompanyId");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("receive_company_id <=", value, "receiveCompanyId");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyIdIn(List<Integer> values) {
            addCriterion("receive_company_id in", values, "receiveCompanyId");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyIdNotIn(List<Integer> values) {
            addCriterion("receive_company_id not in", values, "receiveCompanyId");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("receive_company_id between", value1, value2, "receiveCompanyId");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("receive_company_id not between", value1, value2, "receiveCompanyId");
            return (Criteria) this;
        }

        public Criteria andReceiveCustomerIdIsNull() {
            addCriterion("receive_customer_id is null");
            return (Criteria) this;
        }

        public Criteria andReceiveCustomerIdIsNotNull() {
            addCriterion("receive_customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveCustomerIdEqualTo(Integer value) {
            addCriterion("receive_customer_id =", value, "receiveCustomerId");
            return (Criteria) this;
        }

        public Criteria andReceiveCustomerIdNotEqualTo(Integer value) {
            addCriterion("receive_customer_id <>", value, "receiveCustomerId");
            return (Criteria) this;
        }

        public Criteria andReceiveCustomerIdGreaterThan(Integer value) {
            addCriterion("receive_customer_id >", value, "receiveCustomerId");
            return (Criteria) this;
        }

        public Criteria andReceiveCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("receive_customer_id >=", value, "receiveCustomerId");
            return (Criteria) this;
        }

        public Criteria andReceiveCustomerIdLessThan(Integer value) {
            addCriterion("receive_customer_id <", value, "receiveCustomerId");
            return (Criteria) this;
        }

        public Criteria andReceiveCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("receive_customer_id <=", value, "receiveCustomerId");
            return (Criteria) this;
        }

        public Criteria andReceiveCustomerIdIn(List<Integer> values) {
            addCriterion("receive_customer_id in", values, "receiveCustomerId");
            return (Criteria) this;
        }

        public Criteria andReceiveCustomerIdNotIn(List<Integer> values) {
            addCriterion("receive_customer_id not in", values, "receiveCustomerId");
            return (Criteria) this;
        }

        public Criteria andReceiveCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("receive_customer_id between", value1, value2, "receiveCustomerId");
            return (Criteria) this;
        }

        public Criteria andReceiveCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("receive_customer_id not between", value1, value2, "receiveCustomerId");
            return (Criteria) this;
        }

        public Criteria andReceiveNameIsNull() {
            addCriterion("receive_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiveNameIsNotNull() {
            addCriterion("receive_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveNameEqualTo(String value) {
            addCriterion("receive_name =", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotEqualTo(String value) {
            addCriterion("receive_name <>", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameGreaterThan(String value) {
            addCriterion("receive_name >", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameGreaterThanOrEqualTo(String value) {
            addCriterion("receive_name >=", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameLessThan(String value) {
            addCriterion("receive_name <", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameLessThanOrEqualTo(String value) {
            addCriterion("receive_name <=", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameLike(String value) {
            addCriterion("receive_name like", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotLike(String value) {
            addCriterion("receive_name not like", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameIn(List<String> values) {
            addCriterion("receive_name in", values, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotIn(List<String> values) {
            addCriterion("receive_name not in", values, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameBetween(String value1, String value2) {
            addCriterion("receive_name between", value1, value2, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotBetween(String value1, String value2) {
            addCriterion("receive_name not between", value1, value2, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveConIdIsNull() {
            addCriterion("receive_con_id is null");
            return (Criteria) this;
        }

        public Criteria andReceiveConIdIsNotNull() {
            addCriterion("receive_con_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveConIdEqualTo(Integer value) {
            addCriterion("receive_con_id =", value, "receiveConId");
            return (Criteria) this;
        }

        public Criteria andReceiveConIdNotEqualTo(Integer value) {
            addCriterion("receive_con_id <>", value, "receiveConId");
            return (Criteria) this;
        }

        public Criteria andReceiveConIdGreaterThan(Integer value) {
            addCriterion("receive_con_id >", value, "receiveConId");
            return (Criteria) this;
        }

        public Criteria andReceiveConIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("receive_con_id >=", value, "receiveConId");
            return (Criteria) this;
        }

        public Criteria andReceiveConIdLessThan(Integer value) {
            addCriterion("receive_con_id <", value, "receiveConId");
            return (Criteria) this;
        }

        public Criteria andReceiveConIdLessThanOrEqualTo(Integer value) {
            addCriterion("receive_con_id <=", value, "receiveConId");
            return (Criteria) this;
        }

        public Criteria andReceiveConIdIn(List<Integer> values) {
            addCriterion("receive_con_id in", values, "receiveConId");
            return (Criteria) this;
        }

        public Criteria andReceiveConIdNotIn(List<Integer> values) {
            addCriterion("receive_con_id not in", values, "receiveConId");
            return (Criteria) this;
        }

        public Criteria andReceiveConIdBetween(Integer value1, Integer value2) {
            addCriterion("receive_con_id between", value1, value2, "receiveConId");
            return (Criteria) this;
        }

        public Criteria andReceiveConIdNotBetween(Integer value1, Integer value2) {
            addCriterion("receive_con_id not between", value1, value2, "receiveConId");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneIsNull() {
            addCriterion("receive_phone is null");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneIsNotNull() {
            addCriterion("receive_phone is not null");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneEqualTo(String value) {
            addCriterion("receive_phone =", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneNotEqualTo(String value) {
            addCriterion("receive_phone <>", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneGreaterThan(String value) {
            addCriterion("receive_phone >", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("receive_phone >=", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneLessThan(String value) {
            addCriterion("receive_phone <", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneLessThanOrEqualTo(String value) {
            addCriterion("receive_phone <=", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneLike(String value) {
            addCriterion("receive_phone like", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneNotLike(String value) {
            addCriterion("receive_phone not like", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneIn(List<String> values) {
            addCriterion("receive_phone in", values, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneNotIn(List<String> values) {
            addCriterion("receive_phone not in", values, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneBetween(String value1, String value2) {
            addCriterion("receive_phone between", value1, value2, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneNotBetween(String value1, String value2) {
            addCriterion("receive_phone not between", value1, value2, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceIsNull() {
            addCriterion("receive_province is null");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceIsNotNull() {
            addCriterion("receive_province is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceEqualTo(String value) {
            addCriterion("receive_province =", value, "receiveProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNotEqualTo(String value) {
            addCriterion("receive_province <>", value, "receiveProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceGreaterThan(String value) {
            addCriterion("receive_province >", value, "receiveProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("receive_province >=", value, "receiveProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceLessThan(String value) {
            addCriterion("receive_province <", value, "receiveProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceLessThanOrEqualTo(String value) {
            addCriterion("receive_province <=", value, "receiveProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceLike(String value) {
            addCriterion("receive_province like", value, "receiveProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNotLike(String value) {
            addCriterion("receive_province not like", value, "receiveProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceIn(List<String> values) {
            addCriterion("receive_province in", values, "receiveProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNotIn(List<String> values) {
            addCriterion("receive_province not in", values, "receiveProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceBetween(String value1, String value2) {
            addCriterion("receive_province between", value1, value2, "receiveProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNotBetween(String value1, String value2) {
            addCriterion("receive_province not between", value1, value2, "receiveProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveCityIsNull() {
            addCriterion("receive_city is null");
            return (Criteria) this;
        }

        public Criteria andReceiveCityIsNotNull() {
            addCriterion("receive_city is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveCityEqualTo(String value) {
            addCriterion("receive_city =", value, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityNotEqualTo(String value) {
            addCriterion("receive_city <>", value, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityGreaterThan(String value) {
            addCriterion("receive_city >", value, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityGreaterThanOrEqualTo(String value) {
            addCriterion("receive_city >=", value, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityLessThan(String value) {
            addCriterion("receive_city <", value, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityLessThanOrEqualTo(String value) {
            addCriterion("receive_city <=", value, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityLike(String value) {
            addCriterion("receive_city like", value, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityNotLike(String value) {
            addCriterion("receive_city not like", value, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityIn(List<String> values) {
            addCriterion("receive_city in", values, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityNotIn(List<String> values) {
            addCriterion("receive_city not in", values, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityBetween(String value1, String value2) {
            addCriterion("receive_city between", value1, value2, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityNotBetween(String value1, String value2) {
            addCriterion("receive_city not between", value1, value2, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveDistrictIsNull() {
            addCriterion("receive_district is null");
            return (Criteria) this;
        }

        public Criteria andReceiveDistrictIsNotNull() {
            addCriterion("receive_district is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveDistrictEqualTo(String value) {
            addCriterion("receive_district =", value, "receiveDistrict");
            return (Criteria) this;
        }

        public Criteria andReceiveDistrictNotEqualTo(String value) {
            addCriterion("receive_district <>", value, "receiveDistrict");
            return (Criteria) this;
        }

        public Criteria andReceiveDistrictGreaterThan(String value) {
            addCriterion("receive_district >", value, "receiveDistrict");
            return (Criteria) this;
        }

        public Criteria andReceiveDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("receive_district >=", value, "receiveDistrict");
            return (Criteria) this;
        }

        public Criteria andReceiveDistrictLessThan(String value) {
            addCriterion("receive_district <", value, "receiveDistrict");
            return (Criteria) this;
        }

        public Criteria andReceiveDistrictLessThanOrEqualTo(String value) {
            addCriterion("receive_district <=", value, "receiveDistrict");
            return (Criteria) this;
        }

        public Criteria andReceiveDistrictLike(String value) {
            addCriterion("receive_district like", value, "receiveDistrict");
            return (Criteria) this;
        }

        public Criteria andReceiveDistrictNotLike(String value) {
            addCriterion("receive_district not like", value, "receiveDistrict");
            return (Criteria) this;
        }

        public Criteria andReceiveDistrictIn(List<String> values) {
            addCriterion("receive_district in", values, "receiveDistrict");
            return (Criteria) this;
        }

        public Criteria andReceiveDistrictNotIn(List<String> values) {
            addCriterion("receive_district not in", values, "receiveDistrict");
            return (Criteria) this;
        }

        public Criteria andReceiveDistrictBetween(String value1, String value2) {
            addCriterion("receive_district between", value1, value2, "receiveDistrict");
            return (Criteria) this;
        }

        public Criteria andReceiveDistrictNotBetween(String value1, String value2) {
            addCriterion("receive_district not between", value1, value2, "receiveDistrict");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailaddressIsNull() {
            addCriterion("receive_detailaddress is null");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailaddressIsNotNull() {
            addCriterion("receive_detailaddress is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailaddressEqualTo(String value) {
            addCriterion("receive_detailaddress =", value, "receiveDetailaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailaddressNotEqualTo(String value) {
            addCriterion("receive_detailaddress <>", value, "receiveDetailaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailaddressGreaterThan(String value) {
            addCriterion("receive_detailaddress >", value, "receiveDetailaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailaddressGreaterThanOrEqualTo(String value) {
            addCriterion("receive_detailaddress >=", value, "receiveDetailaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailaddressLessThan(String value) {
            addCriterion("receive_detailaddress <", value, "receiveDetailaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailaddressLessThanOrEqualTo(String value) {
            addCriterion("receive_detailaddress <=", value, "receiveDetailaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailaddressLike(String value) {
            addCriterion("receive_detailaddress like", value, "receiveDetailaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailaddressNotLike(String value) {
            addCriterion("receive_detailaddress not like", value, "receiveDetailaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailaddressIn(List<String> values) {
            addCriterion("receive_detailaddress in", values, "receiveDetailaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailaddressNotIn(List<String> values) {
            addCriterion("receive_detailaddress not in", values, "receiveDetailaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailaddressBetween(String value1, String value2) {
            addCriterion("receive_detailaddress between", value1, value2, "receiveDetailaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailaddressNotBetween(String value1, String value2) {
            addCriterion("receive_detailaddress not between", value1, value2, "receiveDetailaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveDelIdIsNull() {
            addCriterion("receive_del_id is null");
            return (Criteria) this;
        }

        public Criteria andReceiveDelIdIsNotNull() {
            addCriterion("receive_del_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveDelIdEqualTo(Integer value) {
            addCriterion("receive_del_id =", value, "receiveDelId");
            return (Criteria) this;
        }

        public Criteria andReceiveDelIdNotEqualTo(Integer value) {
            addCriterion("receive_del_id <>", value, "receiveDelId");
            return (Criteria) this;
        }

        public Criteria andReceiveDelIdGreaterThan(Integer value) {
            addCriterion("receive_del_id >", value, "receiveDelId");
            return (Criteria) this;
        }

        public Criteria andReceiveDelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("receive_del_id >=", value, "receiveDelId");
            return (Criteria) this;
        }

        public Criteria andReceiveDelIdLessThan(Integer value) {
            addCriterion("receive_del_id <", value, "receiveDelId");
            return (Criteria) this;
        }

        public Criteria andReceiveDelIdLessThanOrEqualTo(Integer value) {
            addCriterion("receive_del_id <=", value, "receiveDelId");
            return (Criteria) this;
        }

        public Criteria andReceiveDelIdIn(List<Integer> values) {
            addCriterion("receive_del_id in", values, "receiveDelId");
            return (Criteria) this;
        }

        public Criteria andReceiveDelIdNotIn(List<Integer> values) {
            addCriterion("receive_del_id not in", values, "receiveDelId");
            return (Criteria) this;
        }

        public Criteria andReceiveDelIdBetween(Integer value1, Integer value2) {
            addCriterion("receive_del_id between", value1, value2, "receiveDelId");
            return (Criteria) this;
        }

        public Criteria andReceiveDelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("receive_del_id not between", value1, value2, "receiveDelId");
            return (Criteria) this;
        }

        public Criteria andRouteIdIsNull() {
            addCriterion("route_id is null");
            return (Criteria) this;
        }

        public Criteria andRouteIdIsNotNull() {
            addCriterion("route_id is not null");
            return (Criteria) this;
        }

        public Criteria andRouteIdEqualTo(Integer value) {
            addCriterion("route_id =", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotEqualTo(Integer value) {
            addCriterion("route_id <>", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdGreaterThan(Integer value) {
            addCriterion("route_id >", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("route_id >=", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdLessThan(Integer value) {
            addCriterion("route_id <", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdLessThanOrEqualTo(Integer value) {
            addCriterion("route_id <=", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdIn(List<Integer> values) {
            addCriterion("route_id in", values, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotIn(List<Integer> values) {
            addCriterion("route_id not in", values, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdBetween(Integer value1, Integer value2) {
            addCriterion("route_id between", value1, value2, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("route_id not between", value1, value2, "routeId");
            return (Criteria) this;
        }

        public Criteria andFrequencyIdIsNull() {
            addCriterion("frequency_id is null");
            return (Criteria) this;
        }

        public Criteria andFrequencyIdIsNotNull() {
            addCriterion("frequency_id is not null");
            return (Criteria) this;
        }

        public Criteria andFrequencyIdEqualTo(Integer value) {
            addCriterion("frequency_id =", value, "frequencyId");
            return (Criteria) this;
        }

        public Criteria andFrequencyIdNotEqualTo(Integer value) {
            addCriterion("frequency_id <>", value, "frequencyId");
            return (Criteria) this;
        }

        public Criteria andFrequencyIdGreaterThan(Integer value) {
            addCriterion("frequency_id >", value, "frequencyId");
            return (Criteria) this;
        }

        public Criteria andFrequencyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("frequency_id >=", value, "frequencyId");
            return (Criteria) this;
        }

        public Criteria andFrequencyIdLessThan(Integer value) {
            addCriterion("frequency_id <", value, "frequencyId");
            return (Criteria) this;
        }

        public Criteria andFrequencyIdLessThanOrEqualTo(Integer value) {
            addCriterion("frequency_id <=", value, "frequencyId");
            return (Criteria) this;
        }

        public Criteria andFrequencyIdIn(List<Integer> values) {
            addCriterion("frequency_id in", values, "frequencyId");
            return (Criteria) this;
        }

        public Criteria andFrequencyIdNotIn(List<Integer> values) {
            addCriterion("frequency_id not in", values, "frequencyId");
            return (Criteria) this;
        }

        public Criteria andFrequencyIdBetween(Integer value1, Integer value2) {
            addCriterion("frequency_id between", value1, value2, "frequencyId");
            return (Criteria) this;
        }

        public Criteria andFrequencyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("frequency_id not between", value1, value2, "frequencyId");
            return (Criteria) this;
        }

        public Criteria andDriverIdIsNull() {
            addCriterion("driver_id is null");
            return (Criteria) this;
        }

        public Criteria andDriverIdIsNotNull() {
            addCriterion("driver_id is not null");
            return (Criteria) this;
        }

        public Criteria andDriverIdEqualTo(Integer value) {
            addCriterion("driver_id =", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotEqualTo(Integer value) {
            addCriterion("driver_id <>", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThan(Integer value) {
            addCriterion("driver_id >", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("driver_id >=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThan(Integer value) {
            addCriterion("driver_id <", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThanOrEqualTo(Integer value) {
            addCriterion("driver_id <=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdIn(List<Integer> values) {
            addCriterion("driver_id in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotIn(List<Integer> values) {
            addCriterion("driver_id not in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdBetween(Integer value1, Integer value2) {
            addCriterion("driver_id between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotBetween(Integer value1, Integer value2) {
            addCriterion("driver_id not between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andInsteadGoodsPaymentIsNull() {
            addCriterion("instead_goods_payment is null");
            return (Criteria) this;
        }

        public Criteria andInsteadGoodsPaymentIsNotNull() {
            addCriterion("instead_goods_payment is not null");
            return (Criteria) this;
        }

        public Criteria andInsteadGoodsPaymentEqualTo(BigDecimal value) {
            addCriterion("instead_goods_payment =", value, "insteadGoodsPayment");
            return (Criteria) this;
        }

        public Criteria andInsteadGoodsPaymentNotEqualTo(BigDecimal value) {
            addCriterion("instead_goods_payment <>", value, "insteadGoodsPayment");
            return (Criteria) this;
        }

        public Criteria andInsteadGoodsPaymentGreaterThan(BigDecimal value) {
            addCriterion("instead_goods_payment >", value, "insteadGoodsPayment");
            return (Criteria) this;
        }

        public Criteria andInsteadGoodsPaymentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("instead_goods_payment >=", value, "insteadGoodsPayment");
            return (Criteria) this;
        }

        public Criteria andInsteadGoodsPaymentLessThan(BigDecimal value) {
            addCriterion("instead_goods_payment <", value, "insteadGoodsPayment");
            return (Criteria) this;
        }

        public Criteria andInsteadGoodsPaymentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("instead_goods_payment <=", value, "insteadGoodsPayment");
            return (Criteria) this;
        }

        public Criteria andInsteadGoodsPaymentIn(List<BigDecimal> values) {
            addCriterion("instead_goods_payment in", values, "insteadGoodsPayment");
            return (Criteria) this;
        }

        public Criteria andInsteadGoodsPaymentNotIn(List<BigDecimal> values) {
            addCriterion("instead_goods_payment not in", values, "insteadGoodsPayment");
            return (Criteria) this;
        }

        public Criteria andInsteadGoodsPaymentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("instead_goods_payment between", value1, value2, "insteadGoodsPayment");
            return (Criteria) this;
        }

        public Criteria andInsteadGoodsPaymentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("instead_goods_payment not between", value1, value2, "insteadGoodsPayment");
            return (Criteria) this;
        }

        public Criteria andInsteadServiceChargeIsNull() {
            addCriterion("instead_service_charge is null");
            return (Criteria) this;
        }

        public Criteria andInsteadServiceChargeIsNotNull() {
            addCriterion("instead_service_charge is not null");
            return (Criteria) this;
        }

        public Criteria andInsteadServiceChargeEqualTo(BigDecimal value) {
            addCriterion("instead_service_charge =", value, "insteadServiceCharge");
            return (Criteria) this;
        }

        public Criteria andInsteadServiceChargeNotEqualTo(BigDecimal value) {
            addCriterion("instead_service_charge <>", value, "insteadServiceCharge");
            return (Criteria) this;
        }

        public Criteria andInsteadServiceChargeGreaterThan(BigDecimal value) {
            addCriterion("instead_service_charge >", value, "insteadServiceCharge");
            return (Criteria) this;
        }

        public Criteria andInsteadServiceChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("instead_service_charge >=", value, "insteadServiceCharge");
            return (Criteria) this;
        }

        public Criteria andInsteadServiceChargeLessThan(BigDecimal value) {
            addCriterion("instead_service_charge <", value, "insteadServiceCharge");
            return (Criteria) this;
        }

        public Criteria andInsteadServiceChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("instead_service_charge <=", value, "insteadServiceCharge");
            return (Criteria) this;
        }

        public Criteria andInsteadServiceChargeIn(List<BigDecimal> values) {
            addCriterion("instead_service_charge in", values, "insteadServiceCharge");
            return (Criteria) this;
        }

        public Criteria andInsteadServiceChargeNotIn(List<BigDecimal> values) {
            addCriterion("instead_service_charge not in", values, "insteadServiceCharge");
            return (Criteria) this;
        }

        public Criteria andInsteadServiceChargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("instead_service_charge between", value1, value2, "insteadServiceCharge");
            return (Criteria) this;
        }

        public Criteria andInsteadServiceChargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("instead_service_charge not between", value1, value2, "insteadServiceCharge");
            return (Criteria) this;
        }

        public Criteria andDoorGetPaymentIsNull() {
            addCriterion("door_get_payment is null");
            return (Criteria) this;
        }

        public Criteria andDoorGetPaymentIsNotNull() {
            addCriterion("door_get_payment is not null");
            return (Criteria) this;
        }

        public Criteria andDoorGetPaymentEqualTo(BigDecimal value) {
            addCriterion("door_get_payment =", value, "doorGetPayment");
            return (Criteria) this;
        }

        public Criteria andDoorGetPaymentNotEqualTo(BigDecimal value) {
            addCriterion("door_get_payment <>", value, "doorGetPayment");
            return (Criteria) this;
        }

        public Criteria andDoorGetPaymentGreaterThan(BigDecimal value) {
            addCriterion("door_get_payment >", value, "doorGetPayment");
            return (Criteria) this;
        }

        public Criteria andDoorGetPaymentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("door_get_payment >=", value, "doorGetPayment");
            return (Criteria) this;
        }

        public Criteria andDoorGetPaymentLessThan(BigDecimal value) {
            addCriterion("door_get_payment <", value, "doorGetPayment");
            return (Criteria) this;
        }

        public Criteria andDoorGetPaymentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("door_get_payment <=", value, "doorGetPayment");
            return (Criteria) this;
        }

        public Criteria andDoorGetPaymentIn(List<BigDecimal> values) {
            addCriterion("door_get_payment in", values, "doorGetPayment");
            return (Criteria) this;
        }

        public Criteria andDoorGetPaymentNotIn(List<BigDecimal> values) {
            addCriterion("door_get_payment not in", values, "doorGetPayment");
            return (Criteria) this;
        }

        public Criteria andDoorGetPaymentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("door_get_payment between", value1, value2, "doorGetPayment");
            return (Criteria) this;
        }

        public Criteria andDoorGetPaymentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("door_get_payment not between", value1, value2, "doorGetPayment");
            return (Criteria) this;
        }

        public Criteria andDoorGetTimeIsNull() {
            addCriterion("door_get_time is null");
            return (Criteria) this;
        }

        public Criteria andDoorGetTimeIsNotNull() {
            addCriterion("door_get_time is not null");
            return (Criteria) this;
        }

        public Criteria andDoorGetTimeEqualTo(String value) {
            addCriterion("door_get_time =", value, "doorGetTime");
            return (Criteria) this;
        }

        public Criteria andDoorGetTimeNotEqualTo(String value) {
            addCriterion("door_get_time <>", value, "doorGetTime");
            return (Criteria) this;
        }

        public Criteria andDoorGetTimeGreaterThan(String value) {
            addCriterion("door_get_time >", value, "doorGetTime");
            return (Criteria) this;
        }

        public Criteria andDoorGetTimeGreaterThanOrEqualTo(String value) {
            addCriterion("door_get_time >=", value, "doorGetTime");
            return (Criteria) this;
        }

        public Criteria andDoorGetTimeLessThan(String value) {
            addCriterion("door_get_time <", value, "doorGetTime");
            return (Criteria) this;
        }

        public Criteria andDoorGetTimeLessThanOrEqualTo(String value) {
            addCriterion("door_get_time <=", value, "doorGetTime");
            return (Criteria) this;
        }

        public Criteria andDoorGetTimeLike(String value) {
            addCriterion("door_get_time like", value, "doorGetTime");
            return (Criteria) this;
        }

        public Criteria andDoorGetTimeNotLike(String value) {
            addCriterion("door_get_time not like", value, "doorGetTime");
            return (Criteria) this;
        }

        public Criteria andDoorGetTimeIn(List<String> values) {
            addCriterion("door_get_time in", values, "doorGetTime");
            return (Criteria) this;
        }

        public Criteria andDoorGetTimeNotIn(List<String> values) {
            addCriterion("door_get_time not in", values, "doorGetTime");
            return (Criteria) this;
        }

        public Criteria andDoorGetTimeBetween(String value1, String value2) {
            addCriterion("door_get_time between", value1, value2, "doorGetTime");
            return (Criteria) this;
        }

        public Criteria andDoorGetTimeNotBetween(String value1, String value2) {
            addCriterion("door_get_time not between", value1, value2, "doorGetTime");
            return (Criteria) this;
        }

        public Criteria andGoodsStatementValueIsNull() {
            addCriterion("goods_statement_value is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStatementValueIsNotNull() {
            addCriterion("goods_statement_value is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStatementValueEqualTo(BigDecimal value) {
            addCriterion("goods_statement_value =", value, "goodsStatementValue");
            return (Criteria) this;
        }

        public Criteria andGoodsStatementValueNotEqualTo(BigDecimal value) {
            addCriterion("goods_statement_value <>", value, "goodsStatementValue");
            return (Criteria) this;
        }

        public Criteria andGoodsStatementValueGreaterThan(BigDecimal value) {
            addCriterion("goods_statement_value >", value, "goodsStatementValue");
            return (Criteria) this;
        }

        public Criteria andGoodsStatementValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_statement_value >=", value, "goodsStatementValue");
            return (Criteria) this;
        }

        public Criteria andGoodsStatementValueLessThan(BigDecimal value) {
            addCriterion("goods_statement_value <", value, "goodsStatementValue");
            return (Criteria) this;
        }

        public Criteria andGoodsStatementValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_statement_value <=", value, "goodsStatementValue");
            return (Criteria) this;
        }

        public Criteria andGoodsStatementValueIn(List<BigDecimal> values) {
            addCriterion("goods_statement_value in", values, "goodsStatementValue");
            return (Criteria) this;
        }

        public Criteria andGoodsStatementValueNotIn(List<BigDecimal> values) {
            addCriterion("goods_statement_value not in", values, "goodsStatementValue");
            return (Criteria) this;
        }

        public Criteria andGoodsStatementValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_statement_value between", value1, value2, "goodsStatementValue");
            return (Criteria) this;
        }

        public Criteria andGoodsStatementValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_statement_value not between", value1, value2, "goodsStatementValue");
            return (Criteria) this;
        }

        public Criteria andInsuranceChargeIsNull() {
            addCriterion("insurance_charge is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceChargeIsNotNull() {
            addCriterion("insurance_charge is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceChargeEqualTo(BigDecimal value) {
            addCriterion("insurance_charge =", value, "insuranceCharge");
            return (Criteria) this;
        }

        public Criteria andInsuranceChargeNotEqualTo(BigDecimal value) {
            addCriterion("insurance_charge <>", value, "insuranceCharge");
            return (Criteria) this;
        }

        public Criteria andInsuranceChargeGreaterThan(BigDecimal value) {
            addCriterion("insurance_charge >", value, "insuranceCharge");
            return (Criteria) this;
        }

        public Criteria andInsuranceChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("insurance_charge >=", value, "insuranceCharge");
            return (Criteria) this;
        }

        public Criteria andInsuranceChargeLessThan(BigDecimal value) {
            addCriterion("insurance_charge <", value, "insuranceCharge");
            return (Criteria) this;
        }

        public Criteria andInsuranceChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("insurance_charge <=", value, "insuranceCharge");
            return (Criteria) this;
        }

        public Criteria andInsuranceChargeIn(List<BigDecimal> values) {
            addCriterion("insurance_charge in", values, "insuranceCharge");
            return (Criteria) this;
        }

        public Criteria andInsuranceChargeNotIn(List<BigDecimal> values) {
            addCriterion("insurance_charge not in", values, "insuranceCharge");
            return (Criteria) this;
        }

        public Criteria andInsuranceChargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insurance_charge between", value1, value2, "insuranceCharge");
            return (Criteria) this;
        }

        public Criteria andInsuranceChargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insurance_charge not between", value1, value2, "insuranceCharge");
            return (Criteria) this;
        }

        public Criteria andPackingChargeIsNull() {
            addCriterion("packing_charge is null");
            return (Criteria) this;
        }

        public Criteria andPackingChargeIsNotNull() {
            addCriterion("packing_charge is not null");
            return (Criteria) this;
        }

        public Criteria andPackingChargeEqualTo(BigDecimal value) {
            addCriterion("packing_charge =", value, "packingCharge");
            return (Criteria) this;
        }

        public Criteria andPackingChargeNotEqualTo(BigDecimal value) {
            addCriterion("packing_charge <>", value, "packingCharge");
            return (Criteria) this;
        }

        public Criteria andPackingChargeGreaterThan(BigDecimal value) {
            addCriterion("packing_charge >", value, "packingCharge");
            return (Criteria) this;
        }

        public Criteria andPackingChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("packing_charge >=", value, "packingCharge");
            return (Criteria) this;
        }

        public Criteria andPackingChargeLessThan(BigDecimal value) {
            addCriterion("packing_charge <", value, "packingCharge");
            return (Criteria) this;
        }

        public Criteria andPackingChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("packing_charge <=", value, "packingCharge");
            return (Criteria) this;
        }

        public Criteria andPackingChargeIn(List<BigDecimal> values) {
            addCriterion("packing_charge in", values, "packingCharge");
            return (Criteria) this;
        }

        public Criteria andPackingChargeNotIn(List<BigDecimal> values) {
            addCriterion("packing_charge not in", values, "packingCharge");
            return (Criteria) this;
        }

        public Criteria andPackingChargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("packing_charge between", value1, value2, "packingCharge");
            return (Criteria) this;
        }

        public Criteria andPackingChargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("packing_charge not between", value1, value2, "packingCharge");
            return (Criteria) this;
        }

        public Criteria andOtherChargeIsNull() {
            addCriterion("other_charge is null");
            return (Criteria) this;
        }

        public Criteria andOtherChargeIsNotNull() {
            addCriterion("other_charge is not null");
            return (Criteria) this;
        }

        public Criteria andOtherChargeEqualTo(BigDecimal value) {
            addCriterion("other_charge =", value, "otherCharge");
            return (Criteria) this;
        }

        public Criteria andOtherChargeNotEqualTo(BigDecimal value) {
            addCriterion("other_charge <>", value, "otherCharge");
            return (Criteria) this;
        }

        public Criteria andOtherChargeGreaterThan(BigDecimal value) {
            addCriterion("other_charge >", value, "otherCharge");
            return (Criteria) this;
        }

        public Criteria andOtherChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("other_charge >=", value, "otherCharge");
            return (Criteria) this;
        }

        public Criteria andOtherChargeLessThan(BigDecimal value) {
            addCriterion("other_charge <", value, "otherCharge");
            return (Criteria) this;
        }

        public Criteria andOtherChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("other_charge <=", value, "otherCharge");
            return (Criteria) this;
        }

        public Criteria andOtherChargeIn(List<BigDecimal> values) {
            addCriterion("other_charge in", values, "otherCharge");
            return (Criteria) this;
        }

        public Criteria andOtherChargeNotIn(List<BigDecimal> values) {
            addCriterion("other_charge not in", values, "otherCharge");
            return (Criteria) this;
        }

        public Criteria andOtherChargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("other_charge between", value1, value2, "otherCharge");
            return (Criteria) this;
        }

        public Criteria andOtherChargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("other_charge not between", value1, value2, "otherCharge");
            return (Criteria) this;
        }

        public Criteria andTotalAccountIsNull() {
            addCriterion("total_account is null");
            return (Criteria) this;
        }

        public Criteria andTotalAccountIsNotNull() {
            addCriterion("total_account is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAccountEqualTo(BigDecimal value) {
            addCriterion("total_account =", value, "totalAccount");
            return (Criteria) this;
        }

        public Criteria andTotalAccountNotEqualTo(BigDecimal value) {
            addCriterion("total_account <>", value, "totalAccount");
            return (Criteria) this;
        }

        public Criteria andTotalAccountGreaterThan(BigDecimal value) {
            addCriterion("total_account >", value, "totalAccount");
            return (Criteria) this;
        }

        public Criteria andTotalAccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_account >=", value, "totalAccount");
            return (Criteria) this;
        }

        public Criteria andTotalAccountLessThan(BigDecimal value) {
            addCriterion("total_account <", value, "totalAccount");
            return (Criteria) this;
        }

        public Criteria andTotalAccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_account <=", value, "totalAccount");
            return (Criteria) this;
        }

        public Criteria andTotalAccountIn(List<BigDecimal> values) {
            addCriterion("total_account in", values, "totalAccount");
            return (Criteria) this;
        }

        public Criteria andTotalAccountNotIn(List<BigDecimal> values) {
            addCriterion("total_account not in", values, "totalAccount");
            return (Criteria) this;
        }

        public Criteria andTotalAccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_account between", value1, value2, "totalAccount");
            return (Criteria) this;
        }

        public Criteria andTotalAccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_account not between", value1, value2, "totalAccount");
            return (Criteria) this;
        }

        public Criteria andFreightChargeIsNull() {
            addCriterion("freight_charge is null");
            return (Criteria) this;
        }

        public Criteria andFreightChargeIsNotNull() {
            addCriterion("freight_charge is not null");
            return (Criteria) this;
        }

        public Criteria andFreightChargeEqualTo(BigDecimal value) {
            addCriterion("freight_charge =", value, "freightCharge");
            return (Criteria) this;
        }

        public Criteria andFreightChargeNotEqualTo(BigDecimal value) {
            addCriterion("freight_charge <>", value, "freightCharge");
            return (Criteria) this;
        }

        public Criteria andFreightChargeGreaterThan(BigDecimal value) {
            addCriterion("freight_charge >", value, "freightCharge");
            return (Criteria) this;
        }

        public Criteria andFreightChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freight_charge >=", value, "freightCharge");
            return (Criteria) this;
        }

        public Criteria andFreightChargeLessThan(BigDecimal value) {
            addCriterion("freight_charge <", value, "freightCharge");
            return (Criteria) this;
        }

        public Criteria andFreightChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freight_charge <=", value, "freightCharge");
            return (Criteria) this;
        }

        public Criteria andFreightChargeIn(List<BigDecimal> values) {
            addCriterion("freight_charge in", values, "freightCharge");
            return (Criteria) this;
        }

        public Criteria andFreightChargeNotIn(List<BigDecimal> values) {
            addCriterion("freight_charge not in", values, "freightCharge");
            return (Criteria) this;
        }

        public Criteria andFreightChargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight_charge between", value1, value2, "freightCharge");
            return (Criteria) this;
        }

        public Criteria andFreightChargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight_charge not between", value1, value2, "freightCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeIsNull() {
            addCriterion("service_charge is null");
            return (Criteria) this;
        }

        public Criteria andServiceChargeIsNotNull() {
            addCriterion("service_charge is not null");
            return (Criteria) this;
        }

        public Criteria andServiceChargeEqualTo(BigDecimal value) {
            addCriterion("service_charge =", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeNotEqualTo(BigDecimal value) {
            addCriterion("service_charge <>", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeGreaterThan(BigDecimal value) {
            addCriterion("service_charge >", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("service_charge >=", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeLessThan(BigDecimal value) {
            addCriterion("service_charge <", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("service_charge <=", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeIn(List<BigDecimal> values) {
            addCriterion("service_charge in", values, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeNotIn(List<BigDecimal> values) {
            addCriterion("service_charge not in", values, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("service_charge between", value1, value2, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("service_charge not between", value1, value2, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andTotalChargeIsNull() {
            addCriterion("total_charge is null");
            return (Criteria) this;
        }

        public Criteria andTotalChargeIsNotNull() {
            addCriterion("total_charge is not null");
            return (Criteria) this;
        }

        public Criteria andTotalChargeEqualTo(BigDecimal value) {
            addCriterion("total_charge =", value, "totalCharge");
            return (Criteria) this;
        }

        public Criteria andTotalChargeNotEqualTo(BigDecimal value) {
            addCriterion("total_charge <>", value, "totalCharge");
            return (Criteria) this;
        }

        public Criteria andTotalChargeGreaterThan(BigDecimal value) {
            addCriterion("total_charge >", value, "totalCharge");
            return (Criteria) this;
        }

        public Criteria andTotalChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_charge >=", value, "totalCharge");
            return (Criteria) this;
        }

        public Criteria andTotalChargeLessThan(BigDecimal value) {
            addCriterion("total_charge <", value, "totalCharge");
            return (Criteria) this;
        }

        public Criteria andTotalChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_charge <=", value, "totalCharge");
            return (Criteria) this;
        }

        public Criteria andTotalChargeIn(List<BigDecimal> values) {
            addCriterion("total_charge in", values, "totalCharge");
            return (Criteria) this;
        }

        public Criteria andTotalChargeNotIn(List<BigDecimal> values) {
            addCriterion("total_charge not in", values, "totalCharge");
            return (Criteria) this;
        }

        public Criteria andTotalChargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_charge between", value1, value2, "totalCharge");
            return (Criteria) this;
        }

        public Criteria andTotalChargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_charge not between", value1, value2, "totalCharge");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNull() {
            addCriterion("payment_type is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNotNull() {
            addCriterion("payment_type is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeEqualTo(Integer value) {
            addCriterion("payment_type =", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotEqualTo(Integer value) {
            addCriterion("payment_type <>", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThan(Integer value) {
            addCriterion("payment_type >", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_type >=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThan(Integer value) {
            addCriterion("payment_type <", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("payment_type <=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIn(List<Integer> values) {
            addCriterion("payment_type in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotIn(List<Integer> values) {
            addCriterion("payment_type not in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeBetween(Integer value1, Integer value2) {
            addCriterion("payment_type between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_type not between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andIsCheckIsNull() {
            addCriterion("is_check is null");
            return (Criteria) this;
        }

        public Criteria andIsCheckIsNotNull() {
            addCriterion("is_check is not null");
            return (Criteria) this;
        }

        public Criteria andIsCheckEqualTo(String value) {
            addCriterion("is_check =", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotEqualTo(String value) {
            addCriterion("is_check <>", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckGreaterThan(String value) {
            addCriterion("is_check >", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckGreaterThanOrEqualTo(String value) {
            addCriterion("is_check >=", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLessThan(String value) {
            addCriterion("is_check <", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLessThanOrEqualTo(String value) {
            addCriterion("is_check <=", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLike(String value) {
            addCriterion("is_check like", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotLike(String value) {
            addCriterion("is_check not like", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckIn(List<String> values) {
            addCriterion("is_check in", values, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotIn(List<String> values) {
            addCriterion("is_check not in", values, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckBetween(String value1, String value2) {
            addCriterion("is_check between", value1, value2, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotBetween(String value1, String value2) {
            addCriterion("is_check not between", value1, value2, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsNoUseIsNull() {
            addCriterion("is_no_use is null");
            return (Criteria) this;
        }

        public Criteria andIsNoUseIsNotNull() {
            addCriterion("is_no_use is not null");
            return (Criteria) this;
        }

        public Criteria andIsNoUseEqualTo(String value) {
            addCriterion("is_no_use =", value, "isNoUse");
            return (Criteria) this;
        }

        public Criteria andIsNoUseNotEqualTo(String value) {
            addCriterion("is_no_use <>", value, "isNoUse");
            return (Criteria) this;
        }

        public Criteria andIsNoUseGreaterThan(String value) {
            addCriterion("is_no_use >", value, "isNoUse");
            return (Criteria) this;
        }

        public Criteria andIsNoUseGreaterThanOrEqualTo(String value) {
            addCriterion("is_no_use >=", value, "isNoUse");
            return (Criteria) this;
        }

        public Criteria andIsNoUseLessThan(String value) {
            addCriterion("is_no_use <", value, "isNoUse");
            return (Criteria) this;
        }

        public Criteria andIsNoUseLessThanOrEqualTo(String value) {
            addCriterion("is_no_use <=", value, "isNoUse");
            return (Criteria) this;
        }

        public Criteria andIsNoUseLike(String value) {
            addCriterion("is_no_use like", value, "isNoUse");
            return (Criteria) this;
        }

        public Criteria andIsNoUseNotLike(String value) {
            addCriterion("is_no_use not like", value, "isNoUse");
            return (Criteria) this;
        }

        public Criteria andIsNoUseIn(List<String> values) {
            addCriterion("is_no_use in", values, "isNoUse");
            return (Criteria) this;
        }

        public Criteria andIsNoUseNotIn(List<String> values) {
            addCriterion("is_no_use not in", values, "isNoUse");
            return (Criteria) this;
        }

        public Criteria andIsNoUseBetween(String value1, String value2) {
            addCriterion("is_no_use between", value1, value2, "isNoUse");
            return (Criteria) this;
        }

        public Criteria andIsNoUseNotBetween(String value1, String value2) {
            addCriterion("is_no_use not between", value1, value2, "isNoUse");
            return (Criteria) this;
        }

        public Criteria andActualGetIsNull() {
            addCriterion("actual_get is null");
            return (Criteria) this;
        }

        public Criteria andActualGetIsNotNull() {
            addCriterion("actual_get is not null");
            return (Criteria) this;
        }

        public Criteria andActualGetEqualTo(BigDecimal value) {
            addCriterion("actual_get =", value, "actualGet");
            return (Criteria) this;
        }

        public Criteria andActualGetNotEqualTo(BigDecimal value) {
            addCriterion("actual_get <>", value, "actualGet");
            return (Criteria) this;
        }

        public Criteria andActualGetGreaterThan(BigDecimal value) {
            addCriterion("actual_get >", value, "actualGet");
            return (Criteria) this;
        }

        public Criteria andActualGetGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_get >=", value, "actualGet");
            return (Criteria) this;
        }

        public Criteria andActualGetLessThan(BigDecimal value) {
            addCriterion("actual_get <", value, "actualGet");
            return (Criteria) this;
        }

        public Criteria andActualGetLessThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_get <=", value, "actualGet");
            return (Criteria) this;
        }

        public Criteria andActualGetIn(List<BigDecimal> values) {
            addCriterion("actual_get in", values, "actualGet");
            return (Criteria) this;
        }

        public Criteria andActualGetNotIn(List<BigDecimal> values) {
            addCriterion("actual_get not in", values, "actualGet");
            return (Criteria) this;
        }

        public Criteria andActualGetBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_get between", value1, value2, "actualGet");
            return (Criteria) this;
        }

        public Criteria andActualGetNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_get not between", value1, value2, "actualGet");
            return (Criteria) this;
        }

        public Criteria andIsEBusinessIsNull() {
            addCriterion("is_e_business is null");
            return (Criteria) this;
        }

        public Criteria andIsEBusinessIsNotNull() {
            addCriterion("is_e_business is not null");
            return (Criteria) this;
        }

        public Criteria andIsEBusinessEqualTo(String value) {
            addCriterion("is_e_business =", value, "isEBusiness");
            return (Criteria) this;
        }

        public Criteria andIsEBusinessNotEqualTo(String value) {
            addCriterion("is_e_business <>", value, "isEBusiness");
            return (Criteria) this;
        }

        public Criteria andIsEBusinessGreaterThan(String value) {
            addCriterion("is_e_business >", value, "isEBusiness");
            return (Criteria) this;
        }

        public Criteria andIsEBusinessGreaterThanOrEqualTo(String value) {
            addCriterion("is_e_business >=", value, "isEBusiness");
            return (Criteria) this;
        }

        public Criteria andIsEBusinessLessThan(String value) {
            addCriterion("is_e_business <", value, "isEBusiness");
            return (Criteria) this;
        }

        public Criteria andIsEBusinessLessThanOrEqualTo(String value) {
            addCriterion("is_e_business <=", value, "isEBusiness");
            return (Criteria) this;
        }

        public Criteria andIsEBusinessLike(String value) {
            addCriterion("is_e_business like", value, "isEBusiness");
            return (Criteria) this;
        }

        public Criteria andIsEBusinessNotLike(String value) {
            addCriterion("is_e_business not like", value, "isEBusiness");
            return (Criteria) this;
        }

        public Criteria andIsEBusinessIn(List<String> values) {
            addCriterion("is_e_business in", values, "isEBusiness");
            return (Criteria) this;
        }

        public Criteria andIsEBusinessNotIn(List<String> values) {
            addCriterion("is_e_business not in", values, "isEBusiness");
            return (Criteria) this;
        }

        public Criteria andIsEBusinessBetween(String value1, String value2) {
            addCriterion("is_e_business between", value1, value2, "isEBusiness");
            return (Criteria) this;
        }

        public Criteria andIsEBusinessNotBetween(String value1, String value2) {
            addCriterion("is_e_business not between", value1, value2, "isEBusiness");
            return (Criteria) this;
        }

        public Criteria andDriverRemarkIsNull() {
            addCriterion("driver_remark is null");
            return (Criteria) this;
        }

        public Criteria andDriverRemarkIsNotNull() {
            addCriterion("driver_remark is not null");
            return (Criteria) this;
        }

        public Criteria andDriverRemarkEqualTo(String value) {
            addCriterion("driver_remark =", value, "driverRemark");
            return (Criteria) this;
        }

        public Criteria andDriverRemarkNotEqualTo(String value) {
            addCriterion("driver_remark <>", value, "driverRemark");
            return (Criteria) this;
        }

        public Criteria andDriverRemarkGreaterThan(String value) {
            addCriterion("driver_remark >", value, "driverRemark");
            return (Criteria) this;
        }

        public Criteria andDriverRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("driver_remark >=", value, "driverRemark");
            return (Criteria) this;
        }

        public Criteria andDriverRemarkLessThan(String value) {
            addCriterion("driver_remark <", value, "driverRemark");
            return (Criteria) this;
        }

        public Criteria andDriverRemarkLessThanOrEqualTo(String value) {
            addCriterion("driver_remark <=", value, "driverRemark");
            return (Criteria) this;
        }

        public Criteria andDriverRemarkLike(String value) {
            addCriterion("driver_remark like", value, "driverRemark");
            return (Criteria) this;
        }

        public Criteria andDriverRemarkNotLike(String value) {
            addCriterion("driver_remark not like", value, "driverRemark");
            return (Criteria) this;
        }

        public Criteria andDriverRemarkIn(List<String> values) {
            addCriterion("driver_remark in", values, "driverRemark");
            return (Criteria) this;
        }

        public Criteria andDriverRemarkNotIn(List<String> values) {
            addCriterion("driver_remark not in", values, "driverRemark");
            return (Criteria) this;
        }

        public Criteria andDriverRemarkBetween(String value1, String value2) {
            addCriterion("driver_remark between", value1, value2, "driverRemark");
            return (Criteria) this;
        }

        public Criteria andDriverRemarkNotBetween(String value1, String value2) {
            addCriterion("driver_remark not between", value1, value2, "driverRemark");
            return (Criteria) this;
        }

        public Criteria andActualInsteadGetIsNull() {
            addCriterion("actual_instead_get is null");
            return (Criteria) this;
        }

        public Criteria andActualInsteadGetIsNotNull() {
            addCriterion("actual_instead_get is not null");
            return (Criteria) this;
        }

        public Criteria andActualInsteadGetEqualTo(BigDecimal value) {
            addCriterion("actual_instead_get =", value, "actualInsteadGet");
            return (Criteria) this;
        }

        public Criteria andActualInsteadGetNotEqualTo(BigDecimal value) {
            addCriterion("actual_instead_get <>", value, "actualInsteadGet");
            return (Criteria) this;
        }

        public Criteria andActualInsteadGetGreaterThan(BigDecimal value) {
            addCriterion("actual_instead_get >", value, "actualInsteadGet");
            return (Criteria) this;
        }

        public Criteria andActualInsteadGetGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_instead_get >=", value, "actualInsteadGet");
            return (Criteria) this;
        }

        public Criteria andActualInsteadGetLessThan(BigDecimal value) {
            addCriterion("actual_instead_get <", value, "actualInsteadGet");
            return (Criteria) this;
        }

        public Criteria andActualInsteadGetLessThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_instead_get <=", value, "actualInsteadGet");
            return (Criteria) this;
        }

        public Criteria andActualInsteadGetIn(List<BigDecimal> values) {
            addCriterion("actual_instead_get in", values, "actualInsteadGet");
            return (Criteria) this;
        }

        public Criteria andActualInsteadGetNotIn(List<BigDecimal> values) {
            addCriterion("actual_instead_get not in", values, "actualInsteadGet");
            return (Criteria) this;
        }

        public Criteria andActualInsteadGetBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_instead_get between", value1, value2, "actualInsteadGet");
            return (Criteria) this;
        }

        public Criteria andActualInsteadGetNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_instead_get not between", value1, value2, "actualInsteadGet");
            return (Criteria) this;
        }

        public Criteria andIsBalanceIsNull() {
            addCriterion("is_balance is null");
            return (Criteria) this;
        }

        public Criteria andIsBalanceIsNotNull() {
            addCriterion("is_balance is not null");
            return (Criteria) this;
        }

        public Criteria andIsBalanceEqualTo(String value) {
            addCriterion("is_balance =", value, "isBalance");
            return (Criteria) this;
        }

        public Criteria andIsBalanceNotEqualTo(String value) {
            addCriterion("is_balance <>", value, "isBalance");
            return (Criteria) this;
        }

        public Criteria andIsBalanceGreaterThan(String value) {
            addCriterion("is_balance >", value, "isBalance");
            return (Criteria) this;
        }

        public Criteria andIsBalanceGreaterThanOrEqualTo(String value) {
            addCriterion("is_balance >=", value, "isBalance");
            return (Criteria) this;
        }

        public Criteria andIsBalanceLessThan(String value) {
            addCriterion("is_balance <", value, "isBalance");
            return (Criteria) this;
        }

        public Criteria andIsBalanceLessThanOrEqualTo(String value) {
            addCriterion("is_balance <=", value, "isBalance");
            return (Criteria) this;
        }

        public Criteria andIsBalanceLike(String value) {
            addCriterion("is_balance like", value, "isBalance");
            return (Criteria) this;
        }

        public Criteria andIsBalanceNotLike(String value) {
            addCriterion("is_balance not like", value, "isBalance");
            return (Criteria) this;
        }

        public Criteria andIsBalanceIn(List<String> values) {
            addCriterion("is_balance in", values, "isBalance");
            return (Criteria) this;
        }

        public Criteria andIsBalanceNotIn(List<String> values) {
            addCriterion("is_balance not in", values, "isBalance");
            return (Criteria) this;
        }

        public Criteria andIsBalanceBetween(String value1, String value2) {
            addCriterion("is_balance between", value1, value2, "isBalance");
            return (Criteria) this;
        }

        public Criteria andIsBalanceNotBetween(String value1, String value2) {
            addCriterion("is_balance not between", value1, value2, "isBalance");
            return (Criteria) this;
        }

        public Criteria andIsBalanceInsteadIsNull() {
            addCriterion("is_balance_instead is null");
            return (Criteria) this;
        }

        public Criteria andIsBalanceInsteadIsNotNull() {
            addCriterion("is_balance_instead is not null");
            return (Criteria) this;
        }

        public Criteria andIsBalanceInsteadEqualTo(String value) {
            addCriterion("is_balance_instead =", value, "isBalanceInstead");
            return (Criteria) this;
        }

        public Criteria andIsBalanceInsteadNotEqualTo(String value) {
            addCriterion("is_balance_instead <>", value, "isBalanceInstead");
            return (Criteria) this;
        }

        public Criteria andIsBalanceInsteadGreaterThan(String value) {
            addCriterion("is_balance_instead >", value, "isBalanceInstead");
            return (Criteria) this;
        }

        public Criteria andIsBalanceInsteadGreaterThanOrEqualTo(String value) {
            addCriterion("is_balance_instead >=", value, "isBalanceInstead");
            return (Criteria) this;
        }

        public Criteria andIsBalanceInsteadLessThan(String value) {
            addCriterion("is_balance_instead <", value, "isBalanceInstead");
            return (Criteria) this;
        }

        public Criteria andIsBalanceInsteadLessThanOrEqualTo(String value) {
            addCriterion("is_balance_instead <=", value, "isBalanceInstead");
            return (Criteria) this;
        }

        public Criteria andIsBalanceInsteadLike(String value) {
            addCriterion("is_balance_instead like", value, "isBalanceInstead");
            return (Criteria) this;
        }

        public Criteria andIsBalanceInsteadNotLike(String value) {
            addCriterion("is_balance_instead not like", value, "isBalanceInstead");
            return (Criteria) this;
        }

        public Criteria andIsBalanceInsteadIn(List<String> values) {
            addCriterion("is_balance_instead in", values, "isBalanceInstead");
            return (Criteria) this;
        }

        public Criteria andIsBalanceInsteadNotIn(List<String> values) {
            addCriterion("is_balance_instead not in", values, "isBalanceInstead");
            return (Criteria) this;
        }

        public Criteria andIsBalanceInsteadBetween(String value1, String value2) {
            addCriterion("is_balance_instead between", value1, value2, "isBalanceInstead");
            return (Criteria) this;
        }

        public Criteria andIsBalanceInsteadNotBetween(String value1, String value2) {
            addCriterion("is_balance_instead not between", value1, value2, "isBalanceInstead");
            return (Criteria) this;
        }

        public Criteria andIsGiveOutIsNull() {
            addCriterion("is_give_out is null");
            return (Criteria) this;
        }

        public Criteria andIsGiveOutIsNotNull() {
            addCriterion("is_give_out is not null");
            return (Criteria) this;
        }

        public Criteria andIsGiveOutEqualTo(String value) {
            addCriterion("is_give_out =", value, "isGiveOut");
            return (Criteria) this;
        }

        public Criteria andIsGiveOutNotEqualTo(String value) {
            addCriterion("is_give_out <>", value, "isGiveOut");
            return (Criteria) this;
        }

        public Criteria andIsGiveOutGreaterThan(String value) {
            addCriterion("is_give_out >", value, "isGiveOut");
            return (Criteria) this;
        }

        public Criteria andIsGiveOutGreaterThanOrEqualTo(String value) {
            addCriterion("is_give_out >=", value, "isGiveOut");
            return (Criteria) this;
        }

        public Criteria andIsGiveOutLessThan(String value) {
            addCriterion("is_give_out <", value, "isGiveOut");
            return (Criteria) this;
        }

        public Criteria andIsGiveOutLessThanOrEqualTo(String value) {
            addCriterion("is_give_out <=", value, "isGiveOut");
            return (Criteria) this;
        }

        public Criteria andIsGiveOutLike(String value) {
            addCriterion("is_give_out like", value, "isGiveOut");
            return (Criteria) this;
        }

        public Criteria andIsGiveOutNotLike(String value) {
            addCriterion("is_give_out not like", value, "isGiveOut");
            return (Criteria) this;
        }

        public Criteria andIsGiveOutIn(List<String> values) {
            addCriterion("is_give_out in", values, "isGiveOut");
            return (Criteria) this;
        }

        public Criteria andIsGiveOutNotIn(List<String> values) {
            addCriterion("is_give_out not in", values, "isGiveOut");
            return (Criteria) this;
        }

        public Criteria andIsGiveOutBetween(String value1, String value2) {
            addCriterion("is_give_out between", value1, value2, "isGiveOut");
            return (Criteria) this;
        }

        public Criteria andIsGiveOutNotBetween(String value1, String value2) {
            addCriterion("is_give_out not between", value1, value2, "isGiveOut");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNull() {
            addCriterion("operator_id is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNotNull() {
            addCriterion("operator_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdEqualTo(Integer value) {
            addCriterion("operator_id =", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotEqualTo(Integer value) {
            addCriterion("operator_id <>", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThan(Integer value) {
            addCriterion("operator_id >", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("operator_id >=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThan(Integer value) {
            addCriterion("operator_id <", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThanOrEqualTo(Integer value) {
            addCriterion("operator_id <=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIn(List<Integer> values) {
            addCriterion("operator_id in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotIn(List<Integer> values) {
            addCriterion("operator_id not in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdBetween(Integer value1, Integer value2) {
            addCriterion("operator_id between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("operator_id not between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameIsNull() {
            addCriterion("logistics_company_name is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameIsNotNull() {
            addCriterion("logistics_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameEqualTo(String value) {
            addCriterion("logistics_company_name =", value, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameNotEqualTo(String value) {
            addCriterion("logistics_company_name <>", value, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameGreaterThan(String value) {
            addCriterion("logistics_company_name >", value, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("logistics_company_name >=", value, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameLessThan(String value) {
            addCriterion("logistics_company_name <", value, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("logistics_company_name <=", value, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameLike(String value) {
            addCriterion("logistics_company_name like", value, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameNotLike(String value) {
            addCriterion("logistics_company_name not like", value, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameIn(List<String> values) {
            addCriterion("logistics_company_name in", values, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameNotIn(List<String> values) {
            addCriterion("logistics_company_name not in", values, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameBetween(String value1, String value2) {
            addCriterion("logistics_company_name between", value1, value2, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameNotBetween(String value1, String value2) {
            addCriterion("logistics_company_name not between", value1, value2, "logisticsCompanyName");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}