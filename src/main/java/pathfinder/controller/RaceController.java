package pathfinder.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pathfinder.models.RaceModel;
import pathfinder.service.race_service.RaceService;

import java.util.List;

@Controller
@RequestMapping("/race")
public class RaceController {

    private final RaceService raceService;

    public RaceController(RaceService raceService) {
        this.raceService = raceService;
    }

    @GetMapping
    public ResponseEntity<List<RaceModel>> get(){
        return ResponseEntity.ok(raceService.getAllRaces());
    }
}
