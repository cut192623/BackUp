package szx.car_shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import szx.car_shop.entity.Car;
import szx.car_shop.entity.JsonResult;
import szx.car_shop.service.ICarService;
import szx.car_shop.service.IUserService;

import java.util.List;

@Controller
@ResponseBody
@CrossOrigin
@RequestMapping("list")
public class CarController {
    @Autowired(required = false)
    private ICarService carService;

    @GetMapping
    public JsonResult list(){
        try {
            List<Car> users = carService.selectAll();
            return new JsonResult(200,"success",users);
        }catch (Exception ex){
            ex.printStackTrace();
            return new JsonResult(500,"failed",ex.getMessage());
        }
    }

    @GetMapping("{carId}")
    public JsonResult findOne(@PathVariable("carId")Integer carId){
        try {
            Car car = carService.selectById(carId);
            return new JsonResult(200,"success",car);
        }catch (Exception ex){
            ex.printStackTrace();
            return new JsonResult(500,"failed",ex.getMessage());
        }
    }

    @PutMapping
    public JsonResult updateOne(@RequestBody Car car){
        try {
            carService.updateById(car);
            return new JsonResult(200,"success","");
        }catch (Exception ex){
            ex.printStackTrace();
            return new JsonResult(500,"failed",ex.getMessage());
        }
    }
}
