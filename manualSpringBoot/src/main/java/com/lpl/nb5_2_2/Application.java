package com.lpl.nb5_2_2;

import com.lpl.nb6_2_3.config.AuthorSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*
*@data 2019/9/10
*@descrption 手工生成简单maven，然后配置pom文件，最后新建启动类
*
*/
@RestController
@SpringBootApplication //组合注解
public class Application {


    @RequestMapping("/")
    String index(){
        return "hello Spring boot";
    }


    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
