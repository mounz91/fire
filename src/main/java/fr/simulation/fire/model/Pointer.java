package fr.simulation.fire.model;

import java.awt.*;

public class Pointer {

    private Point positionBeforeFireMovement;
    private Point positionAfterFireMovement;
    private BoxState state;

    public BoxState getState() {
        return state;
    }

    public void setState(BoxState state) {
        this.state = state;
    }

    public Point getPositionBeforeFireMovement() {
        return positionBeforeFireMovement;
    }

    public void setPositionBeforeFireMovement(Point positionBeforeFireMovement) {
        this.positionBeforeFireMovement = positionBeforeFireMovement;
    }

    public Point getPositionAfterFireMovement() {
        return positionAfterFireMovement;
    }

    public void setPositionAfterFireMovement(Point positionAfterFireMovement) {
        this.positionAfterFireMovement = positionAfterFireMovement;
    }
}
