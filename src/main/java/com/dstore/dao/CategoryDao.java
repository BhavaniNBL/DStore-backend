package com.dstore.dao;

import com.dstore.entity.Category;

import java.util.List;

public interface CategoryDao  {
    Category save(Category category);

    List<Category> findAllCategories();

    Category findCategoryByName(String name);

    void deleteCategory(Long id);
}