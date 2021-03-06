package com.mallgo.old.persistence;

import java.util.List;
import java.util.Map;

import com.mallgo.old.domain.Item;
import com.mallgo.old.domain.Item;

public interface ItemMapper {

  void updateInventoryQuantity(Map<String, Object> param);

  int getInventoryQuantity(String itemId);

  List<Item> getItemListByProduct(String productId);

  Item getItem(String itemId);

}
