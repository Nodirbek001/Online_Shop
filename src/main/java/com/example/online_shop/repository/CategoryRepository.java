package com.example.online_shop.repository;

import com.example.online_shop.enytity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
