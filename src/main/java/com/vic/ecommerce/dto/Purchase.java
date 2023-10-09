package com.vic.ecommerce.dto;

import com.vic.ecommerce.entity.Address;
import com.vic.ecommerce.entity.Customer;
import com.vic.ecommerce.entity.Order;
import com.vic.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
