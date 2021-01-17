package pathfinder.service.class_service;

import pathfinder.models.playable_class.PlayableClassModel;

import java.util.List;

public interface PlayableClassService {
    List<PlayableClassModel> listAllClasses();

    PlayableClassModel getClassByName(String name);

    List<String> getAllClasses();
}
