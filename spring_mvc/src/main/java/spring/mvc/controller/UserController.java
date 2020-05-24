package spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import spring.mvc.entity.UserInfo;
import spring.mvc.service.IUserService;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 用户控制器
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService service;
    @RequestMapping("login")
    public  String login(String name,String password,Model model){
        UserInfo user = service.login(name,password);
        if (user==null){

            model.addAttribute("error","error");
            return "login";
        }
        return "redirect:list";
    }
    @RequestMapping("list")
    public String list(Model model){
        List<UserInfo> users=service.query();
        model.addAttribute("users",users);
        return "list";
    }

    @RequestMapping("add")
    public String add(UserInfo user, @RequestParam(value = "pic" ,required = false) CommonsMultipartFile file) {
        String suffix = null;
        if (file != null) {
            String filename = file.getOriginalFilename();
            suffix = filename.substring(filename.lastIndexOf("."));
            File uploadfile = new File("E:\\upload\\" + System.currentTimeMillis() + suffix);
            user.setPicture(filename);
            System.out.println(" saved:"+user+filename);
            try {
                file.transferTo(uploadfile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return "list";
    }
//    //RequestMapping是配置URL index---> http://localhost:8080/springmvc/index
//    @RequestMapping("login")
//        public String login(HttpServletRequest request){
//            String name=request.getParameter("name");
//            System.out.println(name);
//            return "login";
//        //返回的index字符串，交给视图解析器处理：前缀+字符串+后缀--->/WEB-INF/jsp/index.jsp
//
//    }
//    @RequestMapping("login2")
//    public String login2(String name,String password){
//        System.out.println(name+"  "+password);
//        return "login";
//    }
//
//    @RequestMapping("login3")
//    public String login3(@RequestParam("name")String User,@RequestParam("password")String pass){
//        System.out.println(User+"   "+pass);
//
//        return "login";
//    }
//    @RequestMapping("login4")
//    public String login4(UserInfo info){
//
//       // System.out.println(info);
//        return "forward:list1";
//    }
//
//    @RequestMapping("list1")
//    public String list(HttpServletRequest request){
//
//
//        request.setAttribute("users",users);
//        //System.out.println(users);
//        return "list";
//    }
}