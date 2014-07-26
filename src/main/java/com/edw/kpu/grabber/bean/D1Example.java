package com.edw.kpu.grabber.bean;

import java.util.ArrayList;
import java.util.List;

public class D1Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public D1Example() {
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

        public Criteria andKodeKecamatanIsNull() {
            addCriterion("kode_kecamatan is null");
            return (Criteria) this;
        }

        public Criteria andKodeKecamatanIsNotNull() {
            addCriterion("kode_kecamatan is not null");
            return (Criteria) this;
        }

        public Criteria andKodeKecamatanEqualTo(String value) {
            addCriterion("kode_kecamatan =", value, "kodeKecamatan");
            return (Criteria) this;
        }

        public Criteria andKodeKecamatanNotEqualTo(String value) {
            addCriterion("kode_kecamatan <>", value, "kodeKecamatan");
            return (Criteria) this;
        }

        public Criteria andKodeKecamatanGreaterThan(String value) {
            addCriterion("kode_kecamatan >", value, "kodeKecamatan");
            return (Criteria) this;
        }

        public Criteria andKodeKecamatanGreaterThanOrEqualTo(String value) {
            addCriterion("kode_kecamatan >=", value, "kodeKecamatan");
            return (Criteria) this;
        }

        public Criteria andKodeKecamatanLessThan(String value) {
            addCriterion("kode_kecamatan <", value, "kodeKecamatan");
            return (Criteria) this;
        }

        public Criteria andKodeKecamatanLessThanOrEqualTo(String value) {
            addCriterion("kode_kecamatan <=", value, "kodeKecamatan");
            return (Criteria) this;
        }

        public Criteria andKodeKecamatanLike(String value) {
            addCriterion("kode_kecamatan like", value, "kodeKecamatan");
            return (Criteria) this;
        }

        public Criteria andKodeKecamatanNotLike(String value) {
            addCriterion("kode_kecamatan not like", value, "kodeKecamatan");
            return (Criteria) this;
        }

        public Criteria andKodeKecamatanIn(List<String> values) {
            addCriterion("kode_kecamatan in", values, "kodeKecamatan");
            return (Criteria) this;
        }

        public Criteria andKodeKecamatanNotIn(List<String> values) {
            addCriterion("kode_kecamatan not in", values, "kodeKecamatan");
            return (Criteria) this;
        }

        public Criteria andKodeKecamatanBetween(String value1, String value2) {
            addCriterion("kode_kecamatan between", value1, value2, "kodeKecamatan");
            return (Criteria) this;
        }

        public Criteria andKodeKecamatanNotBetween(String value1, String value2) {
            addCriterion("kode_kecamatan not between", value1, value2, "kodeKecamatan");
            return (Criteria) this;
        }

        public Criteria andNamaKecamatanIsNull() {
            addCriterion("nama_kecamatan is null");
            return (Criteria) this;
        }

        public Criteria andNamaKecamatanIsNotNull() {
            addCriterion("nama_kecamatan is not null");
            return (Criteria) this;
        }

        public Criteria andNamaKecamatanEqualTo(String value) {
            addCriterion("nama_kecamatan =", value, "namaKecamatan");
            return (Criteria) this;
        }

        public Criteria andNamaKecamatanNotEqualTo(String value) {
            addCriterion("nama_kecamatan <>", value, "namaKecamatan");
            return (Criteria) this;
        }

        public Criteria andNamaKecamatanGreaterThan(String value) {
            addCriterion("nama_kecamatan >", value, "namaKecamatan");
            return (Criteria) this;
        }

        public Criteria andNamaKecamatanGreaterThanOrEqualTo(String value) {
            addCriterion("nama_kecamatan >=", value, "namaKecamatan");
            return (Criteria) this;
        }

        public Criteria andNamaKecamatanLessThan(String value) {
            addCriterion("nama_kecamatan <", value, "namaKecamatan");
            return (Criteria) this;
        }

        public Criteria andNamaKecamatanLessThanOrEqualTo(String value) {
            addCriterion("nama_kecamatan <=", value, "namaKecamatan");
            return (Criteria) this;
        }

