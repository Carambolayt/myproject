package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author yt
 * @date 2020/10/3 10:30
 */
@Controller
public class EmpController {
    @GetMapping("")
    public String emps(){
        return "";
    }
}
