package pathfinder.enums.class_skills;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public enum ClassSkills {
    ACROBATICS("acr(dex)"),
    APPRAISE("apr(int)"),
    BLUFF("bluff(cha)"),
    CLIMB("climb(str)"),
    CRAFT("craft(int)"),
    DIPLOMACY("diplo(cha)"),
    DISABLE_DEVICE("dis_dev(dex)"),
    DISGUISE("disguise(cha)"),
    ESCAPE_ARTIST("escape_artist(dex)"),
    FLY("fly(dex)"),
    HANDLE_ANIMAL("handle_animal(cha)"),
    HEAL("heal(wis)"),
    INTIMIDATE("intimidate(cha)"),
    KNOWLEDGE_ALL("knowledge(all)(int)"),
    KNOWLEDGE_TRAINED_ONLY("knowledge(int)"),
    LINGUISTICS_TRAINED_ONLY("linguistics(int)"),
    PERCEPTION("perception(wis)"),
    PERFORM("perform(cha)"),
    PROFESSION_TRAINED_ONLY("profession(wis)"),
    RIDE("ride(dex)"),
    SENSE_MOTIVE("sense_motive(wis)"),
    SLEIGHT_OF_HAND("sleight_of_hand(dex)"),
    SPELLCRAFT("spellcraft(int)"),
    STEALTH("stealth(dex)"),
    SURVIVAL("survival(wis)"),
    SWIM("swim(str)"),
    USE_MAGIC_DEVICE_TRAINED_ONLY("use_magic_devise(cha)");

    ClassSkills(String s) {
    }
}
