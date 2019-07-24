package pathfinder.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pathfinder.dao.RaceEntity;

import java.util.Optional;

public interface RaceRepository extends JpaRepository<RaceEntity, String> {

    Optional<RaceEntity> findByName(String name);
}
