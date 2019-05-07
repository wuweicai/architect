package com.ysx.architect.test.thread.tansun;

public interface MultithreadExectaskMangerService {

    public int insert(MultithreadExectaskManger multithreadExectaskManger) throws Exception;

    public int updateByPrimaryKey(MultithreadExectaskManger multithreadExectaskManger) throws Exception;

    public MultithreadExectaskManger selectBySqlBuliderWithBLOBs(MultithreadExectaskMangerSqlBulider multithreadExectaskMangerSqlBulider) throws Exception;

}