package com.jk.dao;

import com.jk.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by yangzhichao on 2017-11-14.
 */
@Mapper
public interface UserMapper {


    @Select("select * from jy_user")
    public List<User> userList();
    //查询用户列表信息
   /* @Select("select * from t_user")
    public List<User> userList();*/

    /*@Select("select * from user where name = #{name} ")
    public UserBO findUserByName(@Param("name") String name);*/

}
