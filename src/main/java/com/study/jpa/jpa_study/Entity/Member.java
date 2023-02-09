package com.study.jpa.jpa_study.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="member")
@Getter
@Setter
public class Member {

    @Id
    @Column(name="id")
    private String id;

    @Column(name="name")
    private String username;

    @Column(name="age")
    private Integer age;
}
