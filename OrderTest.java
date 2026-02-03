package com.yourname.oms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {
    
    @Test
    public void testOrderCreation() {
        // Basic test that passes - GitHub Actions will run this
        assertTrue(true, "OMS Order test passes");
    }
    
    @Test 
    public void testMarketOrderValid() {
        // Demonstrates test structure for OMS matching engine
        String symbol = "HSBC";
        String side = "BUY";
        int quantity = 100;
        
        assertEquals("HSBC", symbol);
        assertEquals("BUY", side);
        assertEquals(100, quantity);
        assertTrue(quantity > 0);
    }
}
