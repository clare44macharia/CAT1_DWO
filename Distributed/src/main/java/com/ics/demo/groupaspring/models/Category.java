package com.ics.demo.groupaspring.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "categories")
public class Category {
    @Column(name = "name")
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="category_id")
    private Long id;


    @ManyToMany
    @JoinTable(
            name = "category_movies",
            joinColumns = @JoinColumn(name = "category_id"),
            inverseJoinColumns=@JoinColumn(name ="movie_id")
    )

    private Set<Movie> movies =  new HashSet<>();

    private Category(){

    }


    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", movies=" + movies +
                '}';
    }
}
