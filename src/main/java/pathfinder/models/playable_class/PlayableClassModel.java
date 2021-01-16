package pathfinder.models.playable_class;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlayableClassModel {
    private String className;
    private String role;
    private String alignment;
    private Integer hitDie;
    private List<ClassSkillModel> classSkills;
    private Integer skillsPerLevel;
    private String weaponAndArmourProficiency;
}
