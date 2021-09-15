package fr.simulation.fire.service;

import fr.simulation.fire.model.BoxState;

import java.awt.*;
import java.io.IOException;
import java.util.HashMap;

public interface FileReader {

    void read(HashMap<Point, BoxState> board) throws IOException;
}
