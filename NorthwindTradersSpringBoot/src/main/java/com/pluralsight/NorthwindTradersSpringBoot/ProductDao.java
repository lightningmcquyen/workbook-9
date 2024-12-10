package com.pluralsight.NorthwindTradersSpringBoot;

import java.util.List;

public interface ProductDao {
    List<Product> findAll();
}