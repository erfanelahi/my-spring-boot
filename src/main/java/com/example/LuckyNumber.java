package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by ELAHI on 3/5/2017.
 */
@Component
//@ConfigurationProperties(prefix = "my")
public class LuckyNumber {
    @Value("${my.randomNumber}")
    private int myNumber;

    public int getMyNumber() {
        return myNumber;
    }

    public void setMyNumber(int myNumber) {
        this.myNumber = myNumber;
    }
}
