package co.in28minutes.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @RequestMapping("/login")
    //@ResponseBody
    //public String loginMessage(){
    public String loginMessage(@RequestParam String name, ModelMap model){
        //return "Hello World";
        model.put("name", name);
        return "login";
    }
}
