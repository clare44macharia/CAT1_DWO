package com.ics.demo.groupaspring;

import com.ics.demo.groupaspring.models.Category;
import com.ics.demo.groupaspring.models.Movie;
import com.ics.demo.groupaspring.repositories.ActorRepository;
import com.ics.demo.groupaspring.repositories.CategoryRepository;
import com.ics.demo.groupaspring.repositories.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class DummyData implements CommandLineRunner {
    private final MovieRepository movieRepository;
    private final ActorRepository actorRepository;
    private final CategoryRepository categoryRepository;


    public DummyData(MovieRepository movieRepository, ActorRepository actorRepository, CategoryRepository categoryRepository){
        this.movieRepository=movieRepository;
        this.actorRepository=actorRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run (String... args) throws Exception{

        Category category = categoryRepository.save(new Category("Sci-fi"));
        Category category1 = categoryRepository.save(new Category("Rom-com"));
     //   Set<Category> categories = new HashSet<>();
       // categories.add(category);


        Movie movie=new Movie("Fast and Slow", "1990");
        movieRepository.save(movie);
        Movie movie1=new Movie("Slow and Fast", "1989");
        movieRepository.save(movie1);
        category.addMovie(movie);
        category.addMovie(movie1);
        categoryRepository.save(category);
        categoryRepository.save(category1);





    }
}
