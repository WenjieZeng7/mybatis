package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;

import java.util.List;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-03-02 14:21
 */
public interface ParamsMapper {
    /*
    查询所有
     */
    List<User> getAllUser();
}
