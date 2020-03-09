package pathfinder.enums.class_skills;

import java.util.ArrayList;
import java.util.List;

public class BardSkills {
    private List<ClassSkills> skillsList;

    public BardSkills() {
        this.skillsList = new ArrayList<>();
        skillsList.add(ClassSkills.ACROBATICS);
        skillsList.add(ClassSkills.APPRAISE);
        skillsList.add(ClassSkills.BLUFF);
        skillsList.add(ClassSkills.CLIMB);
        skillsList.add(ClassSkills.CRAFT);
        skillsList.add(ClassSkills.DIPLOMACY);
        skillsList.add(ClassSkills.DISGUISE);
        skillsList.add(ClassSkills.ESCAPE_ARTIST);
        skillsList.add(ClassSkills.INTIMIDATE);
        skillsList.add(ClassSkills.KNOWLEDGE_ALL);
        skillsList.add(ClassSkills.LINGUISTICS_TRAINED_ONLY);
        skillsList.add(ClassSkills.PERCEPTION);
        skillsList.add(ClassSkills.PERFORM);
        skillsList.add(ClassSkills.PROFESSION_TRAINED_ONLY);
        skillsList.add(ClassSkills.SENSE_MOTIVE);
        skillsList.add(ClassSkills.SLEIGHT_OF_HAND);
        skillsList.add(ClassSkills.SPELLCRAFT);
        skillsList.add(ClassSkills.STEALTH);
        skillsList.add(ClassSkills.USE_MAGIC_DEVICE_TRAINED_ONLY);
    }
}
