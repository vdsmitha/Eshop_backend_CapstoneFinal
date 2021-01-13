package com.upgrad.eshop.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "ESHOP_ORDER")
public class Order {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    @JsonBackReference
    private User user;

//  TODO: Define the 'Product' field with reference to the Product entity and use the necessary relationship annotation

    @OneToOne
    @Column(name = "productId")
    private Product product;


//  TODO: Define the 'shippingAddress' field with reference to the ShippingAddress entity and use the necessary relationship annotation

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JsonBackReference
    @Column(name = "shippingAddressId")
    @JoinColumn(name = "id")
    private ShippingAddress shippingAddress;

    private Double amount;
    private LocalDateTime orderDate = LocalDateTime.now();

//  TODO: Generate getters & setters and constructors for the Entity class


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", user=" + user +
                ", product=" + product +
                ", shippingAddress=" + shippingAddress +
                ", amount=" + amount +
                ", orderDate=" + orderDate +
                '}';
    }

    public Order(Long id, User user, Product product, ShippingAddress shippingAddress, Double amount, LocalDateTime orderDate) {
        this.id = id;
        this.user = user;
        this.product = product;
        this.shippingAddress = shippingAddress;
        this.amount = amount;
        this.orderDate = orderDate;
    }
}