        public Criteria andNamaKecamatanLike(String value) {
            addCriterion("nama_kecamatan like", value, "namaKecamatan");
            return (Criteria) this;
        }

        public Criteria andNamaKecamatanNotLike(String value) {
            addCriterion("nama_kecamatan not like", value, "namaKecamatan");
            return (Criteria) this;
        }

        public Criteria andNamaKecamatanIn(List<String> values) {
            addCriterion("nama_kecamatan in", values, "namaKecamatan");
            return (Criteria) this;
        }

        public Criteria andNamaKecamatanNotIn(List<String> values) {
            addCriterion("nama_kecamatan not in", values, "namaKecamatan");
            return (Criteria) this;
        }

        public Criteria andNamaKecamatanBetween(String value1, String value2) {
            addCriterion("nama_kecamatan between", value1, value2, "namaKecamatan");
            return (Criteria) this;
        }

        public Criteria andNamaKecamatanNotBetween(String value1, String value2) {
            addCriterion("nama_kecamatan not between", value1, value2, "namaKecamatan");
            return (Criteria) this;
        }

        public Criteria andSuaraPrabowoIsNull() {
            addCriterion("suara_prabowo is null");
            return (Criteria) this;
        }

        public Criteria andSuaraPrabowoIsNotNull() {
            addCriterion("suara_prabowo is not null");
            return (Criteria) this;
        }

        public Criteria andSuaraPrabowoEqualTo(Long value) {
            addCriterion("suara_prabowo =", value, "suaraPrabowo");
            return (Criteria) this;
        }

        public Criteria andSuaraPrabowoNotEqualTo(Long value) {
            addCriterion("suara_prabowo <>", value, "suaraPrabowo");
            return (Criteria) this;
        }

        public Criteria andSuaraPrabowoGreaterThan(Long value) {
            addCriterion("suara_prabowo >", value, "suaraPrabowo");
            return (Criteria) this;
        }

        public Criteria andSuaraPrabowoGreaterThanOrEqualTo(Long value) {
            addCriterion("suara_prabowo >=", value, "suaraPrabowo");
            return (Criteria) this;
        }

        public Criteria andSuaraPrabowoLessThan(Long value) {
            addCriterion("suara_prabowo <", value, "suaraPrabowo");
            return (Criteria) this;
        }

        public Criteria andSuaraPrabowoLessThanOrEqualTo(Long value) {
            addCriterion("suara_prabowo <=", value, "suaraPrabowo");
            return (Criteria) this;
        }

        public Criteria andSuaraPrabowoIn(List<Long> values) {
            addCriterion("suara_prabowo in", values, "suaraPrabowo");
            return (Criteria) this;
        }

        public Criteria andSuaraPrabowoNotIn(List<Long> values) {
            addCriterion("suara_prabowo not in", values, "suaraPrabowo");
            return (Criteria) this;
        }

        public Criteria andSuaraPrabowoBetween(Long value1, Long value2) {
            addCriterion("suara_prabowo between", value1, value2, "suaraPrabowo");
            return (Criteria) this;
        }

        public Criteria andSuaraPrabowoNotBetween(Long value1, Long value2) {
            addCriterion("suara_prabowo not between", value1, value2, "suaraPrabowo");
            return (Criteria) this;
        }

        public Criteria andSuaraJokowiIsNull() {
            addCriterion("suara_jokowi is null");
            return (Criteria) this;
        }

        public Criteria andSuaraJokowiIsNotNull() {
            addCriterion("suara_jokowi is not null");
            return (Criteria) this;
        }

        public Criteria andSuaraJokowiEqualTo(Long value) {
            addCriterion("suara_jokowi =", value, "suaraJokowi");
            return (Criteria) this;
        }

        public Criteria andSuaraJokowiNotEqualTo(Long value) {
            addCriterion("suara_jokowi <>", value, "suaraJokowi");
            return (Criteria) this;
        }

        public Criteria andSuaraJokowiGreaterThan(Long value) {
            addCriterion("suara_jokowi >", value, "suaraJokowi");
            return (Criteria) this;
        }

