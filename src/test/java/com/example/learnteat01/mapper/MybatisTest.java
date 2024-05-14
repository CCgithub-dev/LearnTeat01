package com.example.learnteat01.mapper;


import com.example.learnteat01.Dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisTest {
    @Autowired
    private Usermapper usermapper;

    @Autowired
    private UserxmlMapper userxmlMapper;
    @Test
    public void SelectAll(){
        List<UserDao> userDaos = usermapper.SelectAll();
        System.out.println("========"+userDaos);

    }

    @Test
    public void SelectAllxml(){
        List<UserDao> userDaos = userxmlMapper.SelectAllxml();
        System.out.println("========"+userDaos);

    }
}
