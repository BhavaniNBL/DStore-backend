package com.dstore.repository;

import com.dstore.entity.Category;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    List<Category> findByCategoryName(String name);

    List<Category> findByCategoryDescription(String description);
}