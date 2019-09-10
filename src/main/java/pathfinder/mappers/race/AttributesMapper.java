package pathfinder.mappers.race;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import pathfinder.dao.AttributesEntity;
import pathfinder.models.race.RaceAttribute;

@Mapper
public interface AttributesMapper {

    @Mapping(target = "id", ignore = true)
    AttributesEntity mapAttributesToEntity(RaceAttribute raceAttribute);

    @InheritInverseConfiguration(name = "mapAttributesToEntity")
    RaceAttribute mapAttributesToModel(AttributesEntity attributesEntity);
}
