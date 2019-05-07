package com.ysx.architect.test.thread.tansun;

import java.io.Serializable;

public class MultithreadExecuteDetailSqlBulider extends SQLBulider<MultithreadExecuteDetailSqlBulider> implements Serializable {
    private static final long serialVersionUID = -161123581321345589L;


    public MultithreadExecuteDetailSqlBulider() {
        beanID = this.toString().split("@")[1];
    }

    public MultithreadExecuteDetailSqlBulider andIdEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@id";
        addCriterion("and ID = #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andIdNotEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@id";
        addCriterion("and ID <> #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andIdGreaterThan(String value) {
        String key = beanID + valuesMap.size() + "@id";
        addCriterion("and ID > #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andIdGreaterThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@id";
        addCriterion("and ID >= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andIdLessThan(String value) {
        String key = beanID + valuesMap.size() + "@id";
        addCriterion("and ID < #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andIdLessThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@id";
        addCriterion("and ID <= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andIdIsNull() {
        addCriterion("and ID is null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andIdIsNotNull() {
        addCriterion("and ID is not null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andIdLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@id";
        addCriterion("and ID like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andIdLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@id";
        addCriterion("and ID like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andIdLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@id";
        addCriterion("and ID like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andIdNotLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@id";
        addCriterion("and ID not like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andIdNotLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@id";
        addCriterion("and ID not like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andIdNotLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@id";
        addCriterion("and ID not like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orIdEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@id";
        addCriterion("or ID = #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orIdNotEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@id";
        addCriterion("or ID <> #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orIdGreaterThan(String value) {
        String key = beanID + valuesMap.size() + "@id";
        addCriterion("or ID > #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orIdGreaterThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@id";
        addCriterion("or ID >= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orIdLessThan(String value) {
        String key = beanID + valuesMap.size() + "@id";
        addCriterion("or ID < #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orIdLessThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@id";
        addCriterion("or ID <= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orIdIsNull() {
        addCriterion("or ID is null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orIdIsNotNull() {
        addCriterion("or ID is not null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orIdLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@id";
        addCriterion("or ID like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orIdLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@id";
        addCriterion("or ID like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orIdLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@id";
        addCriterion("or ID like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orIdNotLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@id";
        addCriterion("or ID not like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orIdNotLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@id";
        addCriterion("or ID not like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orIdNotLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@id";
        addCriterion("or ID not like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orderById(boolean isDesc) {
        addOrderBy("ID " + (isDesc ? "desc " : "asc "));
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andManagerIdEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@managerId";
        addCriterion("and MANAGER_ID = #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andManagerIdNotEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@managerId";
        addCriterion("and MANAGER_ID <> #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andManagerIdGreaterThan(String value) {
        String key = beanID + valuesMap.size() + "@managerId";
        addCriterion("and MANAGER_ID > #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andManagerIdGreaterThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@managerId";
        addCriterion("and MANAGER_ID >= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andManagerIdLessThan(String value) {
        String key = beanID + valuesMap.size() + "@managerId";
        addCriterion("and MANAGER_ID < #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andManagerIdLessThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@managerId";
        addCriterion("and MANAGER_ID <= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andManagerIdIsNull() {
        addCriterion("and MANAGER_ID is null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andManagerIdIsNotNull() {
        addCriterion("and MANAGER_ID is not null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andManagerIdLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@managerId";
        addCriterion("and MANAGER_ID like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andManagerIdLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@managerId";
        addCriterion("and MANAGER_ID like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andManagerIdLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@managerId";
        addCriterion("and MANAGER_ID like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andManagerIdNotLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@managerId";
        addCriterion("and MANAGER_ID not like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andManagerIdNotLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@managerId";
        addCriterion("and MANAGER_ID not like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andManagerIdNotLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@managerId";
        addCriterion("and MANAGER_ID not like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orManagerIdEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@managerId";
        addCriterion("or MANAGER_ID = #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orManagerIdNotEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@managerId";
        addCriterion("or MANAGER_ID <> #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orManagerIdGreaterThan(String value) {
        String key = beanID + valuesMap.size() + "@managerId";
        addCriterion("or MANAGER_ID > #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orManagerIdGreaterThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@managerId";
        addCriterion("or MANAGER_ID >= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orManagerIdLessThan(String value) {
        String key = beanID + valuesMap.size() + "@managerId";
        addCriterion("or MANAGER_ID < #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orManagerIdLessThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@managerId";
        addCriterion("or MANAGER_ID <= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orManagerIdIsNull() {
        addCriterion("or MANAGER_ID is null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orManagerIdIsNotNull() {
        addCriterion("or MANAGER_ID is not null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orManagerIdLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@managerId";
        addCriterion("or MANAGER_ID like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orManagerIdLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@managerId";
        addCriterion("or MANAGER_ID like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orManagerIdLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@managerId";
        addCriterion("or MANAGER_ID like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orManagerIdNotLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@managerId";
        addCriterion("or MANAGER_ID not like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orManagerIdNotLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@managerId";
        addCriterion("or MANAGER_ID not like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orManagerIdNotLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@managerId";
        addCriterion("or MANAGER_ID not like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orderByManagerId(boolean isDesc) {
        addOrderBy("MANAGER_ID " + (isDesc ? "desc " : "asc "));
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andThreadNameEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@threadName";
        addCriterion("and THREAD_NAME = #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andThreadNameNotEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@threadName";
        addCriterion("and THREAD_NAME <> #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andThreadNameGreaterThan(String value) {
        String key = beanID + valuesMap.size() + "@threadName";
        addCriterion("and THREAD_NAME > #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andThreadNameGreaterThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@threadName";
        addCriterion("and THREAD_NAME >= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andThreadNameLessThan(String value) {
        String key = beanID + valuesMap.size() + "@threadName";
        addCriterion("and THREAD_NAME < #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andThreadNameLessThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@threadName";
        addCriterion("and THREAD_NAME <= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andThreadNameIsNull() {
        addCriterion("and THREAD_NAME is null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andThreadNameIsNotNull() {
        addCriterion("and THREAD_NAME is not null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andThreadNameLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@threadName";
        addCriterion("and THREAD_NAME like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andThreadNameLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@threadName";
        addCriterion("and THREAD_NAME like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andThreadNameLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@threadName";
        addCriterion("and THREAD_NAME like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andThreadNameNotLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@threadName";
        addCriterion("and THREAD_NAME not like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andThreadNameNotLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@threadName";
        addCriterion("and THREAD_NAME not like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andThreadNameNotLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@threadName";
        addCriterion("and THREAD_NAME not like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orThreadNameEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@threadName";
        addCriterion("or THREAD_NAME = #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orThreadNameNotEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@threadName";
        addCriterion("or THREAD_NAME <> #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orThreadNameGreaterThan(String value) {
        String key = beanID + valuesMap.size() + "@threadName";
        addCriterion("or THREAD_NAME > #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orThreadNameGreaterThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@threadName";
        addCriterion("or THREAD_NAME >= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orThreadNameLessThan(String value) {
        String key = beanID + valuesMap.size() + "@threadName";
        addCriterion("or THREAD_NAME < #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orThreadNameLessThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@threadName";
        addCriterion("or THREAD_NAME <= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orThreadNameIsNull() {
        addCriterion("or THREAD_NAME is null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orThreadNameIsNotNull() {
        addCriterion("or THREAD_NAME is not null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orThreadNameLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@threadName";
        addCriterion("or THREAD_NAME like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orThreadNameLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@threadName";
        addCriterion("or THREAD_NAME like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orThreadNameLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@threadName";
        addCriterion("or THREAD_NAME like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orThreadNameNotLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@threadName";
        addCriterion("or THREAD_NAME not like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orThreadNameNotLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@threadName";
        addCriterion("or THREAD_NAME not like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orThreadNameNotLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@threadName";
        addCriterion("or THREAD_NAME not like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orderByThreadName(boolean isDesc) {
        addOrderBy("THREAD_NAME " + (isDesc ? "desc " : "asc "));
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andStarttimeEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@starttime";
        addCriterion("and STARTTIME = #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andStarttimeNotEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@starttime";
        addCriterion("and STARTTIME <> #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andStarttimeGreaterThan(String value) {
        String key = beanID + valuesMap.size() + "@starttime";
        addCriterion("and STARTTIME > #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andStarttimeGreaterThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@starttime";
        addCriterion("and STARTTIME >= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andStarttimeLessThan(String value) {
        String key = beanID + valuesMap.size() + "@starttime";
        addCriterion("and STARTTIME < #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andStarttimeLessThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@starttime";
        addCriterion("and STARTTIME <= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andStarttimeIsNull() {
        addCriterion("and STARTTIME is null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andStarttimeIsNotNull() {
        addCriterion("and STARTTIME is not null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andStarttimeLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@starttime";
        addCriterion("and STARTTIME like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andStarttimeLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@starttime";
        addCriterion("and STARTTIME like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andStarttimeLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@starttime";
        addCriterion("and STARTTIME like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andStarttimeNotLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@starttime";
        addCriterion("and STARTTIME not like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andStarttimeNotLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@starttime";
        addCriterion("and STARTTIME not like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andStarttimeNotLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@starttime";
        addCriterion("and STARTTIME not like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orStarttimeEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@starttime";
        addCriterion("or STARTTIME = #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orStarttimeNotEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@starttime";
        addCriterion("or STARTTIME <> #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orStarttimeGreaterThan(String value) {
        String key = beanID + valuesMap.size() + "@starttime";
        addCriterion("or STARTTIME > #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orStarttimeGreaterThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@starttime";
        addCriterion("or STARTTIME >= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orStarttimeLessThan(String value) {
        String key = beanID + valuesMap.size() + "@starttime";
        addCriterion("or STARTTIME < #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orStarttimeLessThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@starttime";
        addCriterion("or STARTTIME <= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orStarttimeIsNull() {
        addCriterion("or STARTTIME is null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orStarttimeIsNotNull() {
        addCriterion("or STARTTIME is not null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orStarttimeLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@starttime";
        addCriterion("or STARTTIME like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orStarttimeLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@starttime";
        addCriterion("or STARTTIME like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orStarttimeLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@starttime";
        addCriterion("or STARTTIME like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orStarttimeNotLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@starttime";
        addCriterion("or STARTTIME not like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orStarttimeNotLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@starttime";
        addCriterion("or STARTTIME not like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orStarttimeNotLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@starttime";
        addCriterion("or STARTTIME not like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orderByStarttime(boolean isDesc) {
        addOrderBy("STARTTIME " + (isDesc ? "desc " : "asc "));
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andEndtimeEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@endtime";
        addCriterion("and ENDTIME = #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andEndtimeNotEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@endtime";
        addCriterion("and ENDTIME <> #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andEndtimeGreaterThan(String value) {
        String key = beanID + valuesMap.size() + "@endtime";
        addCriterion("and ENDTIME > #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andEndtimeGreaterThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@endtime";
        addCriterion("and ENDTIME >= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andEndtimeLessThan(String value) {
        String key = beanID + valuesMap.size() + "@endtime";
        addCriterion("and ENDTIME < #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andEndtimeLessThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@endtime";
        addCriterion("and ENDTIME <= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andEndtimeIsNull() {
        addCriterion("and ENDTIME is null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andEndtimeIsNotNull() {
        addCriterion("and ENDTIME is not null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andEndtimeLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@endtime";
        addCriterion("and ENDTIME like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andEndtimeLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@endtime";
        addCriterion("and ENDTIME like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andEndtimeLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@endtime";
        addCriterion("and ENDTIME like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andEndtimeNotLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@endtime";
        addCriterion("and ENDTIME not like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andEndtimeNotLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@endtime";
        addCriterion("and ENDTIME not like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andEndtimeNotLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@endtime";
        addCriterion("and ENDTIME not like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orEndtimeEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@endtime";
        addCriterion("or ENDTIME = #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orEndtimeNotEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@endtime";
        addCriterion("or ENDTIME <> #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orEndtimeGreaterThan(String value) {
        String key = beanID + valuesMap.size() + "@endtime";
        addCriterion("or ENDTIME > #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orEndtimeGreaterThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@endtime";
        addCriterion("or ENDTIME >= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orEndtimeLessThan(String value) {
        String key = beanID + valuesMap.size() + "@endtime";
        addCriterion("or ENDTIME < #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orEndtimeLessThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@endtime";
        addCriterion("or ENDTIME <= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orEndtimeIsNull() {
        addCriterion("or ENDTIME is null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orEndtimeIsNotNull() {
        addCriterion("or ENDTIME is not null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orEndtimeLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@endtime";
        addCriterion("or ENDTIME like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orEndtimeLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@endtime";
        addCriterion("or ENDTIME like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orEndtimeLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@endtime";
        addCriterion("or ENDTIME like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orEndtimeNotLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@endtime";
        addCriterion("or ENDTIME not like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orEndtimeNotLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@endtime";
        addCriterion("or ENDTIME not like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orEndtimeNotLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@endtime";
        addCriterion("or ENDTIME not like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orderByEndtime(boolean isDesc) {
        addOrderBy("ENDTIME " + (isDesc ? "desc " : "asc "));
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andLegalpernumEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@legalpernum";
        addCriterion("and LEGALPERNUM = #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andLegalpernumNotEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@legalpernum";
        addCriterion("and LEGALPERNUM <> #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andLegalpernumGreaterThan(String value) {
        String key = beanID + valuesMap.size() + "@legalpernum";
        addCriterion("and LEGALPERNUM > #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andLegalpernumGreaterThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@legalpernum";
        addCriterion("and LEGALPERNUM >= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andLegalpernumLessThan(String value) {
        String key = beanID + valuesMap.size() + "@legalpernum";
        addCriterion("and LEGALPERNUM < #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andLegalpernumLessThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@legalpernum";
        addCriterion("and LEGALPERNUM <= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andLegalpernumIsNull() {
        addCriterion("and LEGALPERNUM is null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andLegalpernumIsNotNull() {
        addCriterion("and LEGALPERNUM is not null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andLegalpernumLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@legalpernum";
        addCriterion("and LEGALPERNUM like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andLegalpernumLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@legalpernum";
        addCriterion("and LEGALPERNUM like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andLegalpernumLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@legalpernum";
        addCriterion("and LEGALPERNUM like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andLegalpernumNotLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@legalpernum";
        addCriterion("and LEGALPERNUM not like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andLegalpernumNotLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@legalpernum";
        addCriterion("and LEGALPERNUM not like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andLegalpernumNotLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@legalpernum";
        addCriterion("and LEGALPERNUM not like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orLegalpernumEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@legalpernum";
        addCriterion("or LEGALPERNUM = #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orLegalpernumNotEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@legalpernum";
        addCriterion("or LEGALPERNUM <> #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orLegalpernumGreaterThan(String value) {
        String key = beanID + valuesMap.size() + "@legalpernum";
        addCriterion("or LEGALPERNUM > #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orLegalpernumGreaterThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@legalpernum";
        addCriterion("or LEGALPERNUM >= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orLegalpernumLessThan(String value) {
        String key = beanID + valuesMap.size() + "@legalpernum";
        addCriterion("or LEGALPERNUM < #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orLegalpernumLessThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@legalpernum";
        addCriterion("or LEGALPERNUM <= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orLegalpernumIsNull() {
        addCriterion("or LEGALPERNUM is null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orLegalpernumIsNotNull() {
        addCriterion("or LEGALPERNUM is not null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orLegalpernumLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@legalpernum";
        addCriterion("or LEGALPERNUM like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orLegalpernumLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@legalpernum";
        addCriterion("or LEGALPERNUM like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orLegalpernumLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@legalpernum";
        addCriterion("or LEGALPERNUM like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orLegalpernumNotLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@legalpernum";
        addCriterion("or LEGALPERNUM not like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orLegalpernumNotLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@legalpernum";
        addCriterion("or LEGALPERNUM not like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orLegalpernumNotLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@legalpernum";
        addCriterion("or LEGALPERNUM not like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orderByLegalpernum(boolean isDesc) {
        addOrderBy("LEGALPERNUM " + (isDesc ? "desc " : "asc "));
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andOrgidEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@orgid";
        addCriterion("and ORGID = #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andOrgidNotEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@orgid";
        addCriterion("and ORGID <> #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andOrgidGreaterThan(String value) {
        String key = beanID + valuesMap.size() + "@orgid";
        addCriterion("and ORGID > #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andOrgidGreaterThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@orgid";
        addCriterion("and ORGID >= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andOrgidLessThan(String value) {
        String key = beanID + valuesMap.size() + "@orgid";
        addCriterion("and ORGID < #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andOrgidLessThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@orgid";
        addCriterion("and ORGID <= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andOrgidIsNull() {
        addCriterion("and ORGID is null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andOrgidIsNotNull() {
        addCriterion("and ORGID is not null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andOrgidLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@orgid";
        addCriterion("and ORGID like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andOrgidLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@orgid";
        addCriterion("and ORGID like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andOrgidLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@orgid";
        addCriterion("and ORGID like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andOrgidNotLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@orgid";
        addCriterion("and ORGID not like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andOrgidNotLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@orgid";
        addCriterion("and ORGID not like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andOrgidNotLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@orgid";
        addCriterion("and ORGID not like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orOrgidEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@orgid";
        addCriterion("or ORGID = #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orOrgidNotEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@orgid";
        addCriterion("or ORGID <> #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orOrgidGreaterThan(String value) {
        String key = beanID + valuesMap.size() + "@orgid";
        addCriterion("or ORGID > #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orOrgidGreaterThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@orgid";
        addCriterion("or ORGID >= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orOrgidLessThan(String value) {
        String key = beanID + valuesMap.size() + "@orgid";
        addCriterion("or ORGID < #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orOrgidLessThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@orgid";
        addCriterion("or ORGID <= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orOrgidIsNull() {
        addCriterion("or ORGID is null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orOrgidIsNotNull() {
        addCriterion("or ORGID is not null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orOrgidLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@orgid";
        addCriterion("or ORGID like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orOrgidLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@orgid";
        addCriterion("or ORGID like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orOrgidLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@orgid";
        addCriterion("or ORGID like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orOrgidNotLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@orgid";
        addCriterion("or ORGID not like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orOrgidNotLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@orgid";
        addCriterion("or ORGID not like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orOrgidNotLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@orgid";
        addCriterion("or ORGID not like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orderByOrgid(boolean isDesc) {
        addOrderBy("ORGID " + (isDesc ? "desc " : "asc "));
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andExeclassEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@execlass";
        addCriterion("and EXECLASS = #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andExeclassNotEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@execlass";
        addCriterion("and EXECLASS <> #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andExeclassGreaterThan(String value) {
        String key = beanID + valuesMap.size() + "@execlass";
        addCriterion("and EXECLASS > #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andExeclassGreaterThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@execlass";
        addCriterion("and EXECLASS >= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andExeclassLessThan(String value) {
        String key = beanID + valuesMap.size() + "@execlass";
        addCriterion("and EXECLASS < #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andExeclassLessThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@execlass";
        addCriterion("and EXECLASS <= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andExeclassIsNull() {
        addCriterion("and EXECLASS is null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andExeclassIsNotNull() {
        addCriterion("and EXECLASS is not null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andExeclassLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@execlass";
        addCriterion("and EXECLASS like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andExeclassLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@execlass";
        addCriterion("and EXECLASS like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andExeclassLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@execlass";
        addCriterion("and EXECLASS like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andExeclassNotLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@execlass";
        addCriterion("and EXECLASS not like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andExeclassNotLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@execlass";
        addCriterion("and EXECLASS not like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andExeclassNotLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@execlass";
        addCriterion("and EXECLASS not like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orExeclassEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@execlass";
        addCriterion("or EXECLASS = #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orExeclassNotEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@execlass";
        addCriterion("or EXECLASS <> #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orExeclassGreaterThan(String value) {
        String key = beanID + valuesMap.size() + "@execlass";
        addCriterion("or EXECLASS > #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orExeclassGreaterThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@execlass";
        addCriterion("or EXECLASS >= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orExeclassLessThan(String value) {
        String key = beanID + valuesMap.size() + "@execlass";
        addCriterion("or EXECLASS < #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orExeclassLessThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@execlass";
        addCriterion("or EXECLASS <= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orExeclassIsNull() {
        addCriterion("or EXECLASS is null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orExeclassIsNotNull() {
        addCriterion("or EXECLASS is not null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orExeclassLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@execlass";
        addCriterion("or EXECLASS like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orExeclassLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@execlass";
        addCriterion("or EXECLASS like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orExeclassLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@execlass";
        addCriterion("or EXECLASS like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orExeclassNotLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@execlass";
        addCriterion("or EXECLASS not like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orExeclassNotLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@execlass";
        addCriterion("or EXECLASS not like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orExeclassNotLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@execlass";
        addCriterion("or EXECLASS not like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orderByExeclass(boolean isDesc) {
        addOrderBy("EXECLASS " + (isDesc ? "desc " : "asc "));
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andExeclassmethodEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@execlassmethod";
        addCriterion("and EXECLASSMETHOD = #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andExeclassmethodNotEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@execlassmethod";
        addCriterion("and EXECLASSMETHOD <> #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andExeclassmethodGreaterThan(String value) {
        String key = beanID + valuesMap.size() + "@execlassmethod";
        addCriterion("and EXECLASSMETHOD > #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andExeclassmethodGreaterThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@execlassmethod";
        addCriterion("and EXECLASSMETHOD >= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andExeclassmethodLessThan(String value) {
        String key = beanID + valuesMap.size() + "@execlassmethod";
        addCriterion("and EXECLASSMETHOD < #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andExeclassmethodLessThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@execlassmethod";
        addCriterion("and EXECLASSMETHOD <= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andExeclassmethodIsNull() {
        addCriterion("and EXECLASSMETHOD is null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andExeclassmethodIsNotNull() {
        addCriterion("and EXECLASSMETHOD is not null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andExeclassmethodLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@execlassmethod";
        addCriterion("and EXECLASSMETHOD like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andExeclassmethodLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@execlassmethod";
        addCriterion("and EXECLASSMETHOD like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andExeclassmethodLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@execlassmethod";
        addCriterion("and EXECLASSMETHOD like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andExeclassmethodNotLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@execlassmethod";
        addCriterion("and EXECLASSMETHOD not like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andExeclassmethodNotLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@execlassmethod";
        addCriterion("and EXECLASSMETHOD not like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andExeclassmethodNotLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@execlassmethod";
        addCriterion("and EXECLASSMETHOD not like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orExeclassmethodEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@execlassmethod";
        addCriterion("or EXECLASSMETHOD = #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orExeclassmethodNotEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@execlassmethod";
        addCriterion("or EXECLASSMETHOD <> #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orExeclassmethodGreaterThan(String value) {
        String key = beanID + valuesMap.size() + "@execlassmethod";
        addCriterion("or EXECLASSMETHOD > #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orExeclassmethodGreaterThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@execlassmethod";
        addCriterion("or EXECLASSMETHOD >= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orExeclassmethodLessThan(String value) {
        String key = beanID + valuesMap.size() + "@execlassmethod";
        addCriterion("or EXECLASSMETHOD < #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orExeclassmethodLessThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@execlassmethod";
        addCriterion("or EXECLASSMETHOD <= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orExeclassmethodIsNull() {
        addCriterion("or EXECLASSMETHOD is null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orExeclassmethodIsNotNull() {
        addCriterion("or EXECLASSMETHOD is not null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orExeclassmethodLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@execlassmethod";
        addCriterion("or EXECLASSMETHOD like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orExeclassmethodLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@execlassmethod";
        addCriterion("or EXECLASSMETHOD like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orExeclassmethodLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@execlassmethod";
        addCriterion("or EXECLASSMETHOD like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orExeclassmethodNotLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@execlassmethod";
        addCriterion("or EXECLASSMETHOD not like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orExeclassmethodNotLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@execlassmethod";
        addCriterion("or EXECLASSMETHOD not like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orExeclassmethodNotLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@execlassmethod";
        addCriterion("or EXECLASSMETHOD not like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orderByExeclassmethod(boolean isDesc) {
        addOrderBy("EXECLASSMETHOD " + (isDesc ? "desc " : "asc "));
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andStatusEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@status";
        addCriterion("and STATUS = #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andStatusNotEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@status";
        addCriterion("and STATUS <> #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andStatusGreaterThan(String value) {
        String key = beanID + valuesMap.size() + "@status";
        addCriterion("and STATUS > #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andStatusGreaterThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@status";
        addCriterion("and STATUS >= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andStatusLessThan(String value) {
        String key = beanID + valuesMap.size() + "@status";
        addCriterion("and STATUS < #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andStatusLessThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@status";
        addCriterion("and STATUS <= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andStatusIsNull() {
        addCriterion("and STATUS is null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andStatusIsNotNull() {
        addCriterion("and STATUS is not null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andStatusLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@status";
        addCriterion("and STATUS like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andStatusLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@status";
        addCriterion("and STATUS like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andStatusLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@status";
        addCriterion("and STATUS like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andStatusNotLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@status";
        addCriterion("and STATUS not like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andStatusNotLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@status";
        addCriterion("and STATUS not like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider andStatusNotLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@status";
        addCriterion("and STATUS not like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orStatusEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@status";
        addCriterion("or STATUS = #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orStatusNotEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@status";
        addCriterion("or STATUS <> #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orStatusGreaterThan(String value) {
        String key = beanID + valuesMap.size() + "@status";
        addCriterion("or STATUS > #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orStatusGreaterThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@status";
        addCriterion("or STATUS >= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orStatusLessThan(String value) {
        String key = beanID + valuesMap.size() + "@status";
        addCriterion("or STATUS < #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orStatusLessThanOrEqualTo(String value) {
        String key = beanID + valuesMap.size() + "@status";
        addCriterion("or STATUS <= #{valuesMap." + key + "} ", key, value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orStatusIsNull() {
        addCriterion("or STATUS is null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orStatusIsNotNull() {
        addCriterion("or STATUS is not null", null, null);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orStatusLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@status";
        addCriterion("or STATUS like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orStatusLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@status";
        addCriterion("or STATUS like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orStatusLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@status";
        addCriterion("or STATUS like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orStatusNotLikeBoth(String value) {
        String key = beanID + valuesMap.size() + "@status";
        addCriterion("or STATUS not like #{valuesMap." + key + "} ", key, "%" + value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orStatusNotLikeLeft(String value) {
        String key = beanID + valuesMap.size() + "@status";
        addCriterion("or STATUS not like #{valuesMap." + key + "} ", key, "%" + value);
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orStatusNotLikeRigth(String value) {
        String key = beanID + valuesMap.size() + "@status";
        addCriterion("or STATUS not like #{valuesMap." + key + "} ", key, value + "%");
        return this;
    }

    public MultithreadExecuteDetailSqlBulider orderByStatus(boolean isDesc) {
        addOrderBy("STATUS " + (isDesc ? "desc " : "asc "));
        return this;
    }
}
