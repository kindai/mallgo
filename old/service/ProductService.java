package com.mallgo.old.service;

import com.mallgo.old.domain.Product;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by kin on 5/12/14.
 */
public interface ProductService {

    Product getProductByName(String productId);

    @Transactional
    void insertProduct(Product product);
}
