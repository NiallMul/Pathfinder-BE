package pathfinder.enums.class_skills;

import java.util.ArrayList;
import java.util.List;

public class BarbarianSkills {
    private List<ClassSkills> barbarianSkillList;

    public BarbarianSkills() {
        barbarianSkillList = new ArrayList<>();
        barbarianSkillList.add(ClassSkills.ACROBATICS);
        barbarianSkillList.add(ClassSkills.CLIMB);
        barbarianSkillList.add(ClassSkills.CRAFT);
        barbarianSkillList.add(ClassSkills.HANDLE_ANIMAL);
        barbarianSkillList.add(ClassSkills.INTIMIDATE);
        barbarianSkillList.add(ClassSkills.KNOWLEDGE_TRAINED_ONLY);
        barbarianSkillList.add(ClassSkills.PERCEPTION);
        barbarianSkillList.add(ClassSkills.RIDE);
        barbarianSkillList.add(ClassSkills.SURVIVAL);
        barbarianSkillList.add(ClassSkills.SWIM);
    }
}
