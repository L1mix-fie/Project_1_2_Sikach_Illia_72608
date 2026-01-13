package com.example.Spring.Initializr.product.repository;

import com.example.Spring.Initializr.product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Здесь больше ничего писать не нужно
}