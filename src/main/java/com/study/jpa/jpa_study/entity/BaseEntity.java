package com.study.jpa.jpa_study.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
@Getter
@Setter
public class BaseEntity {

    private Date createdDate;
    private Date lastModifiedDAte;
}
