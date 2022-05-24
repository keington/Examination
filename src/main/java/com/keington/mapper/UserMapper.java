package com.keington.mapper;

import com.keington.dao.UserDao;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    List<UserDao> UserList();
    UserDao UserById(int id);
    int addUser(UserDao user);
    int updateUser(UserDao user);
    int deleteUser(int id);

}
