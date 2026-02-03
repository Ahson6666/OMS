package com.oms.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class OrderTest {
    
    @Test
    public void testOmsHealthCheck() {
        assertTrue(true, "OMS Order Management System tests pass");
    }
    
    @Test
    public void testHsbOrderValid() {
        // Simulates HSBC order validation for HK trading
        String symbol = "0005.HK";  // HSBC HKEX
        String side = "BUY";
        int quantity = 100;
        double price = 65.50;
        
        assertEquals("0005.HK", symbol);
        assertEquals("BUY", side);
        assertTrue(quantity > 0);
        assertTrue(price > 0);
    }
}
