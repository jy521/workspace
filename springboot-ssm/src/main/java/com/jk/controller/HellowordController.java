package com.jk.controller;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yy on 2017/11/15.
 */
@SpringBootApplication
public class HellowordController {

    @RequestMapping("/")
    public String index(){
        return "hello word";
    }
}
