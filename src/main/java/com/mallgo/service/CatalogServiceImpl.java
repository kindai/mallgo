package com.mallgo.service;

import java.util.List;

import com.mallgo.domain.Category;
import com.mallgo.domain.Item;
import com.mallgo.domain.Product;
import com.mallgo.persistence.CategoryMapper;
import com.mallgo.persistence.ItemMapper;
import com.mallgo.persistence.ProductMapper;
import com.mallgo.domain.Category;
import com.mallgo.domain.Item;
import com.mallgo.domain.Product;
import com.mallgo.persistence.CategoryMapper;
import com.mallgo.persistence.ItemMapper;
import com.mallgo.persistence.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogServiceImpl implements CatalogService {

  @Autowired
  private CategoryMapper categoryMapper;
  @Autowired
  private ItemMapper itemMapper;
  @Autowired
  private ProductMapper productMapper;

  @Override
  public List<Category> getCategoryList() {
    return categoryMapper.getCategoryList();
  }

  @Override
  public Category getCategory(String categoryId) {
    return categoryMapper.getCategory(categoryId);
  }

  @Override
  public Product getProductByName(String name) {
    return productMapper.getProductByName(name);
  }

  @Override
  public List<Product> getProductListByCategory(String categoryId) {
    return productMapper.getProductListByCategory(categoryId);
  }

  // TODO enable using more than one keyword
  @Override
  public List<Product> searchProductList(String keyword) {
    return productMapper.searchProductList("%" + keyword.toLowerCase() + "%");
  }

  @Override
  public List<Item> getItemListByProduct(String productId) {
    return itemMapper.getItemListByProduct(productId);
  }

  @Override
  public Item getItem(String itemId) {
    return itemMapper.getItem(itemId);
  }

  @Override
  public boolean isItemInStock(String itemId) {
    return itemMapper.getInventoryQuantity(itemId) > 0;
  }
}