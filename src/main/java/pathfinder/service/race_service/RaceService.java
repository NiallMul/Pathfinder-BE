package pathfinder.service.race_service;

import java.util.List;

import pathfinder.models.race.RaceModel;

public interface RaceService {
    List<RaceModel> getAllRaces();

    RaceModel getRace(String name);

    String addRace(RaceModel race);
}
