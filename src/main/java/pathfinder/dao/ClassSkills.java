package pathfinder.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "skills")
public class ClassSkills {
    @Id
    private Integer id;

    @Column
    private String skill;

    @Column
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "name")
    private PlayableClassEntity playableClass;
}
