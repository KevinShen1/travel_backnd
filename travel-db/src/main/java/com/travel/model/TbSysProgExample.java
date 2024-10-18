package com.travel.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbSysProgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbSysProgExample() {
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

        public Criteria andProgIdIsNull() {
            addCriterion("\"prog_id\" is null");
            return (Criteria) this;
        }

        public Criteria andProgIdIsNotNull() {
            addCriterion("\"prog_id\" is not null");
            return (Criteria) this;
        }

        public Criteria andProgIdEqualTo(String value) {
            addCriterion("\"prog_id\" =", value, "progId");
            return (Criteria) this;
        }

        public Criteria andProgIdNotEqualTo(String value) {
            addCriterion("\"prog_id\" <>", value, "progId");
            return (Criteria) this;
        }

        public Criteria andProgIdGreaterThan(String value) {
            addCriterion("\"prog_id\" >", value, "progId");
            return (Criteria) this;
        }

        public Criteria andProgIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"prog_id\" >=", value, "progId");
            return (Criteria) this;
        }

        public Criteria andProgIdLessThan(String value) {
            addCriterion("\"prog_id\" <", value, "progId");
            return (Criteria) this;
        }

        public Criteria andProgIdLessThanOrEqualTo(String value) {
            addCriterion("\"prog_id\" <=", value, "progId");
            return (Criteria) this;
        }

        public Criteria andProgIdLike(String value) {
            addCriterion("\"prog_id\" like", value, "progId");
            return (Criteria) this;
        }

        public Criteria andProgIdNotLike(String value) {
            addCriterion("\"prog_id\" not like", value, "progId");
            return (Criteria) this;
        }

        public Criteria andProgIdIn(List<String> values) {
            addCriterion("\"prog_id\" in", values, "progId");
            return (Criteria) this;
        }

        public Criteria andProgIdNotIn(List<String> values) {
            addCriterion("\"prog_id\" not in", values, "progId");
            return (Criteria) this;
        }

        public Criteria andProgIdBetween(String value1, String value2) {
            addCriterion("\"prog_id\" between", value1, value2, "progId");
            return (Criteria) this;
        }

        public Criteria andProgIdNotBetween(String value1, String value2) {
            addCriterion("\"prog_id\" not between", value1, value2, "progId");
            return (Criteria) this;
        }

        public Criteria andProgNameTwIsNull() {
            addCriterion("\"prog_name_tw\" is null");
            return (Criteria) this;
        }

        public Criteria andProgNameTwIsNotNull() {
            addCriterion("\"prog_name_tw\" is not null");
            return (Criteria) this;
        }

        public Criteria andProgNameTwEqualTo(String value) {
            addCriterion("\"prog_name_tw\" =", value, "progNameTw");
            return (Criteria) this;
        }

        public Criteria andProgNameTwNotEqualTo(String value) {
            addCriterion("\"prog_name_tw\" <>", value, "progNameTw");
            return (Criteria) this;
        }

        public Criteria andProgNameTwGreaterThan(String value) {
            addCriterion("\"prog_name_tw\" >", value, "progNameTw");
            return (Criteria) this;
        }

        public Criteria andProgNameTwGreaterThanOrEqualTo(String value) {
            addCriterion("\"prog_name_tw\" >=", value, "progNameTw");
            return (Criteria) this;
        }

        public Criteria andProgNameTwLessThan(String value) {
            addCriterion("\"prog_name_tw\" <", value, "progNameTw");
            return (Criteria) this;
        }

        public Criteria andProgNameTwLessThanOrEqualTo(String value) {
            addCriterion("\"prog_name_tw\" <=", value, "progNameTw");
            return (Criteria) this;
        }

        public Criteria andProgNameTwLike(String value) {
            addCriterion("\"prog_name_tw\" like", value, "progNameTw");
            return (Criteria) this;
        }

        public Criteria andProgNameTwNotLike(String value) {
            addCriterion("\"prog_name_tw\" not like", value, "progNameTw");
            return (Criteria) this;
        }

        public Criteria andProgNameTwIn(List<String> values) {
            addCriterion("\"prog_name_tw\" in", values, "progNameTw");
            return (Criteria) this;
        }

        public Criteria andProgNameTwNotIn(List<String> values) {
            addCriterion("\"prog_name_tw\" not in", values, "progNameTw");
            return (Criteria) this;
        }

        public Criteria andProgNameTwBetween(String value1, String value2) {
            addCriterion("\"prog_name_tw\" between", value1, value2, "progNameTw");
            return (Criteria) this;
        }

        public Criteria andProgNameTwNotBetween(String value1, String value2) {
            addCriterion("\"prog_name_tw\" not between", value1, value2, "progNameTw");
            return (Criteria) this;
        }

        public Criteria andProgNameCnIsNull() {
            addCriterion("\"prog_name_cn\" is null");
            return (Criteria) this;
        }

        public Criteria andProgNameCnIsNotNull() {
            addCriterion("\"prog_name_cn\" is not null");
            return (Criteria) this;
        }

        public Criteria andProgNameCnEqualTo(String value) {
            addCriterion("\"prog_name_cn\" =", value, "progNameCn");
            return (Criteria) this;
        }

        public Criteria andProgNameCnNotEqualTo(String value) {
            addCriterion("\"prog_name_cn\" <>", value, "progNameCn");
            return (Criteria) this;
        }

        public Criteria andProgNameCnGreaterThan(String value) {
            addCriterion("\"prog_name_cn\" >", value, "progNameCn");
            return (Criteria) this;
        }

        public Criteria andProgNameCnGreaterThanOrEqualTo(String value) {
            addCriterion("\"prog_name_cn\" >=", value, "progNameCn");
            return (Criteria) this;
        }

        public Criteria andProgNameCnLessThan(String value) {
            addCriterion("\"prog_name_cn\" <", value, "progNameCn");
            return (Criteria) this;
        }

        public Criteria andProgNameCnLessThanOrEqualTo(String value) {
            addCriterion("\"prog_name_cn\" <=", value, "progNameCn");
            return (Criteria) this;
        }

        public Criteria andProgNameCnLike(String value) {
            addCriterion("\"prog_name_cn\" like", value, "progNameCn");
            return (Criteria) this;
        }

        public Criteria andProgNameCnNotLike(String value) {
            addCriterion("\"prog_name_cn\" not like", value, "progNameCn");
            return (Criteria) this;
        }

        public Criteria andProgNameCnIn(List<String> values) {
            addCriterion("\"prog_name_cn\" in", values, "progNameCn");
            return (Criteria) this;
        }

        public Criteria andProgNameCnNotIn(List<String> values) {
            addCriterion("\"prog_name_cn\" not in", values, "progNameCn");
            return (Criteria) this;
        }

        public Criteria andProgNameCnBetween(String value1, String value2) {
            addCriterion("\"prog_name_cn\" between", value1, value2, "progNameCn");
            return (Criteria) this;
        }

        public Criteria andProgNameCnNotBetween(String value1, String value2) {
            addCriterion("\"prog_name_cn\" not between", value1, value2, "progNameCn");
            return (Criteria) this;
        }

        public Criteria andProgNameEnIsNull() {
            addCriterion("\"prog_name_en\" is null");
            return (Criteria) this;
        }

        public Criteria andProgNameEnIsNotNull() {
            addCriterion("\"prog_name_en\" is not null");
            return (Criteria) this;
        }

        public Criteria andProgNameEnEqualTo(String value) {
            addCriterion("\"prog_name_en\" =", value, "progNameEn");
            return (Criteria) this;
        }

        public Criteria andProgNameEnNotEqualTo(String value) {
            addCriterion("\"prog_name_en\" <>", value, "progNameEn");
            return (Criteria) this;
        }

        public Criteria andProgNameEnGreaterThan(String value) {
            addCriterion("\"prog_name_en\" >", value, "progNameEn");
            return (Criteria) this;
        }

        public Criteria andProgNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("\"prog_name_en\" >=", value, "progNameEn");
            return (Criteria) this;
        }

        public Criteria andProgNameEnLessThan(String value) {
            addCriterion("\"prog_name_en\" <", value, "progNameEn");
            return (Criteria) this;
        }

        public Criteria andProgNameEnLessThanOrEqualTo(String value) {
            addCriterion("\"prog_name_en\" <=", value, "progNameEn");
            return (Criteria) this;
        }

        public Criteria andProgNameEnLike(String value) {
            addCriterion("\"prog_name_en\" like", value, "progNameEn");
            return (Criteria) this;
        }

        public Criteria andProgNameEnNotLike(String value) {
            addCriterion("\"prog_name_en\" not like", value, "progNameEn");
            return (Criteria) this;
        }

        public Criteria andProgNameEnIn(List<String> values) {
            addCriterion("\"prog_name_en\" in", values, "progNameEn");
            return (Criteria) this;
        }

        public Criteria andProgNameEnNotIn(List<String> values) {
            addCriterion("\"prog_name_en\" not in", values, "progNameEn");
            return (Criteria) this;
        }

        public Criteria andProgNameEnBetween(String value1, String value2) {
            addCriterion("\"prog_name_en\" between", value1, value2, "progNameEn");
            return (Criteria) this;
        }

        public Criteria andProgNameEnNotBetween(String value1, String value2) {
            addCriterion("\"prog_name_en\" not between", value1, value2, "progNameEn");
            return (Criteria) this;
        }

        public Criteria andParentProgIdIsNull() {
            addCriterion("\"parent_prog_id\" is null");
            return (Criteria) this;
        }

        public Criteria andParentProgIdIsNotNull() {
            addCriterion("\"parent_prog_id\" is not null");
            return (Criteria) this;
        }

        public Criteria andParentProgIdEqualTo(String value) {
            addCriterion("\"parent_prog_id\" =", value, "parentProgId");
            return (Criteria) this;
        }

        public Criteria andParentProgIdNotEqualTo(String value) {
            addCriterion("\"parent_prog_id\" <>", value, "parentProgId");
            return (Criteria) this;
        }

        public Criteria andParentProgIdGreaterThan(String value) {
            addCriterion("\"parent_prog_id\" >", value, "parentProgId");
            return (Criteria) this;
        }

        public Criteria andParentProgIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"parent_prog_id\" >=", value, "parentProgId");
            return (Criteria) this;
        }

        public Criteria andParentProgIdLessThan(String value) {
            addCriterion("\"parent_prog_id\" <", value, "parentProgId");
            return (Criteria) this;
        }

        public Criteria andParentProgIdLessThanOrEqualTo(String value) {
            addCriterion("\"parent_prog_id\" <=", value, "parentProgId");
            return (Criteria) this;
        }

        public Criteria andParentProgIdLike(String value) {
            addCriterion("\"parent_prog_id\" like", value, "parentProgId");
            return (Criteria) this;
        }

        public Criteria andParentProgIdNotLike(String value) {
            addCriterion("\"parent_prog_id\" not like", value, "parentProgId");
            return (Criteria) this;
        }

        public Criteria andParentProgIdIn(List<String> values) {
            addCriterion("\"parent_prog_id\" in", values, "parentProgId");
            return (Criteria) this;
        }

        public Criteria andParentProgIdNotIn(List<String> values) {
            addCriterion("\"parent_prog_id\" not in", values, "parentProgId");
            return (Criteria) this;
        }

        public Criteria andParentProgIdBetween(String value1, String value2) {
            addCriterion("\"parent_prog_id\" between", value1, value2, "parentProgId");
            return (Criteria) this;
        }

        public Criteria andParentProgIdNotBetween(String value1, String value2) {
            addCriterion("\"parent_prog_id\" not between", value1, value2, "parentProgId");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNull() {
            addCriterion("\"is_active\" is null");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNotNull() {
            addCriterion("\"is_active\" is not null");
            return (Criteria) this;
        }

        public Criteria andIsActiveEqualTo(Boolean value) {
            addCriterion("\"is_active\" =", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotEqualTo(Boolean value) {
            addCriterion("\"is_active\" <>", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThan(Boolean value) {
            addCriterion("\"is_active\" >", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("\"is_active\" >=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThan(Boolean value) {
            addCriterion("\"is_active\" <", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThanOrEqualTo(Boolean value) {
            addCriterion("\"is_active\" <=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveIn(List<Boolean> values) {
            addCriterion("\"is_active\" in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotIn(List<Boolean> values) {
            addCriterion("\"is_active\" not in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveBetween(Boolean value1, Boolean value2) {
            addCriterion("\"is_active\" between", value1, value2, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("\"is_active\" not between", value1, value2, "isActive");
            return (Criteria) this;
        }

        public Criteria andProgUrlIsNull() {
            addCriterion("\"prog_url\" is null");
            return (Criteria) this;
        }

        public Criteria andProgUrlIsNotNull() {
            addCriterion("\"prog_url\" is not null");
            return (Criteria) this;
        }

        public Criteria andProgUrlEqualTo(String value) {
            addCriterion("\"prog_url\" =", value, "progUrl");
            return (Criteria) this;
        }

        public Criteria andProgUrlNotEqualTo(String value) {
            addCriterion("\"prog_url\" <>", value, "progUrl");
            return (Criteria) this;
        }

        public Criteria andProgUrlGreaterThan(String value) {
            addCriterion("\"prog_url\" >", value, "progUrl");
            return (Criteria) this;
        }

        public Criteria andProgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("\"prog_url\" >=", value, "progUrl");
            return (Criteria) this;
        }

        public Criteria andProgUrlLessThan(String value) {
            addCriterion("\"prog_url\" <", value, "progUrl");
            return (Criteria) this;
        }

        public Criteria andProgUrlLessThanOrEqualTo(String value) {
            addCriterion("\"prog_url\" <=", value, "progUrl");
            return (Criteria) this;
        }

        public Criteria andProgUrlLike(String value) {
            addCriterion("\"prog_url\" like", value, "progUrl");
            return (Criteria) this;
        }

        public Criteria andProgUrlNotLike(String value) {
            addCriterion("\"prog_url\" not like", value, "progUrl");
            return (Criteria) this;
        }

        public Criteria andProgUrlIn(List<String> values) {
            addCriterion("\"prog_url\" in", values, "progUrl");
            return (Criteria) this;
        }

        public Criteria andProgUrlNotIn(List<String> values) {
            addCriterion("\"prog_url\" not in", values, "progUrl");
            return (Criteria) this;
        }

        public Criteria andProgUrlBetween(String value1, String value2) {
            addCriterion("\"prog_url\" between", value1, value2, "progUrl");
            return (Criteria) this;
        }

        public Criteria andProgUrlNotBetween(String value1, String value2) {
            addCriterion("\"prog_url\" not between", value1, value2, "progUrl");
            return (Criteria) this;
        }

        public Criteria andProgIconIsNull() {
            addCriterion("\"prog_icon\" is null");
            return (Criteria) this;
        }

        public Criteria andProgIconIsNotNull() {
            addCriterion("\"prog_icon\" is not null");
            return (Criteria) this;
        }

        public Criteria andProgIconEqualTo(String value) {
            addCriterion("\"prog_icon\" =", value, "progIcon");
            return (Criteria) this;
        }

        public Criteria andProgIconNotEqualTo(String value) {
            addCriterion("\"prog_icon\" <>", value, "progIcon");
            return (Criteria) this;
        }

        public Criteria andProgIconGreaterThan(String value) {
            addCriterion("\"prog_icon\" >", value, "progIcon");
            return (Criteria) this;
        }

        public Criteria andProgIconGreaterThanOrEqualTo(String value) {
            addCriterion("\"prog_icon\" >=", value, "progIcon");
            return (Criteria) this;
        }

        public Criteria andProgIconLessThan(String value) {
            addCriterion("\"prog_icon\" <", value, "progIcon");
            return (Criteria) this;
        }

        public Criteria andProgIconLessThanOrEqualTo(String value) {
            addCriterion("\"prog_icon\" <=", value, "progIcon");
            return (Criteria) this;
        }

        public Criteria andProgIconLike(String value) {
            addCriterion("\"prog_icon\" like", value, "progIcon");
            return (Criteria) this;
        }

        public Criteria andProgIconNotLike(String value) {
            addCriterion("\"prog_icon\" not like", value, "progIcon");
            return (Criteria) this;
        }

        public Criteria andProgIconIn(List<String> values) {
            addCriterion("\"prog_icon\" in", values, "progIcon");
            return (Criteria) this;
        }

        public Criteria andProgIconNotIn(List<String> values) {
            addCriterion("\"prog_icon\" not in", values, "progIcon");
            return (Criteria) this;
        }

        public Criteria andProgIconBetween(String value1, String value2) {
            addCriterion("\"prog_icon\" between", value1, value2, "progIcon");
            return (Criteria) this;
        }

        public Criteria andProgIconNotBetween(String value1, String value2) {
            addCriterion("\"prog_icon\" not between", value1, value2, "progIcon");
            return (Criteria) this;
        }

        public Criteria andProgSortIsNull() {
            addCriterion("\"prog_sort\" is null");
            return (Criteria) this;
        }

        public Criteria andProgSortIsNotNull() {
            addCriterion("\"prog_sort\" is not null");
            return (Criteria) this;
        }

        public Criteria andProgSortEqualTo(Integer value) {
            addCriterion("\"prog_sort\" =", value, "progSort");
            return (Criteria) this;
        }

        public Criteria andProgSortNotEqualTo(Integer value) {
            addCriterion("\"prog_sort\" <>", value, "progSort");
            return (Criteria) this;
        }

        public Criteria andProgSortGreaterThan(Integer value) {
            addCriterion("\"prog_sort\" >", value, "progSort");
            return (Criteria) this;
        }

        public Criteria andProgSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"prog_sort\" >=", value, "progSort");
            return (Criteria) this;
        }

        public Criteria andProgSortLessThan(Integer value) {
            addCriterion("\"prog_sort\" <", value, "progSort");
            return (Criteria) this;
        }

        public Criteria andProgSortLessThanOrEqualTo(Integer value) {
            addCriterion("\"prog_sort\" <=", value, "progSort");
            return (Criteria) this;
        }

        public Criteria andProgSortIn(List<Integer> values) {
            addCriterion("\"prog_sort\" in", values, "progSort");
            return (Criteria) this;
        }

        public Criteria andProgSortNotIn(List<Integer> values) {
            addCriterion("\"prog_sort\" not in", values, "progSort");
            return (Criteria) this;
        }

        public Criteria andProgSortBetween(Integer value1, Integer value2) {
            addCriterion("\"prog_sort\" between", value1, value2, "progSort");
            return (Criteria) this;
        }

        public Criteria andProgSortNotBetween(Integer value1, Integer value2) {
            addCriterion("\"prog_sort\" not between", value1, value2, "progSort");
            return (Criteria) this;
        }

        public Criteria andProgTypeIsNull() {
            addCriterion("\"prog_type\" is null");
            return (Criteria) this;
        }

        public Criteria andProgTypeIsNotNull() {
            addCriterion("\"prog_type\" is not null");
            return (Criteria) this;
        }

        public Criteria andProgTypeEqualTo(String value) {
            addCriterion("\"prog_type\" =", value, "progType");
            return (Criteria) this;
        }

        public Criteria andProgTypeNotEqualTo(String value) {
            addCriterion("\"prog_type\" <>", value, "progType");
            return (Criteria) this;
        }

        public Criteria andProgTypeGreaterThan(String value) {
            addCriterion("\"prog_type\" >", value, "progType");
            return (Criteria) this;
        }

        public Criteria andProgTypeGreaterThanOrEqualTo(String value) {
            addCriterion("\"prog_type\" >=", value, "progType");
            return (Criteria) this;
        }

        public Criteria andProgTypeLessThan(String value) {
            addCriterion("\"prog_type\" <", value, "progType");
            return (Criteria) this;
        }

        public Criteria andProgTypeLessThanOrEqualTo(String value) {
            addCriterion("\"prog_type\" <=", value, "progType");
            return (Criteria) this;
        }

        public Criteria andProgTypeLike(String value) {
            addCriterion("\"prog_type\" like", value, "progType");
            return (Criteria) this;
        }

        public Criteria andProgTypeNotLike(String value) {
            addCriterion("\"prog_type\" not like", value, "progType");
            return (Criteria) this;
        }

        public Criteria andProgTypeIn(List<String> values) {
            addCriterion("\"prog_type\" in", values, "progType");
            return (Criteria) this;
        }

        public Criteria andProgTypeNotIn(List<String> values) {
            addCriterion("\"prog_type\" not in", values, "progType");
            return (Criteria) this;
        }

        public Criteria andProgTypeBetween(String value1, String value2) {
            addCriterion("\"prog_type\" between", value1, value2, "progType");
            return (Criteria) this;
        }

        public Criteria andProgTypeNotBetween(String value1, String value2) {
            addCriterion("\"prog_type\" not between", value1, value2, "progType");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("\"create_user_id\" is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("\"create_user_id\" is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(String value) {
            addCriterion("\"create_user_id\" =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(String value) {
            addCriterion("\"create_user_id\" <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(String value) {
            addCriterion("\"create_user_id\" >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"create_user_id\" >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(String value) {
            addCriterion("\"create_user_id\" <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(String value) {
            addCriterion("\"create_user_id\" <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLike(String value) {
            addCriterion("\"create_user_id\" like", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotLike(String value) {
            addCriterion("\"create_user_id\" not like", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<String> values) {
            addCriterion("\"create_user_id\" in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<String> values) {
            addCriterion("\"create_user_id\" not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(String value1, String value2) {
            addCriterion("\"create_user_id\" between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(String value1, String value2) {
            addCriterion("\"create_user_id\" not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIsNull() {
            addCriterion("\"create_datetime\" is null");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIsNotNull() {
            addCriterion("\"create_datetime\" is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeEqualTo(Date value) {
            addCriterion("\"create_datetime\" =", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotEqualTo(Date value) {
            addCriterion("\"create_datetime\" <>", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeGreaterThan(Date value) {
            addCriterion("\"create_datetime\" >", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("\"create_datetime\" >=", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeLessThan(Date value) {
            addCriterion("\"create_datetime\" <", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("\"create_datetime\" <=", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIn(List<Date> values) {
            addCriterion("\"create_datetime\" in", values, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotIn(List<Date> values) {
            addCriterion("\"create_datetime\" not in", values, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeBetween(Date value1, Date value2) {
            addCriterion("\"create_datetime\" between", value1, value2, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("\"create_datetime\" not between", value1, value2, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateEmpIdIsNull() {
            addCriterion("\"last_update_emp_id\" is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateEmpIdIsNotNull() {
            addCriterion("\"last_update_emp_id\" is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateEmpIdEqualTo(String value) {
            addCriterion("\"last_update_emp_id\" =", value, "lastUpdateEmpId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateEmpIdNotEqualTo(String value) {
            addCriterion("\"last_update_emp_id\" <>", value, "lastUpdateEmpId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateEmpIdGreaterThan(String value) {
            addCriterion("\"last_update_emp_id\" >", value, "lastUpdateEmpId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateEmpIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"last_update_emp_id\" >=", value, "lastUpdateEmpId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateEmpIdLessThan(String value) {
            addCriterion("\"last_update_emp_id\" <", value, "lastUpdateEmpId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateEmpIdLessThanOrEqualTo(String value) {
            addCriterion("\"last_update_emp_id\" <=", value, "lastUpdateEmpId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateEmpIdLike(String value) {
            addCriterion("\"last_update_emp_id\" like", value, "lastUpdateEmpId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateEmpIdNotLike(String value) {
            addCriterion("\"last_update_emp_id\" not like", value, "lastUpdateEmpId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateEmpIdIn(List<String> values) {
            addCriterion("\"last_update_emp_id\" in", values, "lastUpdateEmpId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateEmpIdNotIn(List<String> values) {
            addCriterion("\"last_update_emp_id\" not in", values, "lastUpdateEmpId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateEmpIdBetween(String value1, String value2) {
            addCriterion("\"last_update_emp_id\" between", value1, value2, "lastUpdateEmpId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateEmpIdNotBetween(String value1, String value2) {
            addCriterion("\"last_update_emp_id\" not between", value1, value2, "lastUpdateEmpId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDatetimeIsNull() {
            addCriterion("\"last_update_datetime\" is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDatetimeIsNotNull() {
            addCriterion("\"last_update_datetime\" is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDatetimeEqualTo(Date value) {
            addCriterion("\"last_update_datetime\" =", value, "lastUpdateDatetime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDatetimeNotEqualTo(Date value) {
            addCriterion("\"last_update_datetime\" <>", value, "lastUpdateDatetime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDatetimeGreaterThan(Date value) {
            addCriterion("\"last_update_datetime\" >", value, "lastUpdateDatetime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("\"last_update_datetime\" >=", value, "lastUpdateDatetime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDatetimeLessThan(Date value) {
            addCriterion("\"last_update_datetime\" <", value, "lastUpdateDatetime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("\"last_update_datetime\" <=", value, "lastUpdateDatetime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDatetimeIn(List<Date> values) {
            addCriterion("\"last_update_datetime\" in", values, "lastUpdateDatetime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDatetimeNotIn(List<Date> values) {
            addCriterion("\"last_update_datetime\" not in", values, "lastUpdateDatetime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDatetimeBetween(Date value1, Date value2) {
            addCriterion("\"last_update_datetime\" between", value1, value2, "lastUpdateDatetime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("\"last_update_datetime\" not between", value1, value2, "lastUpdateDatetime");
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