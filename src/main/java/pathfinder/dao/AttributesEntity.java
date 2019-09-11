package pathfinder.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

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
    @GeneratedValue(generator = "UUID-TEST")
    @GenericGenerator(name = "UUID-TEST", strategy = "uuid2")
    private String id;

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
}
