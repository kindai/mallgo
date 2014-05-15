package com.mallgo.old.persistence;

import java.util.List;

import com.mallgo.old.domain.Order;
import com.mallgo.old.domain.Order;

public interface OrderMapper {

  List<Order> getOrdersByUsername(String username);

  Order getOrder(int orderId);
  
  void insertOrder(Order order);
  
  void insertOrderStatus(Order order);

}
