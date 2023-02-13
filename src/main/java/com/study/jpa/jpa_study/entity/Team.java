package com.study.jpa.jpa_study.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "team")
@AllArgsConstructor
@NoArgsConstructor
public class Team {

    @Id
    @Column(name = "team_id")
    private String id;

    private String name;
}
