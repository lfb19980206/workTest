package com.lfb.springboot.controller;

import com.lfb.springboot.domain.Test;
import com.lfb.springboot.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/findById")
    public String findById(int id,Model model){
        Test test = testService.findTestById(id);
        model.addAttribute("test",test);
        return "";
    }

    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Test> tests = testService.findAllTest();
        model.addAttribute("tests",tests);
        return "";
    }

    @RequestMapping("/add")
    public String add(String content,String answer){
        testService.addTest(content,answer);
        return "";
    }

    @RequestMapping("/delete")
    public String delete(int id){
        testService.deleteTest(id);
        return "";
    }

    @RequestMapping("/update")
    public String update(Test test){
        testService.updateTest(test);
        return "";
    }

}
