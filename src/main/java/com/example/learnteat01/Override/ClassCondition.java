package com.example.learnteat01.Override;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class ClassCondition implements Condition {
    /**
     * @param context:上下文对象,可以获取属性值,获取加载器,获取BeanFactory等.
     * @param metadata:元数据对象,使用@Condition(条件类.class)注解
     * @return
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
       //获取配置的环境配置
//        Environment environment = context.getEnvironment();
//        environment.getProperty("");
        //导入通过注解属性值value指定坐标后创建Bean
        Map<String, Object> annotationAttributes = metadata.getAnnotationAttributes(ConditionOnClass.class.getName());
        String[] value = (String[]) annotationAttributes.get("value");
        Boolean flag=true;
            try {
                for (String s : value) {
                    Class<?> aClass = Class.forName(s);
                }
            } catch (ClassNotFoundException e) {
                flag=false;
            }
        return flag;
    }
}
