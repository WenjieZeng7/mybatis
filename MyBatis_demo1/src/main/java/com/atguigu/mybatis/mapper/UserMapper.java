package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;

import java.util.List;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-03-01 20:34
 */
public interface UserMapper {
    /*** 添加用户信息 */
    int insertUser();

    /**
     * 修改
     */
    void updateUser();

    /**
     * 查询实体类对象
     */
    List<User> getUserById();
}
