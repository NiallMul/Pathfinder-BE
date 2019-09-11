package pathfinder.dao.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import pathfinder.dao.RaceEntity;

public interface RaceRepository extends JpaRepository<RaceEntity, String> {

    Optional<RaceEntity> findRaceEntityByRaceName(String name);
}
