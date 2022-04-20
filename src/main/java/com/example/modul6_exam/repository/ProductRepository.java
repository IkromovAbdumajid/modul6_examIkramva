package com.example.modul6_exam.repository;

import com.example.modul6_exam.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findAllByActiveTrue();
    List<Product> findAllById(Integer id);
}