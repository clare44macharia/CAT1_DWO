package com.ics.demo.groupaspring.controller;

import com.ics.demo.groupaspring.models.Actor;
import com.ics.demo.groupaspring.service.ActorService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//http://localhost:8080/actors/{id}
@RestController
@RequestMapping(value="actors")
public class ActorController {    

    private final ActorService actorService;

    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }

    @GetMapping
    public List<Actor> findAll(){
        return actorService.findAll();
    }

   /* @GetMapping(value ="{id}")
    public Actor findById(@PathVariable Long id){
        return actorService.findById(id);
    }

    @PostMapping
    public Actor create(@Validated(Actor.Create.class) @RequestBody Actor Actor){
        return actorService.create(Actor);
    }

    @DeleteMapping(value = "{id}")
    public void delete(@PathVariable Long id){
        actorService.delete(id);
    }

    @PatchMapping
    public Actor update(@Validated(Actor.Update.class) @RequestBody Actor Actor){
        return actorService.update(Actor);
    }

    @PatchMapping(value = "{id}")
    public Actor update(@PathVariable Long id, @RequestBody Actor Actor){
        return actorService.update(id, Actor);
    }*/
}
