package fr.simulation.fire.service.impl;

import fr.simulation.fire.model.BoxState;
import fr.simulation.fire.model.Direction;
import fr.simulation.fire.model.Pointer;
import fr.simulation.fire.service.FireMove;

import java.awt.*;
import java.util.HashMap;

public class FireSimpleMovement implements FireMove {

    @Override
    public void move(HashMap<Point, BoxState> board, Pointer box, Direction movement) {
        Point position = box.getPositionBeforeFireMovement();
        Point newPosition;

        if (movement.equals(Direction.RIGHT)) {
            newPosition = new Point(position.x + 1, position.y);
            board.replace(position, BoxState.ASH);
            board.replace(newPosition, BoxState.FIRE);
            box.setPositionAfterFireMovement(newPosition);
        }

        if (movement.equals(Direction.LEFT)) {
            newPosition = new Point(position.x - 1, position.y);
            board.replace(position, BoxState.ASH);
            board.replace(newPosition, BoxState.FIRE);
            box.setPositionAfterFireMovement(newPosition);
        }
        if (movement.equals(Direction.UP)) {
            newPosition = new Point(position.x, position.y + 1);
            board.replace(position, BoxState.ASH);
            board.replace(newPosition, BoxState.FIRE);
            box.setPositionAfterFireMovement(newPosition);
        }
        if (movement.equals(Direction.DOWN)) {
            newPosition = new Point(position.x, position.y - 1);
            board.replace(position, BoxState.ASH);
            board.replace(newPosition, BoxState.FIRE);
            box.setPositionAfterFireMovement(newPosition);
        }

    }
}
