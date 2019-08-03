package pathfinder.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class AttributesEntity {
    @Id
    private Integer id;
    @Column
    private Integer strength;
    @Column
    private Integer dexterity;
    @Column
    private Integer constitution;
    @Column
    private Integer intelligence;
    @Column
    private Integer wisdom;
    @OneToOne
    @Column
    private String race;
}
