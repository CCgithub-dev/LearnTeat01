package com.example.learnteat01.mapper;

import com.example.learnteat01.Dao.UserDao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Usermapper {

    @Select("select * from t_user;")
    List<UserDao> SelectAll();
}
