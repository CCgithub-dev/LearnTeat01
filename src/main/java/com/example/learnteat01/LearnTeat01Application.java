package com.example.learnteat01;

import com.example.learnconfig.config.CustDemo;
import com.example.learnconfig.config.CustImport;
import com.example.learnteat01.damian.Disco;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * 用@ComponentScan,扫描包名可以获取
 * 用@Import,注入类名,可以获取
 *@CustImport是重写的类
 * 4种写法:
 * 1,导入Bean
 * 2,导入配置类
 * 3,导入ImportSeletor实现类. 一般用于加载配置文件中的类.
 * 4,导入ImportBeanDefinitionRegistrar实现类.
 *
 *
 */


@SpringBootApplication
//@ComponentScan("com.example.learnconfig.config")
//@Import(CustDemo.class)
@CustImport
public class LearnTeat01Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(LearnTeat01Application.class, args);

        Object redisTemplate = context.getBean("cust");
        System.out.println(redisTemplate);


        Object test1 = context.getBean(Disco.class);
        System.out.println(test1);
    }

}
