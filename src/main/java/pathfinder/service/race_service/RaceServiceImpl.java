package pathfinder.service.race_service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pathfinder.dao.RaceEntity;
import pathfinder.dao.repository.RaceRepository;
import pathfinder.mappers.race.RaceMapper;
import pathfinder.models.race.RaceModel;

@Service
public class RaceServiceImpl implements RaceService {
    private final RaceMapper raceMapper;
    private final RaceRepository repository;

    @Autowired
    public RaceServiceImpl(RaceRepository repository, RaceMapper raceMapper) {
        this.raceMapper = raceMapper;
        this.repository = repository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<RaceModel> getAllRaces() {
        List<RaceModel> raceList;
        Optional<List<RaceEntity>> raceDtoList = Optional.ofNullable(repository.findAll());
        raceList = raceMapper.mapRaceEntitiesToModels(raceDtoList.orElseGet(ArrayList::new));
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
