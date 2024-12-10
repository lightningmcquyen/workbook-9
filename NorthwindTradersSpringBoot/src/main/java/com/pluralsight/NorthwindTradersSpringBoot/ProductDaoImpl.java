package com.pluralsight.NorthwindTradersSpringBoot;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class ProductDaoImpl implements ProductDao {
    @Override
    public List<Product> findAll() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Product A", 100.0));
        products.add(new Product(2, "Product B", 200.0));
        products.add(new Product(3, "Product C", 300.0));
        return products;
    }
}