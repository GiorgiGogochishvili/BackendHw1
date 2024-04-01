package ge.ibsu.demo.controllers;

import ge.ibsu.demo.entities.Actor;
import ge.ibsu.demo.services.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/actors")
public class ActorController {

    @Autowired
    private ActorService actorService;

    @GetMapping(value = "/all", produces = "application/json")
    public List<Actor> getAllActors() {
        return actorService.getAllActors();
    }
}


