#整合缓存
##一、前言
>当系统的访问量增大时，相应的数据库的性能就逐渐下降。但是，大多数请求都是在重复的获取相同的数据，如果使用缓存，将结果数据放入其中可以很大程度上减轻数据库的负担，提升系统的响应速度。

spring Boot 针对不同的缓存技术实现了不同的封装，本篇主要介绍 EhCache 和 Redis 缓存。

Spring Boot 提供了以下几个注解实现声明式缓存：

|   注解 |     说明   |       
|:-----|:----------|
|@EnableCaching|开启缓存功能，放在配置类或启动类上|
|@CacheConfig|缓存配置，设置缓存名称|
|@Cacheable|执行方法前先查询缓存是否有数据。有则直接返回缓存数据；否则查询数据再将数据放入缓存|
|@CachePut|执行新增或更新方法后，将数据放入缓存中|
|@CacheEvict|清除缓存|
|@Caching|将多个缓存操作重新组合到一个方法中|
##二、EaCache缓存
###2.1 添加依赖
```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-cache</artifactId>
</dependency>

<dependency>
    <groupId>net.sf.ehcache</groupId>
    <artifactId>ehcache</artifactId>
</dependency>
```
###2.2  添加配置
1).在 src/main/resources 目录下创建 ehcache.xml 文件，内容如下：
```
<?xml version="1.0" encoding="UTF-8"?>
<ehcache xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:noNamespaceSchemaLocation="http://ehcache.org/ehcache.xsd">

    <!-- 磁盘缓存位置 -->
    <diskStore path="java.io.tmpdir/ehcache"/>

    <!-- 默认缓存 -->
    <defaultCache
            maxEntriesLocalHeap="10000"
            eternal="false"
            timeToIdleSeconds="120"
            timeToLiveSeconds="120"
            maxEntriesLocalDisk="10000000"
            diskExpiryThreadIntervalSeconds="120"
            memoryStoreEvictionPolicy="LRU">
        <persistence strategy="localTempSwap"/>
    </defaultCache>

    <!-- 自定义缓存 -->
    <cache name="department"
           maxElementsInMemory="1000"
           eternal="false"
           timeToIdleSeconds="50"
           timeToLiveSeconds="50"
           overflowToDisk="false"
           memoryStoreEvictionPolicy="LRU"/>
</ehcache>
```
说明：

