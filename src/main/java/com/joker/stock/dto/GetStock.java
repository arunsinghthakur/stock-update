package com.joker.stock.dto;

import lombok.*;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class GetStock {
    private String stockCode;
}