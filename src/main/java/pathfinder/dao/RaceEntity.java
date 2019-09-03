package pathfinder.dao;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

    @Column(name = "female_name")
    private String femaleName;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "attribute_id")
    private AttributesEntity attributesEntity;
}
