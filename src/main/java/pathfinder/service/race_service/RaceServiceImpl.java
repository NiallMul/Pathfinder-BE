package pathfinder.service.race_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pathfinder.dao.RaceEntity;
import pathfinder.dao.repository.RaceRepository;
import pathfinder.mappers.race.RaceMapper;
import pathfinder.models.race.RaceModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
        Optional<List<RaceEntity>> raceDtoList = Optional.of(repository.findAll());
        return raceMapper.mapRaceEntitiesToModels(raceDtoList.orElseGet(ArrayList::new));
    }

    @Override
    @Transactional(readOnly = true)
    public RaceModel getRace(String name) {
        return raceMapper.entityRaceToModel(repository.findRaceEntityByRaceName(name).orElse(new RaceEntity()));
    }

    @Override
    @Transactional
    public String addRace(RaceModel race) {
        if (race != null) {
            RaceEntity entity = raceMapper.modelRaceToEntity(race);
            repository.save(entity);
            return "Success";
        }
        return "Race sent was null";
    }

    @Override
    public List<String> getAllRaceNames() {
        Optional<List<String>> raceList = Optional.of(repository.findAll().stream().map(RaceEntity::getRaceName).collect(Collectors.toList()));
        return raceList.get();
    }
}