``` 
name：Cache 的唯一标识
maxElementsInMemory：内存中允许存储的最大的元素个数
maxElementsOnDisk：硬盘最大缓存个数，0代表无限个
clearOnFlush：内存数量最大时是否清除
eternal：缓存对象是否永久有效，如果是，超时设置将被忽略
overflowToDisk：内存不足（超过 maxElementsInMemory）时，是否启用磁盘缓存
timeToIdleSeconds：设置对象在失效前的允许闲置时间（单位：秒）。仅当eternal=false对象不是永久有效时使用，可选属性，默认值是0，也就是可闲置时间无穷大
timeToLiveSeconds：缓存数据的生存时间（TTL），也就是一个元素从构建到消亡的最大时间间隔值，这只能在元素不是永久驻留时有效，如果该值是0就意味着元素可以停顿无穷长的时间
diskPersistent：是否将缓存数据持久化到磁盘上，如果为 true，JVM 重启数据依然存在。默认值是false
diskSpoolBufferSizeMB：这个参数设置DiskStore（磁盘缓存）的缓存区大小。默认是30MB。每个Cache都应该有自己的一个缓冲区
diskExpiryThreadIntervalSeconds：磁盘失效线程运行时间间隔，默认是120秒
memoryStoreEvictionPolicy：当达到 maxElementsInMemory 限制时，Ehcache 将根据指定策略清除内存。默认为 LRU（最近最少使用），其他策略有 FIFO（先进先出），LFU（较少使用）
```
###2.3  编码
在持久层篇datajpa/mybatis-jpa的基础上，添加以下类：
* Service 层：
``` 
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
        System.out.println("修改 id=" + department.getId() + " 的数据");
        this.departmentMapper.update(department);
        return department;
    }

    @Cacheable(key = "#id")
    public Department getDepartmentById(Integer id) {
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
```
* 控制层
```
@Controller
@RequestMapping("department")
@ResponseBody
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("save")
    public Map<String,Object> save(Department department) {
        department.setId(2);
        this.departmentService.save(department);

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code", "200");
        map.put("msg", "保存成功");
        return map;
    }

    @RequestMapping("get/{id}")
    public Map<String,Object> get(@PathVariable("id") Integer id) {
        Department department = this.departmentService.getDepartmentById(id);

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code", "200");
        map.put("msg", "获取成功");
        map.put("data", department);
        return map;
    }

    @RequestMapping("update")
    public Map<String,Object> update(Department department) {
        this.departmentService.update(department);

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code", "200");
        map.put("msg", "修改成功");
        return map;
    }

    @RequestMapping("delete/{id}")
    public Map<String,Object> delete(@PathVariable("id") Integer id) {
        this.departmentService.delete(id);

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code", "200");
        map.put("msg", "删除成功");
        return map;
    }
}
```
* 启动类
添加 @EnableCaching 注解，开启缓存功能。
```
@EnableCaching
@SpringBootApplication
public class SpringbootNosqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootNosqlApplication.class, args);
    }
}
```
##2.4 测试说明
* 发起保存请求：
![](picture/20180912165705.png)
```
保存 id=2 的数据
2018-09-12 17:02:43.755 DEBUG 9888 --- [nio-8080-exec-1] c.e.e.mapper.DepartmentMapper.insert     : ==>  Preparing: insert into department(id,name,descr) values(?,?,?) 
2018-09-12 17:02:43.849 DEBUG 9888 --- [nio-8080-exec-1] c.e.e.mapper.DepartmentMapper.insert     : ==> Parameters: 2(Integer), 研发部(String), 开发产品(String)
2018-09-12 17:02:43.866 DEBUG 9888 --- [nio-8080-exec-1] c.e.e.mapper.DepartmentMapper.insert     : <==    Updates: 1
```
* 保存成功后，立刻发起查询请求，没有日志打印，但返回对象数据，说明数据是从缓存中获取。
* 发起修改请求：
```
修改 id=2 的数据
2018-09-12 17:03:01.219 DEBUG 9888 --- [nio-8080-exec-2] c.e.e.mapper.DepartmentMapper.update     : ==>  Preparing: update department set descr = ? where id = ? 
2018-09-12 17:03:01.261 DEBUG 9888 --- [nio-8080-exec-2] c.e.e.mapper.DepartmentMapper.update     : ==> Parameters: 开发产品1(String), 2(Integer)
2018-09-12 17:03:01.264 DEBUG 9888 --- [nio-8080-exec-2] c.e.e.mapper.DepartmentMapper.update     : <==    Updates: 1
```
* 修改成功后，立刻发起查询请求，没有日志打印，但返回修改后的对象数据，说明缓存中的数据已经同步。
* 发起删除请求：
```
删除 id=2 的数据
2018-09-12 17:06:38.840 DEBUG 9888 --- [nio-8080-exec-6] c.e.e.m.DepartmentMapper.deleteById      : ==>  Preparing: delete from department where id = ? 
2018-09-12 17:06:38.843 DEBUG 9888 --- [nio-8080-exec-6] c.e.e.m.DepartmentMapper.deleteById      : ==> Parameters: 2(Integer)
2018-09-12 17:06:38.849 DEBUG 9888 --- [nio-8080-exec-6] c.e.e.m.DepartmentMapper.deleteById      : <==    Updates: 1
```
*  删除成功后，立刻发起查询请求，控制台打印 sql 语句，说明缓存数据被删除，需要查询数据库。
```
获取 id=2 的数据
2018-09-12 17:07:00.330 DEBUG 9888 --- [nio-8080-exec-7] c.e.e.mapper.DepartmentMapper.getById    : ==>  Preparing: select id,name,descr from department where id = ? 
2018-09-12 17:07:00.337 DEBUG 9888 --- [nio-8080-exec-7] c.e.e.mapper.DepartmentMapper.getById    : ==> Parameters: 2(Integer)
2018-09-12 17:07:00.350 DEBUG 9888 --- [nio-8080-exec-7] c.e.e.mapper.DepartmentMapper.getById    : <==      Total: 0
```


