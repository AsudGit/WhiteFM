package com.gdst.controller;

import com.gdst.pojo.Category;
import com.gdst.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 我的样子平平无奇 on 2018/12/20.
 */
@Controller
@RequestMapping("")
public class CategoryController {
    @Resource(name = "categoryService")
    private CategoryService categoryService;

    @RequestMapping("/indss")
    public ModelAndView in(){
        return new ModelAndView("index");
    }

    @RequestMapping("/listCategory")
    public ModelAndView listCategory(){
        ModelAndView mav = new ModelAndView();
        List<Category> cs= categoryService.list();

        // 放入转发参数
        mav.addObject("cs", cs);
        // 放入jsp路径
        mav.setViewName("index");
        return mav;
    }
}
