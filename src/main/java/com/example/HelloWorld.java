package com.example;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ELAHI on 3/4/2017.
 */
@RestController
@RequestMapping("/")
//@EnableConfigurationProperties(value = LuckyNumber.class)
public class HelloWorld {

    private LuckyNumber luckyNumber;
    private LuckyString luckyString;
    private EntityManager entityManager;
    private StockRepository stockRepository;

    @Autowired
    public HelloWorld(LuckyNumber luckyNumber, LuckyString luckyString, EntityManager entityManager, StockRepository stockRepository) {
        this.luckyNumber = luckyNumber;
        this.luckyString = luckyString;
        this.entityManager = entityManager;
        this.stockRepository = stockRepository;
    }

    @RequestMapping(value = "/hello-world", method = RequestMethod.GET)
    public
    @ResponseBody
    List<String> sayHello() {
        List<String> jsonData = new ArrayList<String>();

        jsonData.add("Hello World! Your Lucky Number is : " + luckyNumber.getMyNumber());
        jsonData.add("Hello World! Your Lucky String is : " + luckyString.getMyString());

        return jsonData;
    }

    @RequestMapping(value = "/stocks", method = RequestMethod.GET)
    public List<Stock> getAllStocks() {
        return entityManager.createQuery("select s from Stock s").getResultList();
    }

    @RequestMapping(value = "/stocks/{stockId}", method = RequestMethod.GET)
    public Stock getStockByStockId(@PathVariable Long stockId)  {
        return stockRepository.findStockByStockId(stockId);
    }
}
