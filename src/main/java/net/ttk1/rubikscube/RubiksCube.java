package net.ttk1.rubikscube;

import java.util.ArrayList;
import java.util.List;

public class RubiksCube {
    private final Face FRONT;
    private final Face BACK;

    private final Face UP;
    private final Face Down;

    private final Face LEFT;
    private final Face RIGHT;

    private List<Face> faces;
    public RubiksCube() {
        FRONT = new Face(Face.Direction.FRONT);
        BACK = new Face(Face.Direction.BACK);
        UP = new Face(Face.Direction.UP);
        Down = new Face(Face.Direction.DOWN);
        LEFT = new Face(Face.Direction.LEFT);
        RIGHT = new Face(Face.Direction.RIGHT);

        faces = new ArrayList<>();
        faces.add(FRONT);
        faces.add(BACK);
        faces.add(UP);
        faces.add(Down);
        faces.add(LEFT);
        faces.add(RIGHT);
    }

    public Face getFRONT() {
        return FRONT;
    }

    public Face getBACK() {
        return BACK;
    }

    public Face getUP() {
        return UP;
    }

    public Face getDown() {
        return Down;
    }

    public Face getLEFT() {
        return LEFT;
    }

    public Face getRIGHT() {
        return RIGHT;
    }

    public List<Face> getFaces() {
        return faces;
    }
}
