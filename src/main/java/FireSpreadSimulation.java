import fr.simulation.fire.Simulation;
import fr.simulation.fire.model.BoxState;
import fr.simulation.fire.model.Pointer;

import java.awt.*;
import java.io.IOException;

public class FireSpreadSimulation {


    public static void main(String[] args) throws IOException {
        Pointer pointer = new Pointer();
        pointer.setPosition(new Point(2, 2));
        pointer.setState(BoxState.FIRE);
        new Simulation().run(5, 5, pointer);
    }
}
