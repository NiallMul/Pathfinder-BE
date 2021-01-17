package pathfinder.service.class_service;

import org.springframework.stereotype.Service;
import pathfinder.dao.PlayableClassEntity;
import pathfinder.dao.repository.PlayableClassRepository;
import pathfinder.mappers.classes.ClassMapper;
import pathfinder.models.playable_class.PlayableClassModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PlayableClassServiceImpl implements PlayableClassService {
    private final ClassMapper mapper;
    private final PlayableClassRepository repository;

    public PlayableClassServiceImpl(ClassMapper mapper, PlayableClassRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public List<PlayableClassModel> listAllClasses() {
        Optional<List<PlayableClassEntity>> playableClasses = Optional.of(repository.findAll());
        return mapper.mapClassEntitiesToModels(playableClasses.orElseGet(ArrayList::new));
    }

    @Override
    public PlayableClassModel getClassByName(String name) {
        Optional<PlayableClassEntity> playableClass = Optional.of(repository.findByName(name));
        return mapper.entityClassToModel(playableClass.get());
    }

    @Override
    public List<String> getAllClasses() {
        Optional<List<String>> classList = Optional.of(repository.findAll().stream().map(PlayableClassEntity::getName).collect(Collectors.toList()));
        return classList.get();
    }
}