        public Criteria andSuaraJokowiGreaterThanOrEqualTo(Long value) {
            addCriterion("suara_jokowi >=", value, "suaraJokowi");
            return (Criteria) this;
        }

        public Criteria andSuaraJokowiLessThan(Long value) {
            addCriterion("suara_jokowi <", value, "suaraJokowi");
            return (Criteria) this;
        }

        public Criteria andSuaraJokowiLessThanOrEqualTo(Long value) {
            addCriterion("suara_jokowi <=", value, "suaraJokowi");
            return (Criteria) this;
        }

        public Criteria andSuaraJokowiIn(List<Long> values) {
            addCriterion("suara_jokowi in", values, "suaraJokowi");
            return (Criteria) this;
        }

        public Criteria andSuaraJokowiNotIn(List<Long> values) {
            addCriterion("suara_jokowi not in", values, "suaraJokowi");
            return (Criteria) this;
        }

        public Criteria andSuaraJokowiBetween(Long value1, Long value2) {
            addCriterion("suara_jokowi between", value1, value2, "suaraJokowi");
            return (Criteria) this;
        }

        public Criteria andSuaraJokowiNotBetween(Long value1, Long value2) {
            addCriterion("suara_jokowi not between", value1, value2, "suaraJokowi");
            return (Criteria) this;
        }

        public Criteria andKodeKabupatenIsNull() {
            addCriterion("kode_kabupaten is null");
            return (Criteria) this;
        }

        public Criteria andKodeKabupatenIsNotNull() {
            addCriterion("kode_kabupaten is not null");
            return (Criteria) this;
        }

        public Criteria andKodeKabupatenEqualTo(String value) {
            addCriterion("kode_kabupaten =", value, "kodeKabupaten");
            return (Criteria) this;
        }

        public Criteria andKodeKabupatenNotEqualTo(String value) {
            addCriterion("kode_kabupaten <>", value, "kodeKabupaten");
            return (Criteria) this;
        }

        public Criteria andKodeKabupatenGreaterThan(String value) {
            addCriterion("kode_kabupaten >", value, "kodeKabupaten");
            return (Criteria) this;
        }

        public Criteria andKodeKabupatenGreaterThanOrEqualTo(String value) {
            addCriterion("kode_kabupaten >=", value, "kodeKabupaten");
            return (Criteria) this;
        }

        public Criteria andKodeKabupatenLessThan(String value) {
            addCriterion("kode_kabupaten <", value, "kodeKabupaten");
            return (Criteria) this;
        }

        public Criteria andKodeKabupatenLessThanOrEqualTo(String value) {
            addCriterion("kode_kabupaten <=", value, "kodeKabupaten");
            return (Criteria) this;
        }

        public Criteria andKodeKabupatenLike(String value) {
            addCriterion("kode_kabupaten like", value, "kodeKabupaten");
            return (Criteria) this;
        }

        public Criteria andKodeKabupatenNotLike(String value) {
            addCriterion("kode_kabupaten not like", value, "kodeKabupaten");
            return (Criteria) this;
        }

        public Criteria andKodeKabupatenIn(List<String> values) {
            addCriterion("kode_kabupaten in", values, "kodeKabupaten");
            return (Criteria) this;
        }

        public Criteria andKodeKabupatenNotIn(List<String> values) {
            addCriterion("kode_kabupaten not in", values, "kodeKabupaten");
            return (Criteria) this;
        }

        public Criteria andKodeKabupatenBetween(String value1, String value2) {
            addCriterion("kode_kabupaten between", value1, value2, "kodeKabupaten");
            return (Criteria) this;
        }

        public Criteria andKodeKabupatenNotBetween(String value1, String value2) {
            addCriterion("kode_kabupaten not between", value1, value2, "kodeKabupaten");
            return (Criteria) this;
        }

        public Criteria andNamaKabupatenIsNull() {
            addCriterion("nama_kabupaten is null");
            return (Criteria) this;
        }

        public Criteria andNamaKabupatenIsNotNull() {
            addCriterion("nama_kabupaten is not null");
            return (Criteria) this;
        }

