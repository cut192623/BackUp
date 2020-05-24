package szx.car_shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import szx.car_shop.entity.User;
import szx.car_shop.service.IUserService;



@Controller
@RequestMapping("user")
public class UserController {
    @Autowired(required = false)
    private IUserService userService;


    @RequestMapping("login")
    public String login(String username, String Password, Model model){

       // System.out.println(username+Password);
        User user= userService.selectByUser(username, Password);
        if (user!=null){

            System.out.println(user);
            return "redirect:http://localhost:8080/car";
        }
        else{
            model.addAttribute("error","账号或密码错误");
            return "login";
        }

        // model.addAttribute("error","账号或密码错误");
    }


}
