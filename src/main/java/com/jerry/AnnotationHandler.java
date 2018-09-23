package com.jerry;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class AnnotationHandler {


    /**
     * 业务方法：ModeLAndView完成数据的传递，以及视图的解析
     */
    @RequestMapping("/modelAndViewTest")
    public ModelAndView modelAndViewTest(){
        //创建ModelAndView对象
        ModelAndView modelAndView = new ModelAndView();
        //填充模型数据
        modelAndView.addObject("name","tom");
        //设置逻辑视图
        modelAndView.setViewName("show");

        return modelAndView;

    }

    /**
     * 业务方法:Model传值,String进行视图解析
     */
    @RequestMapping("/ModelTest")
    public String ModelTest(Model model){
        //填充模型数据
        model.addAttribute("name","jerry");
        //设置逻辑视图
        return "show";
    }


    /**
     * 业务方法：Map传值，String进行视图解析
     */
    @RequestMapping("/MapTest")
    public String MapTest(Map<String,String> map){

        //填充模型数据
        map.put("name","jerry");
        //设置逻辑视图
        return  "show";
    }



}
