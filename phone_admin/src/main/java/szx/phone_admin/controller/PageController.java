package szx.phone_admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import szx.phone_admin.entity.User;

import java.util.ArrayList;
import java.util.List;

/*
* 页面访问控制器
* */
@Controller
public class PageController {
    @RequestMapping("index.html")
    public String index(){

        return "index";
    }

    @RequestMapping("login.html")
    public String login(){

        return "login";
    }
    @RequestMapping("failed.html")
    public String failed(){

        return "failed";
    }
}
