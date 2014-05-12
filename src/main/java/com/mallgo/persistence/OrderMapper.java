package com.mallgo.persistence;

import java.util.List;

import com.mallgo.domain.Order;
import com.mallgo.domain.Order;

public interface OrderMapper {

  List<Order> getOrdersByUsername(String username);

  Order getOrder(int orderId);
  
  void insertOrder(Order order);
  
  void insertOrderStatus(Order order);

}
