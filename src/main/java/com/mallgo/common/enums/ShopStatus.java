package com.mallgo.common.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kin on 5/12/14.
 */
public enum ShopStatus implements EnumDomainValue {
    PENDING(30010L, "Pending", "Pending"),
    ENABLED(30012L, "Enabled", "Enabled"),
    DISABLED(30013L, "Disabled", "Disabled"),
    DELETED(30014L, "Deleted", "Deleted"),
    ;
    private static List<ShopStatus> list = new ArrayList<>();
    static{
        list.add(PENDING);
        list.add(ENABLED);
        list.add(DISABLED);
        list.add(DELETED);
    }

    private static final Domain domain = Domain.USER_STATUS;

    private Long id;
    private String value;
    private String alias;
    private Long lowValue = null;
    private Long highValue = null;
    private Integer sortOrder = 0;
    private Boolean active = true;

    private ShopStatus(Long id, String value, String alias) {
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

    public static ShopStatus getById(Long id){
        return (ShopStatus) EnumUtils.getById(id, list);
    }

    public static List<ShopStatus> getList(){
        return list;
    }
}
