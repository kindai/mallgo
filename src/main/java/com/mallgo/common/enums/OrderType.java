package com.mallgo.common.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kin on 5/12/14.
 */
public enum OrderType implements EnumDomainValue {
    PRODUCT(34010L, "Product", "Product"),
    SERVICE(34011L, "Service", "Service"),
    ;
    private static List<OrderType> list = new ArrayList<>();
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

    private OrderType(Long id, String value, String alias) {
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

    public static OrderType getById(Long id){
        return (OrderType) EnumUtils.getById(id, list);
    }

    public static List<OrderType> getList(){
        return list;
    }
}
