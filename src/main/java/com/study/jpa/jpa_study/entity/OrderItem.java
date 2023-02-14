package com.study.jpa.jpa_study.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "order_item")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_item_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "item_id")
    @Column(name = "item")
    private Item item;

    @ManyToOne
    @JoinColumn(name = "order_id")
    @Column(name = "orders")
    private Order order;

    private int orderPrice;

    private int count;
}
