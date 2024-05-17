package com.travel.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbTravelShareMstExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbTravelShareMstExample() {
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

        public Criteria andTravelIdIsNull() {
            addCriterion("\"travel_id\" is null");
            return (Criteria) this;
        }

        public Criteria andTravelIdIsNotNull() {
            addCriterion("\"travel_id\" is not null");
            return (Criteria) this;
        }

        public Criteria andTravelIdEqualTo(Integer value) {
            addCriterion("\"travel_id\" =", value, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdNotEqualTo(Integer value) {
            addCriterion("\"travel_id\" <>", value, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdGreaterThan(Integer value) {
            addCriterion("\"travel_id\" >", value, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"travel_id\" >=", value, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdLessThan(Integer value) {
            addCriterion("\"travel_id\" <", value, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdLessThanOrEqualTo(Integer value) {
            addCriterion("\"travel_id\" <=", value, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdIn(List<Integer> values) {
            addCriterion("\"travel_id\" in", values, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdNotIn(List<Integer> values) {
            addCriterion("\"travel_id\" not in", values, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdBetween(Integer value1, Integer value2) {
            addCriterion("\"travel_id\" between", value1, value2, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("\"travel_id\" not between", value1, value2, "travelId");
            return (Criteria) this;
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

        public Criteria andTravelNameIsNull() {
            addCriterion("\"travel_name\" is null");
            return (Criteria) this;
        }

        public Criteria andTravelNameIsNotNull() {
            addCriterion("\"travel_name\" is not null");
            return (Criteria) this;
        }

        public Criteria andTravelNameEqualTo(String value) {
            addCriterion("\"travel_name\" =", value, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameNotEqualTo(String value) {
            addCriterion("\"travel_name\" <>", value, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameGreaterThan(String value) {
            addCriterion("\"travel_name\" >", value, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameGreaterThanOrEqualTo(String value) {
            addCriterion("\"travel_name\" >=", value, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameLessThan(String value) {
            addCriterion("\"travel_name\" <", value, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameLessThanOrEqualTo(String value) {
            addCriterion("\"travel_name\" <=", value, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameLike(String value) {
            addCriterion("\"travel_name\" like", value, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameNotLike(String value) {
            addCriterion("\"travel_name\" not like", value, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameIn(List<String> values) {
            addCriterion("\"travel_name\" in", values, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameNotIn(List<String> values) {
            addCriterion("\"travel_name\" not in", values, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameBetween(String value1, String value2) {
            addCriterion("\"travel_name\" between", value1, value2, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameNotBetween(String value1, String value2) {
            addCriterion("\"travel_name\" not between", value1, value2, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelPictureUrlIsNull() {
            addCriterion("\"travel_picture_url\" is null");
            return (Criteria) this;
        }

        public Criteria andTravelPictureUrlIsNotNull() {
            addCriterion("\"travel_picture_url\" is not null");
            return (Criteria) this;
        }

        public Criteria andTravelPictureUrlEqualTo(String value) {
            addCriterion("\"travel_picture_url\" =", value, "travelPictureUrl");
            return (Criteria) this;
        }

        public Criteria andTravelPictureUrlNotEqualTo(String value) {
            addCriterion("\"travel_picture_url\" <>", value, "travelPictureUrl");
            return (Criteria) this;
        }

        public Criteria andTravelPictureUrlGreaterThan(String value) {
            addCriterion("\"travel_picture_url\" >", value, "travelPictureUrl");
            return (Criteria) this;
        }

        public Criteria andTravelPictureUrlGreaterThanOrEqualTo(String value) {
            addCriterion("\"travel_picture_url\" >=", value, "travelPictureUrl");
            return (Criteria) this;
        }

        public Criteria andTravelPictureUrlLessThan(String value) {
            addCriterion("\"travel_picture_url\" <", value, "travelPictureUrl");
            return (Criteria) this;
        }

        public Criteria andTravelPictureUrlLessThanOrEqualTo(String value) {
            addCriterion("\"travel_picture_url\" <=", value, "travelPictureUrl");
            return (Criteria) this;
        }

        public Criteria andTravelPictureUrlLike(String value) {
            addCriterion("\"travel_picture_url\" like", value, "travelPictureUrl");
            return (Criteria) this;
        }

        public Criteria andTravelPictureUrlNotLike(String value) {
            addCriterion("\"travel_picture_url\" not like", value, "travelPictureUrl");
            return (Criteria) this;
        }

        public Criteria andTravelPictureUrlIn(List<String> values) {
            addCriterion("\"travel_picture_url\" in", values, "travelPictureUrl");
            return (Criteria) this;
        }

        public Criteria andTravelPictureUrlNotIn(List<String> values) {
            addCriterion("\"travel_picture_url\" not in", values, "travelPictureUrl");
            return (Criteria) this;
        }

        public Criteria andTravelPictureUrlBetween(String value1, String value2) {
            addCriterion("\"travel_picture_url\" between", value1, value2, "travelPictureUrl");
            return (Criteria) this;
        }

        public Criteria andTravelPictureUrlNotBetween(String value1, String value2) {
            addCriterion("\"travel_picture_url\" not between", value1, value2, "travelPictureUrl");
            return (Criteria) this;
        }

        public Criteria andTravelAdressIsNull() {
            addCriterion("\"travel_adress\" is null");
            return (Criteria) this;
        }

        public Criteria andTravelAdressIsNotNull() {
            addCriterion("\"travel_adress\" is not null");
            return (Criteria) this;
        }

        public Criteria andTravelAdressEqualTo(String value) {
            addCriterion("\"travel_adress\" =", value, "travelAdress");
            return (Criteria) this;
        }

        public Criteria andTravelAdressNotEqualTo(String value) {
            addCriterion("\"travel_adress\" <>", value, "travelAdress");
            return (Criteria) this;
        }

        public Criteria andTravelAdressGreaterThan(String value) {
            addCriterion("\"travel_adress\" >", value, "travelAdress");
            return (Criteria) this;
        }

        public Criteria andTravelAdressGreaterThanOrEqualTo(String value) {
            addCriterion("\"travel_adress\" >=", value, "travelAdress");
            return (Criteria) this;
        }

        public Criteria andTravelAdressLessThan(String value) {
            addCriterion("\"travel_adress\" <", value, "travelAdress");
            return (Criteria) this;
        }

        public Criteria andTravelAdressLessThanOrEqualTo(String value) {
            addCriterion("\"travel_adress\" <=", value, "travelAdress");
            return (Criteria) this;
        }

        public Criteria andTravelAdressLike(String value) {
            addCriterion("\"travel_adress\" like", value, "travelAdress");
            return (Criteria) this;
        }

        public Criteria andTravelAdressNotLike(String value) {
            addCriterion("\"travel_adress\" not like", value, "travelAdress");
            return (Criteria) this;
        }

        public Criteria andTravelAdressIn(List<String> values) {
            addCriterion("\"travel_adress\" in", values, "travelAdress");
            return (Criteria) this;
        }

        public Criteria andTravelAdressNotIn(List<String> values) {
            addCriterion("\"travel_adress\" not in", values, "travelAdress");
            return (Criteria) this;
        }

        public Criteria andTravelAdressBetween(String value1, String value2) {
            addCriterion("\"travel_adress\" between", value1, value2, "travelAdress");
            return (Criteria) this;
        }

        public Criteria andTravelAdressNotBetween(String value1, String value2) {
            addCriterion("\"travel_adress\" not between", value1, value2, "travelAdress");
            return (Criteria) this;
        }

        public Criteria andTravelSummaryIsNull() {
            addCriterion("\"travel_summary\" is null");
            return (Criteria) this;
        }

        public Criteria andTravelSummaryIsNotNull() {
            addCriterion("\"travel_summary\" is not null");
            return (Criteria) this;
        }

        public Criteria andTravelSummaryEqualTo(String value) {
            addCriterion("\"travel_summary\" =", value, "travelSummary");
            return (Criteria) this;
        }

        public Criteria andTravelSummaryNotEqualTo(String value) {
            addCriterion("\"travel_summary\" <>", value, "travelSummary");
            return (Criteria) this;
        }

        public Criteria andTravelSummaryGreaterThan(String value) {
            addCriterion("\"travel_summary\" >", value, "travelSummary");
            return (Criteria) this;
        }

        public Criteria andTravelSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("\"travel_summary\" >=", value, "travelSummary");
            return (Criteria) this;
        }

        public Criteria andTravelSummaryLessThan(String value) {
            addCriterion("\"travel_summary\" <", value, "travelSummary");
            return (Criteria) this;
        }

        public Criteria andTravelSummaryLessThanOrEqualTo(String value) {
            addCriterion("\"travel_summary\" <=", value, "travelSummary");
            return (Criteria) this;
        }

        public Criteria andTravelSummaryLike(String value) {
            addCriterion("\"travel_summary\" like", value, "travelSummary");
            return (Criteria) this;
        }

        public Criteria andTravelSummaryNotLike(String value) {
            addCriterion("\"travel_summary\" not like", value, "travelSummary");
            return (Criteria) this;
        }

        public Criteria andTravelSummaryIn(List<String> values) {
            addCriterion("\"travel_summary\" in", values, "travelSummary");
            return (Criteria) this;
        }

        public Criteria andTravelSummaryNotIn(List<String> values) {
            addCriterion("\"travel_summary\" not in", values, "travelSummary");
            return (Criteria) this;
        }

        public Criteria andTravelSummaryBetween(String value1, String value2) {
            addCriterion("\"travel_summary\" between", value1, value2, "travelSummary");
            return (Criteria) this;
        }

        public Criteria andTravelSummaryNotBetween(String value1, String value2) {
            addCriterion("\"travel_summary\" not between", value1, value2, "travelSummary");
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

        public Criteria andLastUpdateUserIdIsNull() {
            addCriterion("\"last_update_user_id\" is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdIsNotNull() {
            addCriterion("\"last_update_user_id\" is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdEqualTo(String value) {
            addCriterion("\"last_update_user_id\" =", value, "lastUpdateUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdNotEqualTo(String value) {
            addCriterion("\"last_update_user_id\" <>", value, "lastUpdateUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdGreaterThan(String value) {
            addCriterion("\"last_update_user_id\" >", value, "lastUpdateUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"last_update_user_id\" >=", value, "lastUpdateUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdLessThan(String value) {
            addCriterion("\"last_update_user_id\" <", value, "lastUpdateUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdLessThanOrEqualTo(String value) {
            addCriterion("\"last_update_user_id\" <=", value, "lastUpdateUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdLike(String value) {
            addCriterion("\"last_update_user_id\" like", value, "lastUpdateUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdNotLike(String value) {
            addCriterion("\"last_update_user_id\" not like", value, "lastUpdateUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdIn(List<String> values) {
            addCriterion("\"last_update_user_id\" in", values, "lastUpdateUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdNotIn(List<String> values) {
            addCriterion("\"last_update_user_id\" not in", values, "lastUpdateUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdBetween(String value1, String value2) {
            addCriterion("\"last_update_user_id\" between", value1, value2, "lastUpdateUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdNotBetween(String value1, String value2) {
            addCriterion("\"last_update_user_id\" not between", value1, value2, "lastUpdateUserId");
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