package com.mallgo.old.persistence;

import java.util.List;

import com.mallgo.old.domain.Product;

public interface ProductMapper {

  List<Product> getProductListByCategory(String categoryId);

  Product getProductByName(String name);

  List<Product> searchProductList(String keywords);

  void insertProduct(Product product);

}
