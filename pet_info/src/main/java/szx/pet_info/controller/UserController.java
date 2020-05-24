package szx.pet_info.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import szx.pet_info.entity.Pet;
import szx.pet_info.entity.User;
import szx.pet_info.service.IPetService;
import szx.pet_info.service.IUserService;

@Controller
@CrossOrigin
@RequestMapping("user")
public class UserController {
    @Autowired(required = false)
    private IUserService iUserService;
    @Autowired(required = false)
    private IPetService iPetService;

    @RequestMapping("login.html")
    public String tologin()
    {
        return "login";
    }

    @RequestMapping("login")
    public String login(String username, String password, Model model){
        User user = iUserService.login(username, password);
        if (user != null){
            System.out.println("1");
            return "redirect:pet-list.html";
        }else {
            System.out.println("2");
            model.addAttribute("error","账号或密码错误");
            return "forward:/login.html";
        }

    }

    @RequestMapping("pet-list.html")
    public String list(Model model){
        model.addAttribute("pets",iPetService.selectAllInfo());
        return "pet-list";
    }

    @RequestMapping("register.html")
    public String toRegister(){return "register";}

    @RequestMapping("register")
    public String register(String pet_name, String pet_type, String pet_age, String pet_number, String pet_img, Model model){
        String name=pet_name;
        String type=pet_type;
        String age=pet_age;
        String number=pet_number;
        String image=pet_img;
        System.out.println(name+type+age+number+image);
        return "pet-list";
    }
    @ResponseBody
    @RequestMapping(value = "checkNum" ,method = RequestMethod.POST)
    public Boolean checkNum(String pet_number){
        Pet pet = iPetService.selectByNum(pet_number);
        if (pet ==null){
            System.out.println("false");
            return false;
        }
        System.out.println("success");
        return true;
    }
}
