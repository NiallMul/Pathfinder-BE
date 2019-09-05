package pathfinder.service.race_service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pathfinder.dao.RaceEntity;
import pathfinder.dao.repository.RaceRepository;
import pathfinder.mappers.race.RaceMapper;
import pathfinder.models.race.RaceModel;

@Service
public class RaceServiceImpl implements RaceService {
    private final RaceMapper raceMapper;
    private final RaceRepository repository;

    @Autowired
    public RaceServiceImpl(RaceMapper raceMapper, RaceRepository repository) {
        this.raceMapper = raceMapper;
        this.repository = repository;
    }

    public List<RaceModel> getAllRaces() {
        List<RaceModel> raceList = new ArrayList<>();
        raceList.add(new RaceModel());
        return raceList;
    }

    @Override
    public String addRace(RaceModel race) {
        if(race!=null){
            RaceEntity entity = raceMapper.modelRaceToEntity(race);
            repository.save(entity);
            return "Success";
        }
        return "Race sent was null";
    }
}
