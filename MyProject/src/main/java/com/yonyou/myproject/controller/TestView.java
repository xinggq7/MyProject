package com.yonyou.myproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Created by xinggq on 17-3-23.
 */

/**
 * @Controller返回的会进行模板渲染
 * 必要条件：
 * 1.在pom文件中加入依赖包
 * 2.在main/resource/templates路径下添加相关的模板文件（html）
 */

@Controller
@RequestMapping("/TestView")
public class TestView {

    @RequestMapping("/hi")

    public String hi(){
        return "hi";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
