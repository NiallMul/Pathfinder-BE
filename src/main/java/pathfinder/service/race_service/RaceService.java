package pathfinder.service.race_service;

import pathfinder.models.race.RaceModel;

import java.util.List;

public interface RaceService {
    List<RaceModel> getAllRaces();

    RaceModel getRace(String name);

    String addRace(RaceModel race);

    List<String> getAllRaceNames();
}
