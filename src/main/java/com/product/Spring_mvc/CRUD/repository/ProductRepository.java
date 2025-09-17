package com.product.Spring_mvc.CRUD.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.product.Spring_mvc.CRUD.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}