package com.everyday.dao;

import com.everyday.models.Category;

import java.util.List;

public interface RetailDao{
    void addCategory(Category category);
    List<Category> getAllCategories();
    Category getCategoryById(long categoryId);
    boolean deleteCategory(long categoryId);
    Category updateCategory(Category category);

}
