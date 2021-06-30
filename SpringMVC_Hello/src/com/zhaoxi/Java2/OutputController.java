package com.zhaoxi.Java2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @author shkstart
 * @create2021-01-1716:22
 */
//测试数据输出
@Controller
public class OutputController {
    //通过map传递参数
    @RequestMapping("/map")
    public String mapOutput(Map<String,String> map){
        //给map传值
        map.put("msg","map中的参数");
        map.put("haha","哈哈");
        return "success";
    }
    //通过model传递参数
    @RequestMapping("/model")
    public String model(Model model){
        //给map传值
        model.addAttribute("msg","model中的参数");
        return "success";
    }
    //通过modelMap传递参数
    @RequestMapping("/modelMap")
    public String modelMap(ModelMap modelMap){
        //给map传值
        modelMap.addAttribute("msg","modelMap中的数据");
        return "success";
    }

    //返回值类型可以是ModelAndView
    @RequestMapping("/modelAndView")
    public ModelAndView modelAndView(){
        //创建modelAndView对象

        ModelAndView mv = new ModelAndView("success");
        mv.addObject("msg","modelAndView中的数据");
        return mv;
    }
}
