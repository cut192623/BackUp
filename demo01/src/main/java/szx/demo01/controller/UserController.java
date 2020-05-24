package szx.demo01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import szx.demo01.entity.User;
import szx.demo01.service.IUSerService;

@Controller
public class UserController {
    @Autowired
    private IUSerService userService;

    @RequestMapping("login.html")
    public String tologin(){

        return "login";
    }

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String login(String username, String password, Model model){
        User user=userService.login(username,password);
        if (user==null){
            model.addAttribute("error","账号或密码错误");
            return "login";
         }
        else{

            return "redirect:carlist";
        }
    }
}
