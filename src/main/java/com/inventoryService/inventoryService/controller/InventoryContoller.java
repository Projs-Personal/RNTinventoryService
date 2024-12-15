package com.inventoryService.inventoryService.controller;

import com.inventoryService.inventoryService.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryContoller {
    private final InventoryService inventoryService;

    @GetMapping
    public ResponseEntity<Boolean> isInStock(String skuCode, Integer quantity) {
        Boolean response = inventoryService.isInStock(skuCode, quantity);
        if (!response)
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
