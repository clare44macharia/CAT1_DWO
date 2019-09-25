/*
package com.ics.demo;

import com.ics.demo.groupaspring.models.Movie;
import com.ics.demo.groupaspring.models.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@org.springframework.cloud.openfeign.FeignClient(name = "client", url = "http://10.51.10.111:9090")
public interface FeignClient {
    @RequestMapping(method = RequestMethod.GET, value = "movies")
    List<Movie> getAllMovies();

    @RequestMapping(method = RequestMethod.GET, value = "movies/{id}")
    Movie findById(@PathVariable(name="id")Long id);

    @RequestMapping(method = RequestMethod.POST , value= "movies")
    Movie createMovie (@RequestBody Movie movie);

    @RequestMapping(method = RequestMethod.PATCH, value ="movies/{id}")
    Movie updateMovie(@PathVariable Long id , @RequestBody Movie movie);






}
*/
