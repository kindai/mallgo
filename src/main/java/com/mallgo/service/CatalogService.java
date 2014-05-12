package com.mallgo.service;

import com.mallgo.domain.Category;
import com.mallgo.domain.Item;
import com.mallgo.domain.Product;

import java.util.List;

/**
 * Created by kin on 5/12/14.
 */
public interface CatalogService {
    List<Category> getCategoryList();

    Category getCategory(String categoryId);

    Product getProductByName(String name);

    List<Product> getProductListByCategory(String categoryId);

    // TODO enable using more than one keyword
    List<Product> searchProductList(String keyword);

    List<Item> getItemListByProduct(String productId);

    Item getItem(String itemId);

    boolean isItemInStock(String itemId);
}
