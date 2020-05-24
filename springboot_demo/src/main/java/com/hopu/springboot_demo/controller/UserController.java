package com.hopu.springboot_demo.controller;

import com.hopu.springboot_demo.entity.JsonResult;
import com.hopu.springboot_demo.entity.Page;
import com.hopu.springboot_demo.entity.User;
import com.hopu.springboot_demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
@CrossOrigin
public class UserController {

    @RequestMapping("hello")
    @ResponseBody
    public String test(){
        return "Hello SpringBoot!";
    }

    @Autowired
    private IUserService userService;

    //    @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public JsonResult list(){
        try {
            List<User> users = userService.selectAll();
            return new JsonResult(200,"success",users);
        }catch (Exception ex){
            ex.printStackTrace();
            return new JsonResult(500,"failed",ex.getMessage());
        }
    }

    //GetMapping中的{名称}对应PathVariable中的名称，将url最后的值传入到int id参数中
    @GetMapping("{id}")
    //@PathVariable("id")用于配置参数，用于获得/user/1 格式的参数值
    public JsonResult findOne(@PathVariable("id")int id){
        try {
            User user = userService.selectById(id);
            return new JsonResult(200,"success",user);
        }catch (Exception ex){
            ex.printStackTrace();
            return new JsonResult(500,"failed",ex.getMessage());
        }
    }

    @PostMapping
    //@RequestBody的作用是帮助从前段json参数中读取数据，绑定到java对象中
    public JsonResult addUser(@RequestBody User user){
        try {
            userService.insert(user);
            return new JsonResult(200,"success","");
        }catch (Exception ex){
            ex.printStackTrace();
            return new JsonResult(500,"failed",ex.getMessage());
        }
    }

    @PutMapping
    public JsonResult updateUser(@RequestBody User user){
        try {
            userService.update(user);
            return new JsonResult(200,"success","");
        }catch (Exception ex){
            ex.printStackTrace();
            return new JsonResult(500,"failed",ex.getMessage());
        }
    }

    @DeleteMapping("{id}")
    public JsonResult deleteUser(@PathVariable("id")int id){
        try {
            userService.delete(id);
            return new JsonResult(200,"success","");
        }catch (Exception ex){
            ex.printStackTrace();
            return new JsonResult(500,"failed",ex.getMessage());
        }
    }

    @GetMapping("page/{pageNo}")
    //@PathVariable("id")用于配置参数，用于获取/user/1格式的参数值
    public  JsonResult findPage(@PathVariable("pageNo")int pageNo){
        try{
            if (pageNo<=0){
                return  new JsonResult(500,"failed","页数不能小于等于0");
            }
            Page<User> userPage = userService.selectPage(pageNo);
            return  new JsonResult(200,"success",userPage);
        } catch (Exception e) {
            e.printStackTrace();
            return  new JsonResult(500,"failed",e.getMessage());
        }
    }
}