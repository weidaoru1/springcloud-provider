package com.springcloud.controller;

import com.springcloud.model.User;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @RequestMapping("/provider/test")
    public String providerTest(){
        JSONObject json = new JSONObject();
        json.put("success",1);
        System.out.println("==========provider========");
        json.put("msg","嗨，provider,我是消息提供者");
        return json.toString();
    }

    @GetMapping("/provider/user")
    public User user(){
        User user = new User();
        user.setId(10086);
        user.setName("中国移动");
        return user;
    }

    @GetMapping("/provider/getUser")
    public User getUser(@RequestParam("id") Integer id,@RequestParam("name") String name){
        User user = new User();
        user.setId(id);
        user.setName(name);
        return user;
    }
    @PostMapping("/provider/addUser")
    public User addUser(@RequestParam("id") Integer id, @RequestParam("name") String name){
        User user = new User();
        user.setId(id);
        user.setName(name);
        return user;
    }
    @PutMapping("/provider/updateUser")
    public User updateUser(@RequestParam("id") Integer id, @RequestParam("name") String name){
        User user = new User();
        user.setId(id);
        user.setName(name);
        return user;
    }
    @DeleteMapping("/provider/deleteUser")
    public User deleteUser(@RequestParam("id") Integer id, @RequestParam("name") String name){
        User user = new User();
        user.setId(id);
        user.setName(name);
        return user;
    }
    @RequestMapping("/provider/hello/test")
    public String hello(){
        JSONObject json = new JSONObject();
        json.put("success",1);
        System.out.println("==========provider========");
        json.put("msg","hello，provider,我是消息提供者");
        return json.toString();
    }
}
