package fr.simulation.fire.service.impl;

import fr.simulation.fire.model.Direction;
import fr.simulation.fire.service.ChooseDirection;

import static fr.simulation.fire.model.Direction.getRandomDirection;

public class ChooseDirectionRandomly implements ChooseDirection {

    @Override
    public Direction choose() {

        return getRandomDirection();

    }
}
