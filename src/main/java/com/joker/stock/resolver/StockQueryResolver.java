package com.joker.stock.resolver;

import com.joker.stock.dto.GetStock;
import com.joker.stock.dto.StockPriceDto;
import com.joker.stock.service.StockService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StockQueryResolver implements GraphQLQueryResolver {
    @Autowired
    private StockService stockService;

    public List<StockPriceDto> findAllStocks() {
        return stockService.getAllStocks();
    }

    public StockPriceDto getStock(GetStock stock) {return stockService.getStock(stock);}
}