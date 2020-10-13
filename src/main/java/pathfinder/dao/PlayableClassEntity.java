package pathfinder.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "classes")
public class PlayableClassEntity {
    @Id
    @Column
    private String name;

    @Column
    private String role;

    @Column
    private String alignment;

    @Column
    private Integer hitDie;

    @Column(name = "skills_per_level")
    private Integer skillsPerLevel;

    @Column(name = "weapons_armour_proficiency")
    private String weaponAndArmourPref;

    @OneToMany(mappedBy = "playableClass")
    private List<ClassSkills> skillList;
}