        public Criteria andNamaKabupatenEqualTo(String value) {
            addCriterion("nama_kabupaten =", value, "namaKabupaten");
            return (Criteria) this;
        }

        public Criteria andNamaKabupatenNotEqualTo(String value) {
            addCriterion("nama_kabupaten <>", value, "namaKabupaten");
            return (Criteria) this;
        }

        public Criteria andNamaKabupatenGreaterThan(String value) {
            addCriterion("nama_kabupaten >", value, "namaKabupaten");
            return (Criteria) this;
        }

        public Criteria andNamaKabupatenGreaterThanOrEqualTo(String value) {
            addCriterion("nama_kabupaten >=", value, "namaKabupaten");
            return (Criteria) this;
        }

        public Criteria andNamaKabupatenLessThan(String value) {
            addCriterion("nama_kabupaten <", value, "namaKabupaten");
            return (Criteria) this;
        }

        public Criteria andNamaKabupatenLessThanOrEqualTo(String value) {
            addCriterion("nama_kabupaten <=", value, "namaKabupaten");
            return (Criteria) this;
        }

        public Criteria andNamaKabupatenLike(String value) {
            addCriterion("nama_kabupaten like", value, "namaKabupaten");
            return (Criteria) this;
        }

        public Criteria andNamaKabupatenNotLike(String value) {
            addCriterion("nama_kabupaten not like", value, "namaKabupaten");
            return (Criteria) this;
        }

        public Criteria andNamaKabupatenIn(List<String> values) {
            addCriterion("nama_kabupaten in", values, "namaKabupaten");
            return (Criteria) this;
        }

        public Criteria andNamaKabupatenNotIn(List<String> values) {
            addCriterion("nama_kabupaten not in", values, "namaKabupaten");
            return (Criteria) this;
        }

        public Criteria andNamaKabupatenBetween(String value1, String value2) {
            addCriterion("nama_kabupaten between", value1, value2, "namaKabupaten");
            return (Criteria) this;
        }

        public Criteria andNamaKabupatenNotBetween(String value1, String value2) {
            addCriterion("nama_kabupaten not between", value1, value2, "namaKabupaten");
            return (Criteria) this;
        }

        public Criteria andKodeProvinsiIsNull() {
            addCriterion("kode_provinsi is null");
            return (Criteria) this;
        }

        public Criteria andKodeProvinsiIsNotNull() {
            addCriterion("kode_provinsi is not null");
            return (Criteria) this;
        }

        public Criteria andKodeProvinsiEqualTo(String value) {
            addCriterion("kode_provinsi =", value, "kodeProvinsi");
            return (Criteria) this;
        }

        public Criteria andKodeProvinsiNotEqualTo(String value) {
            addCriterion("kode_provinsi <>", value, "kodeProvinsi");
            return (Criteria) this;
        }

        public Criteria andKodeProvinsiGreaterThan(String value) {
            addCriterion("kode_provinsi >", value, "kodeProvinsi");
            return (Criteria) this;
        }

        public Criteria andKodeProvinsiGreaterThanOrEqualTo(String value) {
            addCriterion("kode_provinsi >=", value, "kodeProvinsi");
            return (Criteria) this;
        }

        public Criteria andKodeProvinsiLessThan(String value) {
            addCriterion("kode_provinsi <", value, "kodeProvinsi");
            return (Criteria) this;
        }

        public Criteria andKodeProvinsiLessThanOrEqualTo(String value) {
            addCriterion("kode_provinsi <=", value, "kodeProvinsi");
            return (Criteria) this;
        }

        public Criteria andKodeProvinsiLike(String value) {
            addCriterion("kode_provinsi like", value, "kodeProvinsi");
            return (Criteria) this;
        }

        public Criteria andKodeProvinsiNotLike(String value) {
            addCriterion("kode_provinsi not like", value, "kodeProvinsi");
            return (Criteria) this;
        }

        public Criteria andKodeProvinsiIn(List<String> values) {
            addCriterion("kode_provinsi in", values, "kodeProvinsi");
            return (Criteria) this;
        }

        public Criteria andKodeProvinsiNotIn(List<String> values) {
            addCriterion("kode_provinsi not in", values, "kodeProvinsi");
            return (Criteria) this;
        }

