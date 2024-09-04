package me.burninghandsapp.familyportal.models;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class BlogPostItemComments implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private  int id;

    @ManyToOne
    private BlogPostItems blogItem;

    @ManyToOne
    @JoinColumn(name="author_user_id", referencedColumnName="user_id")
    private  User author;

    @Column(columnDefinition="TEXT")
    private String commentText;

    @Column(name = "DateCreated", columnDefinition = "DATETIME")
    private LocalDateTime dateCreated;
}
