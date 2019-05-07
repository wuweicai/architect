package com.ysx.architect.test.thread.tansun;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


@Service("multithreadExecuteDetailDaoImpl")
@Scope("prototype")
@Transactional(propagation=Propagation.REQUIRED)
public class MultithreadExecuteDetailDaoImpl implements MultithreadExecuteDetailDao {
    @Resource
    private MultithreadExecuteDetailMapper multithreadExecuteDetailMapper;

    public MultithreadExecuteDetailDaoImpl() {
        super();
    }

    public List<MultithreadExecuteDetail> selectListBySqlBuliderWithBLOBs(MultithreadExecuteDetailSqlBulider multithreadExecuteDetailSqlBulider) throws Exception {
        return multithreadExecuteDetailMapper.selectBySqlBuliderWithBLOBs(multithreadExecuteDetailSqlBulider);
    }

    public List<MultithreadExecuteDetail> selectListBySqlBulider(MultithreadExecuteDetailSqlBulider multithreadExecuteDetailSqlBulider) throws Exception {
        return multithreadExecuteDetailMapper.selectBySqlBulider(multithreadExecuteDetailSqlBulider);
    }

    public MultithreadExecuteDetail selectBySqlBuliderWithBLOBs(MultithreadExecuteDetailSqlBulider multithreadExecuteDetailSqlBulider) throws Exception {
        multithreadExecuteDetailSqlBulider.setIndexNo(0);
        multithreadExecuteDetailSqlBulider.setPageSize(0);
        List<MultithreadExecuteDetail> listMultithreadExecuteDetailSqlBuliders = selectListBySqlBuliderWithBLOBs(multithreadExecuteDetailSqlBulider);
        if(listMultithreadExecuteDetailSqlBuliders != null && listMultithreadExecuteDetailSqlBuliders.size() > 0)
            return listMultithreadExecuteDetailSqlBuliders.get(0);
        else
            return null;
    }

    public MultithreadExecuteDetail selectBySqlBulider(MultithreadExecuteDetailSqlBulider multithreadExecuteDetailSqlBulider) throws Exception {
        multithreadExecuteDetailSqlBulider.setIndexNo(0);
        multithreadExecuteDetailSqlBulider.setPageSize(0);
        List<MultithreadExecuteDetail> listMultithreadExecuteDetailSqlBuliders = selectListBySqlBulider(multithreadExecuteDetailSqlBulider);
        if(listMultithreadExecuteDetailSqlBuliders != null && listMultithreadExecuteDetailSqlBuliders.size() > 0)
            return listMultithreadExecuteDetailSqlBuliders.get(0);
        else
            return null;
    }

    public MultithreadExecuteDetail selectByPrimaryKey(MultithreadExecuteDetailKey multithreadExecuteDetailKey) throws Exception {
        return multithreadExecuteDetailMapper.selectByPrimaryKey(multithreadExecuteDetailKey);
    }

    public int countBySqlBulider(MultithreadExecuteDetailSqlBulider multithreadExecuteDetailSqlBulider) throws Exception {
        return multithreadExecuteDetailMapper.countBySqlBulider(multithreadExecuteDetailSqlBulider);
    }

    public int insert(MultithreadExecuteDetail multithreadExecuteDetail) throws Exception {
        return multithreadExecuteDetailMapper.insert(multithreadExecuteDetail);
    }

    public int insertUseBatch(List<MultithreadExecuteDetail> listMultithreadExecuteDetails) throws Exception {
        return multithreadExecuteDetailMapper.insertUseBatch(listMultithreadExecuteDetails);
    }

    public int updateBySqlBulider(MultithreadExecuteDetail multithreadExecuteDetail, MultithreadExecuteDetailSqlBulider multithreadExecuteDetailSqlBulider) throws Exception {
        multithreadExecuteDetailSqlBulider.setUpdateObject(multithreadExecuteDetail);
        return multithreadExecuteDetailMapper.updateBySqlBulider(multithreadExecuteDetailSqlBulider);
    }

    public int updateBySqlBuliderSelective(MultithreadExecuteDetail multithreadExecuteDetail, MultithreadExecuteDetailSqlBulider multithreadExecuteDetailSqlBulider) throws Exception {
        multithreadExecuteDetailSqlBulider.setUpdateObject(multithreadExecuteDetail);
        return multithreadExecuteDetailMapper.updateBySqlBuliderSelective(multithreadExecuteDetailSqlBulider);
    }

    public int updateByPrimaryKey(MultithreadExecuteDetail multithreadExecuteDetail) throws Exception {
        return multithreadExecuteDetailMapper.updateByPrimaryKey(multithreadExecuteDetail);
    }

    public int updateByPrimaryKeySelective(MultithreadExecuteDetail multithreadExecuteDetail) throws Exception {
        return multithreadExecuteDetailMapper.updateByPrimaryKeySelective(multithreadExecuteDetail);
    }

    public int deleteBySqlBulider(MultithreadExecuteDetailSqlBulider multithreadExecuteDetailSqlBulider) throws Exception {
        return multithreadExecuteDetailMapper.deleteBySqlBulider(multithreadExecuteDetailSqlBulider);
    }

    public int deleteByPrimaryKey(MultithreadExecuteDetailKey multithreadExecuteDetailKey) throws Exception {
        return multithreadExecuteDetailMapper.deleteByPrimaryKey(multithreadExecuteDetailKey);
    }
}