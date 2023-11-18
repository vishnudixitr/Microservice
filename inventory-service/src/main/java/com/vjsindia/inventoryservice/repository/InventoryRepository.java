package com.vjsindia.inventoryservice.repository;

import com.vjsindia.inventoryservice.model.Inventory;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import java.util.Optional;

@Repository

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    Optional<Inventory>  findBySkuCode(String skuCode);

    List<Inventory> findBySkuCodeIn(List<String> skuCode);
}
