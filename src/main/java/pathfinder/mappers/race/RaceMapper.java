package pathfinder.mappers.race;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.ReportingPolicy;

import pathfinder.dao.RaceEntity;
import pathfinder.models.race.RaceModel;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT, uses =
        AttributesMapper.class)
public interface RaceMapper {

    @Mapping(source = "raceAttribute", target = "attributesEntity")
    RaceEntity modelRaceToEntity(RaceModel race);

    @InheritInverseConfiguration(name = "modelRaceToEntity")
    RaceModel entityRaceToModel(RaceEntity race);

    default List<RaceModel> mapRaceEntitiesToModels(List<RaceEntity> raceEntities) {
        return Optional.ofNullable(raceEntities)
                       .filter(list -> !list.isEmpty())
                       .orElse(Collections.emptyList())
                       .stream()
                       .map(this::entityRaceToModel)
                       .collect(Collectors.toList());
    }
}

