package com.mallgo.old.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mallgo.old.domain.Item;
import com.mallgo.old.domain.LineItem;
import com.mallgo.old.domain.Order;
import com.mallgo.old.persistence.ItemMapper;
import com.mallgo.old.persistence.LineItemMapper;
import com.mallgo.old.persistence.OrderMapper;
import com.mallgo.old.persistence.SequenceMapper;
import com.mallgo.old.domain.Item;
import com.mallgo.old.domain.LineItem;
import com.mallgo.old.domain.Order;
import com.mallgo.old.domain.Sequence;
import com.mallgo.old.persistence.ItemMapper;
import com.mallgo.old.persistence.LineItemMapper;
import com.mallgo.old.persistence.OrderMapper;
import com.mallgo.old.persistence.SequenceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderServiceImpl implements OrderService {

  @Autowired
  private ItemMapper itemMapper;
  @Autowired
  private OrderMapper orderMapper;
  @Autowired
  private SequenceMapper sequenceMapper;
  @Autowired
  private LineItemMapper lineItemMapper;

  @Override
  @Transactional
  public void insertOrder(Order order) {
    order.setOrderId(getNextId("ordernum"));
    for (int i = 0; i < order.getLineItems().size(); i++) {
      LineItem lineItem = (LineItem) order.getLineItems().get(i);
      String itemId = lineItem.getItemId();
      Integer increment = new Integer(lineItem.getQuantity());
      Map<String, Object> param = new HashMap<String, Object>(2);
      param.put("itemId", itemId);
      param.put("increment", increment);
      itemMapper.updateInventoryQuantity(param);
    }

    orderMapper.insertOrder(order);
    orderMapper.insertOrderStatus(order);
    for (int i = 0; i < order.getLineItems().size(); i++) {
      LineItem lineItem = (LineItem) order.getLineItems().get(i);
      lineItem.setOrderId(order.getOrderId());
      lineItemMapper.insertLineItem(lineItem);
    }
  }

  @Override
  @Transactional
  public Order getOrder(int orderId) {
    Order order = orderMapper.getOrder(orderId);
    order.setLineItems(lineItemMapper.getLineItemsByOrderId(orderId));

    for (int i = 0; i < order.getLineItems().size(); i++) {
      LineItem lineItem = (LineItem) order.getLineItems().get(i);
      Item item = itemMapper.getItem(lineItem.getItemId());
      item.setQuantity(itemMapper.getInventoryQuantity(lineItem.getItemId()));
      lineItem.setItem(item);
    }

    return order;
  }

  @Override
  public List<Order> getOrdersByUsername(String username) {
    return orderMapper.getOrdersByUsername(username);
  }

  @Override
  public int getNextId(String name) {
    Sequence sequence = new Sequence(name, -1);
    sequence = (Sequence) sequenceMapper.getSequence(sequence);
    if (sequence == null) {
      throw new RuntimeException("Error: A null sequence was returned from the database (could not get next " + name
          + " sequence).");
    }
    Sequence parameterObject = new Sequence(name, sequence.getNextId() + 1);
    sequenceMapper.updateSequence(parameterObject);
    return sequence.getNextId();
  }

}
