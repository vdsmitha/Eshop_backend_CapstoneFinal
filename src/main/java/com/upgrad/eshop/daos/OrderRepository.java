package com.upgrad.eshop.daos;

import com.upgrad.eshop.entities.Order;
import com.upgrad.eshop.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long> {
    public Optional<Order> findById(int id);
    public Optional<Order> findByProduct(String product);
}
