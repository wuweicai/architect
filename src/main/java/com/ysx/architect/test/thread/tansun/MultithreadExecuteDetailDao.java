package com.ysx.architect.test.thread.tansun;

import java.util.List;

public interface MultithreadExecuteDetailDao {

    public List<MultithreadExecuteDetail> selectListBySqlBuliderWithBLOBs(MultithreadExecuteDetailSqlBulider multithreadExecuteDetailSqlBulider) throws Exception;

    public List<MultithreadExecuteDetail> selectListBySqlBulider(MultithreadExecuteDetailSqlBulider multithreadExecuteDetailSqlBulider) throws Exception;

    public MultithreadExecuteDetail selectBySqlBuliderWithBLOBs(MultithreadExecuteDetailSqlBulider multithreadExecuteDetailSqlBulider) throws Exception;

    public MultithreadExecuteDetail selectBySqlBulider(MultithreadExecuteDetailSqlBulider multithreadExecuteDetailSqlBulider) throws Exception;

    public MultithreadExecuteDetail selectByPrimaryKey(MultithreadExecuteDetailKey multithreadExecuteDetailKey) throws Exception;

    public int countBySqlBulider(MultithreadExecuteDetailSqlBulider multithreadExecuteDetailSqlBulider) throws Exception;

    public int insert(MultithreadExecuteDetail multithreadExecuteDetail) throws Exception;

    public int insertUseBatch(List<MultithreadExecuteDetail> listMultithreadExecuteDetails) throws Exception;

    public int updateBySqlBulider(MultithreadExecuteDetail multithreadExecuteDetail, MultithreadExecuteDetailSqlBulider multithreadExecuteDetailSqlBulider) throws Exception;

    public int updateBySqlBuliderSelective(MultithreadExecuteDetail multithreadExecuteDetail, MultithreadExecuteDetailSqlBulider multithreadExecuteDetailSqlBulider) throws Exception;

    public int updateByPrimaryKey(MultithreadExecuteDetail multithreadExecuteDetail) throws Exception;

    public int updateByPrimaryKeySelective(MultithreadExecuteDetail multithreadExecuteDetail) throws Exception;

    public int deleteBySqlBulider(MultithreadExecuteDetailSqlBulider multithreadExecuteDetailSqlBulider) throws Exception;

    public int deleteByPrimaryKey(MultithreadExecuteDetailKey multithreadExecuteDetailKey) throws Exception;

}