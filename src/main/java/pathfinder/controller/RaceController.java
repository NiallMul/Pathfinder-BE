package pathfinder.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pathfinder.models.race.RaceModel;
import pathfinder.service.race_service.RaceService;

import java.util.List;

@Controller
@RequestMapping("/race")
@Api(tags = {"Race controller"}, consumes = "application/json")
public class RaceController {

    private final RaceService raceService;

    public RaceController(RaceService raceService) {
        this.raceService = raceService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<List<RaceModel>> get(){
        return ResponseEntity.ok(raceService.getAllRaces());
    }

    @GetMapping(params = "name")
    public ResponseEntity<RaceModel> get(String name){
        return ResponseEntity.ok(raceService.getRace(name));
    }

    @PostMapping
    @ApiOperation(value = "Register race", notes = "Adds a new race entry to the db")
    public ResponseEntity<String> addRace(@RequestBody RaceModel race){
        return ResponseEntity.ok(raceService.addRace(race));
    }
}
