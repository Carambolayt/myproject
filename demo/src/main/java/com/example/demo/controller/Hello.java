package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yt
 * @date 2020/9/23 16:34
 */
@Controller
public class Hello {
    @RequestMapping("/hello")
    public String index(){
        return "index";
    }
}
