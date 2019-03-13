package com.my.demo.Repository;

import com.my.demo.po.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "user",path="user" )
public interface UserRepository extends MongoRepository<User,Long> {

    /*
     * MongoRepository与HibernateTemplete相似，提供一些基本的方法，
     * 实现的方法有findone(),save(),count(),findAll(),findAll(Pageable),delete(),deleteAll()..etc
     * 要使用Repository的功能，先继承MongoRepository<T, TD>接口
     * 其中T为仓库保存的bean类，TD为该bean的唯一标识的类型，一般为ObjectId。
     * 之后在spring-boot中注入该接口就可以使用，无需实现里面的方法，spring会根据定义的规则自动生成。
     * starter-data-mongodb 支持方法命名约定查询 findBy{User的name属性名}，
     * findBy后面的属性名一定要在User类中存在，否则会报错
     */

    /**
     * 根据name查询User实体集合
     * @param name
     * @return
     */
    List<User> findByName(String name);

}