        public Criteria andKodeProvinsiBetween(String value1, String value2) {
            addCriterion("kode_provinsi between", value1, value2, "kodeProvinsi");
            return (Criteria) this;
        }

        public Criteria andKodeProvinsiNotBetween(String value1, String value2) {
            addCriterion("kode_provinsi not between", value1, value2, "kodeProvinsi");
            return (Criteria) this;
        }

        public Criteria andNamaProvinsiIsNull() {
            addCriterion("nama_provinsi is null");
            return (Criteria) this;
        }

        public Criteria andNamaProvinsiIsNotNull() {
            addCriterion("nama_provinsi is not null");
            return (Criteria) this;
        }

        public Criteria andNamaProvinsiEqualTo(String value) {
            addCriterion("nama_provinsi =", value, "namaProvinsi");
            return (Criteria) this;
        }

        public Criteria andNamaProvinsiNotEqualTo(String value) {
            addCriterion("nama_provinsi <>", value, "namaProvinsi");
            return (Criteria) this;
        }

        public Criteria andNamaProvinsiGreaterThan(String value) {
            addCriterion("nama_provinsi >", value, "namaProvinsi");
            return (Criteria) this;
        }

        public Criteria andNamaProvinsiGreaterThanOrEqualTo(String value) {
            addCriterion("nama_provinsi >=", value, "namaProvinsi");
            return (Criteria) this;
        }

        public Criteria andNamaProvinsiLessThan(String value) {
            addCriterion("nama_provinsi <", value, "namaProvinsi");
            return (Criteria) this;
        }

        public Criteria andNamaProvinsiLessThanOrEqualTo(String value) {
            addCriterion("nama_provinsi <=", value, "namaProvinsi");
            return (Criteria) this;
        }

        public Criteria andNamaProvinsiLike(String value) {
            addCriterion("nama_provinsi like", value, "namaProvinsi");
            return (Criteria) this;
        }

        public Criteria andNamaProvinsiNotLike(String value) {
            addCriterion("nama_provinsi not like", value, "namaProvinsi");
            return (Criteria) this;
        }

        public Criteria andNamaProvinsiIn(List<String> values) {
            addCriterion("nama_provinsi in", values, "namaProvinsi");
            return (Criteria) this;
        }

        public Criteria andNamaProvinsiNotIn(List<String> values) {
            addCriterion("nama_provinsi not in", values, "namaProvinsi");
            return (Criteria) this;
        }

        public Criteria andNamaProvinsiBetween(String value1, String value2) {
            addCriterion("nama_provinsi between", value1, value2, "namaProvinsi");
            return (Criteria) this;
        }

        public Criteria andNamaProvinsiNotBetween(String value1, String value2) {
            addCriterion("nama_provinsi not between", value1, value2, "namaProvinsi");
            return (Criteria) this;
        }

        public Criteria andKodeKecamatanLikeInsensitive(String value) {
            addCriterion("upper(kode_kecamatan) like", value.toUpperCase(), "kodeKecamatan");
            return (Criteria) this;
        }

        public Criteria andNamaKecamatanLikeInsensitive(String value) {
            addCriterion("upper(nama_kecamatan) like", value.toUpperCase(), "namaKecamatan");
            return (Criteria) this;
        }

        public Criteria andKodeKabupatenLikeInsensitive(String value) {
            addCriterion("upper(kode_kabupaten) like", value.toUpperCase(), "kodeKabupaten");
            return (Criteria) this;
        }

        public Criteria andNamaKabupatenLikeInsensitive(String value) {
            addCriterion("upper(nama_kabupaten) like", value.toUpperCase(), "namaKabupaten");
            return (Criteria) this;
        }

        public Criteria andKodeProvinsiLikeInsensitive(String value) {
            addCriterion("upper(kode_provinsi) like", value.toUpperCase(), "kodeProvinsi");
            return (Criteria) this;
        }

        public Criteria andNamaProvinsiLikeInsensitive(String value) {
            addCriterion("upper(nama_provinsi) like", value.toUpperCase(), "namaProvinsi");
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