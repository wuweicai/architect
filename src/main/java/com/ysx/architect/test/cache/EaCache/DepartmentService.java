package com.ysx.architect.test.cache.EaCache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@CacheConfig(cacheNames = "department")
@Service
public class DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @CachePut(key = "#department.id")
    public Department save(Department department) {
        //department.setId(2);
        department.setName("研发部");
        department.setDescr("开发产品");
        System.out.println("保存 id=" + department.getId() + " 的数据");
        this.departmentMapper.insert(department);
        return department;
    }

    @CachePut(key = "#department.id")
    public Department update(Department department) {
        department.setName("研发部1");
        department.setDescr("开发产品1");
        System.out.println("修改 id=" + department.getId() + " 的数据");
        this.departmentMapper.update(department);
        return department;
    }

    @Cacheable(key = "#id")
    public Department getDepartmentById(String id) {
        System.out.println("获取 id=" + id + " 的数据");
        Department department = this.departmentMapper.getById(id);
        return department;
    }

    @CacheEvict(key = "#id")
    public void delete(Integer id) {
        System.out.println("删除 id=" + id + " 的数据");
        this.departmentMapper.deleteById(id);
    }
}