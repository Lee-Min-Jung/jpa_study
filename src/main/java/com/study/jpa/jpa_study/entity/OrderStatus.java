package com.study.jpa.jpa_study.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "order_status")
@Getter
@Setter
public class OrderStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_item_id")
    private Long id;

    @Column(name = "item_id")
    private Long itemId;

    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "order_price")
    private Long orderPrice;

    @Column(name = "count")
    private int count;
}
