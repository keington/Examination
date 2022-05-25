package com.keington.controller;

import com.keington.dao.UserDao;
import com.keington.mapper.UserMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Xu.Huaian
 * @date 2022/05/24
 */

@Controller
@RequestMapping("/user")
public class SysUserController {

    private final UserMapper usermapper;

    public SysUserController(UserMapper usermapper) {
        this.usermapper = usermapper;
    }

    // TODO: 2022/5/25 完善用户查询响应500
    // 用户列表
    @GetMapping("/list")
    public List<UserDao> UserList(){
        return usermapper.UserList();
    }

    // 添加用户
    @GetMapping("/add")
    public String addUser(){
        usermapper.addUser(new UserDao(5));
        return "OK";
    }

    // 更新用户
    @RequestMapping("/update")
    public String updateUser(){
        usermapper.updateUser(new UserDao(5));
        return "OK";
    }

    // 删除用户
    @GetMapping("/delete")
    public String deleteUser(){
        usermapper.deleteUser(5);
        return "OK";
    }
}
