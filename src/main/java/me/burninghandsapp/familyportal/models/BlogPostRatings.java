package me.burninghandsapp.familyportal.models;

import lombok.Getter;
import lombok.Setter;

import  jakarta.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
public class BlogPostRatings implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private  int id;

    @ManyToOne
    private BlogPostItems blogItem;

    @ManyToOne
    private  User rateBy;

    private  Integer rate;
}
