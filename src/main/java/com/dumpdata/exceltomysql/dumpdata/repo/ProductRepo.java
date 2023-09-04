package com.dumpdata.exceltomysql.dumpdata.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dumpdata.exceltomysql.dumpdata.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {
    
}
