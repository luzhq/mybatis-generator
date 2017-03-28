package com.morning.star.dms.order.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DmsOrderInfoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DmsOrderInfoCriteria() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("orderId =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("orderId <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("orderId >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("orderId >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("orderId <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("orderId <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("orderId in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("orderId not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("orderId between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("orderId not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("orderNo is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("orderNo is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("orderNo =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("orderNo <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("orderNo >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("orderNo >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("orderNo <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("orderNo <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("orderNo like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("orderNo not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("orderNo in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("orderNo not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("orderNo between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("orderNo not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoIsNull() {
            addCriterion("outOrderNo is null");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoIsNotNull() {
            addCriterion("outOrderNo is not null");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoEqualTo(String value) {
            addCriterion("outOrderNo =", value, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoNotEqualTo(String value) {
            addCriterion("outOrderNo <>", value, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoGreaterThan(String value) {
            addCriterion("outOrderNo >", value, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("outOrderNo >=", value, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoLessThan(String value) {
            addCriterion("outOrderNo <", value, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoLessThanOrEqualTo(String value) {
            addCriterion("outOrderNo <=", value, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoLike(String value) {
            addCriterion("outOrderNo like", value, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoNotLike(String value) {
            addCriterion("outOrderNo not like", value, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoIn(List<String> values) {
            addCriterion("outOrderNo in", values, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoNotIn(List<String> values) {
            addCriterion("outOrderNo not in", values, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoBetween(String value1, String value2) {
            addCriterion("outOrderNo between", value1, value2, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoNotBetween(String value1, String value2) {
            addCriterion("outOrderNo not between", value1, value2, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andPackageCodeIsNull() {
            addCriterion("packageCode is null");
            return (Criteria) this;
        }

        public Criteria andPackageCodeIsNotNull() {
            addCriterion("packageCode is not null");
            return (Criteria) this;
        }

        public Criteria andPackageCodeEqualTo(String value) {
            addCriterion("packageCode =", value, "packageCode");
            return (Criteria) this;
        }

        public Criteria andPackageCodeNotEqualTo(String value) {
            addCriterion("packageCode <>", value, "packageCode");
            return (Criteria) this;
        }

        public Criteria andPackageCodeGreaterThan(String value) {
            addCriterion("packageCode >", value, "packageCode");
            return (Criteria) this;
        }

        public Criteria andPackageCodeGreaterThanOrEqualTo(String value) {
            addCriterion("packageCode >=", value, "packageCode");
            return (Criteria) this;
        }

        public Criteria andPackageCodeLessThan(String value) {
            addCriterion("packageCode <", value, "packageCode");
            return (Criteria) this;
        }

        public Criteria andPackageCodeLessThanOrEqualTo(String value) {
            addCriterion("packageCode <=", value, "packageCode");
            return (Criteria) this;
        }

        public Criteria andPackageCodeLike(String value) {
            addCriterion("packageCode like", value, "packageCode");
            return (Criteria) this;
        }

        public Criteria andPackageCodeNotLike(String value) {
            addCriterion("packageCode not like", value, "packageCode");
            return (Criteria) this;
        }

        public Criteria andPackageCodeIn(List<String> values) {
            addCriterion("packageCode in", values, "packageCode");
            return (Criteria) this;
        }

        public Criteria andPackageCodeNotIn(List<String> values) {
            addCriterion("packageCode not in", values, "packageCode");
            return (Criteria) this;
        }

        public Criteria andPackageCodeBetween(String value1, String value2) {
            addCriterion("packageCode between", value1, value2, "packageCode");
            return (Criteria) this;
        }

        public Criteria andPackageCodeNotBetween(String value1, String value2) {
            addCriterion("packageCode not between", value1, value2, "packageCode");
            return (Criteria) this;
        }

        public Criteria andLockApplyCodeIsNull() {
            addCriterion("lockApplyCode is null");
            return (Criteria) this;
        }

        public Criteria andLockApplyCodeIsNotNull() {
            addCriterion("lockApplyCode is not null");
            return (Criteria) this;
        }

        public Criteria andLockApplyCodeEqualTo(String value) {
            addCriterion("lockApplyCode =", value, "lockApplyCode");
            return (Criteria) this;
        }

        public Criteria andLockApplyCodeNotEqualTo(String value) {
            addCriterion("lockApplyCode <>", value, "lockApplyCode");
            return (Criteria) this;
        }

        public Criteria andLockApplyCodeGreaterThan(String value) {
            addCriterion("lockApplyCode >", value, "lockApplyCode");
            return (Criteria) this;
        }

        public Criteria andLockApplyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("lockApplyCode >=", value, "lockApplyCode");
            return (Criteria) this;
        }

        public Criteria andLockApplyCodeLessThan(String value) {
            addCriterion("lockApplyCode <", value, "lockApplyCode");
            return (Criteria) this;
        }

        public Criteria andLockApplyCodeLessThanOrEqualTo(String value) {
            addCriterion("lockApplyCode <=", value, "lockApplyCode");
            return (Criteria) this;
        }

        public Criteria andLockApplyCodeLike(String value) {
            addCriterion("lockApplyCode like", value, "lockApplyCode");
            return (Criteria) this;
        }

        public Criteria andLockApplyCodeNotLike(String value) {
            addCriterion("lockApplyCode not like", value, "lockApplyCode");
            return (Criteria) this;
        }

        public Criteria andLockApplyCodeIn(List<String> values) {
            addCriterion("lockApplyCode in", values, "lockApplyCode");
            return (Criteria) this;
        }

        public Criteria andLockApplyCodeNotIn(List<String> values) {
            addCriterion("lockApplyCode not in", values, "lockApplyCode");
            return (Criteria) this;
        }

        public Criteria andLockApplyCodeBetween(String value1, String value2) {
            addCriterion("lockApplyCode between", value1, value2, "lockApplyCode");
            return (Criteria) this;
        }

        public Criteria andLockApplyCodeNotBetween(String value1, String value2) {
            addCriterion("lockApplyCode not between", value1, value2, "lockApplyCode");
            return (Criteria) this;
        }

        public Criteria andPayNoIsNull() {
            addCriterion("payNo is null");
            return (Criteria) this;
        }

        public Criteria andPayNoIsNotNull() {
            addCriterion("payNo is not null");
            return (Criteria) this;
        }

        public Criteria andPayNoEqualTo(String value) {
            addCriterion("payNo =", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotEqualTo(String value) {
            addCriterion("payNo <>", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoGreaterThan(String value) {
            addCriterion("payNo >", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoGreaterThanOrEqualTo(String value) {
            addCriterion("payNo >=", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoLessThan(String value) {
            addCriterion("payNo <", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoLessThanOrEqualTo(String value) {
            addCriterion("payNo <=", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoLike(String value) {
            addCriterion("payNo like", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotLike(String value) {
            addCriterion("payNo not like", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoIn(List<String> values) {
            addCriterion("payNo in", values, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotIn(List<String> values) {
            addCriterion("payNo not in", values, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoBetween(String value1, String value2) {
            addCriterion("payNo between", value1, value2, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotBetween(String value1, String value2) {
            addCriterion("payNo not between", value1, value2, "payNo");
            return (Criteria) this;
        }

        public Criteria andDistributorCodeIsNull() {
            addCriterion("distributorCode is null");
            return (Criteria) this;
        }

        public Criteria andDistributorCodeIsNotNull() {
            addCriterion("distributorCode is not null");
            return (Criteria) this;
        }

        public Criteria andDistributorCodeEqualTo(String value) {
            addCriterion("distributorCode =", value, "distributorCode");
            return (Criteria) this;
        }

        public Criteria andDistributorCodeNotEqualTo(String value) {
            addCriterion("distributorCode <>", value, "distributorCode");
            return (Criteria) this;
        }

        public Criteria andDistributorCodeGreaterThan(String value) {
            addCriterion("distributorCode >", value, "distributorCode");
            return (Criteria) this;
        }

        public Criteria andDistributorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("distributorCode >=", value, "distributorCode");
            return (Criteria) this;
        }

        public Criteria andDistributorCodeLessThan(String value) {
            addCriterion("distributorCode <", value, "distributorCode");
            return (Criteria) this;
        }

        public Criteria andDistributorCodeLessThanOrEqualTo(String value) {
            addCriterion("distributorCode <=", value, "distributorCode");
            return (Criteria) this;
        }

        public Criteria andDistributorCodeLike(String value) {
            addCriterion("distributorCode like", value, "distributorCode");
            return (Criteria) this;
        }

        public Criteria andDistributorCodeNotLike(String value) {
            addCriterion("distributorCode not like", value, "distributorCode");
            return (Criteria) this;
        }

        public Criteria andDistributorCodeIn(List<String> values) {
            addCriterion("distributorCode in", values, "distributorCode");
            return (Criteria) this;
        }

        public Criteria andDistributorCodeNotIn(List<String> values) {
            addCriterion("distributorCode not in", values, "distributorCode");
            return (Criteria) this;
        }

        public Criteria andDistributorCodeBetween(String value1, String value2) {
            addCriterion("distributorCode between", value1, value2, "distributorCode");
            return (Criteria) this;
        }

        public Criteria andDistributorCodeNotBetween(String value1, String value2) {
            addCriterion("distributorCode not between", value1, value2, "distributorCode");
            return (Criteria) this;
        }

        public Criteria andDistributorNameIsNull() {
            addCriterion("distributorName is null");
            return (Criteria) this;
        }

        public Criteria andDistributorNameIsNotNull() {
            addCriterion("distributorName is not null");
            return (Criteria) this;
        }

        public Criteria andDistributorNameEqualTo(String value) {
            addCriterion("distributorName =", value, "distributorName");
            return (Criteria) this;
        }

        public Criteria andDistributorNameNotEqualTo(String value) {
            addCriterion("distributorName <>", value, "distributorName");
            return (Criteria) this;
        }

        public Criteria andDistributorNameGreaterThan(String value) {
            addCriterion("distributorName >", value, "distributorName");
            return (Criteria) this;
        }

        public Criteria andDistributorNameGreaterThanOrEqualTo(String value) {
            addCriterion("distributorName >=", value, "distributorName");
            return (Criteria) this;
        }

        public Criteria andDistributorNameLessThan(String value) {
            addCriterion("distributorName <", value, "distributorName");
            return (Criteria) this;
        }

        public Criteria andDistributorNameLessThanOrEqualTo(String value) {
            addCriterion("distributorName <=", value, "distributorName");
            return (Criteria) this;
        }

        public Criteria andDistributorNameLike(String value) {
            addCriterion("distributorName like", value, "distributorName");
            return (Criteria) this;
        }

        public Criteria andDistributorNameNotLike(String value) {
            addCriterion("distributorName not like", value, "distributorName");
            return (Criteria) this;
        }

        public Criteria andDistributorNameIn(List<String> values) {
            addCriterion("distributorName in", values, "distributorName");
            return (Criteria) this;
        }

        public Criteria andDistributorNameNotIn(List<String> values) {
            addCriterion("distributorName not in", values, "distributorName");
            return (Criteria) this;
        }

        public Criteria andDistributorNameBetween(String value1, String value2) {
            addCriterion("distributorName between", value1, value2, "distributorName");
            return (Criteria) this;
        }

        public Criteria andDistributorNameNotBetween(String value1, String value2) {
            addCriterion("distributorName not between", value1, value2, "distributorName");
            return (Criteria) this;
        }

        public Criteria andClearanceTypeIsNull() {
            addCriterion("clearanceType is null");
            return (Criteria) this;
        }

        public Criteria andClearanceTypeIsNotNull() {
            addCriterion("clearanceType is not null");
            return (Criteria) this;
        }

        public Criteria andClearanceTypeEqualTo(String value) {
            addCriterion("clearanceType =", value, "clearanceType");
            return (Criteria) this;
        }

        public Criteria andClearanceTypeNotEqualTo(String value) {
            addCriterion("clearanceType <>", value, "clearanceType");
            return (Criteria) this;
        }

        public Criteria andClearanceTypeGreaterThan(String value) {
            addCriterion("clearanceType >", value, "clearanceType");
            return (Criteria) this;
        }

        public Criteria andClearanceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("clearanceType >=", value, "clearanceType");
            return (Criteria) this;
        }

        public Criteria andClearanceTypeLessThan(String value) {
            addCriterion("clearanceType <", value, "clearanceType");
            return (Criteria) this;
        }

        public Criteria andClearanceTypeLessThanOrEqualTo(String value) {
            addCriterion("clearanceType <=", value, "clearanceType");
            return (Criteria) this;
        }

        public Criteria andClearanceTypeLike(String value) {
            addCriterion("clearanceType like", value, "clearanceType");
            return (Criteria) this;
        }

        public Criteria andClearanceTypeNotLike(String value) {
            addCriterion("clearanceType not like", value, "clearanceType");
            return (Criteria) this;
        }

        public Criteria andClearanceTypeIn(List<String> values) {
            addCriterion("clearanceType in", values, "clearanceType");
            return (Criteria) this;
        }

        public Criteria andClearanceTypeNotIn(List<String> values) {
            addCriterion("clearanceType not in", values, "clearanceType");
            return (Criteria) this;
        }

        public Criteria andClearanceTypeBetween(String value1, String value2) {
            addCriterion("clearanceType between", value1, value2, "clearanceType");
            return (Criteria) this;
        }

        public Criteria andClearanceTypeNotBetween(String value1, String value2) {
            addCriterion("clearanceType not between", value1, value2, "clearanceType");
            return (Criteria) this;
        }

        public Criteria andTaxationIsNull() {
            addCriterion("taxation is null");
            return (Criteria) this;
        }

        public Criteria andTaxationIsNotNull() {
            addCriterion("taxation is not null");
            return (Criteria) this;
        }

        public Criteria andTaxationEqualTo(BigDecimal value) {
            addCriterion("taxation =", value, "taxation");
            return (Criteria) this;
        }

        public Criteria andTaxationNotEqualTo(BigDecimal value) {
            addCriterion("taxation <>", value, "taxation");
            return (Criteria) this;
        }

        public Criteria andTaxationGreaterThan(BigDecimal value) {
            addCriterion("taxation >", value, "taxation");
            return (Criteria) this;
        }

        public Criteria andTaxationGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("taxation >=", value, "taxation");
            return (Criteria) this;
        }

        public Criteria andTaxationLessThan(BigDecimal value) {
            addCriterion("taxation <", value, "taxation");
            return (Criteria) this;
        }

        public Criteria andTaxationLessThanOrEqualTo(BigDecimal value) {
            addCriterion("taxation <=", value, "taxation");
            return (Criteria) this;
        }

        public Criteria andTaxationIn(List<BigDecimal> values) {
            addCriterion("taxation in", values, "taxation");
            return (Criteria) this;
        }

        public Criteria andTaxationNotIn(List<BigDecimal> values) {
            addCriterion("taxation not in", values, "taxation");
            return (Criteria) this;
        }

        public Criteria andTaxationBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("taxation between", value1, value2, "taxation");
            return (Criteria) this;
        }

        public Criteria andTaxationNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("taxation not between", value1, value2, "taxation");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("totalAmount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("totalAmount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(BigDecimal value) {
            addCriterion("totalAmount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("totalAmount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("totalAmount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("totalAmount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(BigDecimal value) {
            addCriterion("totalAmount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("totalAmount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<BigDecimal> values) {
            addCriterion("totalAmount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("totalAmount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalAmount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalAmount not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeIsNull() {
            addCriterion("discountFee is null");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeIsNotNull() {
            addCriterion("discountFee is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeEqualTo(BigDecimal value) {
            addCriterion("discountFee =", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeNotEqualTo(BigDecimal value) {
            addCriterion("discountFee <>", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeGreaterThan(BigDecimal value) {
            addCriterion("discountFee >", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discountFee >=", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeLessThan(BigDecimal value) {
            addCriterion("discountFee <", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discountFee <=", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeIn(List<BigDecimal> values) {
            addCriterion("discountFee in", values, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeNotIn(List<BigDecimal> values) {
            addCriterion("discountFee not in", values, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discountFee between", value1, value2, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discountFee not between", value1, value2, "discountFee");
            return (Criteria) this;
        }

        public Criteria andSaleAmountIsNull() {
            addCriterion("saleAmount is null");
            return (Criteria) this;
        }

        public Criteria andSaleAmountIsNotNull() {
            addCriterion("saleAmount is not null");
            return (Criteria) this;
        }

        public Criteria andSaleAmountEqualTo(BigDecimal value) {
            addCriterion("saleAmount =", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountNotEqualTo(BigDecimal value) {
            addCriterion("saleAmount <>", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountGreaterThan(BigDecimal value) {
            addCriterion("saleAmount >", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("saleAmount >=", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountLessThan(BigDecimal value) {
            addCriterion("saleAmount <", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("saleAmount <=", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountIn(List<BigDecimal> values) {
            addCriterion("saleAmount in", values, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountNotIn(List<BigDecimal> values) {
            addCriterion("saleAmount not in", values, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("saleAmount between", value1, value2, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("saleAmount not between", value1, value2, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andLogisticsFeeIsNull() {
            addCriterion("logisticsFee is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsFeeIsNotNull() {
            addCriterion("logisticsFee is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsFeeEqualTo(BigDecimal value) {
            addCriterion("logisticsFee =", value, "logisticsFee");
            return (Criteria) this;
        }

        public Criteria andLogisticsFeeNotEqualTo(BigDecimal value) {
            addCriterion("logisticsFee <>", value, "logisticsFee");
            return (Criteria) this;
        }

        public Criteria andLogisticsFeeGreaterThan(BigDecimal value) {
            addCriterion("logisticsFee >", value, "logisticsFee");
            return (Criteria) this;
        }

        public Criteria andLogisticsFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("logisticsFee >=", value, "logisticsFee");
            return (Criteria) this;
        }

        public Criteria andLogisticsFeeLessThan(BigDecimal value) {
            addCriterion("logisticsFee <", value, "logisticsFee");
            return (Criteria) this;
        }

        public Criteria andLogisticsFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("logisticsFee <=", value, "logisticsFee");
            return (Criteria) this;
        }

        public Criteria andLogisticsFeeIn(List<BigDecimal> values) {
            addCriterion("logisticsFee in", values, "logisticsFee");
            return (Criteria) this;
        }

        public Criteria andLogisticsFeeNotIn(List<BigDecimal> values) {
            addCriterion("logisticsFee not in", values, "logisticsFee");
            return (Criteria) this;
        }

        public Criteria andLogisticsFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("logisticsFee between", value1, value2, "logisticsFee");
            return (Criteria) this;
        }

        public Criteria andLogisticsFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("logisticsFee not between", value1, value2, "logisticsFee");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNull() {
            addCriterion("owner is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("owner is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(String value) {
            addCriterion("owner =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(String value) {
            addCriterion("owner <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(String value) {
            addCriterion("owner >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("owner >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(String value) {
            addCriterion("owner <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(String value) {
            addCriterion("owner <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLike(String value) {
            addCriterion("owner like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotLike(String value) {
            addCriterion("owner not like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<String> values) {
            addCriterion("owner in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<String> values) {
            addCriterion("owner not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(String value1, String value2) {
            addCriterion("owner between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(String value1, String value2) {
            addCriterion("owner not between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("orderStatus is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("orderStatus is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("orderStatus =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("orderStatus <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("orderStatus >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("orderStatus >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("orderStatus <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("orderStatus <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("orderStatus like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("orderStatus not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("orderStatus in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("orderStatus not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("orderStatus between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("orderStatus not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("auditStatus is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("auditStatus is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(String value) {
            addCriterion("auditStatus =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(String value) {
            addCriterion("auditStatus <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(String value) {
            addCriterion("auditStatus >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(String value) {
            addCriterion("auditStatus >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(String value) {
            addCriterion("auditStatus <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(String value) {
            addCriterion("auditStatus <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLike(String value) {
            addCriterion("auditStatus like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotLike(String value) {
            addCriterion("auditStatus not like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<String> values) {
            addCriterion("auditStatus in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<String> values) {
            addCriterion("auditStatus not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(String value1, String value2) {
            addCriterion("auditStatus between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(String value1, String value2) {
            addCriterion("auditStatus not between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIsNull() {
            addCriterion("submitTime is null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIsNotNull() {
            addCriterion("submitTime is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeEqualTo(Date value) {
            addCriterion("submitTime =", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotEqualTo(Date value) {
            addCriterion("submitTime <>", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThan(Date value) {
            addCriterion("submitTime >", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("submitTime >=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThan(Date value) {
            addCriterion("submitTime <", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThanOrEqualTo(Date value) {
            addCriterion("submitTime <=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIn(List<Date> values) {
            addCriterion("submitTime in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotIn(List<Date> values) {
            addCriterion("submitTime not in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeBetween(Date value1, Date value2) {
            addCriterion("submitTime between", value1, value2, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotBetween(Date value1, Date value2) {
            addCriterion("submitTime not between", value1, value2, "submitTime");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("payType is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("payType is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(String value) {
            addCriterion("payType =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(String value) {
            addCriterion("payType <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(String value) {
            addCriterion("payType >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("payType >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(String value) {
            addCriterion("payType <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(String value) {
            addCriterion("payType <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLike(String value) {
            addCriterion("payType like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotLike(String value) {
            addCriterion("payType not like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<String> values) {
            addCriterion("payType in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<String> values) {
            addCriterion("payType not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(String value1, String value2) {
            addCriterion("payType between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(String value1, String value2) {
            addCriterion("payType not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("payTime is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("payTime is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("payTime =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("payTime <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("payTime >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payTime >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("payTime <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("payTime <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("payTime in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("payTime not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("payTime between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("payTime not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeIsNull() {
            addCriterion("outTime is null");
            return (Criteria) this;
        }

        public Criteria andOutTimeIsNotNull() {
            addCriterion("outTime is not null");
            return (Criteria) this;
        }

        public Criteria andOutTimeEqualTo(Date value) {
            addCriterion("outTime =", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeNotEqualTo(Date value) {
            addCriterion("outTime <>", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeGreaterThan(Date value) {
            addCriterion("outTime >", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("outTime >=", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeLessThan(Date value) {
            addCriterion("outTime <", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeLessThanOrEqualTo(Date value) {
            addCriterion("outTime <=", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeIn(List<Date> values) {
            addCriterion("outTime in", values, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeNotIn(List<Date> values) {
            addCriterion("outTime not in", values, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeBetween(Date value1, Date value2) {
            addCriterion("outTime between", value1, value2, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeNotBetween(Date value1, Date value2) {
            addCriterion("outTime not between", value1, value2, "outTime");
            return (Criteria) this;
        }

        public Criteria andCouponJsonIsNull() {
            addCriterion("couponJson is null");
            return (Criteria) this;
        }

        public Criteria andCouponJsonIsNotNull() {
            addCriterion("couponJson is not null");
            return (Criteria) this;
        }

        public Criteria andCouponJsonEqualTo(String value) {
            addCriterion("couponJson =", value, "couponJson");
            return (Criteria) this;
        }

        public Criteria andCouponJsonNotEqualTo(String value) {
            addCriterion("couponJson <>", value, "couponJson");
            return (Criteria) this;
        }

        public Criteria andCouponJsonGreaterThan(String value) {
            addCriterion("couponJson >", value, "couponJson");
            return (Criteria) this;
        }

        public Criteria andCouponJsonGreaterThanOrEqualTo(String value) {
            addCriterion("couponJson >=", value, "couponJson");
            return (Criteria) this;
        }

        public Criteria andCouponJsonLessThan(String value) {
            addCriterion("couponJson <", value, "couponJson");
            return (Criteria) this;
        }

        public Criteria andCouponJsonLessThanOrEqualTo(String value) {
            addCriterion("couponJson <=", value, "couponJson");
            return (Criteria) this;
        }

        public Criteria andCouponJsonLike(String value) {
            addCriterion("couponJson like", value, "couponJson");
            return (Criteria) this;
        }

        public Criteria andCouponJsonNotLike(String value) {
            addCriterion("couponJson not like", value, "couponJson");
            return (Criteria) this;
        }

        public Criteria andCouponJsonIn(List<String> values) {
            addCriterion("couponJson in", values, "couponJson");
            return (Criteria) this;
        }

        public Criteria andCouponJsonNotIn(List<String> values) {
            addCriterion("couponJson not in", values, "couponJson");
            return (Criteria) this;
        }

        public Criteria andCouponJsonBetween(String value1, String value2) {
            addCriterion("couponJson between", value1, value2, "couponJson");
            return (Criteria) this;
        }

        public Criteria andCouponJsonNotBetween(String value1, String value2) {
            addCriterion("couponJson not between", value1, value2, "couponJson");
            return (Criteria) this;
        }

        public Criteria andShippedTimeIsNull() {
            addCriterion("shippedTime is null");
            return (Criteria) this;
        }

        public Criteria andShippedTimeIsNotNull() {
            addCriterion("shippedTime is not null");
            return (Criteria) this;
        }

        public Criteria andShippedTimeEqualTo(Date value) {
            addCriterion("shippedTime =", value, "shippedTime");
            return (Criteria) this;
        }

        public Criteria andShippedTimeNotEqualTo(Date value) {
            addCriterion("shippedTime <>", value, "shippedTime");
            return (Criteria) this;
        }

        public Criteria andShippedTimeGreaterThan(Date value) {
            addCriterion("shippedTime >", value, "shippedTime");
            return (Criteria) this;
        }

        public Criteria andShippedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("shippedTime >=", value, "shippedTime");
            return (Criteria) this;
        }

        public Criteria andShippedTimeLessThan(Date value) {
            addCriterion("shippedTime <", value, "shippedTime");
            return (Criteria) this;
        }

        public Criteria andShippedTimeLessThanOrEqualTo(Date value) {
            addCriterion("shippedTime <=", value, "shippedTime");
            return (Criteria) this;
        }

        public Criteria andShippedTimeIn(List<Date> values) {
            addCriterion("shippedTime in", values, "shippedTime");
            return (Criteria) this;
        }

        public Criteria andShippedTimeNotIn(List<Date> values) {
            addCriterion("shippedTime not in", values, "shippedTime");
            return (Criteria) this;
        }

        public Criteria andShippedTimeBetween(Date value1, Date value2) {
            addCriterion("shippedTime between", value1, value2, "shippedTime");
            return (Criteria) this;
        }

        public Criteria andShippedTimeNotBetween(Date value1, Date value2) {
            addCriterion("shippedTime not between", value1, value2, "shippedTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIsNull() {
            addCriterion("logisticsCompany is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIsNotNull() {
            addCriterion("logisticsCompany is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyEqualTo(String value) {
            addCriterion("logisticsCompany =", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotEqualTo(String value) {
            addCriterion("logisticsCompany <>", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyGreaterThan(String value) {
            addCriterion("logisticsCompany >", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("logisticsCompany >=", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyLessThan(String value) {
            addCriterion("logisticsCompany <", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyLessThanOrEqualTo(String value) {
            addCriterion("logisticsCompany <=", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyLike(String value) {
            addCriterion("logisticsCompany like", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotLike(String value) {
            addCriterion("logisticsCompany not like", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIn(List<String> values) {
            addCriterion("logisticsCompany in", values, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotIn(List<String> values) {
            addCriterion("logisticsCompany not in", values, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyBetween(String value1, String value2) {
            addCriterion("logisticsCompany between", value1, value2, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotBetween(String value1, String value2) {
            addCriterion("logisticsCompany not between", value1, value2, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoIsNull() {
            addCriterion("logisticsNo is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoIsNotNull() {
            addCriterion("logisticsNo is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoEqualTo(String value) {
            addCriterion("logisticsNo =", value, "logisticsNo");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoNotEqualTo(String value) {
            addCriterion("logisticsNo <>", value, "logisticsNo");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoGreaterThan(String value) {
            addCriterion("logisticsNo >", value, "logisticsNo");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoGreaterThanOrEqualTo(String value) {
            addCriterion("logisticsNo >=", value, "logisticsNo");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoLessThan(String value) {
            addCriterion("logisticsNo <", value, "logisticsNo");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoLessThanOrEqualTo(String value) {
            addCriterion("logisticsNo <=", value, "logisticsNo");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoLike(String value) {
            addCriterion("logisticsNo like", value, "logisticsNo");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoNotLike(String value) {
            addCriterion("logisticsNo not like", value, "logisticsNo");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoIn(List<String> values) {
            addCriterion("logisticsNo in", values, "logisticsNo");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoNotIn(List<String> values) {
            addCriterion("logisticsNo not in", values, "logisticsNo");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoBetween(String value1, String value2) {
            addCriterion("logisticsNo between", value1, value2, "logisticsNo");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoNotBetween(String value1, String value2) {
            addCriterion("logisticsNo not between", value1, value2, "logisticsNo");
            return (Criteria) this;
        }

        public Criteria andSignTimeIsNull() {
            addCriterion("signTime is null");
            return (Criteria) this;
        }

        public Criteria andSignTimeIsNotNull() {
            addCriterion("signTime is not null");
            return (Criteria) this;
        }

        public Criteria andSignTimeEqualTo(Date value) {
            addCriterion("signTime =", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotEqualTo(Date value) {
            addCriterion("signTime <>", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeGreaterThan(Date value) {
            addCriterion("signTime >", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("signTime >=", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLessThan(Date value) {
            addCriterion("signTime <", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLessThanOrEqualTo(Date value) {
            addCriterion("signTime <=", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeIn(List<Date> values) {
            addCriterion("signTime in", values, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotIn(List<Date> values) {
            addCriterion("signTime not in", values, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeBetween(Date value1, Date value2) {
            addCriterion("signTime between", value1, value2, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotBetween(Date value1, Date value2) {
            addCriterion("signTime not between", value1, value2, "signTime");
            return (Criteria) this;
        }

        public Criteria andBuyerRemarkIsNull() {
            addCriterion("buyerRemark is null");
            return (Criteria) this;
        }

        public Criteria andBuyerRemarkIsNotNull() {
            addCriterion("buyerRemark is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerRemarkEqualTo(String value) {
            addCriterion("buyerRemark =", value, "buyerRemark");
            return (Criteria) this;
        }

        public Criteria andBuyerRemarkNotEqualTo(String value) {
            addCriterion("buyerRemark <>", value, "buyerRemark");
            return (Criteria) this;
        }

        public Criteria andBuyerRemarkGreaterThan(String value) {
            addCriterion("buyerRemark >", value, "buyerRemark");
            return (Criteria) this;
        }

        public Criteria andBuyerRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("buyerRemark >=", value, "buyerRemark");
            return (Criteria) this;
        }

        public Criteria andBuyerRemarkLessThan(String value) {
            addCriterion("buyerRemark <", value, "buyerRemark");
            return (Criteria) this;
        }

        public Criteria andBuyerRemarkLessThanOrEqualTo(String value) {
            addCriterion("buyerRemark <=", value, "buyerRemark");
            return (Criteria) this;
        }

        public Criteria andBuyerRemarkLike(String value) {
            addCriterion("buyerRemark like", value, "buyerRemark");
            return (Criteria) this;
        }

        public Criteria andBuyerRemarkNotLike(String value) {
            addCriterion("buyerRemark not like", value, "buyerRemark");
            return (Criteria) this;
        }

        public Criteria andBuyerRemarkIn(List<String> values) {
            addCriterion("buyerRemark in", values, "buyerRemark");
            return (Criteria) this;
        }

        public Criteria andBuyerRemarkNotIn(List<String> values) {
            addCriterion("buyerRemark not in", values, "buyerRemark");
            return (Criteria) this;
        }

        public Criteria andBuyerRemarkBetween(String value1, String value2) {
            addCriterion("buyerRemark between", value1, value2, "buyerRemark");
            return (Criteria) this;
        }

        public Criteria andBuyerRemarkNotBetween(String value1, String value2) {
            addCriterion("buyerRemark not between", value1, value2, "buyerRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkIsNull() {
            addCriterion("orderRemark is null");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkIsNotNull() {
            addCriterion("orderRemark is not null");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkEqualTo(String value) {
            addCriterion("orderRemark =", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkNotEqualTo(String value) {
            addCriterion("orderRemark <>", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkGreaterThan(String value) {
            addCriterion("orderRemark >", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("orderRemark >=", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkLessThan(String value) {
            addCriterion("orderRemark <", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkLessThanOrEqualTo(String value) {
            addCriterion("orderRemark <=", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkLike(String value) {
            addCriterion("orderRemark like", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkNotLike(String value) {
            addCriterion("orderRemark not like", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkIn(List<String> values) {
            addCriterion("orderRemark in", values, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkNotIn(List<String> values) {
            addCriterion("orderRemark not in", values, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkBetween(String value1, String value2) {
            addCriterion("orderRemark between", value1, value2, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkNotBetween(String value1, String value2) {
            addCriterion("orderRemark not between", value1, value2, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("createTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("deleteFlag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("deleteFlag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(Integer value) {
            addCriterion("deleteFlag =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(Integer value) {
            addCriterion("deleteFlag <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(Integer value) {
            addCriterion("deleteFlag >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("deleteFlag >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(Integer value) {
            addCriterion("deleteFlag <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(Integer value) {
            addCriterion("deleteFlag <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<Integer> values) {
            addCriterion("deleteFlag in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<Integer> values) {
            addCriterion("deleteFlag not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(Integer value1, Integer value2) {
            addCriterion("deleteFlag between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("deleteFlag not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andOmsSystemStatusIsNull() {
            addCriterion("omsSystemStatus is null");
            return (Criteria) this;
        }

        public Criteria andOmsSystemStatusIsNotNull() {
            addCriterion("omsSystemStatus is not null");
            return (Criteria) this;
        }

        public Criteria andOmsSystemStatusEqualTo(String value) {
            addCriterion("omsSystemStatus =", value, "omsSystemStatus");
            return (Criteria) this;
        }

        public Criteria andOmsSystemStatusNotEqualTo(String value) {
            addCriterion("omsSystemStatus <>", value, "omsSystemStatus");
            return (Criteria) this;
        }

        public Criteria andOmsSystemStatusGreaterThan(String value) {
            addCriterion("omsSystemStatus >", value, "omsSystemStatus");
            return (Criteria) this;
        }

        public Criteria andOmsSystemStatusGreaterThanOrEqualTo(String value) {
            addCriterion("omsSystemStatus >=", value, "omsSystemStatus");
            return (Criteria) this;
        }

        public Criteria andOmsSystemStatusLessThan(String value) {
            addCriterion("omsSystemStatus <", value, "omsSystemStatus");
            return (Criteria) this;
        }

        public Criteria andOmsSystemStatusLessThanOrEqualTo(String value) {
            addCriterion("omsSystemStatus <=", value, "omsSystemStatus");
            return (Criteria) this;
        }

        public Criteria andOmsSystemStatusLike(String value) {
            addCriterion("omsSystemStatus like", value, "omsSystemStatus");
            return (Criteria) this;
        }

        public Criteria andOmsSystemStatusNotLike(String value) {
            addCriterion("omsSystemStatus not like", value, "omsSystemStatus");
            return (Criteria) this;
        }

        public Criteria andOmsSystemStatusIn(List<String> values) {
            addCriterion("omsSystemStatus in", values, "omsSystemStatus");
            return (Criteria) this;
        }

        public Criteria andOmsSystemStatusNotIn(List<String> values) {
            addCriterion("omsSystemStatus not in", values, "omsSystemStatus");
            return (Criteria) this;
        }

        public Criteria andOmsSystemStatusBetween(String value1, String value2) {
            addCriterion("omsSystemStatus between", value1, value2, "omsSystemStatus");
            return (Criteria) this;
        }

        public Criteria andOmsSystemStatusNotBetween(String value1, String value2) {
            addCriterion("omsSystemStatus not between", value1, value2, "omsSystemStatus");
            return (Criteria) this;
        }

        public Criteria andOmsSystemRemarkIsNull() {
            addCriterion("omsSystemRemark is null");
            return (Criteria) this;
        }

        public Criteria andOmsSystemRemarkIsNotNull() {
            addCriterion("omsSystemRemark is not null");
            return (Criteria) this;
        }

        public Criteria andOmsSystemRemarkEqualTo(String value) {
            addCriterion("omsSystemRemark =", value, "omsSystemRemark");
            return (Criteria) this;
        }

        public Criteria andOmsSystemRemarkNotEqualTo(String value) {
            addCriterion("omsSystemRemark <>", value, "omsSystemRemark");
            return (Criteria) this;
        }

        public Criteria andOmsSystemRemarkGreaterThan(String value) {
            addCriterion("omsSystemRemark >", value, "omsSystemRemark");
            return (Criteria) this;
        }

        public Criteria andOmsSystemRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("omsSystemRemark >=", value, "omsSystemRemark");
            return (Criteria) this;
        }

        public Criteria andOmsSystemRemarkLessThan(String value) {
            addCriterion("omsSystemRemark <", value, "omsSystemRemark");
            return (Criteria) this;
        }

        public Criteria andOmsSystemRemarkLessThanOrEqualTo(String value) {
            addCriterion("omsSystemRemark <=", value, "omsSystemRemark");
            return (Criteria) this;
        }

        public Criteria andOmsSystemRemarkLike(String value) {
            addCriterion("omsSystemRemark like", value, "omsSystemRemark");
            return (Criteria) this;
        }

        public Criteria andOmsSystemRemarkNotLike(String value) {
            addCriterion("omsSystemRemark not like", value, "omsSystemRemark");
            return (Criteria) this;
        }

        public Criteria andOmsSystemRemarkIn(List<String> values) {
            addCriterion("omsSystemRemark in", values, "omsSystemRemark");
            return (Criteria) this;
        }

        public Criteria andOmsSystemRemarkNotIn(List<String> values) {
            addCriterion("omsSystemRemark not in", values, "omsSystemRemark");
            return (Criteria) this;
        }

        public Criteria andOmsSystemRemarkBetween(String value1, String value2) {
            addCriterion("omsSystemRemark between", value1, value2, "omsSystemRemark");
            return (Criteria) this;
        }

        public Criteria andOmsSystemRemarkNotBetween(String value1, String value2) {
            addCriterion("omsSystemRemark not between", value1, value2, "omsSystemRemark");
            return (Criteria) this;
        }

        public Criteria andSettleFlagIsNull() {
            addCriterion("settleFlag is null");
            return (Criteria) this;
        }

        public Criteria andSettleFlagIsNotNull() {
            addCriterion("settleFlag is not null");
            return (Criteria) this;
        }

        public Criteria andSettleFlagEqualTo(Integer value) {
            addCriterion("settleFlag =", value, "settleFlag");
            return (Criteria) this;
        }

        public Criteria andSettleFlagNotEqualTo(Integer value) {
            addCriterion("settleFlag <>", value, "settleFlag");
            return (Criteria) this;
        }

        public Criteria andSettleFlagGreaterThan(Integer value) {
            addCriterion("settleFlag >", value, "settleFlag");
            return (Criteria) this;
        }

        public Criteria andSettleFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("settleFlag >=", value, "settleFlag");
            return (Criteria) this;
        }

        public Criteria andSettleFlagLessThan(Integer value) {
            addCriterion("settleFlag <", value, "settleFlag");
            return (Criteria) this;
        }

        public Criteria andSettleFlagLessThanOrEqualTo(Integer value) {
            addCriterion("settleFlag <=", value, "settleFlag");
            return (Criteria) this;
        }

        public Criteria andSettleFlagIn(List<Integer> values) {
            addCriterion("settleFlag in", values, "settleFlag");
            return (Criteria) this;
        }

        public Criteria andSettleFlagNotIn(List<Integer> values) {
            addCriterion("settleFlag not in", values, "settleFlag");
            return (Criteria) this;
        }

        public Criteria andSettleFlagBetween(Integer value1, Integer value2) {
            addCriterion("settleFlag between", value1, value2, "settleFlag");
            return (Criteria) this;
        }

        public Criteria andSettleFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("settleFlag not between", value1, value2, "settleFlag");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIsNull() {
            addCriterion("refundTime is null");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIsNotNull() {
            addCriterion("refundTime is not null");
            return (Criteria) this;
        }

        public Criteria andRefundTimeEqualTo(Date value) {
            addCriterion("refundTime =", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotEqualTo(Date value) {
            addCriterion("refundTime <>", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeGreaterThan(Date value) {
            addCriterion("refundTime >", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("refundTime >=", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLessThan(Date value) {
            addCriterion("refundTime <", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLessThanOrEqualTo(Date value) {
            addCriterion("refundTime <=", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIn(List<Date> values) {
            addCriterion("refundTime in", values, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotIn(List<Date> values) {
            addCriterion("refundTime not in", values, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeBetween(Date value1, Date value2) {
            addCriterion("refundTime between", value1, value2, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotBetween(Date value1, Date value2) {
            addCriterion("refundTime not between", value1, value2, "refundTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("auditTime is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("auditTime is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("auditTime =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("auditTime <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("auditTime >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("auditTime >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("auditTime <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("auditTime <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("auditTime in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("auditTime not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("auditTime between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("auditTime not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIsNull() {
            addCriterion("orderSource is null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIsNotNull() {
            addCriterion("orderSource is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceEqualTo(String value) {
            addCriterion("orderSource =", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotEqualTo(String value) {
            addCriterion("orderSource <>", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceGreaterThan(String value) {
            addCriterion("orderSource >", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceGreaterThanOrEqualTo(String value) {
            addCriterion("orderSource >=", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLessThan(String value) {
            addCriterion("orderSource <", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLessThanOrEqualTo(String value) {
            addCriterion("orderSource <=", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLike(String value) {
            addCriterion("orderSource like", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotLike(String value) {
            addCriterion("orderSource not like", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIn(List<String> values) {
            addCriterion("orderSource in", values, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotIn(List<String> values) {
            addCriterion("orderSource not in", values, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceBetween(String value1, String value2) {
            addCriterion("orderSource between", value1, value2, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotBetween(String value1, String value2) {
            addCriterion("orderSource not between", value1, value2, "orderSource");
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