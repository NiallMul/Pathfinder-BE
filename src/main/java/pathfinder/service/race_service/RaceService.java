package pathfinder.service.race_service;

import java.util.List;

import pathfinder.models.race.RaceModel;

public interface RaceService {
    List<RaceModel> getAllRaces();

    String addRace(RaceModel race);
}
