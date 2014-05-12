package com.mallgo.service;

import com.mallgo.domain.Product;
import com.mallgo.persistence.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by kin on 5/11/14.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public Product getProductByName(String productId) {
        return productMapper.getProductByName(productId);
    }

    @Override
    @Transactional
    public void insertProduct(Product product) {
        productMapper.insertProduct(product);
    }

}
