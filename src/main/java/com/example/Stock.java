package com.example;

import javax.persistence.*;

@NamedStoredProcedureQuery(
        name = Stock.Calculate,
        procedureName = Stock.Calculate,
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = Stock.X),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = Stock.Y),
                @StoredProcedureParameter(mode = ParameterMode.OUT, type = Double.class, name = Stock.Sum)
        }
)
@Entity
@Table(name = "stock")
public class Stock {
    public static final String Calculate = "calculate";
    public static final String X = "x";
    public static final String Y = "y";
    public static final String Sum = "sum";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "stockid")
    private Long stockId;

    @Column(name = "companyname")
    private String companyName;

    @Column(name = "price", nullable = true)
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Long getStockId() {
        return stockId;
    }

    public void setStockId(Long stockId) {
        this.stockId = stockId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
