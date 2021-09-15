package fr.simulation.fire;

import fr.simulation.fire.model.BoxState;
import fr.simulation.fire.service.impl.BoardBuilder;

import java.awt.*;
import java.util.HashMap;

public class Simulation {

    public void run(int height, int length) {
        HashMap<Point, BoxState> board = new HashMap<>();

        new BoardBuilder().build(board, length, height);

    }

}
