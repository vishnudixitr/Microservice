package com.vjsindia.inventoryservice.controller;


import com.vjsindia.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
@Slf4j
public class InventoryController {

    private final InventoryService inventoryService;

    // http://localhost:8082/api/inventory/iphone-13,iphone13-red

    // http://localhost:8082/api/inventory?skuCode=iphone-13&skuCode=iphone13-red
    //http://localhost:1243/api/inventory/checkProducts?skuCode=iphone_13&skuCode=iphone_13_red
    @GetMapping("isInStock/{skuCode}")
    @ResponseStatus(HttpStatus.OK)
    public boolean isInStock(@PathVariable("skuCode") String skuCode) {
        log.info("Received inventory check request for skuCode: {}", skuCode);
        return inventoryService.isInStock(skuCode);
    }
}
