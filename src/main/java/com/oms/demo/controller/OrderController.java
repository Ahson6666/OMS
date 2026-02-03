```java
package com.oms.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    
    @GetMapping("/api/health")
    public String health() {
        return "OMS API running! Ready for HKEX trading.";
    }
    
    @GetMapping("/api/orders")
    public String getOrders() {
        return "Order book: HSBC@65.50 (100), AAPL@230.00 (50)";
    }
}
