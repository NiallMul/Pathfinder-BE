package pathfinder.mappers.classes;

import org.mapstruct.*;
import pathfinder.dao.PlayableClassEntity;
import pathfinder.models.playable_class.PlayableClassModel;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT)
public interface ClassMapper {

    @Mapping(source = "className", target = "name")
    @Mapping(source = "weaponAndArmourProficiency", target = "weaponAndArmourPref")
    @Mapping(target = "skills", expression = "java(new java.util.HashSet<>())")
    PlayableClassEntity modelClassToEntity(PlayableClassModel model);

    @InheritInverseConfiguration
    PlayableClassModel entityClassToModel(PlayableClassEntity entity);

    default List<PlayableClassModel> mapClassEntitiesToModels(List<PlayableClassEntity> classEntityList) {
        return Optional.ofNullable(classEntityList)
                .filter(list -> !list.isEmpty())
                .orElse(Collections.emptyList())
                .stream()
                .map(this::entityClassToModel)
                .collect(Collectors.toList());
    }
}
