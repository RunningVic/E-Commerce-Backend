package com.vic.ecommerce.service;

import com.vic.ecommerce.dto.Purchase;
import com.vic.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
