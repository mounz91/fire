package fr.simulation.fire.model;

public enum BoxState {
    FIRE("fire"),
    ASH("ash"),
    TREE("tree");

    private String value;

    BoxState(String value) {
        this.value = value;
    }


    public String getValue() {
        return value;
    }
}
