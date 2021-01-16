package pathfinder.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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

    @Column(name = "hit_die")
    private Integer hitDie;

    @Column(name = "skills_per_level")
    private Integer skillsPerLevel;

    @Column(name = "weapons_armour_proficiency")
    private String weaponAndArmourPref;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "class_skills",
            joinColumns = {
                    @JoinColumn(name = "class_name", referencedColumnName = "name",
                            nullable = false, updatable = false)},
            inverseJoinColumns = {
                    @JoinColumn(name = "skill_id", referencedColumnName = "id",
                            nullable = false, updatable = false)})
    private Set<Skills> skills = new HashSet<>();

}
