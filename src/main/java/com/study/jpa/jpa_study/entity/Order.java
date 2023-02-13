package com.study.jpa.jpa_study.entity;

import com.study.jpa.jpa_study.enums.OrderStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
@Getter
@Setter
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long id;

    @Column(name = "member_id")
    private Long memberId;

    @Column(name = "order_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
}
