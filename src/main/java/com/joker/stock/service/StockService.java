package com.joker.stock.service;

import com.joker.stock.dto.GetStock;
import com.joker.stock.dto.StockPriceDto;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class StockService {

    public StockPriceDto getStockPrice(GetStock stock) {
        Random r = new Random();
        int low = 10;
        int high = 100;
        int oldPrice = r.nextInt(high - low) + low;
        int newPrice = r.nextInt(high - low) + low;
        return new StockPriceDto(stock.getStockCode(), String.valueOf(oldPrice), String.valueOf(newPrice));
    }


}
