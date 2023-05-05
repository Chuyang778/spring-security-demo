package com.example.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChuYang
 * @version 1.0
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    @PreAuthorize("hashAuthority('test')")
    public String hello() {
        return "hello";
    }
}
