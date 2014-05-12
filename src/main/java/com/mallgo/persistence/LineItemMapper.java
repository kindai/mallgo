package com.mallgo.persistence;

import java.util.List;

import com.mallgo.domain.LineItem;
import com.mallgo.domain.LineItem;

public interface LineItemMapper {

  List<LineItem> getLineItemsByOrderId(int orderId);

  void insertLineItem(LineItem lineItem);

}
