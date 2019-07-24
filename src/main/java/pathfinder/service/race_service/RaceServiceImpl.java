package pathfinder.service.race_service;

import org.springframework.stereotype.Service;
import pathfinder.models.RaceModel;

import java.util.ArrayList;
import java.util.List;

@Service
public class RaceServiceImpl implements RaceService {

    public List<RaceModel> getAllRaces() {
        List<RaceModel> raceList = new ArrayList<>();
        raceList.add(new RaceModel());
        return raceList;
    }
}
