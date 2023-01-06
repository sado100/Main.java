package _3_my_projects.animals_in_garden.data.creature.enums;

public enum TurtleEnum {
    INSIDE("schowany"),
    OUTSIDE("aktywny");

    private final String description;

    TurtleEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
