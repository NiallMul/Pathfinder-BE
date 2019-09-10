package pathfinder.dao;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "attributes")
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

    @Column
    private Integer charisma;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "race_name")
    private RaceEntity race;
}
