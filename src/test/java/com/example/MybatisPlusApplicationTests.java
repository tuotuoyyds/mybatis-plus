package com.example;

import com.example.mapper.UserMapper;
import com.example.pojo.User;
import com.example.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {

    @Autowired
    UserMapper userMapper;
    @Autowired
    UserService userService;
    @Test
    void cc(){
        List<User> list = userService.list();
        list.forEach(System.out::println);
        System.out.println("xx");
        System.out.println("master");
        System.out.println("ssh");
    }
    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(null);
    }

}
