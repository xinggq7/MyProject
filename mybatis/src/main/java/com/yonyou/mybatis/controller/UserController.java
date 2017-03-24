package com.yonyou.mybatis.controller;

import com.yonyou.mybatis.entity.User;
import com.yonyou.mybatis.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Created by xinggq on 17-3-24.
 */


/**
 * @Controller返回的是字符串匹配的模板与HTNL页面结合使用
 * @RestController返回的是一个对象的json字符串
 */
@RestController

@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    /*****************这样的叫做restful风格，或者restful规范*****************/
    @RequestMapping("/selectById/{id}")
    public User selectById(@PathVariable("id") String id){
        User user = userService.selectById(id);
        return user;
    }

    @RequestMapping("/selectByName/{name}")
    public User selectByName(@PathVariable("name") String name){
        User user = userService.selectByName(name);
        return user;
    }
    /********************************************************************/



    @RequestMapping("/selectAll")
    public List<User> selectAll(){
        List<User> list = userService.selectAll();
        return list;
    }



    /*****************下面两个方法的请求url是一样的，通过请求是post方式环视get方式来确定调用哪个方法*****************/
    /*****************这样的叫做restful风格，或者restful规范*****************/
    @RequestMapping(value = "/hi",method = RequestMethod.POST)
    public void hi(){
        System.out.print("post");
    }

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public void hello(){
        System.out.print("get");
    }
    /*********************************************************************************************************/


    /*****************@PathVariable @RequestParam @RequestBody的区别和用法*************************************/
    @RequestMapping(value = "/{a}/{b}/{c}",method = RequestMethod.POST)
    public void byby(@PathVariable("a") String a,@PathVariable("b") String b,@PathVariable("c") String c){
        //@PathVariable从url中获取参数
        //@RequestParam和@RequestBody是获取由浏览器post提交的参数
    }
    /*********************************************************************************************************/

    @RequestMapping(value="/header")
    public void header(@RequestHeader("Host") String host){
        System.out.print(host);
    }
}
