package me.importtao.user.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlanetKidExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlanetKidExample() {
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
    public Criteria andnameIsNull() {
        addCriterion("name is null");
        return (Criteria) this;
    }

    public Criteria andnameIsNotNull() {
        addCriterion("name is not null");
        return (Criteria) this;
    }

    public Criteria andnameEqualTo(String value) {
        addCriterion("name =", value, "name");
        return (Criteria) this;
    }

    public Criteria andnameNotEqualTo(String value) {
        addCriterion("name <>", value, "name");
        return (Criteria) this;
    }

    public Criteria andnameGreaterThan(String value) {
        addCriterion("name >", value, "name");
        return (Criteria) this;
    }

    public Criteria andnameGreaterThanOrEqualTo(String value) {
        addCriterion("name >=", value, "name");
        return (Criteria) this;
    }

    public Criteria andnameLessThan(String value) {
        addCriterion("name <", value, "name");
        return (Criteria) this;
    }

    public Criteria andnameLessThanOrEqualTo(String value) {
        addCriterion("name <=", value, "name");
        return (Criteria) this;
    }

    public Criteria andnameIn(List<String> values) {
        addCriterion("name in", values, "name");
        return (Criteria) this;
    }

    public Criteria andnameNotIn(List<String> values) {
        addCriterion("name not in", values, "name");
        return (Criteria) this;
    }

    public Criteria andnameBetween(String value1, String value2) {
        addCriterion("name between", value1, value2, "name");
        return (Criteria) this;
    }

    public Criteria andnameNotBetween(String value1, String value2) {
        addCriterion("name not between", value1, value2, "name");
        return (Criteria) this;
    }

    public Criteria andnameLike(String value) {
        addCriterion("name like", value, "name");
        return (Criteria) this;
    }

    public Criteria andnameNotLike(String value) {
        addCriterion("name not like", value, "name");
        return (Criteria) this;
    }
    public Criteria andnumberIsNull() {
        addCriterion("number is null");
        return (Criteria) this;
    }

    public Criteria andnumberIsNotNull() {
        addCriterion("number is not null");
        return (Criteria) this;
    }

    public Criteria andnumberEqualTo(String value) {
        addCriterion("number =", value, "number");
        return (Criteria) this;
    }

    public Criteria andnumberNotEqualTo(String value) {
        addCriterion("number <>", value, "number");
        return (Criteria) this;
    }

    public Criteria andnumberGreaterThan(String value) {
        addCriterion("number >", value, "number");
        return (Criteria) this;
    }

    public Criteria andnumberGreaterThanOrEqualTo(String value) {
        addCriterion("number >=", value, "number");
        return (Criteria) this;
    }

    public Criteria andnumberLessThan(String value) {
        addCriterion("number <", value, "number");
        return (Criteria) this;
    }

    public Criteria andnumberLessThanOrEqualTo(String value) {
        addCriterion("number <=", value, "number");
        return (Criteria) this;
    }

    public Criteria andnumberIn(List<String> values) {
        addCriterion("number in", values, "number");
        return (Criteria) this;
    }

    public Criteria andnumberNotIn(List<String> values) {
        addCriterion("number not in", values, "number");
        return (Criteria) this;
    }

    public Criteria andnumberBetween(String value1, String value2) {
        addCriterion("number between", value1, value2, "number");
        return (Criteria) this;
    }

    public Criteria andnumberNotBetween(String value1, String value2) {
        addCriterion("number not between", value1, value2, "number");
        return (Criteria) this;
    }

    public Criteria andnumberLike(String value) {
        addCriterion("number like", value, "number");
        return (Criteria) this;
    }

    public Criteria andnumberNotLike(String value) {
        addCriterion("number not like", value, "number");
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

    public Criteria andbirthdayEqualTo(Date value) {
        addCriterion("birthday =", value, "birthday");
        return (Criteria) this;
    }

    public Criteria andbirthdayNotEqualTo(Date value) {
        addCriterion("birthday <>", value, "birthday");
        return (Criteria) this;
    }

    public Criteria andbirthdayGreaterThan(Date value) {
        addCriterion("birthday >", value, "birthday");
        return (Criteria) this;
    }

    public Criteria andbirthdayGreaterThanOrEqualTo(Date value) {
        addCriterion("birthday >=", value, "birthday");
        return (Criteria) this;
    }

    public Criteria andbirthdayLessThan(Date value) {
        addCriterion("birthday <", value, "birthday");
        return (Criteria) this;
    }

    public Criteria andbirthdayLessThanOrEqualTo(Date value) {
        addCriterion("birthday <=", value, "birthday");
        return (Criteria) this;
    }

    public Criteria andbirthdayIn(List<Date> values) {
        addCriterion("birthday in", values, "birthday");
        return (Criteria) this;
    }

    public Criteria andbirthdayNotIn(List<Date> values) {
        addCriterion("birthday not in", values, "birthday");
        return (Criteria) this;
    }

    public Criteria andbirthdayBetween(Date value1, Date value2) {
        addCriterion("birthday between", value1, value2, "birthday");
        return (Criteria) this;
    }

    public Criteria andbirthdayNotBetween(Date value1, Date value2) {
        addCriterion("birthday not between", value1, value2, "birthday");
        return (Criteria) this;
    }

    public Criteria andbirthdayLike(Date value) {
        addCriterion("birthday like", value, "birthday");
        return (Criteria) this;
    }

    public Criteria andbirthdayNotLike(Date value) {
        addCriterion("birthday not like", value, "birthday");
        return (Criteria) this;
    }
    public Criteria andgradeIsNull() {
        addCriterion("grade is null");
        return (Criteria) this;
    }

    public Criteria andgradeIsNotNull() {
        addCriterion("grade is not null");
        return (Criteria) this;
    }

    public Criteria andgradeEqualTo(String value) {
        addCriterion("grade =", value, "grade");
        return (Criteria) this;
    }

    public Criteria andgradeNotEqualTo(String value) {
        addCriterion("grade <>", value, "grade");
        return (Criteria) this;
    }

    public Criteria andgradeGreaterThan(String value) {
        addCriterion("grade >", value, "grade");
        return (Criteria) this;
    }

    public Criteria andgradeGreaterThanOrEqualTo(String value) {
        addCriterion("grade >=", value, "grade");
        return (Criteria) this;
    }

    public Criteria andgradeLessThan(String value) {
        addCriterion("grade <", value, "grade");
        return (Criteria) this;
    }

    public Criteria andgradeLessThanOrEqualTo(String value) {
        addCriterion("grade <=", value, "grade");
        return (Criteria) this;
    }

    public Criteria andgradeIn(List<String> values) {
        addCriterion("grade in", values, "grade");
        return (Criteria) this;
    }

    public Criteria andgradeNotIn(List<String> values) {
        addCriterion("grade not in", values, "grade");
        return (Criteria) this;
    }

    public Criteria andgradeBetween(String value1, String value2) {
        addCriterion("grade between", value1, value2, "grade");
        return (Criteria) this;
    }

    public Criteria andgradeNotBetween(String value1, String value2) {
        addCriterion("grade not between", value1, value2, "grade");
        return (Criteria) this;
    }

    public Criteria andgradeLike(String value) {
        addCriterion("grade like", value, "grade");
        return (Criteria) this;
    }

    public Criteria andgradeNotLike(String value) {
        addCriterion("grade not like", value, "grade");
        return (Criteria) this;
    }
    public Criteria andschoolIsNull() {
        addCriterion("school is null");
        return (Criteria) this;
    }

    public Criteria andschoolIsNotNull() {
        addCriterion("school is not null");
        return (Criteria) this;
    }

    public Criteria andschoolEqualTo(String value) {
        addCriterion("school =", value, "school");
        return (Criteria) this;
    }

    public Criteria andschoolNotEqualTo(String value) {
        addCriterion("school <>", value, "school");
        return (Criteria) this;
    }

    public Criteria andschoolGreaterThan(String value) {
        addCriterion("school >", value, "school");
        return (Criteria) this;
    }

    public Criteria andschoolGreaterThanOrEqualTo(String value) {
        addCriterion("school >=", value, "school");
        return (Criteria) this;
    }

    public Criteria andschoolLessThan(String value) {
        addCriterion("school <", value, "school");
        return (Criteria) this;
    }

    public Criteria andschoolLessThanOrEqualTo(String value) {
        addCriterion("school <=", value, "school");
        return (Criteria) this;
    }

    public Criteria andschoolIn(List<String> values) {
        addCriterion("school in", values, "school");
        return (Criteria) this;
    }

    public Criteria andschoolNotIn(List<String> values) {
        addCriterion("school not in", values, "school");
        return (Criteria) this;
    }

    public Criteria andschoolBetween(String value1, String value2) {
        addCriterion("school between", value1, value2, "school");
        return (Criteria) this;
    }

    public Criteria andschoolNotBetween(String value1, String value2) {
        addCriterion("school not between", value1, value2, "school");
        return (Criteria) this;
    }

    public Criteria andschoolLike(String value) {
        addCriterion("school like", value, "school");
        return (Criteria) this;
    }

    public Criteria andschoolNotLike(String value) {
        addCriterion("school not like", value, "school");
        return (Criteria) this;
    }
    public Criteria andsexIsNull() {
        addCriterion("sex is null");
        return (Criteria) this;
    }

    public Criteria andsexIsNotNull() {
        addCriterion("sex is not null");
        return (Criteria) this;
    }

    public Criteria andsexEqualTo(Integer value) {
        addCriterion("sex =", value, "sex");
        return (Criteria) this;
    }

    public Criteria andsexNotEqualTo(Integer value) {
        addCriterion("sex <>", value, "sex");
        return (Criteria) this;
    }

    public Criteria andsexGreaterThan(Integer value) {
        addCriterion("sex >", value, "sex");
        return (Criteria) this;
    }

    public Criteria andsexGreaterThanOrEqualTo(Integer value) {
        addCriterion("sex >=", value, "sex");
        return (Criteria) this;
    }

    public Criteria andsexLessThan(Integer value) {
        addCriterion("sex <", value, "sex");
        return (Criteria) this;
    }

    public Criteria andsexLessThanOrEqualTo(Integer value) {
        addCriterion("sex <=", value, "sex");
        return (Criteria) this;
    }

    public Criteria andsexIn(List<Integer> values) {
        addCriterion("sex in", values, "sex");
        return (Criteria) this;
    }

    public Criteria andsexNotIn(List<Integer> values) {
        addCriterion("sex not in", values, "sex");
        return (Criteria) this;
    }

    public Criteria andsexBetween(Integer value1, Integer value2) {
        addCriterion("sex between", value1, value2, "sex");
        return (Criteria) this;
    }

    public Criteria andsexNotBetween(Integer value1, Integer value2) {
        addCriterion("sex not between", value1, value2, "sex");
        return (Criteria) this;
    }

    public Criteria andsexLike(Integer value) {
        addCriterion("sex like", value, "sex");
        return (Criteria) this;
    }

    public Criteria andsexNotLike(Integer value) {
        addCriterion("sex not like", value, "sex");
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
    public Criteria andtuitionIsNull() {
        addCriterion("tuition is null");
        return (Criteria) this;
    }

    public Criteria andtuitionIsNotNull() {
        addCriterion("tuition is not null");
        return (Criteria) this;
    }

    public Criteria andtuitionEqualTo(Double value) {
        addCriterion("tuition =", value, "tuition");
        return (Criteria) this;
    }

    public Criteria andtuitionNotEqualTo(Double value) {
        addCriterion("tuition <>", value, "tuition");
        return (Criteria) this;
    }

    public Criteria andtuitionGreaterThan(Double value) {
        addCriterion("tuition >", value, "tuition");
        return (Criteria) this;
    }

    public Criteria andtuitionGreaterThanOrEqualTo(Double value) {
        addCriterion("tuition >=", value, "tuition");
        return (Criteria) this;
    }

    public Criteria andtuitionLessThan(Double value) {
        addCriterion("tuition <", value, "tuition");
        return (Criteria) this;
    }

    public Criteria andtuitionLessThanOrEqualTo(Double value) {
        addCriterion("tuition <=", value, "tuition");
        return (Criteria) this;
    }

    public Criteria andtuitionIn(List<Double> values) {
        addCriterion("tuition in", values, "tuition");
        return (Criteria) this;
    }

    public Criteria andtuitionNotIn(List<Double> values) {
        addCriterion("tuition not in", values, "tuition");
        return (Criteria) this;
    }

    public Criteria andtuitionBetween(Double value1, Double value2) {
        addCriterion("tuition between", value1, value2, "tuition");
        return (Criteria) this;
    }

    public Criteria andtuitionNotBetween(Double value1, Double value2) {
        addCriterion("tuition not between", value1, value2, "tuition");
        return (Criteria) this;
    }

    public Criteria andtuitionLike(Double value) {
        addCriterion("tuition like", value, "tuition");
        return (Criteria) this;
    }

    public Criteria andtuitionNotLike(Double value) {
        addCriterion("tuition not like", value, "tuition");
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