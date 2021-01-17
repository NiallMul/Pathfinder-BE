package pathfinder.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pathfinder.dao.PlayableClassEntity;

import java.util.List;

public interface PlayableClassRepository extends JpaRepository<PlayableClassEntity, String> {
    List<PlayableClassEntity> findAll();

    PlayableClassEntity findByName(String name);
}
