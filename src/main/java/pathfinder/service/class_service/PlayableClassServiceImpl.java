package pathfinder.service.class_service;

import org.springframework.stereotype.Service;
import pathfinder.dao.PlayableClassEntity;
import pathfinder.dao.repository.PlayableClassRepository;
import pathfinder.mappers.classes.ClassMapper;
import pathfinder.models.playable_class.PlayableClassModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
}
