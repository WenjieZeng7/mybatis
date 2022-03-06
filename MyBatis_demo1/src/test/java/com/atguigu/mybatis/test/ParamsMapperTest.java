package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.ParamsMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-03-02 14:27
 */
public class ParamsMapperTest {
    @Test
    public void testGetAllUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParamsMapper mapper = sqlSession.getMapper(ParamsMapper.class);
        List<User> list = mapper.getAllUser();
        System.out.println(list);
    }
}
