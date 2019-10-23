package com.lfb.springboot.controller;

import com.lfb.springboot.domain.User;
import com.lfb.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @author lufeibin
 * @description: TODO
 * @date 2019/10/21 15:23
 */

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public String login(User user){

        System.out.println(user);
        User loginuser = userService.login(user);
        System.out.println(loginuser);
        return "index";
    }

    @RequestMapping("reg")
    public String register(User user, Map<String,String> msg, Model model){

        User registerUser = userService.findUserByUsername(user.getUsername());
        if(registerUser != null){
            msg.put("register","用户名已存在");
        }else {
            msg.put("register","注册成功");
        }
        model.addAttribute("msg",msg);
        return "index";

    }
}
