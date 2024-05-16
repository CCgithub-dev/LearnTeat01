package com.example.learnconfig.config;


import org.springframework.context.annotation.Import;

import java.lang.annotation.*;
//重写Import注解

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(CustDemo.class)
public @interface CustImport {
}
