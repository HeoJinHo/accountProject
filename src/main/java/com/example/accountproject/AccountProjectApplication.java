package com.example.accountproject;

import com.example.accountproject.models.interfaces.MemberSv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

//@EnableMongoRepositories(basePackageClasses = com.example.accountproject.models.interfaces.MemberSv.class)
@SpringBootApplication
public class AccountProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountProjectApplication.class, args);
    }

}
