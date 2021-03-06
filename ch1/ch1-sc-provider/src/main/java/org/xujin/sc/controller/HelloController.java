package org.xujin.sc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: xujin
 **/
@RequestMapping("/hello")
@RestController
public class HelloController {


    @GetMapping("")
    public String hello(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

}
