package com.wang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Administrator on 2016/9/26.
 */
@SpringBootApplication
@ComponentScan({"com.wang.serivce","com.wang.servlet","com.fc"})
@MapperScan("com.wang.dao.mapper")
public class StartSpring extends SpringBootServletInitializer{
    public static void main(String[] args){
        SpringApplication.run(StartSpring.class,args);
    }
}
