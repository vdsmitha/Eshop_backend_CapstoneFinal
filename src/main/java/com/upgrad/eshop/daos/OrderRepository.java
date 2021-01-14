package com.upgrad.eshop.daos;

import com.upgrad.eshop.entities.Order;
import com.upgrad.eshop.entities.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
    public Order findById(int id);
    public Order findByProduct(String product);
}