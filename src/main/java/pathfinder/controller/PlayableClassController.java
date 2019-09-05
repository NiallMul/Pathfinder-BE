package pathfinder.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pathfinder.models.playable_class.PlayableClassModel;
import pathfinder.service.class_service.PlayableClassService;

@Controller
@RequestMapping("/class")
public class PlayableClassController {

    private final PlayableClassService playableClassService;

    public PlayableClassController(PlayableClassService playableClassService){
        this.playableClassService = playableClassService;
    }

    @GetMapping
    public ResponseEntity<List<PlayableClassModel>> getClasses(){
        return ResponseEntity.ok(playableClassService.listAllClasses());
    }

}
