package com.zy.springmvc.controller;

import com.zy.springmvc.entity.Form;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

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

//    @PostMapping("/apply")
//    @ResponseBody
//    public String apply(@RequestParam(value = "n",defaultValue = "ANON") String name, String course, Integer[] purpose){
//        System.out.println(name);
//        System.out.println(course);
//        for (Integer p : purpose) {
//            System.out.println(p);
//        }
//        return "SUCCESS";
//    }


//    @PostMapping("/apply")
//    @ResponseBody
//    public String apply(Form form){
//        return "SUCCESS";
//    }

    //使用map接收复合数据时，复合数据中只接收首个，会发生数据丢失
    @PostMapping("/apply")
    @ResponseBody
    public String apply(@RequestParam Map map){
        System.out.println(map);
        return "SUCCESS";
    }
}
