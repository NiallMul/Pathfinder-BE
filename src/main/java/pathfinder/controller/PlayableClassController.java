package pathfinder.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pathfinder.models.playable_class.PlayableClassModel;

import java.util.List;

@Controller
@RequestMapping("/class")
public class PlayableClassController {

    private final PlayableClassService playableClassService;

    public PlayableClassController(PlayableClassService playableClassService){
        this.playableClassService = playableClassService;
    }

    @GetMapping
    public ResponseEntity<List<PlayableClassModel>> getClasses(){
        return ResponseEntity.ok(new List<PlayableClassModel>);
    }

}
