package com.todo.springboot.springboottodolist.login;

import com.todo.springboot.springboottodolist.AuthenticationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value="/login",method = RequestMethod.GET)
    public String loginJsp(){
        return "login";
    }

    @RequestMapping(value="/login",method = RequestMethod.POST)
    public String goToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model){
        if(authenticationService.authenticate(name, password)) {
            model.put("name", name);
            return "welcome";
        }
        model.put("errorMessage","Invalid Username or Pasword");
        return "login";
    }
}
