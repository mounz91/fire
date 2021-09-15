package fr.simulation.fire.service;

import fr.simulation.fire.model.BoxState;
import fr.simulation.fire.model.MovementDirection;
import fr.simulation.fire.model.Pointer;

import java.awt.*;
import java.util.HashMap;

public interface FireMove {

    void move(HashMap<Point, BoxState> board, Pointer box, MovementDirection movement);
}
