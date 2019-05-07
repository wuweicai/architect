package com.ysx.architect.test.quarts.multi;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface SysTaskMapper {

    SysTask get(Long id);

    List<SysTask> list(Map<String,Object> map);

    int count(Map<String,Object> map);

    int save(SysTask task);

    int update(SysTask task);

    int remove(Long id);

    int batchRemove(Long[] ids);
}