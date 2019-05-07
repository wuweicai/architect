package com.ysx.architect.test.thread.tansun;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class SQLBulider<T> implements Serializable {
    private static final long serialVersionUID = -161123581321345589L;
    protected String beanID = "";
    protected Map<String, Object> valuesMap = new HashMap();
    protected List<String> whereList = new ArrayList();
    protected List<String> orderList = new ArrayList();
    protected Object updateObject;
    protected boolean isForUpdate = false;
    protected boolean distinct = false;
    protected int indexNo = 0;
    protected int pageSize = 0;

    public SQLBulider() {
    }

    public void clear() {
        this.valuesMap = new HashMap();
        this.whereList = new ArrayList();
        this.orderList = new ArrayList();
        this.updateObject = null;
        this.isForUpdate = false;
        this.distinct = false;
        this.pageSize = 0;
        this.indexNo = 0;
    }

    public Map<String, Object> getValuesMap() {
        return this.valuesMap;
    }

    public Object getUpdateObject() {
        return this.updateObject;
    }

    public void setUpdateObject(Object updateObject) {
        this.updateObject = updateObject;
    }

    public boolean isForUpdate() {
        return this.isForUpdate;
    }

    public void setForUpdate(boolean isForUpdate) {
        this.isForUpdate = isForUpdate;
    }

    public boolean isDistinct() {
        return this.distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public int getIndexNo() {
        return this.indexNo;
    }

    public void setIndexNo(int indexNo) {
        this.indexNo = indexNo;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    protected List<String> getWhereList() {
        return this.whereList;
    }

    public void setWhereCase(String whereCase) {
        this.whereList.add(whereCase);
    }

    protected List<String> getOrderList() {
        return this.orderList;
    }

    protected SQLBulider<T> addCriterion(String whereCase, String key, Object value) {
        this.whereList.add(whereCase);
        if (key != null) {
            this.valuesMap.put(key, value);
        }

        return this;
    }

    protected SQLBulider<T> addOrderBy(String orderByCase) {
        this.orderList.add(orderByCase);
        return this;
    }

    public T and(SQLBulider<T> newCaseSQLBulider) {
        List<String> caseList = newCaseSQLBulider.getWhereList();
        this.addCriterion("and ( " + newCaseSQLBulider.toCase(caseList) + " ) ", (String)null, (Object)null);
        Map<String, Object> caseValuesMap = newCaseSQLBulider.getValuesMap();
        this.valuesMap.putAll(caseValuesMap);
//        return this;
        return null;
    }

    public T or(SQLBulider<T> newCaseSQLBulider) {
        List<String> caseList = newCaseSQLBulider.getWhereList();
        this.addCriterion("or ( " + newCaseSQLBulider.toCase(caseList) + " ) ", (String)null, (Object)null);
        Map<String, Object> caseValuesMap = newCaseSQLBulider.getValuesMap();
        this.valuesMap.putAll(caseValuesMap);
        //return this;
        return null;
    }

    protected String toCase(List<String> caseList) {
        StringBuilder sb = new StringBuilder();
        if (caseList != null && caseList.size() > 0) {
            int i = 0;

            for(int lsize = caseList.size(); i < lsize; ++i) {
                String str = ((String)caseList.get(i)).trim();
                if (0 == i) {
                    String startStr = str.split(" ")[0];
                    sb.append(" " + str.substring(startStr.length() + 1));
                } else {
                    sb.append(" " + str);
                }
            }
        }

        return sb.toString();
    }
}
