package me.importtao.user.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlanetUser1Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlanetUser1Example() {
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
    public Criteria anduserIdIsNull() {
        addCriterion("user_id is null");
        return (Criteria) this;
    }

    public Criteria anduserIdIsNotNull() {
        addCriterion("user_id is not null");
        return (Criteria) this;
    }

    public Criteria anduserIdEqualTo(String value) {
        addCriterion("user_id =", value, "user_id");
        return (Criteria) this;
    }

    public Criteria anduserIdNotEqualTo(String value) {
        addCriterion("user_id <>", value, "user_id");
        return (Criteria) this;
    }

    public Criteria anduserIdGreaterThan(String value) {
        addCriterion("user_id >", value, "user_id");
        return (Criteria) this;
    }

    public Criteria anduserIdGreaterThanOrEqualTo(String value) {
        addCriterion("user_id >=", value, "user_id");
        return (Criteria) this;
    }

    public Criteria anduserIdLessThan(String value) {
        addCriterion("user_id <", value, "user_id");
        return (Criteria) this;
    }

    public Criteria anduserIdLessThanOrEqualTo(String value) {
        addCriterion("user_id <=", value, "user_id");
        return (Criteria) this;
    }

    public Criteria anduserIdIn(List<String> values) {
        addCriterion("user_id in", values, "user_id");
        return (Criteria) this;
    }

    public Criteria anduserIdNotIn(List<String> values) {
        addCriterion("user_id not in", values, "user_id");
        return (Criteria) this;
    }

    public Criteria anduserIdBetween(String value1, String value2) {
        addCriterion("user_id between", value1, value2, "user_id");
        return (Criteria) this;
    }

    public Criteria anduserIdNotBetween(String value1, String value2) {
        addCriterion("user_id not between", value1, value2, "user_id");
        return (Criteria) this;
    }

    public Criteria anduserIdLike(String value) {
        addCriterion("user_id like", value, "user_id");
        return (Criteria) this;
    }

    public Criteria anduserIdNotLike(String value) {
        addCriterion("user_id not like", value, "user_id");
        return (Criteria) this;
    }
    public Criteria andnickNameIsNull() {
        addCriterion("nick_name is null");
        return (Criteria) this;
    }

    public Criteria andnickNameIsNotNull() {
        addCriterion("nick_name is not null");
        return (Criteria) this;
    }

    public Criteria andnickNameEqualTo(String value) {
        addCriterion("nick_name =", value, "nick_name");
        return (Criteria) this;
    }

    public Criteria andnickNameNotEqualTo(String value) {
        addCriterion("nick_name <>", value, "nick_name");
        return (Criteria) this;
    }

    public Criteria andnickNameGreaterThan(String value) {
        addCriterion("nick_name >", value, "nick_name");
        return (Criteria) this;
    }

    public Criteria andnickNameGreaterThanOrEqualTo(String value) {
        addCriterion("nick_name >=", value, "nick_name");
        return (Criteria) this;
    }

    public Criteria andnickNameLessThan(String value) {
        addCriterion("nick_name <", value, "nick_name");
        return (Criteria) this;
    }

    public Criteria andnickNameLessThanOrEqualTo(String value) {
        addCriterion("nick_name <=", value, "nick_name");
        return (Criteria) this;
    }

    public Criteria andnickNameIn(List<String> values) {
        addCriterion("nick_name in", values, "nick_name");
        return (Criteria) this;
    }

    public Criteria andnickNameNotIn(List<String> values) {
        addCriterion("nick_name not in", values, "nick_name");
        return (Criteria) this;
    }

    public Criteria andnickNameBetween(String value1, String value2) {
        addCriterion("nick_name between", value1, value2, "nick_name");
        return (Criteria) this;
    }

    public Criteria andnickNameNotBetween(String value1, String value2) {
        addCriterion("nick_name not between", value1, value2, "nick_name");
        return (Criteria) this;
    }

    public Criteria andnickNameLike(String value) {
        addCriterion("nick_name like", value, "nick_name");
        return (Criteria) this;
    }

    public Criteria andnickNameNotLike(String value) {
        addCriterion("nick_name not like", value, "nick_name");
        return (Criteria) this;
    }
    public Criteria andsexCodeIsNull() {
        addCriterion("sex_code is null");
        return (Criteria) this;
    }

    public Criteria andsexCodeIsNotNull() {
        addCriterion("sex_code is not null");
        return (Criteria) this;
    }

    public Criteria andsexCodeEqualTo(Integer value) {
        addCriterion("sex_code =", value, "sex_code");
        return (Criteria) this;
    }

    public Criteria andsexCodeNotEqualTo(Integer value) {
        addCriterion("sex_code <>", value, "sex_code");
        return (Criteria) this;
    }

    public Criteria andsexCodeGreaterThan(Integer value) {
        addCriterion("sex_code >", value, "sex_code");
        return (Criteria) this;
    }

    public Criteria andsexCodeGreaterThanOrEqualTo(Integer value) {
        addCriterion("sex_code >=", value, "sex_code");
        return (Criteria) this;
    }

    public Criteria andsexCodeLessThan(Integer value) {
        addCriterion("sex_code <", value, "sex_code");
        return (Criteria) this;
    }

    public Criteria andsexCodeLessThanOrEqualTo(Integer value) {
        addCriterion("sex_code <=", value, "sex_code");
        return (Criteria) this;
    }

    public Criteria andsexCodeIn(List<Integer> values) {
        addCriterion("sex_code in", values, "sex_code");
        return (Criteria) this;
    }

    public Criteria andsexCodeNotIn(List<Integer> values) {
        addCriterion("sex_code not in", values, "sex_code");
        return (Criteria) this;
    }

    public Criteria andsexCodeBetween(Integer value1, Integer value2) {
        addCriterion("sex_code between", value1, value2, "sex_code");
        return (Criteria) this;
    }

    public Criteria andsexCodeNotBetween(Integer value1, Integer value2) {
        addCriterion("sex_code not between", value1, value2, "sex_code");
        return (Criteria) this;
    }

    public Criteria andsexCodeLike(Integer value) {
        addCriterion("sex_code like", value, "sex_code");
        return (Criteria) this;
    }

    public Criteria andsexCodeNotLike(Integer value) {
        addCriterion("sex_code not like", value, "sex_code");
        return (Criteria) this;
    }
    public Criteria andphoneIsNull() {
        addCriterion("phone is null");
        return (Criteria) this;
    }

    public Criteria andphoneIsNotNull() {
        addCriterion("phone is not null");
        return (Criteria) this;
    }

    public Criteria andphoneEqualTo(String value) {
        addCriterion("phone =", value, "phone");
        return (Criteria) this;
    }

    public Criteria andphoneNotEqualTo(String value) {
        addCriterion("phone <>", value, "phone");
        return (Criteria) this;
    }

    public Criteria andphoneGreaterThan(String value) {
        addCriterion("phone >", value, "phone");
        return (Criteria) this;
    }

    public Criteria andphoneGreaterThanOrEqualTo(String value) {
        addCriterion("phone >=", value, "phone");
        return (Criteria) this;
    }

    public Criteria andphoneLessThan(String value) {
        addCriterion("phone <", value, "phone");
        return (Criteria) this;
    }

    public Criteria andphoneLessThanOrEqualTo(String value) {
        addCriterion("phone <=", value, "phone");
        return (Criteria) this;
    }

    public Criteria andphoneIn(List<String> values) {
        addCriterion("phone in", values, "phone");
        return (Criteria) this;
    }

    public Criteria andphoneNotIn(List<String> values) {
        addCriterion("phone not in", values, "phone");
        return (Criteria) this;
    }

    public Criteria andphoneBetween(String value1, String value2) {
        addCriterion("phone between", value1, value2, "phone");
        return (Criteria) this;
    }

    public Criteria andphoneNotBetween(String value1, String value2) {
        addCriterion("phone not between", value1, value2, "phone");
        return (Criteria) this;
    }

    public Criteria andphoneLike(String value) {
        addCriterion("phone like", value, "phone");
        return (Criteria) this;
    }

    public Criteria andphoneNotLike(String value) {
        addCriterion("phone not like", value, "phone");
        return (Criteria) this;
    }
    public Criteria andpasswordIsNull() {
        addCriterion("password is null");
        return (Criteria) this;
    }

    public Criteria andpasswordIsNotNull() {
        addCriterion("password is not null");
        return (Criteria) this;
    }

    public Criteria andpasswordEqualTo(String value) {
        addCriterion("password =", value, "password");
        return (Criteria) this;
    }

    public Criteria andpasswordNotEqualTo(String value) {
        addCriterion("password <>", value, "password");
        return (Criteria) this;
    }

    public Criteria andpasswordGreaterThan(String value) {
        addCriterion("password >", value, "password");
        return (Criteria) this;
    }

    public Criteria andpasswordGreaterThanOrEqualTo(String value) {
        addCriterion("password >=", value, "password");
        return (Criteria) this;
    }

    public Criteria andpasswordLessThan(String value) {
        addCriterion("password <", value, "password");
        return (Criteria) this;
    }

    public Criteria andpasswordLessThanOrEqualTo(String value) {
        addCriterion("password <=", value, "password");
        return (Criteria) this;
    }

    public Criteria andpasswordIn(List<String> values) {
        addCriterion("password in", values, "password");
        return (Criteria) this;
    }

    public Criteria andpasswordNotIn(List<String> values) {
        addCriterion("password not in", values, "password");
        return (Criteria) this;
    }

    public Criteria andpasswordBetween(String value1, String value2) {
        addCriterion("password between", value1, value2, "password");
        return (Criteria) this;
    }

    public Criteria andpasswordNotBetween(String value1, String value2) {
        addCriterion("password not between", value1, value2, "password");
        return (Criteria) this;
    }

    public Criteria andpasswordLike(String value) {
        addCriterion("password like", value, "password");
        return (Criteria) this;
    }

    public Criteria andpasswordNotLike(String value) {
        addCriterion("password not like", value, "password");
        return (Criteria) this;
    }
    public Criteria andemailIsNull() {
        addCriterion("email is null");
        return (Criteria) this;
    }

    public Criteria andemailIsNotNull() {
        addCriterion("email is not null");
        return (Criteria) this;
    }

    public Criteria andemailEqualTo(String value) {
        addCriterion("email =", value, "email");
        return (Criteria) this;
    }

    public Criteria andemailNotEqualTo(String value) {
        addCriterion("email <>", value, "email");
        return (Criteria) this;
    }

    public Criteria andemailGreaterThan(String value) {
        addCriterion("email >", value, "email");
        return (Criteria) this;
    }

    public Criteria andemailGreaterThanOrEqualTo(String value) {
        addCriterion("email >=", value, "email");
        return (Criteria) this;
    }

    public Criteria andemailLessThan(String value) {
        addCriterion("email <", value, "email");
        return (Criteria) this;
    }

    public Criteria andemailLessThanOrEqualTo(String value) {
        addCriterion("email <=", value, "email");
        return (Criteria) this;
    }

    public Criteria andemailIn(List<String> values) {
        addCriterion("email in", values, "email");
        return (Criteria) this;
    }

    public Criteria andemailNotIn(List<String> values) {
        addCriterion("email not in", values, "email");
        return (Criteria) this;
    }

    public Criteria andemailBetween(String value1, String value2) {
        addCriterion("email between", value1, value2, "email");
        return (Criteria) this;
    }

    public Criteria andemailNotBetween(String value1, String value2) {
        addCriterion("email not between", value1, value2, "email");
        return (Criteria) this;
    }

    public Criteria andemailLike(String value) {
        addCriterion("email like", value, "email");
        return (Criteria) this;
    }

    public Criteria andemailNotLike(String value) {
        addCriterion("email not like", value, "email");
        return (Criteria) this;
    }
    public Criteria andimageIsNull() {
        addCriterion("image is null");
        return (Criteria) this;
    }

    public Criteria andimageIsNotNull() {
        addCriterion("image is not null");
        return (Criteria) this;
    }

    public Criteria andimageEqualTo(String value) {
        addCriterion("image =", value, "image");
        return (Criteria) this;
    }

    public Criteria andimageNotEqualTo(String value) {
        addCriterion("image <>", value, "image");
        return (Criteria) this;
    }

    public Criteria andimageGreaterThan(String value) {
        addCriterion("image >", value, "image");
        return (Criteria) this;
    }

    public Criteria andimageGreaterThanOrEqualTo(String value) {
        addCriterion("image >=", value, "image");
        return (Criteria) this;
    }

    public Criteria andimageLessThan(String value) {
        addCriterion("image <", value, "image");
        return (Criteria) this;
    }

    public Criteria andimageLessThanOrEqualTo(String value) {
        addCriterion("image <=", value, "image");
        return (Criteria) this;
    }

    public Criteria andimageIn(List<String> values) {
        addCriterion("image in", values, "image");
        return (Criteria) this;
    }

    public Criteria andimageNotIn(List<String> values) {
        addCriterion("image not in", values, "image");
        return (Criteria) this;
    }

    public Criteria andimageBetween(String value1, String value2) {
        addCriterion("image between", value1, value2, "image");
        return (Criteria) this;
    }

    public Criteria andimageNotBetween(String value1, String value2) {
        addCriterion("image not between", value1, value2, "image");
        return (Criteria) this;
    }

    public Criteria andimageLike(String value) {
        addCriterion("image like", value, "image");
        return (Criteria) this;
    }

    public Criteria andimageNotLike(String value) {
        addCriterion("image not like", value, "image");
        return (Criteria) this;
    }
    public Criteria andbirthdayIsNull() {
        addCriterion("birthday is null");
        return (Criteria) this;
    }

    public Criteria andbirthdayIsNotNull() {
        addCriterion("birthday is not null");
        return (Criteria) this;
    }

    public Criteria andbirthdayEqualTo(String value) {
        addCriterion("birthday =", value, "birthday");
        return (Criteria) this;
    }

    public Criteria andbirthdayNotEqualTo(String value) {
        addCriterion("birthday <>", value, "birthday");
        return (Criteria) this;
    }

    public Criteria andbirthdayGreaterThan(String value) {
        addCriterion("birthday >", value, "birthday");
        return (Criteria) this;
    }

    public Criteria andbirthdayGreaterThanOrEqualTo(String value) {
        addCriterion("birthday >=", value, "birthday");
        return (Criteria) this;
    }

    public Criteria andbirthdayLessThan(String value) {
        addCriterion("birthday <", value, "birthday");
        return (Criteria) this;
    }

    public Criteria andbirthdayLessThanOrEqualTo(String value) {
        addCriterion("birthday <=", value, "birthday");
        return (Criteria) this;
    }

    public Criteria andbirthdayIn(List<String> values) {
        addCriterion("birthday in", values, "birthday");
        return (Criteria) this;
    }

    public Criteria andbirthdayNotIn(List<String> values) {
        addCriterion("birthday not in", values, "birthday");
        return (Criteria) this;
    }

    public Criteria andbirthdayBetween(String value1, String value2) {
        addCriterion("birthday between", value1, value2, "birthday");
        return (Criteria) this;
    }

    public Criteria andbirthdayNotBetween(String value1, String value2) {
        addCriterion("birthday not between", value1, value2, "birthday");
        return (Criteria) this;
    }

    public Criteria andbirthdayLike(String value) {
        addCriterion("birthday like", value, "birthday");
        return (Criteria) this;
    }

    public Criteria andbirthdayNotLike(String value) {
        addCriterion("birthday not like", value, "birthday");
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
    public Criteria andmodifyTimeIsNull() {
        addCriterion("modify_time is null");
        return (Criteria) this;
    }

    public Criteria andmodifyTimeIsNotNull() {
        addCriterion("modify_time is not null");
        return (Criteria) this;
    }

    public Criteria andmodifyTimeEqualTo(Date value) {
        addCriterion("modify_time =", value, "modify_time");
        return (Criteria) this;
    }

    public Criteria andmodifyTimeNotEqualTo(Date value) {
        addCriterion("modify_time <>", value, "modify_time");
        return (Criteria) this;
    }

    public Criteria andmodifyTimeGreaterThan(Date value) {
        addCriterion("modify_time >", value, "modify_time");
        return (Criteria) this;
    }

    public Criteria andmodifyTimeGreaterThanOrEqualTo(Date value) {
        addCriterion("modify_time >=", value, "modify_time");
        return (Criteria) this;
    }

    public Criteria andmodifyTimeLessThan(Date value) {
        addCriterion("modify_time <", value, "modify_time");
        return (Criteria) this;
    }

    public Criteria andmodifyTimeLessThanOrEqualTo(Date value) {
        addCriterion("modify_time <=", value, "modify_time");
        return (Criteria) this;
    }

    public Criteria andmodifyTimeIn(List<Date> values) {
        addCriterion("modify_time in", values, "modify_time");
        return (Criteria) this;
    }

    public Criteria andmodifyTimeNotIn(List<Date> values) {
        addCriterion("modify_time not in", values, "modify_time");
        return (Criteria) this;
    }

    public Criteria andmodifyTimeBetween(Date value1, Date value2) {
        addCriterion("modify_time between", value1, value2, "modify_time");
        return (Criteria) this;
    }

    public Criteria andmodifyTimeNotBetween(Date value1, Date value2) {
        addCriterion("modify_time not between", value1, value2, "modify_time");
        return (Criteria) this;
    }

    public Criteria andmodifyTimeLike(Date value) {
        addCriterion("modify_time like", value, "modify_time");
        return (Criteria) this;
    }

    public Criteria andmodifyTimeNotLike(Date value) {
        addCriterion("modify_time not like", value, "modify_time");
        return (Criteria) this;
    }
    public Criteria andidentityIsNull() {
        addCriterion("identity is null");
        return (Criteria) this;
    }

    public Criteria andidentityIsNotNull() {
        addCriterion("identity is not null");
        return (Criteria) this;
    }

    public Criteria andidentityEqualTo(Integer value) {
        addCriterion("identity =", value, "identity");
        return (Criteria) this;
    }

    public Criteria andidentityNotEqualTo(Integer value) {
        addCriterion("identity <>", value, "identity");
        return (Criteria) this;
    }

    public Criteria andidentityGreaterThan(Integer value) {
        addCriterion("identity >", value, "identity");
        return (Criteria) this;
    }

    public Criteria andidentityGreaterThanOrEqualTo(Integer value) {
        addCriterion("identity >=", value, "identity");
        return (Criteria) this;
    }

    public Criteria andidentityLessThan(Integer value) {
        addCriterion("identity <", value, "identity");
        return (Criteria) this;
    }

    public Criteria andidentityLessThanOrEqualTo(Integer value) {
        addCriterion("identity <=", value, "identity");
        return (Criteria) this;
    }

    public Criteria andidentityIn(List<Integer> values) {
        addCriterion("identity in", values, "identity");
        return (Criteria) this;
    }

    public Criteria andidentityNotIn(List<Integer> values) {
        addCriterion("identity not in", values, "identity");
        return (Criteria) this;
    }

    public Criteria andidentityBetween(Integer value1, Integer value2) {
        addCriterion("identity between", value1, value2, "identity");
        return (Criteria) this;
    }

    public Criteria andidentityNotBetween(Integer value1, Integer value2) {
        addCriterion("identity not between", value1, value2, "identity");
        return (Criteria) this;
    }

    public Criteria andidentityLike(Integer value) {
        addCriterion("identity like", value, "identity");
        return (Criteria) this;
    }

    public Criteria andidentityNotLike(Integer value) {
        addCriterion("identity not like", value, "identity");
        return (Criteria) this;
    }
    public Criteria andthirdAccountIsNull() {
        addCriterion("third_account is null");
        return (Criteria) this;
    }

    public Criteria andthirdAccountIsNotNull() {
        addCriterion("third_account is not null");
        return (Criteria) this;
    }

    public Criteria andthirdAccountEqualTo(String value) {
        addCriterion("third_account =", value, "third_account");
        return (Criteria) this;
    }

    public Criteria andthirdAccountNotEqualTo(String value) {
        addCriterion("third_account <>", value, "third_account");
        return (Criteria) this;
    }

    public Criteria andthirdAccountGreaterThan(String value) {
        addCriterion("third_account >", value, "third_account");
        return (Criteria) this;
    }

    public Criteria andthirdAccountGreaterThanOrEqualTo(String value) {
        addCriterion("third_account >=", value, "third_account");
        return (Criteria) this;
    }

    public Criteria andthirdAccountLessThan(String value) {
        addCriterion("third_account <", value, "third_account");
        return (Criteria) this;
    }

    public Criteria andthirdAccountLessThanOrEqualTo(String value) {
        addCriterion("third_account <=", value, "third_account");
        return (Criteria) this;
    }

    public Criteria andthirdAccountIn(List<String> values) {
        addCriterion("third_account in", values, "third_account");
        return (Criteria) this;
    }

    public Criteria andthirdAccountNotIn(List<String> values) {
        addCriterion("third_account not in", values, "third_account");
        return (Criteria) this;
    }

    public Criteria andthirdAccountBetween(String value1, String value2) {
        addCriterion("third_account between", value1, value2, "third_account");
        return (Criteria) this;
    }

    public Criteria andthirdAccountNotBetween(String value1, String value2) {
        addCriterion("third_account not between", value1, value2, "third_account");
        return (Criteria) this;
    }

    public Criteria andthirdAccountLike(String value) {
        addCriterion("third_account like", value, "third_account");
        return (Criteria) this;
    }

    public Criteria andthirdAccountNotLike(String value) {
        addCriterion("third_account not like", value, "third_account");
        return (Criteria) this;
    }
    public Criteria andsellerIdIsNull() {
        addCriterion("seller_id is null");
        return (Criteria) this;
    }

    public Criteria andsellerIdIsNotNull() {
        addCriterion("seller_id is not null");
        return (Criteria) this;
    }

    public Criteria andsellerIdEqualTo(Long value) {
        addCriterion("seller_id =", value, "seller_id");
        return (Criteria) this;
    }

    public Criteria andsellerIdNotEqualTo(Long value) {
        addCriterion("seller_id <>", value, "seller_id");
        return (Criteria) this;
    }

    public Criteria andsellerIdGreaterThan(Long value) {
        addCriterion("seller_id >", value, "seller_id");
        return (Criteria) this;
    }

    public Criteria andsellerIdGreaterThanOrEqualTo(Long value) {
        addCriterion("seller_id >=", value, "seller_id");
        return (Criteria) this;
    }

    public Criteria andsellerIdLessThan(Long value) {
        addCriterion("seller_id <", value, "seller_id");
        return (Criteria) this;
    }

    public Criteria andsellerIdLessThanOrEqualTo(Long value) {
        addCriterion("seller_id <=", value, "seller_id");
        return (Criteria) this;
    }

    public Criteria andsellerIdIn(List<Long> values) {
        addCriterion("seller_id in", values, "seller_id");
        return (Criteria) this;
    }

    public Criteria andsellerIdNotIn(List<Long> values) {
        addCriterion("seller_id not in", values, "seller_id");
        return (Criteria) this;
    }

    public Criteria andsellerIdBetween(Long value1, Long value2) {
        addCriterion("seller_id between", value1, value2, "seller_id");
        return (Criteria) this;
    }

    public Criteria andsellerIdNotBetween(Long value1, Long value2) {
        addCriterion("seller_id not between", value1, value2, "seller_id");
        return (Criteria) this;
    }

    public Criteria andsellerIdLike(Long value) {
        addCriterion("seller_id like", value, "seller_id");
        return (Criteria) this;
    }

    public Criteria andsellerIdNotLike(Long value) {
        addCriterion("seller_id not like", value, "seller_id");
        return (Criteria) this;
    }
    public Criteria andchannelIsNull() {
        addCriterion("channel is null");
        return (Criteria) this;
    }

    public Criteria andchannelIsNotNull() {
        addCriterion("channel is not null");
        return (Criteria) this;
    }

    public Criteria andchannelEqualTo(String value) {
        addCriterion("channel =", value, "channel");
        return (Criteria) this;
    }

    public Criteria andchannelNotEqualTo(String value) {
        addCriterion("channel <>", value, "channel");
        return (Criteria) this;
    }

    public Criteria andchannelGreaterThan(String value) {
        addCriterion("channel >", value, "channel");
        return (Criteria) this;
    }

    public Criteria andchannelGreaterThanOrEqualTo(String value) {
        addCriterion("channel >=", value, "channel");
        return (Criteria) this;
    }

    public Criteria andchannelLessThan(String value) {
        addCriterion("channel <", value, "channel");
        return (Criteria) this;
    }

    public Criteria andchannelLessThanOrEqualTo(String value) {
        addCriterion("channel <=", value, "channel");
        return (Criteria) this;
    }

    public Criteria andchannelIn(List<String> values) {
        addCriterion("channel in", values, "channel");
        return (Criteria) this;
    }

    public Criteria andchannelNotIn(List<String> values) {
        addCriterion("channel not in", values, "channel");
        return (Criteria) this;
    }

    public Criteria andchannelBetween(String value1, String value2) {
        addCriterion("channel between", value1, value2, "channel");
        return (Criteria) this;
    }

    public Criteria andchannelNotBetween(String value1, String value2) {
        addCriterion("channel not between", value1, value2, "channel");
        return (Criteria) this;
    }

    public Criteria andchannelLike(String value) {
        addCriterion("channel like", value, "channel");
        return (Criteria) this;
    }

    public Criteria andchannelNotLike(String value) {
        addCriterion("channel not like", value, "channel");
        return (Criteria) this;
    }
    public Criteria andactivityIsNull() {
        addCriterion("activity is null");
        return (Criteria) this;
    }

    public Criteria andactivityIsNotNull() {
        addCriterion("activity is not null");
        return (Criteria) this;
    }

    public Criteria andactivityEqualTo(String value) {
        addCriterion("activity =", value, "activity");
        return (Criteria) this;
    }

    public Criteria andactivityNotEqualTo(String value) {
        addCriterion("activity <>", value, "activity");
        return (Criteria) this;
    }

    public Criteria andactivityGreaterThan(String value) {
        addCriterion("activity >", value, "activity");
        return (Criteria) this;
    }

    public Criteria andactivityGreaterThanOrEqualTo(String value) {
        addCriterion("activity >=", value, "activity");
        return (Criteria) this;
    }

    public Criteria andactivityLessThan(String value) {
        addCriterion("activity <", value, "activity");
        return (Criteria) this;
    }

    public Criteria andactivityLessThanOrEqualTo(String value) {
        addCriterion("activity <=", value, "activity");
        return (Criteria) this;
    }

    public Criteria andactivityIn(List<String> values) {
        addCriterion("activity in", values, "activity");
        return (Criteria) this;
    }

    public Criteria andactivityNotIn(List<String> values) {
        addCriterion("activity not in", values, "activity");
        return (Criteria) this;
    }

    public Criteria andactivityBetween(String value1, String value2) {
        addCriterion("activity between", value1, value2, "activity");
        return (Criteria) this;
    }

    public Criteria andactivityNotBetween(String value1, String value2) {
        addCriterion("activity not between", value1, value2, "activity");
        return (Criteria) this;
    }

    public Criteria andactivityLike(String value) {
        addCriterion("activity like", value, "activity");
        return (Criteria) this;
    }

    public Criteria andactivityNotLike(String value) {
        addCriterion("activity not like", value, "activity");
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
    public Criteria andexpireTimeIsNull() {
        addCriterion("expire_time is null");
        return (Criteria) this;
    }

    public Criteria andexpireTimeIsNotNull() {
        addCriterion("expire_time is not null");
        return (Criteria) this;
    }

    public Criteria andexpireTimeEqualTo(Date value) {
        addCriterion("expire_time =", value, "expire_time");
        return (Criteria) this;
    }

    public Criteria andexpireTimeNotEqualTo(Date value) {
        addCriterion("expire_time <>", value, "expire_time");
        return (Criteria) this;
    }

    public Criteria andexpireTimeGreaterThan(Date value) {
        addCriterion("expire_time >", value, "expire_time");
        return (Criteria) this;
    }

    public Criteria andexpireTimeGreaterThanOrEqualTo(Date value) {
        addCriterion("expire_time >=", value, "expire_time");
        return (Criteria) this;
    }

    public Criteria andexpireTimeLessThan(Date value) {
        addCriterion("expire_time <", value, "expire_time");
        return (Criteria) this;
    }

    public Criteria andexpireTimeLessThanOrEqualTo(Date value) {
        addCriterion("expire_time <=", value, "expire_time");
        return (Criteria) this;
    }

    public Criteria andexpireTimeIn(List<Date> values) {
        addCriterion("expire_time in", values, "expire_time");
        return (Criteria) this;
    }

    public Criteria andexpireTimeNotIn(List<Date> values) {
        addCriterion("expire_time not in", values, "expire_time");
        return (Criteria) this;
    }

    public Criteria andexpireTimeBetween(Date value1, Date value2) {
        addCriterion("expire_time between", value1, value2, "expire_time");
        return (Criteria) this;
    }

    public Criteria andexpireTimeNotBetween(Date value1, Date value2) {
        addCriterion("expire_time not between", value1, value2, "expire_time");
        return (Criteria) this;
    }

    public Criteria andexpireTimeLike(Date value) {
        addCriterion("expire_time like", value, "expire_time");
        return (Criteria) this;
    }

    public Criteria andexpireTimeNotLike(Date value) {
        addCriterion("expire_time not like", value, "expire_time");
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
    public Criteria andkidParentIsNull() {
        addCriterion("kid_parent is null");
        return (Criteria) this;
    }

    public Criteria andkidParentIsNotNull() {
        addCriterion("kid_parent is not null");
        return (Criteria) this;
    }

    public Criteria andkidParentEqualTo(String value) {
        addCriterion("kid_parent =", value, "kid_parent");
        return (Criteria) this;
    }

    public Criteria andkidParentNotEqualTo(String value) {
        addCriterion("kid_parent <>", value, "kid_parent");
        return (Criteria) this;
    }

    public Criteria andkidParentGreaterThan(String value) {
        addCriterion("kid_parent >", value, "kid_parent");
        return (Criteria) this;
    }

    public Criteria andkidParentGreaterThanOrEqualTo(String value) {
        addCriterion("kid_parent >=", value, "kid_parent");
        return (Criteria) this;
    }

    public Criteria andkidParentLessThan(String value) {
        addCriterion("kid_parent <", value, "kid_parent");
        return (Criteria) this;
    }

    public Criteria andkidParentLessThanOrEqualTo(String value) {
        addCriterion("kid_parent <=", value, "kid_parent");
        return (Criteria) this;
    }

    public Criteria andkidParentIn(List<String> values) {
        addCriterion("kid_parent in", values, "kid_parent");
        return (Criteria) this;
    }

    public Criteria andkidParentNotIn(List<String> values) {
        addCriterion("kid_parent not in", values, "kid_parent");
        return (Criteria) this;
    }

    public Criteria andkidParentBetween(String value1, String value2) {
        addCriterion("kid_parent between", value1, value2, "kid_parent");
        return (Criteria) this;
    }

    public Criteria andkidParentNotBetween(String value1, String value2) {
        addCriterion("kid_parent not between", value1, value2, "kid_parent");
        return (Criteria) this;
    }

    public Criteria andkidParentLike(String value) {
        addCriterion("kid_parent like", value, "kid_parent");
        return (Criteria) this;
    }

    public Criteria andkidParentNotLike(String value) {
        addCriterion("kid_parent not like", value, "kid_parent");
        return (Criteria) this;
    }
    public Criteria andquitStateIsNull() {
        addCriterion("quit_state is null");
        return (Criteria) this;
    }

    public Criteria andquitStateIsNotNull() {
        addCriterion("quit_state is not null");
        return (Criteria) this;
    }

    public Criteria andquitStateEqualTo(Integer value) {
        addCriterion("quit_state =", value, "quit_state");
        return (Criteria) this;
    }

    public Criteria andquitStateNotEqualTo(Integer value) {
        addCriterion("quit_state <>", value, "quit_state");
        return (Criteria) this;
    }

    public Criteria andquitStateGreaterThan(Integer value) {
        addCriterion("quit_state >", value, "quit_state");
        return (Criteria) this;
    }

    public Criteria andquitStateGreaterThanOrEqualTo(Integer value) {
        addCriterion("quit_state >=", value, "quit_state");
        return (Criteria) this;
    }

    public Criteria andquitStateLessThan(Integer value) {
        addCriterion("quit_state <", value, "quit_state");
        return (Criteria) this;
    }

    public Criteria andquitStateLessThanOrEqualTo(Integer value) {
        addCriterion("quit_state <=", value, "quit_state");
        return (Criteria) this;
    }

    public Criteria andquitStateIn(List<Integer> values) {
        addCriterion("quit_state in", values, "quit_state");
        return (Criteria) this;
    }

    public Criteria andquitStateNotIn(List<Integer> values) {
        addCriterion("quit_state not in", values, "quit_state");
        return (Criteria) this;
    }

    public Criteria andquitStateBetween(Integer value1, Integer value2) {
        addCriterion("quit_state between", value1, value2, "quit_state");
        return (Criteria) this;
    }

    public Criteria andquitStateNotBetween(Integer value1, Integer value2) {
        addCriterion("quit_state not between", value1, value2, "quit_state");
        return (Criteria) this;
    }

    public Criteria andquitStateLike(Integer value) {
        addCriterion("quit_state like", value, "quit_state");
        return (Criteria) this;
    }

    public Criteria andquitStateNotLike(Integer value) {
        addCriterion("quit_state not like", value, "quit_state");
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
    public Criteria andchannelIdIsNull() {
        addCriterion("channel_id is null");
        return (Criteria) this;
    }

    public Criteria andchannelIdIsNotNull() {
        addCriterion("channel_id is not null");
        return (Criteria) this;
    }

    public Criteria andchannelIdEqualTo(Long value) {
        addCriterion("channel_id =", value, "channel_id");
        return (Criteria) this;
    }

    public Criteria andchannelIdNotEqualTo(Long value) {
        addCriterion("channel_id <>", value, "channel_id");
        return (Criteria) this;
    }

    public Criteria andchannelIdGreaterThan(Long value) {
        addCriterion("channel_id >", value, "channel_id");
        return (Criteria) this;
    }

    public Criteria andchannelIdGreaterThanOrEqualTo(Long value) {
        addCriterion("channel_id >=", value, "channel_id");
        return (Criteria) this;
    }

    public Criteria andchannelIdLessThan(Long value) {
        addCriterion("channel_id <", value, "channel_id");
        return (Criteria) this;
    }

    public Criteria andchannelIdLessThanOrEqualTo(Long value) {
        addCriterion("channel_id <=", value, "channel_id");
        return (Criteria) this;
    }

    public Criteria andchannelIdIn(List<Long> values) {
        addCriterion("channel_id in", values, "channel_id");
        return (Criteria) this;
    }

    public Criteria andchannelIdNotIn(List<Long> values) {
        addCriterion("channel_id not in", values, "channel_id");
        return (Criteria) this;
    }

    public Criteria andchannelIdBetween(Long value1, Long value2) {
        addCriterion("channel_id between", value1, value2, "channel_id");
        return (Criteria) this;
    }

    public Criteria andchannelIdNotBetween(Long value1, Long value2) {
        addCriterion("channel_id not between", value1, value2, "channel_id");
        return (Criteria) this;
    }

    public Criteria andchannelIdLike(Long value) {
        addCriterion("channel_id like", value, "channel_id");
        return (Criteria) this;
    }

    public Criteria andchannelIdNotLike(Long value) {
        addCriterion("channel_id not like", value, "channel_id");
        return (Criteria) this;
    }
    public Criteria andaddressIsNull() {
        addCriterion("address is null");
        return (Criteria) this;
    }

    public Criteria andaddressIsNotNull() {
        addCriterion("address is not null");
        return (Criteria) this;
    }

    public Criteria andaddressEqualTo(String value) {
        addCriterion("address =", value, "address");
        return (Criteria) this;
    }

    public Criteria andaddressNotEqualTo(String value) {
        addCriterion("address <>", value, "address");
        return (Criteria) this;
    }

    public Criteria andaddressGreaterThan(String value) {
        addCriterion("address >", value, "address");
        return (Criteria) this;
    }

    public Criteria andaddressGreaterThanOrEqualTo(String value) {
        addCriterion("address >=", value, "address");
        return (Criteria) this;
    }

    public Criteria andaddressLessThan(String value) {
        addCriterion("address <", value, "address");
        return (Criteria) this;
    }

    public Criteria andaddressLessThanOrEqualTo(String value) {
        addCriterion("address <=", value, "address");
        return (Criteria) this;
    }

    public Criteria andaddressIn(List<String> values) {
        addCriterion("address in", values, "address");
        return (Criteria) this;
    }

    public Criteria andaddressNotIn(List<String> values) {
        addCriterion("address not in", values, "address");
        return (Criteria) this;
    }

    public Criteria andaddressBetween(String value1, String value2) {
        addCriterion("address between", value1, value2, "address");
        return (Criteria) this;
    }

    public Criteria andaddressNotBetween(String value1, String value2) {
        addCriterion("address not between", value1, value2, "address");
        return (Criteria) this;
    }

    public Criteria andaddressLike(String value) {
        addCriterion("address like", value, "address");
        return (Criteria) this;
    }

    public Criteria andaddressNotLike(String value) {
        addCriterion("address not like", value, "address");
        return (Criteria) this;
    }
    public Criteria andinviterIsNull() {
        addCriterion("inviter is null");
        return (Criteria) this;
    }

    public Criteria andinviterIsNotNull() {
        addCriterion("inviter is not null");
        return (Criteria) this;
    }

    public Criteria andinviterEqualTo(String value) {
        addCriterion("inviter =", value, "inviter");
        return (Criteria) this;
    }

    public Criteria andinviterNotEqualTo(String value) {
        addCriterion("inviter <>", value, "inviter");
        return (Criteria) this;
    }

    public Criteria andinviterGreaterThan(String value) {
        addCriterion("inviter >", value, "inviter");
        return (Criteria) this;
    }

    public Criteria andinviterGreaterThanOrEqualTo(String value) {
        addCriterion("inviter >=", value, "inviter");
        return (Criteria) this;
    }

    public Criteria andinviterLessThan(String value) {
        addCriterion("inviter <", value, "inviter");
        return (Criteria) this;
    }

    public Criteria andinviterLessThanOrEqualTo(String value) {
        addCriterion("inviter <=", value, "inviter");
        return (Criteria) this;
    }

    public Criteria andinviterIn(List<String> values) {
        addCriterion("inviter in", values, "inviter");
        return (Criteria) this;
    }

    public Criteria andinviterNotIn(List<String> values) {
        addCriterion("inviter not in", values, "inviter");
        return (Criteria) this;
    }

    public Criteria andinviterBetween(String value1, String value2) {
        addCriterion("inviter between", value1, value2, "inviter");
        return (Criteria) this;
    }

    public Criteria andinviterNotBetween(String value1, String value2) {
        addCriterion("inviter not between", value1, value2, "inviter");
        return (Criteria) this;
    }

    public Criteria andinviterLike(String value) {
        addCriterion("inviter like", value, "inviter");
        return (Criteria) this;
    }

    public Criteria andinviterNotLike(String value) {
        addCriterion("inviter not like", value, "inviter");
        return (Criteria) this;
    }
    public Criteria andinviterTypeIsNull() {
        addCriterion("inviter_type is null");
        return (Criteria) this;
    }

    public Criteria andinviterTypeIsNotNull() {
        addCriterion("inviter_type is not null");
        return (Criteria) this;
    }

    public Criteria andinviterTypeEqualTo(Integer value) {
        addCriterion("inviter_type =", value, "inviter_type");
        return (Criteria) this;
    }

    public Criteria andinviterTypeNotEqualTo(Integer value) {
        addCriterion("inviter_type <>", value, "inviter_type");
        return (Criteria) this;
    }

    public Criteria andinviterTypeGreaterThan(Integer value) {
        addCriterion("inviter_type >", value, "inviter_type");
        return (Criteria) this;
    }

    public Criteria andinviterTypeGreaterThanOrEqualTo(Integer value) {
        addCriterion("inviter_type >=", value, "inviter_type");
        return (Criteria) this;
    }

    public Criteria andinviterTypeLessThan(Integer value) {
        addCriterion("inviter_type <", value, "inviter_type");
        return (Criteria) this;
    }

    public Criteria andinviterTypeLessThanOrEqualTo(Integer value) {
        addCriterion("inviter_type <=", value, "inviter_type");
        return (Criteria) this;
    }

    public Criteria andinviterTypeIn(List<Integer> values) {
        addCriterion("inviter_type in", values, "inviter_type");
        return (Criteria) this;
    }

    public Criteria andinviterTypeNotIn(List<Integer> values) {
        addCriterion("inviter_type not in", values, "inviter_type");
        return (Criteria) this;
    }

    public Criteria andinviterTypeBetween(Integer value1, Integer value2) {
        addCriterion("inviter_type between", value1, value2, "inviter_type");
        return (Criteria) this;
    }

    public Criteria andinviterTypeNotBetween(Integer value1, Integer value2) {
        addCriterion("inviter_type not between", value1, value2, "inviter_type");
        return (Criteria) this;
    }

    public Criteria andinviterTypeLike(Integer value) {
        addCriterion("inviter_type like", value, "inviter_type");
        return (Criteria) this;
    }

    public Criteria andinviterTypeNotLike(Integer value) {
        addCriterion("inviter_type not like", value, "inviter_type");
        return (Criteria) this;
    }
    public Criteria anduserStatusIsNull() {
        addCriterion("user_status is null");
        return (Criteria) this;
    }

    public Criteria anduserStatusIsNotNull() {
        addCriterion("user_status is not null");
        return (Criteria) this;
    }

    public Criteria anduserStatusEqualTo(Integer value) {
        addCriterion("user_status =", value, "user_status");
        return (Criteria) this;
    }

    public Criteria anduserStatusNotEqualTo(Integer value) {
        addCriterion("user_status <>", value, "user_status");
        return (Criteria) this;
    }

    public Criteria anduserStatusGreaterThan(Integer value) {
        addCriterion("user_status >", value, "user_status");
        return (Criteria) this;
    }

    public Criteria anduserStatusGreaterThanOrEqualTo(Integer value) {
        addCriterion("user_status >=", value, "user_status");
        return (Criteria) this;
    }

    public Criteria anduserStatusLessThan(Integer value) {
        addCriterion("user_status <", value, "user_status");
        return (Criteria) this;
    }

    public Criteria anduserStatusLessThanOrEqualTo(Integer value) {
        addCriterion("user_status <=", value, "user_status");
        return (Criteria) this;
    }

    public Criteria anduserStatusIn(List<Integer> values) {
        addCriterion("user_status in", values, "user_status");
        return (Criteria) this;
    }

    public Criteria anduserStatusNotIn(List<Integer> values) {
        addCriterion("user_status not in", values, "user_status");
        return (Criteria) this;
    }

    public Criteria anduserStatusBetween(Integer value1, Integer value2) {
        addCriterion("user_status between", value1, value2, "user_status");
        return (Criteria) this;
    }

    public Criteria anduserStatusNotBetween(Integer value1, Integer value2) {
        addCriterion("user_status not between", value1, value2, "user_status");
        return (Criteria) this;
    }

    public Criteria anduserStatusLike(Integer value) {
        addCriterion("user_status like", value, "user_status");
        return (Criteria) this;
    }

    public Criteria anduserStatusNotLike(Integer value) {
        addCriterion("user_status not like", value, "user_status");
        return (Criteria) this;
    }
    public Criteria andcampusIdIsNull() {
        addCriterion("campus_id is null");
        return (Criteria) this;
    }

    public Criteria andcampusIdIsNotNull() {
        addCriterion("campus_id is not null");
        return (Criteria) this;
    }

    public Criteria andcampusIdEqualTo(Long value) {
        addCriterion("campus_id =", value, "campus_id");
        return (Criteria) this;
    }

    public Criteria andcampusIdNotEqualTo(Long value) {
        addCriterion("campus_id <>", value, "campus_id");
        return (Criteria) this;
    }

    public Criteria andcampusIdGreaterThan(Long value) {
        addCriterion("campus_id >", value, "campus_id");
        return (Criteria) this;
    }

    public Criteria andcampusIdGreaterThanOrEqualTo(Long value) {
        addCriterion("campus_id >=", value, "campus_id");
        return (Criteria) this;
    }

    public Criteria andcampusIdLessThan(Long value) {
        addCriterion("campus_id <", value, "campus_id");
        return (Criteria) this;
    }

    public Criteria andcampusIdLessThanOrEqualTo(Long value) {
        addCriterion("campus_id <=", value, "campus_id");
        return (Criteria) this;
    }

    public Criteria andcampusIdIn(List<Long> values) {
        addCriterion("campus_id in", values, "campus_id");
        return (Criteria) this;
    }

    public Criteria andcampusIdNotIn(List<Long> values) {
        addCriterion("campus_id not in", values, "campus_id");
        return (Criteria) this;
    }

    public Criteria andcampusIdBetween(Long value1, Long value2) {
        addCriterion("campus_id between", value1, value2, "campus_id");
        return (Criteria) this;
    }

    public Criteria andcampusIdNotBetween(Long value1, Long value2) {
        addCriterion("campus_id not between", value1, value2, "campus_id");
        return (Criteria) this;
    }

    public Criteria andcampusIdLike(Long value) {
        addCriterion("campus_id like", value, "campus_id");
        return (Criteria) this;
    }

    public Criteria andcampusIdNotLike(Long value) {
        addCriterion("campus_id not like", value, "campus_id");
        return (Criteria) this;
    }
    public Criteria andstatusIsNull() {
        addCriterion("status is null");
        return (Criteria) this;
    }

    public Criteria andstatusIsNotNull() {
        addCriterion("status is not null");
        return (Criteria) this;
    }

    public Criteria andstatusEqualTo(Integer value) {
        addCriterion("status =", value, "status");
        return (Criteria) this;
    }

    public Criteria andstatusNotEqualTo(Integer value) {
        addCriterion("status <>", value, "status");
        return (Criteria) this;
    }

    public Criteria andstatusGreaterThan(Integer value) {
        addCriterion("status >", value, "status");
        return (Criteria) this;
    }

    public Criteria andstatusGreaterThanOrEqualTo(Integer value) {
        addCriterion("status >=", value, "status");
        return (Criteria) this;
    }

    public Criteria andstatusLessThan(Integer value) {
        addCriterion("status <", value, "status");
        return (Criteria) this;
    }

    public Criteria andstatusLessThanOrEqualTo(Integer value) {
        addCriterion("status <=", value, "status");
        return (Criteria) this;
    }

    public Criteria andstatusIn(List<Integer> values) {
        addCriterion("status in", values, "status");
        return (Criteria) this;
    }

    public Criteria andstatusNotIn(List<Integer> values) {
        addCriterion("status not in", values, "status");
        return (Criteria) this;
    }

    public Criteria andstatusBetween(Integer value1, Integer value2) {
        addCriterion("status between", value1, value2, "status");
        return (Criteria) this;
    }

    public Criteria andstatusNotBetween(Integer value1, Integer value2) {
        addCriterion("status not between", value1, value2, "status");
        return (Criteria) this;
    }

    public Criteria andstatusLike(Integer value) {
        addCriterion("status like", value, "status");
        return (Criteria) this;
    }

    public Criteria andstatusNotLike(Integer value) {
        addCriterion("status not like", value, "status");
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