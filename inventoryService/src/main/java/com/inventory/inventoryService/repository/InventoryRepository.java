package com.inventory.inventoryService.repository;

import com.inventory.inventoryService.model.Inventory;
public interface InventoryRepository extends JpaRepository <Inventory, Long> {
 boolean existsBySkuCodeAndQuantityIsGreaterThanEqual(String skuCode, Integer quantity);
}
