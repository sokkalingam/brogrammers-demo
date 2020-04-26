package com.brogrammers.demo.services

import org.springframework.stereotype.Service

@Service
class HelloService {

    public String hello() {
        return "Hello from Service"
    }
}
