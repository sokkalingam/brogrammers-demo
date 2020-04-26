package com.brogrammers.demo.controllers

import com.brogrammers.demo.services.HelloService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @Autowired
    private HelloService helloService

    @GetMapping("/hello")
    public String hello() {
        return helloService.hello()
    }
}
