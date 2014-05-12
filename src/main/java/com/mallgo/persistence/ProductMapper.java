package com.mallgo.persistence;

import java.util.List;

import com.mallgo.domain.Product;
import org.apache.ibatis.annotations.Select;

public interface ProductMapper {

  List<Product> getProductListByCategory(String categoryId);

  Product getProductByName(String name);

  List<Product> searchProductList(String keywords);

  void insertProduct(Product product);

}
