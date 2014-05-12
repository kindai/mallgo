package com.mallgo.common.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kin on 5/12/14.
 */
public enum ProductType implements EnumDomainValue{
    PRODUCT(35010L, "Product", "Product"),
    SERVICE(35011L, "Service", "Service"),
    ;
    private static List<ProductType> list = new ArrayList<>();
    static{
        list.add(PRODUCT);
        list.add(SERVICE);
    }

    private static final Domain domain = Domain.USER_TYPE;

    private Long id;
    private String value;
    private String alias;
    private Long lowValue = null;
    private Long highValue = null;
    private Integer sortOrder = 0;
    private Boolean active = true;

    private ProductType(Long id, String value, String alias) {
        this.id = id;
        this.value = value;
        this.alias= alias;
    }

    public Long getId() {
        return id;
    }

    public Domain getDomain() {
        return domain;
    }

    public String getValue() {
        return value;
    }

    public String getAlias() {
        return alias;
    }

    public static ProductType getById(Long id){
        return (ProductType) EnumUtils.getById(id, list);
    }

    public static List<ProductType> getList(){
        return list;
    }
}
