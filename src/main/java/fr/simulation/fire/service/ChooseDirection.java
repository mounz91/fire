package fr.simulation.fire.service;

import fr.simulation.fire.model.BoxState;
import fr.simulation.fire.model.Direction;
import fr.simulation.fire.model.Pointer;

import java.awt.*;
import java.util.HashMap;

public interface ChooseDirection {

    Direction choose(HashMap<Point, BoxState> board, Pointer pointer);
}
