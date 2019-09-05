package pathfinder.service.class_service;

import java.util.ArrayList;
import java.util.List;

import pathfinder.models.playable_class.PlayableClassModel;

public class PlayableClassServiceImpl implements PlayableClassService{

    @Override
    public List<PlayableClassModel> listAllClasses() {
        List<PlayableClassModel> classList = new ArrayList<>();
        classList.add(new PlayableClassModel());
        return classList;
    }
}
