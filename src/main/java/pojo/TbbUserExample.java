package pojo;

import java.util.ArrayList;
import java.util.List;

public class TbbUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbbUserExample() {
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

        public Criteria andTbnameIsNull() {
            addCriterion("tbname is null");
            return (Criteria) this;
        }

        public Criteria andTbnameIsNotNull() {
            addCriterion("tbname is not null");
            return (Criteria) this;
        }

        public Criteria andTbnameEqualTo(String value) {
            addCriterion("tbname =", value, "tbname");
            return (Criteria) this;
        }

        public Criteria andTbnameNotEqualTo(String value) {
            addCriterion("tbname <>", value, "tbname");
            return (Criteria) this;
        }

        public Criteria andTbnameGreaterThan(String value) {
            addCriterion("tbname >", value, "tbname");
            return (Criteria) this;
        }

        public Criteria andTbnameGreaterThanOrEqualTo(String value) {
            addCriterion("tbname >=", value, "tbname");
            return (Criteria) this;
        }

        public Criteria andTbnameLessThan(String value) {
            addCriterion("tbname <", value, "tbname");
            return (Criteria) this;
        }

        public Criteria andTbnameLessThanOrEqualTo(String value) {
            addCriterion("tbname <=", value, "tbname");
            return (Criteria) this;
        }

        public Criteria andTbnameLike(String value) {
            addCriterion("tbname like", value, "tbname");
            return (Criteria) this;
        }

        public Criteria andTbnameNotLike(String value) {
            addCriterion("tbname not like", value, "tbname");
            return (Criteria) this;
        }

        public Criteria andTbnameIn(List<String> values) {
            addCriterion("tbname in", values, "tbname");
            return (Criteria) this;
        }

        public Criteria andTbnameNotIn(List<String> values) {
            addCriterion("tbname not in", values, "tbname");
            return (Criteria) this;
        }

        public Criteria andTbnameBetween(String value1, String value2) {
            addCriterion("tbname between", value1, value2, "tbname");
            return (Criteria) this;
        }

        public Criteria andTbnameNotBetween(String value1, String value2) {
            addCriterion("tbname not between", value1, value2, "tbname");
            return (Criteria) this;
        }

        public Criteria andTbsexIsNull() {
            addCriterion("tbsex is null");
            return (Criteria) this;
        }

        public Criteria andTbsexIsNotNull() {
            addCriterion("tbsex is not null");
            return (Criteria) this;
        }

        public Criteria andTbsexEqualTo(String value) {
            addCriterion("tbsex =", value, "tbsex");
            return (Criteria) this;
        }

        public Criteria andTbsexNotEqualTo(String value) {
            addCriterion("tbsex <>", value, "tbsex");
            return (Criteria) this;
        }

        public Criteria andTbsexGreaterThan(String value) {
            addCriterion("tbsex >", value, "tbsex");
            return (Criteria) this;
        }

        public Criteria andTbsexGreaterThanOrEqualTo(String value) {
            addCriterion("tbsex >=", value, "tbsex");
            return (Criteria) this;
        }

        public Criteria andTbsexLessThan(String value) {
            addCriterion("tbsex <", value, "tbsex");
            return (Criteria) this;
        }

        public Criteria andTbsexLessThanOrEqualTo(String value) {
            addCriterion("tbsex <=", value, "tbsex");
            return (Criteria) this;
        }

        public Criteria andTbsexLike(String value) {
            addCriterion("tbsex like", value, "tbsex");
            return (Criteria) this;
        }

        public Criteria andTbsexNotLike(String value) {
            addCriterion("tbsex not like", value, "tbsex");
            return (Criteria) this;
        }

        public Criteria andTbsexIn(List<String> values) {
            addCriterion("tbsex in", values, "tbsex");
            return (Criteria) this;
        }

        public Criteria andTbsexNotIn(List<String> values) {
            addCriterion("tbsex not in", values, "tbsex");
            return (Criteria) this;
        }

        public Criteria andTbsexBetween(String value1, String value2) {
            addCriterion("tbsex between", value1, value2, "tbsex");
            return (Criteria) this;
        }

        public Criteria andTbsexNotBetween(String value1, String value2) {
            addCriterion("tbsex not between", value1, value2, "tbsex");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
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