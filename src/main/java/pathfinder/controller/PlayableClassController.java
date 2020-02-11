package pathfinder.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pathfinder.models.playable_class.PlayableClassModel;
import pathfinder.service.class_service.PlayableClassService;

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
        return ResponseEntity.ok(playableClassService.listAllClasses());
    }
    @GetMapping(params = "className")
    public ResponseEntity<PlayableClassModel> getClass(String className){
        return ResponseEntity.ok(new PlayableClassModel());
    }
}
