package com.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 运行后访问: <a href="http://localhost:8080/test/index">...</a>
 * 文档描述: <a href="https://licheng1013.github.io/study/java/spring-boot.html">...</a>
 * @author lc
 * @since 2023/1/14
 */
@SpringBootApplication
public class WebApp {
    public static void main(String[] args) {
        SpringApplication.run(WebApp.class,args);
    }
}
