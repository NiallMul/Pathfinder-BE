package pathfinder.models.race;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RaceModel {

    private String raceName;

    private String physicalDesc;

    private String society;

    private String relations;

    private String alignment;

    private String religion;

    private String adventurers;

    private String maleName;

    private String femaleName;

    private RaceAttribute raceAttribute;
}
