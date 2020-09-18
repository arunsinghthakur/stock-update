package com.joker.stock.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class StockPriceDto {
    private String stockCode;
    private String oldPrice;
    private String newPrice;
}