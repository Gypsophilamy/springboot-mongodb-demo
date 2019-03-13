package com.my.demo;

import com.my.demo.Repository.UserRepository;
import com.my.demo.po.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {


    @Autowired
    private UserRepository userRepository;

//    @Test
//    public void Testsave(){
//        userRepository.insert(new User(1001L,"mytest",24,"女"));
//        System.out.println("保存成功！");
//    }

    /**
     * 查询全部User实体
     */
//    @Test
//    public void TestFindAll() {
//        List<User> users = userRepository.findAll();
//        System.out.println("size: " + users.size() + "," + users.get(0).getName());
//    }

    /**
     * 根据name查询User
     */
//    @Test
//    public void TestFindByName(){
//        List<User> users = userRepository.findByName("mytest");
//        System.out.println("size: "+users.size());
//    }

    /**
     * 根据id删除对应User实体
     */
//    @Test
//    public void TestDelete(){
//        userRepository.deleteById(1001L);
//        System.out.println("删除成功！");
//    }
}
