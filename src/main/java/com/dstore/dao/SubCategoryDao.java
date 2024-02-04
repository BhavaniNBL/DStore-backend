package com.dstore.dao;

import com.dstore.entity.SubCategory;

import java.util.List;

public interface SubCategoryDao {
    SubCategory save(SubCategory subCategory);

    List<SubCategory> findAllSubCategories();

    SubCategory findSubCategoryByName(String name);

    void deleteSubCategory(Long id);
}