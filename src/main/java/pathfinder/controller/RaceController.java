package pathfinder.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pathfinder.models.race.RaceModel;
import pathfinder.service.race_service.RaceService;

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

    @PostMapping
    public ResponseEntity<String> addRace(RaceModel race){
        return ResponseEntity.ok(raceService.addRace(race));
    }
}
