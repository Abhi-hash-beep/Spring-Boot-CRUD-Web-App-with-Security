package com.product.Spring_mvc.CRUD.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.product.Spring_mvc.CRUD.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}