package com.ygorftf.course.repositories;

import com.ygorftf.course.entities.Category;
import com.ygorftf.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
