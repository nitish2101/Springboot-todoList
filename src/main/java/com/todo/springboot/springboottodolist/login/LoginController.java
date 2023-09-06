package com.todo.springboot.springboottodolist.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @RequestMapping("/login")
    public String loginJsp(){
        return "login";
    }

}
