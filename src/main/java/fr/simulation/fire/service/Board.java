package fr.simulation.fire.service;

import fr.simulation.fire.model.BoxState;

import java.awt.*;
import java.util.HashMap;

public interface Board {

    void build(HashMap<Point, BoxState> board, int length, int height);
}
