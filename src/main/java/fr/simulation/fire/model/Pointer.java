package fr.simulation.fire.model;

import java.awt.*;

public class Pointer {

    private Point position;
    private Point positionAfterFireMovement;
    private BoxState state;

    public BoxState getState() {
        return state;
    }

    public void setState(BoxState state) {
        this.state = state;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public Point getPositionAfterFireMovement() {
        return positionAfterFireMovement;
    }

    public void setPositionAfterFireMovement(Point positionAfterFireMovement) {
        this.positionAfterFireMovement = positionAfterFireMovement;
    }
}
