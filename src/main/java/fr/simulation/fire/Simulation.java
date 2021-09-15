package fr.simulation.fire;

import fr.simulation.fire.model.BoxState;
import fr.simulation.fire.model.Direction;
import fr.simulation.fire.model.Pointer;
import fr.simulation.fire.service.impl.BoardBuilder;
import fr.simulation.fire.service.impl.ChooseDirectionRandomly;
import fr.simulation.fire.service.impl.FireFileWriterImpl;
import fr.simulation.fire.service.impl.FireSimpleMovement;

import java.awt.*;
import java.io.IOException;
import java.util.HashMap;

public class Simulation {

    public void run(int height, int length, Pointer pointer) throws IOException {
        HashMap<Point, BoxState> board = new HashMap<>();
        new BoardBuilder().build(board, length, height);

        Direction direction = new ChooseDirectionRandomly().choose(board, pointer);
        new FireSimpleMovement().move(board, pointer, direction);
        new FireFileWriterImpl().write(board);

    }

}
