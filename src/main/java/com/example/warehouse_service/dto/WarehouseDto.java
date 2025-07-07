package com.example.warehouse_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WarehouseDto {
    private int id;

    private String warehouseName;

    private String warehouseIdentifier;

    private LocalDateTime created;

    private LocalDateTime updated;
}
