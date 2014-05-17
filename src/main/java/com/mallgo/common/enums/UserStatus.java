
package com.mallgo.common.enums;

import java.util.ArrayList;
import java.util.List;

public enum UserStatus implements EnumDomainValue {
    ENABLED(29012L, "Enabled", "Enabled"),
    DISABLED(29013L, "Disabled", "Disabled"),
    DELETED(29014L, "Deleted", "Deleted"),
    ;
    private static List<UserStatus> list = new ArrayList<>();
    static{
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

    private UserStatus(Long id, String value, String alias) {
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

    public static UserStatus getById(Long id){
        return (UserStatus) EnumUtils.getById(id, list);
    }
    
    public static List<UserStatus> getList(){
        return list;
    }
}
