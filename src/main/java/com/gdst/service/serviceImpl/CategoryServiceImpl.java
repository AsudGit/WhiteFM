package com.gdst.service.serviceImpl;

import com.gdst.dao.CategoryMapper;
import com.gdst.pojo.Category;
import com.gdst.service.CategoryService;
import com.gdst.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 我的样子平平无奇 on 2018/12/20.
 */
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

    @Resource(name = "categoryMapper")
    private CategoryMapper categoryMapper;

    public List<Category> list() {
        return categoryMapper.list();
    }
}
