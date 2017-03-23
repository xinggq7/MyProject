package com.yonyou.myproject.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xinggq on 17-3-23.
 */
//@RestController返回的都是字符串
@RestController
@RequestMapping("/Test")
public class Test {

    @RequestMapping("/hi")
    public String hi() {
        return "hi!s";
    }

    @RequestMapping("/nihao")
    public String nihao() {
        return "hi!ass";
    }

    //get请求，直接将hello后的内容作为name参数的值
    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name){
        return "hello "+name;
    }
    //post请求
    @RequestMapping(value = "/hi",method = RequestMethod.POST)
    public String hi(String name){
        return "hello "+name;
    }
}
