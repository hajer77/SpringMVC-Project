package com.springMVC.web.repository;

import com.springMVC.web.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category,Long> {


    Optional<Category> findByName(String url);
}
