import fr.simulation.fire.model.BoxState;
import fr.simulation.fire.model.MovementDirection;
import fr.simulation.fire.model.Pointer;
import fr.simulation.fire.service.impl.BoardBuilder;
import fr.simulation.fire.service.FireMove;
import fr.simulation.fire.service.impl.FireSimpleMovement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;

class FireSpreadTest {

    private HashMap<Point, BoxState> board;
    private int l;
    private int h;

    private Point initialPosition;
    private FireMove fireMove;

    @BeforeEach
    void setup() {

        l = 5;
        h = 5;
        fireMove = new FireSimpleMovement();
        board = new HashMap<>();

        new BoardBuilder().build(board, l, h);
        initialPosition = new Point(2, 2);

    }

    @Test
    void build_board() {

        //WHEN
        new BoardBuilder().build(board, l, h);

        //THEN
        assertThat(board.size()).isEqualTo(25);
        assertThat(board).containsEntry(new Point(2, 2), BoxState.TREE);

    }


    @Test
    void fire_move_to_right() {
        //GIVEN
        Pointer pointer = new Pointer();
        pointer.setState(BoxState.FIRE);
        pointer.setPositionBeforeFireMovement(initialPosition);

        //WHEN
        fireMove.move(board, pointer, MovementDirection.RIGHT);

        //THEN
        assertThat(board.get(initialPosition)).isEqualTo(BoxState.ASH);
        assertThat(pointer.getState()).isEqualTo(BoxState.FIRE);
        assertThat(pointer.getPositionAfterFireMovement()).isEqualTo(new Point(3, 2));
    }

    @Test
    void fire_move_to_left() {
        //GIVEN
        Pointer pointer = new Pointer();
        pointer.setState(BoxState.FIRE);
        pointer.setPositionBeforeFireMovement(initialPosition);
        //WHEN
        fireMove.move(board, pointer, MovementDirection.LEFT);

        //THEN
        BoxState boxState = board.get(initialPosition);
        assertThat(boxState).isEqualTo(BoxState.ASH);
        assertThat(pointer.getState()).isEqualTo(BoxState.FIRE);
        assertThat(pointer.getPositionAfterFireMovement()).isEqualTo(new Point(1, 2));


    }

    @Test
    void fire_move_up() {
        //GIVEN
        Pointer pointer = new Pointer();
        pointer.setState(BoxState.FIRE);
        pointer.setPositionBeforeFireMovement(initialPosition);
        //WHEN
        fireMove.move(board, pointer, MovementDirection.UP);

        //THEN
        BoxState boxState = board.get(initialPosition);
        assertThat(boxState).isEqualTo(BoxState.ASH);
        assertThat(pointer.getState()).isEqualTo(BoxState.FIRE);
        assertThat(pointer.getPositionAfterFireMovement()).isEqualTo(new Point(2, 3));
    }

    @Test
    void fire_move_down() {
        //GIVEN
        Pointer pointer = new Pointer();
        pointer.setState(BoxState.FIRE);
        pointer.setPositionBeforeFireMovement(initialPosition);

        //WHEN
        fireMove.move(board, pointer, MovementDirection.DOWN);

        //THEN
        BoxState boxState = board.get(initialPosition);
        assertThat(boxState).isEqualTo(BoxState.ASH);
        assertThat(pointer.getState()).isEqualTo(BoxState.FIRE);
        assertThat(pointer.getPositionAfterFireMovement()).isEqualTo(new Point(2, 1));
    }


}
