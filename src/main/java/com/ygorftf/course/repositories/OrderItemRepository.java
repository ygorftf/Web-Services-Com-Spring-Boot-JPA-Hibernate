package com.ygorftf.course.repositories;

import com.ygorftf.course.entities.OrderItem;
import com.ygorftf.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
