package com.dstore.repository;

import com.dstore.entity.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubCategoryRepository extends JpaRepository<SubCategory, Long> {

    List<SubCategory> findBySubCategoryName(String name);

    List<SubCategory> findBySubCategoryDescription(String description);
}