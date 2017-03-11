package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ELAHI on 3/11/2017.
 */
@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {
     Stock findStockByStockId(Long stockId);
}
