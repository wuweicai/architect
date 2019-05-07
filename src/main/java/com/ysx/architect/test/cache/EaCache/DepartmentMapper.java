package com.ysx.architect.test.cache.EaCache;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DepartmentMapper {

    public void insert(Department department);

    public Department getById(String id);

    public void update(Department department);

    public void deleteById(Integer id);
    public List<Department> selectAll();

    public String getDescById(String Id);
}