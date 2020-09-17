package com.joker.stock.service;

import com.joker.stock.dto.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class StockService {

    public StockPriceDto getStock(GetStock stock) {
        Random r = new Random();
        int low = 10;
        int high = 100;
        int oldPrice = r.nextInt(high-low) + low;
        int newPrice = r.nextInt(high-low) + low;
        return new StockPriceDto( stock.getStockCode(), oldPrice, newPrice);
    }


}
