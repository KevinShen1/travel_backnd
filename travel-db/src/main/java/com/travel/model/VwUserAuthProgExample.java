package com.travel.model;

import java.util.ArrayList;
import java.util.List;

public class VwUserAuthProgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VwUserAuthProgExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("\"user_id\" is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("\"user_id\" is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("\"user_id\" =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("\"user_id\" <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("\"user_id\" >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"user_id\" >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("\"user_id\" <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("\"user_id\" <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("\"user_id\" like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("\"user_id\" not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("\"user_id\" in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("\"user_id\" not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("\"user_id\" between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("\"user_id\" not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("\"user_name\" is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("\"user_name\" is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("\"user_name\" =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("\"user_name\" <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("\"user_name\" >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("\"user_name\" >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("\"user_name\" <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("\"user_name\" <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("\"user_name\" like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("\"user_name\" not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("\"user_name\" in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("\"user_name\" not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("\"user_name\" between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("\"user_name\" not between", value1, value2, "userName");
            return (Criteria) this;
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