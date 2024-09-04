package me.burninghandsapp.familyportal.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


import java.io.Serializable;

@Getter
@Setter
@Entity
public class Categories implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private  int id;

    private  String categoryName;

    private  String categoryDescription;


    private  Boolean hasArticles;


}
