package pathfinder.models;

import lombok.*;

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

    private String femaileName;

    private RaceAttribute raceAttribute;
}
