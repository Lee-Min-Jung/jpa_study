package com.study.jpa.jpa_study.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "team")
    private List<Member> members = new ArrayList<Member>();
}
