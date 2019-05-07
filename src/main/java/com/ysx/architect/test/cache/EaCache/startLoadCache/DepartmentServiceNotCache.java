package com.ysx.architect.test.cache.EaCache.startLoadCache;

import com.ysx.architect.test.cache.EaCache.Department;
import com.ysx.architect.test.cache.EaCache.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceNotCache {

    @Autowired
    private DepartmentMapper departmentMapper;

    public Department save(Department department) {
        //department.setId(2);
        department.setName("研发部");
        department.setDescr("开发产品");
        System.out.println("保存 id=" + department.getId() + " 的数据");
        this.departmentMapper.insert(department);
        return department;
    }

    public Department update(Department department) {
        department.setName("研发部1");
        department.setDescr("开发产品1");
        System.out.println("修改 id=" + department.getId() + " 的数据");
        this.departmentMapper.update(department);
        return department;
    }

    public Department getDepartmentById(String id) {
        System.out.println("获取 id=" + id + " 的数据");
        Department department = this.departmentMapper.getById(id);
        return department;
    }

    @Cacheable(key = "#id")
    public String getDesctById(String id) {
        System.out.println("获取 id=" + id + " 的数据");
        String desc = this.departmentMapper.getDescById(id);
        return desc;
    }

    public void delete(Integer id) {
        System.out.println("删除 id=" + id + " 的数据");
        this.departmentMapper.deleteById(id);
    }

    public List<Department> selectAll(){
        List<Department> lstDepartment = departmentMapper.selectAll();
        return lstDepartment;
    }
}
