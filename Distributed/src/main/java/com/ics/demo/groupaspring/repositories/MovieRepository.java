package com.ics.demo.groupaspring.repositories;

import com.ics.demo.groupaspring.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Long>{
}
