package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by ELAHI on 3/5/2017.
 */
@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner : These are the arguments used to start the app > ");
        for (String arg: args) {
            System.out.println(arg);
        }
    }
}
