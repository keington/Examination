package com.keington.controller;

import com.keington.dao.UserDao;
import com.keington.mapper.UserMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author Xu.Huaian
 * @date 2022/05/24
 */

@Controller
public class UserController {

    private final UserMapper usermapper;

    public UserController(UserMapper usermapper) {
        this.usermapper = usermapper;
    }

    // TODO: 2022/5/25 完善用户查询响应500 
    @GetMapping("/UserList")
    public List<UserDao> querUserList(){
        return (List<UserDao>) usermapper.UserList();
    }

    @GetMapping("/addUser")
    public String addUser(){
        usermapper.addUser(new UserDao(5));
        return "OK";
    }
}
