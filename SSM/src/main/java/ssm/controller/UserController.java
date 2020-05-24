package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ssm.entity.JsonResult;
import ssm.entity.UserInfo;
import ssm.service.IUserService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    //    @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public JsonResult list(){
        try {
            List<UserInfo> users = userService.selectAll();
            return new JsonResult(200,"success",users);
        }catch (Exception ex){
            ex.printStackTrace();
            return new JsonResult(500,"failed",ex.getMessage());
        }
    }

    //GetMapping中的{名称}对应PathVariable中的名称，将url最后的值传入到int id参数中
    @GetMapping("{name}")
    //@PathVariable("id")用于配置参数，用于获得/user/1 格式的参数值
    public JsonResult findOne(@PathVariable("name")String name){
        try {
            UserInfo user = userService.selectByName(name);
            return new JsonResult(200,"success",user);
        }catch (Exception ex){
            ex.printStackTrace();
            return new JsonResult(500,"failed",ex.getMessage());
        }
    }

    @PostMapping
    public JsonResult addUser(@RequestBody  UserInfo user){
        try {
            userService.insert(user);
            return new JsonResult(200,"success","");
        }catch (Exception ex){
            ex.printStackTrace();
            return new JsonResult(500,"failed",ex.getMessage());
        }
    }

    @PutMapping
    public JsonResult updateUser(@RequestBody UserInfo user){
        try {
            userService.update(user);
            return new JsonResult(200,"success","");
        }catch (Exception ex){
            ex.printStackTrace();
            return new JsonResult(500,"failed",ex.getMessage());
        }
    }

    @DeleteMapping("{name}")
    public JsonResult deleteUser(@PathVariable("name")String name){
        try {
            userService.delete(name);
            return new JsonResult(200,"success","");
        }catch (Exception ex){
            ex.printStackTrace();
            return new JsonResult(500,"failed",ex.getMessage());
        }
    }
}
