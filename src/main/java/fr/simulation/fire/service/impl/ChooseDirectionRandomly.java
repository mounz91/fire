package fr.simulation.fire.service.impl;

import fr.simulation.fire.model.BoxState;
import fr.simulation.fire.model.Direction;
import fr.simulation.fire.model.Pointer;
import fr.simulation.fire.service.ChooseDirection;

import java.awt.*;
import java.util.HashMap;

import static fr.simulation.fire.model.Direction.getRandomDirection;

public class ChooseDirectionRandomly implements ChooseDirection {

    @Override
    public Direction choose(HashMap<Point, BoxState> board, Pointer pointer) {

        return getRandomDirection();

    }
}
