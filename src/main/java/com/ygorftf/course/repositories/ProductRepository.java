package com.ygorftf.course.repositories;

import com.ygorftf.course.entities.Category;
import com.ygorftf.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
