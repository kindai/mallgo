package com.mallgo.common.enums;

/**
 * Created with IntelliJ IDEA.
 * User: cam-dev
 * Date: 2/24/14
 * Time: 2:23 PM
 * To change this template use File | Settings | File Templates.
 */
public enum Domain {
    USER_TYPE( 10L, "USER TYPE", "Classification of user type", "USER TYPE"),
    RESOURCE_TYPE( 20L, "RESOURCE TYPE", "Resources that CAM Manages", "RESOURCE TYPE"),
    LANGUAGE( 30L, "LANGUAGE", "DISPLAYED OR SPOKEN LANGUAGES", "LANGUAGE"),
    GROUP_TYPE( 40L, "GROUP TYPE", "Group Types", "GROUP TYPE"),
    PHONE_TYPE( 50L, "PHONE TYPE", "Types of phone for contacts and users", "PHONE TYPE"),
    DATE_FORMAT( 60L, "DATE FORMAT", "User preferred date formats", "DATE FORMAT"),
    TIME_FORMAT( 70L, "TIME FORMAT", "User preferred time formats", "TIME FORMAT"),
    TITLE( 80L, "TITLE", "User preferred time formats", "TITLE"),
    TIME_ZONE( 90L, "TIME ZONE", "Time Zones", "TIME ZONE"),
    CONTACT_TYPE( 100L, "CONTACT TYPE", "Contact types", "CONTACT TYPE"),
    ORGANIZATION_STATUS( 110L, "ORGANIZATION STATUS", "TBC WITH CHUCK - Organization Status", "CUSTOMER STATUS"),
    TERRITORY_TYPE( 120L, "TERRITORY TYPE", "Territory Type", "TERRITORY TYPE"),
    ADDRESS_TYPE( 130L, "ADDRESS TYPE", "Address Types", "ADDRESS TYPE"),
    CONTRACT_STATUS( 140L, "CONTRACT STATUS", "Contract Status", "CONTRACT STATUS"),
    CONTRACT_TYPE( 150L, "CONTRACT TYPE", "Contract Type", "CONTRACT TYPE"),
    BILLABLE_TYPE( 160L, "BILLABLE TYPE", "Billable Type", "BILLABLE TYPE"),
    SERVICE_TYPE( 170L, "SERVICE TYPE", "Service Type", "SERVICE TYPE"),
    SERVICE_STATE( 180L, "SERVICE STATE", "Service State", "SERVICE STATE"),
    CHANNEL( 190L, "CHANNEL", "Service Channels", "CHANNEL"),
    PRIVILEGE_USER_TYPE( 200L, "PRIVILEGE USER TYPE", "Classification of privilege user type", "PRIVILEGE USER TYPE"),
    SERVICE_HOURS( 210L, "SERVICE HOURS", "Service Hours", "SERVICE HOURS"),
    USER_STATUS( 230L, "USER STATUS", "User Status", "USER STATUS"),
    APPLICATION_USER_TYPE( 240L, "APPLICATION USER TYPE", "Application User Type", "APPLICATION USER TYPE"),
    APPLICATION_STATUS( 241L, "APPLICATION STATUS", "Classification of application status: Enabled, Disabled, Deleted, Pending", "APPLICATION STATUS"),
    APPLICATION_ROLE_TYPE( 242L, "APPLICATION ROLE TYPE", "Classification of application role type: Customer Admin, Customer User", "APPLICATION ROLE TYPE"),
    POLICY_STATUS( 250L, "POLICY STATUS", "Policy status", "POLICY STATUS"),
    ORGANIZATION_TYPE( 260L, "ORGANIZATION TYPE", "Classification of organization type: ALL, GROUP, ORGANIZATION", "CUSTOMER TYPE"),
    CONJUNCTION( 270L, "CONJUNCTION", "Classification of query criteria conjunction", "CONJUNCTION"),
    DELIVERY_STATUS( 271L, "DELIVERY_STATUS", "deliver status", "deliver status"),
    CUSTOMER_SOURCE_TYPE( 280L, "CUSTOMER SOURCE TYPE", "To identify where the customer comes from", "CUSTOMER SOURCE TYPE"),

    ROLE_LEVEL(290L, "ROLE LEVEL", "hierarchy or roles", "ROLE LEVEL"),
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
