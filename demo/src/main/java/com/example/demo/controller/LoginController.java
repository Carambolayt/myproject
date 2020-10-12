package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author yt
 * @date 2020/9/23 21:31
 */
@Controller
public class LoginController {
    @PostMapping("/login/user")
    public String login(@RequestParam String username, @RequestParam String password, Map<String, String> mes
            , HttpSession session) {
        if ("admin".equals(username) && "123456".equals(password)) {
            session.setAttribute("loginUser",username);
            return "redirect:/main";
        } else {
            mes.put("msg", "账号密码不正确");
            return "index";
        }
    }
}
