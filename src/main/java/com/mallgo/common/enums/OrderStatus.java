package com.mallgo.common.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kin on 5/12/14.
 */
public enum OrderStatus implements EnumDomainValue {
    PENDPAY(31010L, "PendPay", "PendPay"),
    PAID(30011L, "Paid", "Paid"),
    SHIPPED(30012L, "Shipped", "Shipped"),
    RECEIVED(30014L, "Received", "Received"),
    USED(30015L, "Used", "Used"),
    COMMENTED(30016L, "Commented", "Commented"),
    ASKEDREFUND(30017L, "Askedrefund", "Askedrefund"),
    REFUNDED(30018L, "Returned", "Returned"),
    CLOSED(30019L, "Closed", "Closed"),
    ;
    private static List<OrderStatus> list = new ArrayList<>();
    static{
        list.add(PENDPAY);
        list.add(PAID);
        list.add(SHIPPED);
        list.add(RECEIVED);
        list.add(USED);
        list.add(COMMENTED);
        list.add(ASKEDREFUND);
        list.add(REFUNDED);
        list.add(CLOSED);
    }

    private static final Domain domain = Domain.USER_STATUS;

    private Long id;
    private String value;
    private String alias;
    private Long lowValue = null;
    private Long highValue = null;
    private Integer sortOrder = 0;
    private Boolean active = true;

    private OrderStatus(Long id, String value, String alias) {
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

    public static OrderStatus getById(Long id){
        return (OrderStatus) EnumUtils.getById(id, list);
    }

    public static List<OrderStatus> getList(){
        return list;
    }
}
