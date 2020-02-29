package me.importtao.user.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlanetKidHourExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlanetKidHourExample() {
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
    public Criteria andkidIdIsNull() {
        addCriterion("kid_id is null");
        return (Criteria) this;
    }

    public Criteria andkidIdIsNotNull() {
        addCriterion("kid_id is not null");
        return (Criteria) this;
    }

    public Criteria andkidIdEqualTo(Long value) {
        addCriterion("kid_id =", value, "kid_id");
        return (Criteria) this;
    }

    public Criteria andkidIdNotEqualTo(Long value) {
        addCriterion("kid_id <>", value, "kid_id");
        return (Criteria) this;
    }

    public Criteria andkidIdGreaterThan(Long value) {
        addCriterion("kid_id >", value, "kid_id");
        return (Criteria) this;
    }

    public Criteria andkidIdGreaterThanOrEqualTo(Long value) {
        addCriterion("kid_id >=", value, "kid_id");
        return (Criteria) this;
    }

    public Criteria andkidIdLessThan(Long value) {
        addCriterion("kid_id <", value, "kid_id");
        return (Criteria) this;
    }

    public Criteria andkidIdLessThanOrEqualTo(Long value) {
        addCriterion("kid_id <=", value, "kid_id");
        return (Criteria) this;
    }

    public Criteria andkidIdIn(List<Long> values) {
        addCriterion("kid_id in", values, "kid_id");
        return (Criteria) this;
    }

    public Criteria andkidIdNotIn(List<Long> values) {
        addCriterion("kid_id not in", values, "kid_id");
        return (Criteria) this;
    }

    public Criteria andkidIdBetween(Long value1, Long value2) {
        addCriterion("kid_id between", value1, value2, "kid_id");
        return (Criteria) this;
    }

    public Criteria andkidIdNotBetween(Long value1, Long value2) {
        addCriterion("kid_id not between", value1, value2, "kid_id");
        return (Criteria) this;
    }

    public Criteria andkidIdLike(Long value) {
        addCriterion("kid_id like", value, "kid_id");
        return (Criteria) this;
    }

    public Criteria andkidIdNotLike(Long value) {
        addCriterion("kid_id not like", value, "kid_id");
        return (Criteria) this;
    }
    public Criteria andparentIdIsNull() {
        addCriterion("parent_id is null");
        return (Criteria) this;
    }

    public Criteria andparentIdIsNotNull() {
        addCriterion("parent_id is not null");
        return (Criteria) this;
    }

    public Criteria andparentIdEqualTo(String value) {
        addCriterion("parent_id =", value, "parent_id");
        return (Criteria) this;
    }

    public Criteria andparentIdNotEqualTo(String value) {
        addCriterion("parent_id <>", value, "parent_id");
        return (Criteria) this;
    }

    public Criteria andparentIdGreaterThan(String value) {
        addCriterion("parent_id >", value, "parent_id");
        return (Criteria) this;
    }

    public Criteria andparentIdGreaterThanOrEqualTo(String value) {
        addCriterion("parent_id >=", value, "parent_id");
        return (Criteria) this;
    }

    public Criteria andparentIdLessThan(String value) {
        addCriterion("parent_id <", value, "parent_id");
        return (Criteria) this;
    }

    public Criteria andparentIdLessThanOrEqualTo(String value) {
        addCriterion("parent_id <=", value, "parent_id");
        return (Criteria) this;
    }

    public Criteria andparentIdIn(List<String> values) {
        addCriterion("parent_id in", values, "parent_id");
        return (Criteria) this;
    }

    public Criteria andparentIdNotIn(List<String> values) {
        addCriterion("parent_id not in", values, "parent_id");
        return (Criteria) this;
    }

    public Criteria andparentIdBetween(String value1, String value2) {
        addCriterion("parent_id between", value1, value2, "parent_id");
        return (Criteria) this;
    }

    public Criteria andparentIdNotBetween(String value1, String value2) {
        addCriterion("parent_id not between", value1, value2, "parent_id");
        return (Criteria) this;
    }

    public Criteria andparentIdLike(String value) {
        addCriterion("parent_id like", value, "parent_id");
        return (Criteria) this;
    }

    public Criteria andparentIdNotLike(String value) {
        addCriterion("parent_id not like", value, "parent_id");
        return (Criteria) this;
    }
    public Criteria andtypeIsNull() {
        addCriterion("type is null");
        return (Criteria) this;
    }

    public Criteria andtypeIsNotNull() {
        addCriterion("type is not null");
        return (Criteria) this;
    }

    public Criteria andtypeEqualTo(Integer value) {
        addCriterion("type =", value, "type");
        return (Criteria) this;
    }

    public Criteria andtypeNotEqualTo(Integer value) {
        addCriterion("type <>", value, "type");
        return (Criteria) this;
    }

    public Criteria andtypeGreaterThan(Integer value) {
        addCriterion("type >", value, "type");
        return (Criteria) this;
    }

    public Criteria andtypeGreaterThanOrEqualTo(Integer value) {
        addCriterion("type >=", value, "type");
        return (Criteria) this;
    }

    public Criteria andtypeLessThan(Integer value) {
        addCriterion("type <", value, "type");
        return (Criteria) this;
    }

    public Criteria andtypeLessThanOrEqualTo(Integer value) {
        addCriterion("type <=", value, "type");
        return (Criteria) this;
    }

    public Criteria andtypeIn(List<Integer> values) {
        addCriterion("type in", values, "type");
        return (Criteria) this;
    }

    public Criteria andtypeNotIn(List<Integer> values) {
        addCriterion("type not in", values, "type");
        return (Criteria) this;
    }

    public Criteria andtypeBetween(Integer value1, Integer value2) {
        addCriterion("type between", value1, value2, "type");
        return (Criteria) this;
    }

    public Criteria andtypeNotBetween(Integer value1, Integer value2) {
        addCriterion("type not between", value1, value2, "type");
        return (Criteria) this;
    }

    public Criteria andtypeLike(Integer value) {
        addCriterion("type like", value, "type");
        return (Criteria) this;
    }

    public Criteria andtypeNotLike(Integer value) {
        addCriterion("type not like", value, "type");
        return (Criteria) this;
    }
    public Criteria andcurHourIsNull() {
        addCriterion("cur_hour is null");
        return (Criteria) this;
    }

    public Criteria andcurHourIsNotNull() {
        addCriterion("cur_hour is not null");
        return (Criteria) this;
    }

    public Criteria andcurHourEqualTo(Double value) {
        addCriterion("cur_hour =", value, "cur_hour");
        return (Criteria) this;
    }

    public Criteria andcurHourNotEqualTo(Double value) {
        addCriterion("cur_hour <>", value, "cur_hour");
        return (Criteria) this;
    }

    public Criteria andcurHourGreaterThan(Double value) {
        addCriterion("cur_hour >", value, "cur_hour");
        return (Criteria) this;
    }

    public Criteria andcurHourGreaterThanOrEqualTo(Double value) {
        addCriterion("cur_hour >=", value, "cur_hour");
        return (Criteria) this;
    }

    public Criteria andcurHourLessThan(Double value) {
        addCriterion("cur_hour <", value, "cur_hour");
        return (Criteria) this;
    }

    public Criteria andcurHourLessThanOrEqualTo(Double value) {
        addCriterion("cur_hour <=", value, "cur_hour");
        return (Criteria) this;
    }

    public Criteria andcurHourIn(List<Double> values) {
        addCriterion("cur_hour in", values, "cur_hour");
        return (Criteria) this;
    }

    public Criteria andcurHourNotIn(List<Double> values) {
        addCriterion("cur_hour not in", values, "cur_hour");
        return (Criteria) this;
    }

    public Criteria andcurHourBetween(Double value1, Double value2) {
        addCriterion("cur_hour between", value1, value2, "cur_hour");
        return (Criteria) this;
    }

    public Criteria andcurHourNotBetween(Double value1, Double value2) {
        addCriterion("cur_hour not between", value1, value2, "cur_hour");
        return (Criteria) this;
    }

    public Criteria andcurHourLike(Double value) {
        addCriterion("cur_hour like", value, "cur_hour");
        return (Criteria) this;
    }

    public Criteria andcurHourNotLike(Double value) {
        addCriterion("cur_hour not like", value, "cur_hour");
        return (Criteria) this;
    }
    public Criteria andtotalHourIsNull() {
        addCriterion("total_hour is null");
        return (Criteria) this;
    }

    public Criteria andtotalHourIsNotNull() {
        addCriterion("total_hour is not null");
        return (Criteria) this;
    }

    public Criteria andtotalHourEqualTo(Double value) {
        addCriterion("total_hour =", value, "total_hour");
        return (Criteria) this;
    }

    public Criteria andtotalHourNotEqualTo(Double value) {
        addCriterion("total_hour <>", value, "total_hour");
        return (Criteria) this;
    }

    public Criteria andtotalHourGreaterThan(Double value) {
        addCriterion("total_hour >", value, "total_hour");
        return (Criteria) this;
    }

    public Criteria andtotalHourGreaterThanOrEqualTo(Double value) {
        addCriterion("total_hour >=", value, "total_hour");
        return (Criteria) this;
    }

    public Criteria andtotalHourLessThan(Double value) {
        addCriterion("total_hour <", value, "total_hour");
        return (Criteria) this;
    }

    public Criteria andtotalHourLessThanOrEqualTo(Double value) {
        addCriterion("total_hour <=", value, "total_hour");
        return (Criteria) this;
    }

    public Criteria andtotalHourIn(List<Double> values) {
        addCriterion("total_hour in", values, "total_hour");
        return (Criteria) this;
    }

    public Criteria andtotalHourNotIn(List<Double> values) {
        addCriterion("total_hour not in", values, "total_hour");
        return (Criteria) this;
    }

    public Criteria andtotalHourBetween(Double value1, Double value2) {
        addCriterion("total_hour between", value1, value2, "total_hour");
        return (Criteria) this;
    }

    public Criteria andtotalHourNotBetween(Double value1, Double value2) {
        addCriterion("total_hour not between", value1, value2, "total_hour");
        return (Criteria) this;
    }

    public Criteria andtotalHourLike(Double value) {
        addCriterion("total_hour like", value, "total_hour");
        return (Criteria) this;
    }

    public Criteria andtotalHourNotLike(Double value) {
        addCriterion("total_hour not like", value, "total_hour");
        return (Criteria) this;
    }
    public Criteria andstartTimeIsNull() {
        addCriterion("start_time is null");
        return (Criteria) this;
    }

    public Criteria andstartTimeIsNotNull() {
        addCriterion("start_time is not null");
        return (Criteria) this;
    }

    public Criteria andstartTimeEqualTo(Date value) {
        addCriterion("start_time =", value, "start_time");
        return (Criteria) this;
    }

    public Criteria andstartTimeNotEqualTo(Date value) {
        addCriterion("start_time <>", value, "start_time");
        return (Criteria) this;
    }

    public Criteria andstartTimeGreaterThan(Date value) {
        addCriterion("start_time >", value, "start_time");
        return (Criteria) this;
    }

    public Criteria andstartTimeGreaterThanOrEqualTo(Date value) {
        addCriterion("start_time >=", value, "start_time");
        return (Criteria) this;
    }

    public Criteria andstartTimeLessThan(Date value) {
        addCriterion("start_time <", value, "start_time");
        return (Criteria) this;
    }

    public Criteria andstartTimeLessThanOrEqualTo(Date value) {
        addCriterion("start_time <=", value, "start_time");
        return (Criteria) this;
    }

    public Criteria andstartTimeIn(List<Date> values) {
        addCriterion("start_time in", values, "start_time");
        return (Criteria) this;
    }

    public Criteria andstartTimeNotIn(List<Date> values) {
        addCriterion("start_time not in", values, "start_time");
        return (Criteria) this;
    }

    public Criteria andstartTimeBetween(Date value1, Date value2) {
        addCriterion("start_time between", value1, value2, "start_time");
        return (Criteria) this;
    }

    public Criteria andstartTimeNotBetween(Date value1, Date value2) {
        addCriterion("start_time not between", value1, value2, "start_time");
        return (Criteria) this;
    }

    public Criteria andstartTimeLike(Date value) {
        addCriterion("start_time like", value, "start_time");
        return (Criteria) this;
    }

    public Criteria andstartTimeNotLike(Date value) {
        addCriterion("start_time not like", value, "start_time");
        return (Criteria) this;
    }
    public Criteria andremarkIsNull() {
        addCriterion("remark is null");
        return (Criteria) this;
    }

    public Criteria andremarkIsNotNull() {
        addCriterion("remark is not null");
        return (Criteria) this;
    }

    public Criteria andremarkEqualTo(String value) {
        addCriterion("remark =", value, "remark");
        return (Criteria) this;
    }

    public Criteria andremarkNotEqualTo(String value) {
        addCriterion("remark <>", value, "remark");
        return (Criteria) this;
    }

    public Criteria andremarkGreaterThan(String value) {
        addCriterion("remark >", value, "remark");
        return (Criteria) this;
    }

    public Criteria andremarkGreaterThanOrEqualTo(String value) {
        addCriterion("remark >=", value, "remark");
        return (Criteria) this;
    }

    public Criteria andremarkLessThan(String value) {
        addCriterion("remark <", value, "remark");
        return (Criteria) this;
    }

    public Criteria andremarkLessThanOrEqualTo(String value) {
        addCriterion("remark <=", value, "remark");
        return (Criteria) this;
    }

    public Criteria andremarkIn(List<String> values) {
        addCriterion("remark in", values, "remark");
        return (Criteria) this;
    }

    public Criteria andremarkNotIn(List<String> values) {
        addCriterion("remark not in", values, "remark");
        return (Criteria) this;
    }

    public Criteria andremarkBetween(String value1, String value2) {
        addCriterion("remark between", value1, value2, "remark");
        return (Criteria) this;
    }

    public Criteria andremarkNotBetween(String value1, String value2) {
        addCriterion("remark not between", value1, value2, "remark");
        return (Criteria) this;
    }

    public Criteria andremarkLike(String value) {
        addCriterion("remark like", value, "remark");
        return (Criteria) this;
    }

    public Criteria andremarkNotLike(String value) {
        addCriterion("remark not like", value, "remark");
        return (Criteria) this;
    }
    public Criteria anddeletedIsNull() {
        addCriterion("deleted is null");
        return (Criteria) this;
    }

    public Criteria anddeletedIsNotNull() {
        addCriterion("deleted is not null");
        return (Criteria) this;
    }

    public Criteria anddeletedEqualTo(Integer value) {
        addCriterion("deleted =", value, "deleted");
        return (Criteria) this;
    }

    public Criteria anddeletedNotEqualTo(Integer value) {
        addCriterion("deleted <>", value, "deleted");
        return (Criteria) this;
    }

    public Criteria anddeletedGreaterThan(Integer value) {
        addCriterion("deleted >", value, "deleted");
        return (Criteria) this;
    }

    public Criteria anddeletedGreaterThanOrEqualTo(Integer value) {
        addCriterion("deleted >=", value, "deleted");
        return (Criteria) this;
    }

    public Criteria anddeletedLessThan(Integer value) {
        addCriterion("deleted <", value, "deleted");
        return (Criteria) this;
    }

    public Criteria anddeletedLessThanOrEqualTo(Integer value) {
        addCriterion("deleted <=", value, "deleted");
        return (Criteria) this;
    }

    public Criteria anddeletedIn(List<Integer> values) {
        addCriterion("deleted in", values, "deleted");
        return (Criteria) this;
    }

    public Criteria anddeletedNotIn(List<Integer> values) {
        addCriterion("deleted not in", values, "deleted");
        return (Criteria) this;
    }

    public Criteria anddeletedBetween(Integer value1, Integer value2) {
        addCriterion("deleted between", value1, value2, "deleted");
        return (Criteria) this;
    }

    public Criteria anddeletedNotBetween(Integer value1, Integer value2) {
        addCriterion("deleted not between", value1, value2, "deleted");
        return (Criteria) this;
    }

    public Criteria anddeletedLike(Integer value) {
        addCriterion("deleted like", value, "deleted");
        return (Criteria) this;
    }

    public Criteria anddeletedNotLike(Integer value) {
        addCriterion("deleted not like", value, "deleted");
        return (Criteria) this;
    }
    public Criteria andcreateTimeIsNull() {
        addCriterion("create_time is null");
        return (Criteria) this;
    }

    public Criteria andcreateTimeIsNotNull() {
        addCriterion("create_time is not null");
        return (Criteria) this;
    }

    public Criteria andcreateTimeEqualTo(Date value) {
        addCriterion("create_time =", value, "create_time");
        return (Criteria) this;
    }

    public Criteria andcreateTimeNotEqualTo(Date value) {
        addCriterion("create_time <>", value, "create_time");
        return (Criteria) this;
    }

    public Criteria andcreateTimeGreaterThan(Date value) {
        addCriterion("create_time >", value, "create_time");
        return (Criteria) this;
    }

    public Criteria andcreateTimeGreaterThanOrEqualTo(Date value) {
        addCriterion("create_time >=", value, "create_time");
        return (Criteria) this;
    }

    public Criteria andcreateTimeLessThan(Date value) {
        addCriterion("create_time <", value, "create_time");
        return (Criteria) this;
    }

    public Criteria andcreateTimeLessThanOrEqualTo(Date value) {
        addCriterion("create_time <=", value, "create_time");
        return (Criteria) this;
    }

    public Criteria andcreateTimeIn(List<Date> values) {
        addCriterion("create_time in", values, "create_time");
        return (Criteria) this;
    }

    public Criteria andcreateTimeNotIn(List<Date> values) {
        addCriterion("create_time not in", values, "create_time");
        return (Criteria) this;
    }

    public Criteria andcreateTimeBetween(Date value1, Date value2) {
        addCriterion("create_time between", value1, value2, "create_time");
        return (Criteria) this;
    }

    public Criteria andcreateTimeNotBetween(Date value1, Date value2) {
        addCriterion("create_time not between", value1, value2, "create_time");
        return (Criteria) this;
    }

    public Criteria andcreateTimeLike(Date value) {
        addCriterion("create_time like", value, "create_time");
        return (Criteria) this;
    }

    public Criteria andcreateTimeNotLike(Date value) {
        addCriterion("create_time not like", value, "create_time");
        return (Criteria) this;
    }
    public Criteria andcreateUserIsNull() {
        addCriterion("create_user is null");
        return (Criteria) this;
    }

    public Criteria andcreateUserIsNotNull() {
        addCriterion("create_user is not null");
        return (Criteria) this;
    }

    public Criteria andcreateUserEqualTo(String value) {
        addCriterion("create_user =", value, "create_user");
        return (Criteria) this;
    }

    public Criteria andcreateUserNotEqualTo(String value) {
        addCriterion("create_user <>", value, "create_user");
        return (Criteria) this;
    }

    public Criteria andcreateUserGreaterThan(String value) {
        addCriterion("create_user >", value, "create_user");
        return (Criteria) this;
    }

    public Criteria andcreateUserGreaterThanOrEqualTo(String value) {
        addCriterion("create_user >=", value, "create_user");
        return (Criteria) this;
    }

    public Criteria andcreateUserLessThan(String value) {
        addCriterion("create_user <", value, "create_user");
        return (Criteria) this;
    }

    public Criteria andcreateUserLessThanOrEqualTo(String value) {
        addCriterion("create_user <=", value, "create_user");
        return (Criteria) this;
    }

    public Criteria andcreateUserIn(List<String> values) {
        addCriterion("create_user in", values, "create_user");
        return (Criteria) this;
    }

    public Criteria andcreateUserNotIn(List<String> values) {
        addCriterion("create_user not in", values, "create_user");
        return (Criteria) this;
    }

    public Criteria andcreateUserBetween(String value1, String value2) {
        addCriterion("create_user between", value1, value2, "create_user");
        return (Criteria) this;
    }

    public Criteria andcreateUserNotBetween(String value1, String value2) {
        addCriterion("create_user not between", value1, value2, "create_user");
        return (Criteria) this;
    }

    public Criteria andcreateUserLike(String value) {
        addCriterion("create_user like", value, "create_user");
        return (Criteria) this;
    }

    public Criteria andcreateUserNotLike(String value) {
        addCriterion("create_user not like", value, "create_user");
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