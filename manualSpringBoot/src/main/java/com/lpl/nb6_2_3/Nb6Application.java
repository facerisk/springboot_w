package com.lpl.nb6_2_3;


import com.lpl.nb6_2_3.config.AuthorSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Nb6Application {
    @Autowired
    AuthorSettings authorSettings;
    @RequestMapping("/propertiesTest")
    String propertiesTest(){
        return "hello Spring boot"+authorSettings.getName()+":"+authorSettings.getAge();
    }
    public static void main(String[] args) {
        SpringApplication.run(Nb6Application.class,args);
    }
}
