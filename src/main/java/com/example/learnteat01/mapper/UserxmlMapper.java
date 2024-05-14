package com.example.learnteat01.mapper;

import com.example.learnteat01.Dao.UserDao;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserxmlMapper {

    List<UserDao> SelectAllxml();
}
