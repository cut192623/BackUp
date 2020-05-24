package szx.demo01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import szx.demo01.service.ICarService;

@Controller

public class CarController {
    @Autowired
    private ICarService carService;
    @RequestMapping("carlist")
    public String list(Model model){
        model.addAttribute("cars",carService.selectAll());
        return "cars" ;
    }

    @RequestMapping("buy")
    @ResponseBody
    public String buy(Integer carId){
        try {
            carService.updateById(carId);
            return "success";
        }catch (Exception e){
            e.printStackTrace();
            return "failed";
        }

    }
}
