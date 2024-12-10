package com.pluralsight.NorthwindTradersSpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ProductDao productDao() {
        return new ProductDaoImpl();
    }
}
