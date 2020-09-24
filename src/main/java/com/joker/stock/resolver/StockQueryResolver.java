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

    public StockPriceDto getStockPrice(String stockCode) {return stockService.getStockPrice(stockCode);}
}
