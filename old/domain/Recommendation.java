package com.mallgo.old.domain;

import java.io.Serializable;

/**
 * Created by kin on 5/12/14.
 */
public class Recommendation extends AuditableEntity implements Serializable {

    private static final long serialVersionUID = -7492639256670189893L;

    Product fromProduct;
    Product toProduct;

    public Product getFromProduct() {
        return fromProduct;
    }

    public void setFromProduct(Product fromProduct) {
        this.fromProduct = fromProduct;
    }

    public Product getToProduct() {
        return toProduct;
    }

    public void setToProduct(Product toProduct) {
        this.toProduct = toProduct;
    }

}
