package pathfinder.service.class_service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import pathfinder.models.playable_class.PlayableClassModel;

@Service
public class PlayableClassServiceImpl implements PlayableClassService{

    @Override
    public List<PlayableClassModel> listAllClasses() {
        List<PlayableClassModel> classList = new ArrayList<>();
        classList.add(new PlayableClassModel());
        return classList;
    }
}
