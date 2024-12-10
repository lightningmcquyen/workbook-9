package com.pluralsight.NorthwindTradersSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NorthwindApplication implements CommandLineRunner {

    @Autowired
    private ProductDao productDao;

    @Override
    public void run(String... args) {
        System.out.println("Running the Northwind Application...");

        // Retrieve all products using the ProductDao
        List<Product> products = productDao.findAll();

        // Print all products
        System.out.println("Available Products:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}