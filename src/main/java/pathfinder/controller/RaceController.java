package pathfinder.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import pathfinder.models.race.RaceModel;
import pathfinder.service.race_service.RaceService;

@Controller
@RequestMapping("/race")
@Api(tags = {"Race controller"}, consumes = "application/json")
public class RaceController {

    private final RaceService raceService;

    public RaceController(RaceService raceService) {
        this.raceService = raceService;
    }

    @GetMapping
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
