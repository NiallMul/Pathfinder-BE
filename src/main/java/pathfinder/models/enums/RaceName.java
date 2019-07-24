package pathfinder.models.enums;

public enum RaceName {
    DWARF("Dwarf"), ELF("Elf"), HUMAN("Human"), GNOME("Gnome"), HALF_ELF("Half-Elf"),
    HALF_ORC("Half-Orc"), HALFLING("Halfling");

    private String value;

    RaceName(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
