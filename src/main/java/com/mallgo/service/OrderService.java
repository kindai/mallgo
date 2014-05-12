package com.mallgo.service;

import com.mallgo.domain.Order;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by kin on 5/12/14.
 */
public interface OrderService {
    @Transactional
    void insertOrder(Order order);

    @Transactional
    Order getOrder(int orderId);

    List<Order> getOrdersByUsername(String username);

    int getNextId(String name);
}
