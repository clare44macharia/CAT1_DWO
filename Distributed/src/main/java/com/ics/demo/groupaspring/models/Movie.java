package com.ics.demo.groupaspring.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @NotNull(groups = Update.class)
    private Long id;

    @Column(name="name")
    @NotNull(groups = Create.class)
    private String name;

    @Column(name="yearReleased")
    private String yearReleased;

    @OneToMany(mappedBy = "movie")
    private List<Actor> actors;

    @ManyToMany(mappedBy = "movies")
    private Set<Category> categories;

    public Movie(String name, String yearReleased){
        this.name=name;
        this.yearReleased = yearReleased;
       // this.categories = categories;
    }

    private Movie(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(String yearReleased) {
        this.yearReleased = yearReleased;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public interface Create{}

    public interface Update{}

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yearReleased='" + yearReleased + '\'' +
                ", actors=" + actors +
                ", categories=" + categories +
                '}';
    }

}
