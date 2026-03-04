package model;

public enum Mention {

    AJOURNE("Ajournée"),
    PASSABLE("Passable"),
    ASSEZ_BIEN("Assez Bien"),
    BIEN("Bien"),
    TRES_BIEN("Très Bien");

    private final String label;

    Mention(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

}
