package com.mallgo.common.enums;

/**
 * Created with IntelliJ IDEA.
 * User: cam-dev
 * Date: 2/24/14
 * Time: 2:23 PM
 * To change this template use File | Settings | File Templates.
 */
public enum Domain {
    USER_TYPE( 280L, "USER TYPE", "Classification of user type", "USER TYPE"),
    USER_STATUS( 290L, "USER STATUS", "User Status", "USER STATUS"),
    SHOP_STATUS( 300L, "SHOP STATUS", "Shop Status", "SHOP STATUS"),
    ORDER_STATUS( 310L, "ORDER STATUS", "Order Status", "ORDER STATUS"),
    ORDER_ACTION_TYPE( 320L, "ORDER ACTION TYPE", "Order Action Type", "ORDER ACTION TYPE"),
    ITEM_STATUS( 330L, "ITEM STATUS", "Item status", "ITEM STATUS"),
    ORDER_TYPE( 340L, "ORDER TYPE", "Order Type", "ORDER TYPE"),
    PRODUCT_TYPE( 350L, "PRODUCT TYPE", "Product Type", "PRODUCT TYPE");

    private Long id;
    private String name;
    private String usage;
    private String alias;

    private Domain(Long id, String name, String usage, String alias) {
        this.id = id;
        this.name = name;
        this.usage = usage;
        this.alias = alias;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsage() {
        return usage;
    }

    public String getAlias() {
        return alias;
    }
}
