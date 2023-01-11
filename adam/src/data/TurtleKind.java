package data;

public enum TurtleKind {
    TORTOISE("ladowy"),
    EMYD("blotny"),
    SEATURTLE("morski");

    private final String description;

    TurtleKind(String description) {

        this.description = description;
    }

    public String getDescription() {

        return description;
    }

}


