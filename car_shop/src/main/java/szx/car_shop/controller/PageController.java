package szx.car_shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class PageController {
    @RequestMapping("login")
    public String login(){
        return "login";
    }

    @RequestMapping("car")
    public String car(){
        return "car";
    }
}
