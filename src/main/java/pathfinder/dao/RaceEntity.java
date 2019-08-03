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
public class RaceEntity {
    @Column(name = "race_name")
    @Id
    private String raceName;

    @Column(name = "physical_desc")
    private String physicalDesc;

    @Column(name = "society")
    private String society;

    @Column(name = "relations")
    private String relations;

    @Column(name = "alignment")
    private String alignment;

    @Column(name = "religion")
    private String religion;

    @Column(name = "adventurers")
    private String adventurers;

    @Column(name = "maleName")
    private String maleName;

    @Column(name = "femaile_name")
    private String femaileName;

    @Column(name = "attribute_id")
    @OneToOne
    private AttributesEntity attributesEntity;
}
