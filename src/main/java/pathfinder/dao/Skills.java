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
@Table(name = "skills")
public class Skills {

    @Id
    private Integer id;

    @Column
    private String skill;

    @ManyToMany(mappedBy = "skills", fetch = FetchType.LAZY)
    private Set<PlayableClassEntity> classes = new HashSet<>();
}
