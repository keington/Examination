package com.keington.dao;

/**
 * @author Xu.Huaian
 * @date 2022/05/24
 */
public class UserDao {

    private final int id;
    private String name;
    private String password;
    private String email;
    private String phone;
    private String role;
    private String status;
    private String createTime;
    private String updateTime;

    public UserDao(int i) {
        this.id = i;
    }
}
