package com.raiff.delo.DatabaseAdapter;

import com.raiff.delo.Model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Integer> {
    Order findByOrderId(Integer orderId);
}