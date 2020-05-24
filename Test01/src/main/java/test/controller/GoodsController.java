package test.controller;

import org.springframework.web.bind.annotation.RequestMethod;
import test.entity.GoodsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import test.service.GoodsServiceImpl;
import test.service.IGoodsService;
import test.util.MockData;

import java.util.List;

@Controller
@RequestMapping(value = "goods")
public class GoodsController {

    @Autowired
    private IGoodsService goodsService;

    // xx...:8080/goods/list
    @RequestMapping("list")
    public String list(Model model){
        List<GoodsEntity> goodsList = goodsService.findAll();
        //将数据添加到模型中
        model.addAttribute("goodsEntities",goodsList);
        //返回视图名称
        return "goodslist";

    }
    @RequestMapping("index")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "add")
    public  String add(){

        return "add";
    }
    @RequestMapping(value = "add2")
    public  String add2(GoodsEntity goodsEntity){
        goodsService.add(goodsEntity);
        return "redirect:list";
    }

    @RequestMapping("delete")
    public String delete(Model model,Long goodsId){
        GoodsEntity goods=goodsService.findById(goodsId);
        goodsService.remove(goods.getId());
        return "redirect:list";
    }


    @RequestMapping("update")
    public String update(Model model,Long goodsId){
        GoodsEntity goods=goodsService.findById(goodsId);
        model.addAttribute("goods",goods);
        return "update";
    }

    @RequestMapping("update2")
    public String update2(GoodsEntity goodsEntity){
        goodsService.modify(goodsEntity);
        return "redirect:list";
    }
}

