package com.ygorftf.course.repositories;

import com.ygorftf.course.entities.Order;
import com.ygorftf.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
