package com.study.jpa.jpa_study.entity.Item;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("A")
public class Album extends Item{
    private String artist;
    private String etc;
}
