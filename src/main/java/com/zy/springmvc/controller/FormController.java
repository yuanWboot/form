package com.zy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FormController {
//    @PostMapping("/apply")
//    @ResponseBody
//    public String apply(String name,String course,Integer[] purpose){
//        System.out.println(name);
//        System.out.println(course);
//        for (Integer p : purpose) {
//            System.out.println(p);
//        }
//        return "SUCCESS";
//    }

    @PostMapping("/apply")
    @ResponseBody
    public String apply(@RequestParam(value = "n",defaultValue = "ANON") String name, String course, Integer[] purpose){
        System.out.println(name);
        System.out.println(course);
        for (Integer p : purpose) {
            System.out.println(p);
        }
        return "SUCCESS";
    }
}
