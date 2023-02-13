package com.study.jpa.jpa_study.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "member")
public class Member {

    @Id
    @Column(name = "member_id")
    private String id;

    @Column(name = "username")
    private String username;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;
}

