package com.ysx.architect.test.thread.tansun;

import java.util.List;

public interface MultithreadExecuteDetailMapper {

    public List<MultithreadExecuteDetail> selectBySqlBuliderWithBLOBs(MultithreadExecuteDetailSqlBulider multithreadExecuteDetailSqlBulider) throws Exception;

    public List<MultithreadExecuteDetail> selectBySqlBulider(MultithreadExecuteDetailSqlBulider multithreadExecuteDetailSqlBulider) throws Exception;

    public MultithreadExecuteDetail selectByPrimaryKey(MultithreadExecuteDetailKey multithreadExecuteDetailKey) throws Exception;

    public int countBySqlBulider(MultithreadExecuteDetailSqlBulider multithreadExecuteDetailSqlBulider) throws Exception;

    public int insert(MultithreadExecuteDetail multithreadExecuteDetail) throws Exception;

    public int insertUseBatch(List<MultithreadExecuteDetail> listMultithreadExecuteDetail) throws Exception;

    public int updateBySqlBulider(MultithreadExecuteDetailSqlBulider multithreadExecuteDetailSqlBulider) throws Exception;

    public int updateBySqlBuliderSelective(MultithreadExecuteDetailSqlBulider multithreadExecuteDetailSqlBulider) throws Exception;

    public int updateByPrimaryKey(MultithreadExecuteDetailKey multithreadExecuteDetailKey) throws Exception;

    public int updateByPrimaryKeySelective(MultithreadExecuteDetailKey multithreadExecuteDetailKey) throws Exception;

    public int deleteBySqlBulider(MultithreadExecuteDetailSqlBulider multithreadExecuteDetailSqlBulider) throws Exception;

    public int deleteByPrimaryKey(MultithreadExecuteDetailKey multithreadExecuteDetailKey) throws Exception;

}