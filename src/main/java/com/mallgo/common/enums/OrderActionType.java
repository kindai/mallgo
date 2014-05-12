package com.mallgo.common.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kin on 5/12/14.
 */
public enum OrderActionType implements EnumDomainValue {
    CREATE(32010L, "Create", "Create"),
    PAY(32011L, "Pay", "Pay"),
    SHIP(32012L, "Ship", "Ship"),
    CONFIRMRECEIVED(32013L, "ConfirmReceived", "ConfirmReceived"),
    COMMENT(32014L, "Comment", "Comment"),
    ASKREFUND(32015L, "AskRefund", "AskRefund"),
    CONFIRMREFUND(32016L, "ConfirmRefund", "ConfirmRefund"),
    CLOSE(32017L, "Close", "Close"),
    USE(32018L, "Use", "Use"),
    ;
    private static List<OrderActionType> list = new ArrayList<>();
    static{
        list.add(CREATE);
        list.add(PAY);
        list.add(SHIP);
        list.add(CONFIRMRECEIVED);
        list.add(COMMENT);
        list.add(ASKREFUND);
        list.add(CONFIRMREFUND);
        list.add(CLOSE);
        list.add(USE);
    }

    private static final Domain domain = Domain.USER_STATUS;

    private Long id;
    private String value;
    private String alias;
    private Long lowValue = null;
    private Long highValue = null;
    private Integer sortOrder = 0;
    private Boolean active = true;

    private OrderActionType(Long id, String value, String alias) {
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

    public static OrderActionType getById(Long id){
        return (OrderActionType) EnumUtils.getById(id, list);
    }

    public static List<OrderActionType> getList(){
        return list;
    }
}
