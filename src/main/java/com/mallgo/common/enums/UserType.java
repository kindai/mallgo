
package com.mallgo.common.enums;

import java.util.ArrayList;
import java.util.List;

public enum UserType implements EnumDomainValue {
    PROVIDER(1011L, "Provider", "Provider"),
    CUSTOMER(1012L, "Customer", "Customer"),
    ;
    private static List<UserType> list = new ArrayList<>();
    static{
        list.add(PROVIDER);
        list.add(CUSTOMER);
    }

    private static final Domain domain = Domain.USER_TYPE;

    private Long id;
    private String value;
    private String alias;
    private Long lowValue = null;
    private Long highValue = null;
    private Integer sortOrder = 0;
    private Boolean active = true;

    private UserType(Long id, String value, String alias) {
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

    public static UserType getById(Long id){
        return (UserType) EnumUtils.getById(id, list);
    }
    
    public static List<UserType> getList(){
        return list;
    }
}
