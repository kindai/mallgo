package com.mallgo.old.persistence;

import java.util.List;

import com.mallgo.old.domain.LineItem;
import com.mallgo.old.domain.LineItem;

public interface LineItemMapper {

  List<LineItem> getLineItemsByOrderId(int orderId);

  void insertLineItem(LineItem lineItem);

}
