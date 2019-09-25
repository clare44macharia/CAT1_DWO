package com.ics.demo.groupaspring.service;

import com.ics.demo.groupaspring.NotFoundException;
import com.ics.demo.groupaspring.models.Actor;
import com.ics.demo.groupaspring.repositories.MovieRepository;
import com.ics.demo.groupaspring.models.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class MovieServiceImpl implements MovieService {
    private final  ActorService actorService;

    private final MovieRepository movieRepository;

    public MovieServiceImpl(ActorService actorService, MovieRepository movieRepository){
        this.actorService = actorService;
        this.movieRepository=movieRepository;
    }

    @Override
    public List<Movie> findAll(){
        return movieRepository.findAll();
    }

    @Override
    public Movie findById(Long id){
        return movieRepository.findById(id).orElseThrow(()->
                new NotFoundException("No record with id " +id+ "found"));
    }

    @Override
    public Movie create(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public void delete(Long id) {
        movieRepository.deleteById(id);
    }

    @Override
    public Movie update(Movie movie) {
        Movie foundMovie = findById(movie.getId());
        foundMovie.setName(movie.getName());
        foundMovie.setYearReleased(movie.getYearReleased());
        return movieRepository.save(foundMovie);
    }

    @Override
    public Movie update(Long id, Movie movie) {
        Movie foundMovie = findById(movie.getId());
        foundMovie.setName(movie.getName());
        foundMovie.setYearReleased(movie.getYearReleased());
        return movieRepository.save(foundMovie);
    }

    @Override
    public Actor createActor(Long id, Actor actor) {
        Movie movie = findById(id);
        actor.setMovie(movie);
        return actorService.create(actor);
    }

}
