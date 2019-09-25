package com.ics.demo.groupaspring.repositories;

import com.ics.demo.groupaspring.models.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor,Long> {
}
