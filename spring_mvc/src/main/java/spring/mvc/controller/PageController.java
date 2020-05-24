package spring.mvc.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")

public class PageController {
    @RequestMapping("index")
        public String index(){
            System.out.println("访问index页面");
            return "index";

        }
        @RequestMapping("login")
        public String login(){
            return "login";
        }
        @RequestMapping("test")
        public String test(){
            return "test";
        }

    @RequestMapping("upload")
    public String upload(){
        return "upload";
    }

}
