package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by ELAHI on 3/5/2017.
 */
@Configuration
public class LuckyStringConfiguration {
    @Bean
    //@Profile("prod")
    public LuckyString myStringProd(@Value("${my.randomString}") String myString){
        LuckyString luckyString = new LuckyString();
        luckyString.setMyString(myString);
        return luckyString;
    }
//    @Bean
//    @Profile("dev")
//    public LuckyString myStringDev(){
//        LuckyString luckyString = new LuckyString();
//        luckyString.setMyString("This is your default lucky string");
//        return luckyString;
//    }
}
