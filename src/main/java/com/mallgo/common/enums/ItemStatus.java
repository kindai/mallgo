package com.mallgo.common.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kin on 5/12/14.
 */
public enum ItemStatus implements EnumDomainValue {
    INSTOCK(33010L, "InStock", "InStock"),
    OUTOFSTOCK(33011L, "OutOfStock", "OutOfStock"),
    ;
    private static List<ItemStatus> list = new ArrayList<>();
    static{
        list.add(INSTOCK);
        list.add(OUTOFSTOCK);
    }

    private static final Domain domain = Domain.USER_STATUS;

    private Long id;
    private String value;
    private String alias;
    private Long lowValue = null;
    private Long highValue = null;
    private Integer sortOrder = 0;
    private Boolean active = true;

    private ItemStatus(Long id, String value, String alias) {
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

    public static ItemStatus getById(Long id){
        return (ItemStatus) EnumUtils.getById(id, list);
    }

    public static List<ItemStatus> getList(){
        return list;
    }
}
