package spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import spring.mvc.entity.UserInfo;

@Controller
@RequestMapping("test")
public class TestController {

    @RequestMapping("test1")
    public String test(){

        return "index";

    }



}
