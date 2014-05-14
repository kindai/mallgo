package com.mallgo.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Cart extends AuditableEntity implements Serializable {

    private static final long serialVersionUID = 8329559983943337176L;

    private final Map<Long, CartItem> itemMap = Collections.synchronizedMap(new HashMap<Long, CartItem>());
    private final List<CartItem> itemList = new ArrayList<CartItem>();
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Iterator<CartItem> getCartItems() {
        return itemList.iterator();
    }

    public List<CartItem> getCartItemList() {
        return itemList;
    }

    public int getNumberOfItems() {
        return itemList.size();
    }

    public Iterator<CartItem> getAllCartItems() {
        return itemList.iterator();
    }

    public boolean containsItemId(String itemId) {
        return itemMap.containsKey(itemId);
    }

    public void addItem(Item item, boolean isInStock) {
        CartItem cartItem = (CartItem) itemMap.get(item.getId());
        if (cartItem == null) {
            cartItem = new CartItem();
            cartItem.setItem(item);
            cartItem.setQuantity(0);
            cartItem.setInStock(isInStock);
            itemMap.put(item.getId(), cartItem);
            itemList.add(cartItem);
        }
        cartItem.incrementQuantity();
    }

    public Item removeItemById(Long itemId) {
        CartItem cartItem = (CartItem) itemMap.remove(itemId);
        if (cartItem == null) {
            return null;
        } else {
            itemList.remove(cartItem);
            return cartItem.getItem();
        }
    }

    public void incrementQuantityByItemId(Long itemId) {
        CartItem cartItem = (CartItem) itemMap.get(itemId);
        cartItem.incrementQuantity();
    }

    public void setQuantityByItemId(Long itemId, int quantity) {
        CartItem cartItem = (CartItem) itemMap.get(itemId);
        cartItem.setQuantity(quantity);
    }

    public BigDecimal getSubTotal() {
        BigDecimal subTotal = new BigDecimal("0");
        Iterator<CartItem> items = getAllCartItems();
        while (items.hasNext()) {
            CartItem cartItem = (CartItem) items.next();
            Item item = cartItem.getItem();
            BigDecimal listPrice = item.getListPrice();
            BigDecimal quantity = new BigDecimal(String.valueOf(cartItem.getQuantity()));
            subTotal = subTotal.add(listPrice.multiply(quantity));
        }
        return subTotal;
    }

}
