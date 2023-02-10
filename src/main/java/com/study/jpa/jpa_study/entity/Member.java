package com.study.jpa.jpa_study.entity;

import com.study.jpa.jpa_study.enums.RoleType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="member")
@Getter
@Setter
@NoArgsConstructor
public class Member {

    @Id
    @Column(name="id")
    private String id;

    @Column(name="name")
    private String username;

    @Column(name="age")
    private Integer age;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @Lob
    private String description;
}
