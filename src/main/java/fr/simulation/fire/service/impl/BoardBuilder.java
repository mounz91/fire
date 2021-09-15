package fr.simulation.fire.service.impl;

import fr.simulation.fire.model.BoxState;
import fr.simulation.fire.service.Board;

import java.awt.*;
import java.util.HashMap;

public class BoardBuilder implements Board {

    public void build(HashMap<Point, BoxState> board, int length, int height) {

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < height; j++) {
                Point position = new Point(i, j);
                board.put(position, BoxState.TREE);
            }
        }

    }
}
