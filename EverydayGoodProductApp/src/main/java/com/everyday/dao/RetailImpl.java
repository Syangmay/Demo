package com.everyday.dao;

import com.everyday.helpers.PostgresConnHelper;
import com.everyday.models.Category;

import java.sql.Connection;
import java.util.List;

public class RetailImpl implements  RetailDao {
    private Connection conn;
    public RetailImpl(){
        conn = PostgresConnHelper.getConnection();
        System.out.println("Connection Created");
    }

    @Override
    public void addCategory(Category category) {

    }

    @Override
    public List<Category> getAllCategories() {
        return null;
    }

    @Override
    public Category getCategoryById(long categoryId) {
        return null;
    }

    @Override
    public boolean deleteCategory(long categoryId) {
        return false;
    }

    @Override
    public Category updateCategory(Category category) {
        return null;
    }
}
