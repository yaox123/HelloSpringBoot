package com.example.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: HelloSpringBoot
 * @BelongsPackage: com.example.user
 * @Author: yaox
 * @CreateTime: 2018-10-23 21:34
 */

@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    public String say(){
        return "Hello SpringBoot!";
    }
}
