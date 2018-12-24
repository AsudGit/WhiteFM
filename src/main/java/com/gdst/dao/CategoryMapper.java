package com.gdst.dao;

import com.gdst.pojo.Category;
import com.gdst.util.Page;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 我的样子平平无奇 on 2018/12/20.
 */

@Repository(value = "categoryMapper")
public interface CategoryMapper {
    public int add(Category category);

    public void delete(int id);

    public Category get(int id);

    public int update(Category category);

    public List<Category> list();

    public List<Category> list(Page page);

    public int total();
}
