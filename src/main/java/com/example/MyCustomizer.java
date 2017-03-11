package com.example;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by ELAHI on 3/8/2017.
 */
//@Component
@Configuration
public class MyCustomizer /*implements EmbeddedServletContainerCustomizer*/ {

//    @Override
//    public void customize(ConfigurableEmbeddedServletContainer container) {
//        container.setContextPath("/v1");
//    }
    @Bean
    public EmbeddedServletContainerFactory factory(){
        TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory();
        factory.setContextPath("/v2");
        return factory;
    }
}
