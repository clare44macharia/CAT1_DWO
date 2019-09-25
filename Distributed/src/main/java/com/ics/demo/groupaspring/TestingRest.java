/*
package com.ics.demo.groupaspring;

import com.ics.demo.FeignClient;
import com.ics.demo.FeignMockClient;
import com.ics.demo.groupaspring.models.Movie;
import com.ics.demo.groupaspring.models.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class TestingRest implements CommandLineRunner {


   private final FeignClient feignClient ;

    public TestingRest(FeignClient feignClient) {
        this.feignClient = feignClient;
    }


    @Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate = new RestTemplate();



   ResponseEntity<List<Movie>> response = restTemplate.exchange("http://10.51.10.111:9090/movies",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Movie>>(){});
               List<Movie> movies = response.getBody();

               System.out.println(movies.toString());


               Movie movie = restTemplate.getForObject("http://10.51.10.111:9090/movies/3",
                       Movie.class);
               System.err.println(movie.toString());

        String url = "http://10.51.10.111:9090/movies/search?name="+ movie.getName();
        movies = feignClient.getAllMovies();
        System.err.println(movies.toString());


        Movie newMovie = new Movie ("Tall Girl", "2016");
        newMovie = feignClient.createMovie(newMovie);
        System.out.print("CreatedMovie:" + newMovie.toString());

        newMovie.setName("Hustler");
        feignClient.updateMovie(newMovie.getId(),newMovie);


        Movie movieByName = restTemplate.getForObject(url,
                Movie.class);
        System.err.println(movieByName.toString());





    }
}
*/
