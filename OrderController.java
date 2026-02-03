"Add file" → Name: `src/main/java/com/yourname/oms/controller/OrderController.java`

package com.yourname.oms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    
    @GetMapping("/api/health")
    public String health() {
        return "OMS running! Ready for HK investment banks.";
    }
}

Commit: "feat: add health check endpoint"

