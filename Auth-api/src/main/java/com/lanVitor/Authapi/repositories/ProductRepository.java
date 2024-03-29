package com.lanVitor.Authapi.repositories;


import com.lanVitor.Authapi.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
