package net.ttk1.rubikscube;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.print("\u001B[2J");
        RubiksCube rubiksCube = new RubiksCube();
        List<Face> faces = rubiksCube.getFaces();

        for (Face face: faces) {
            face.print();
        }
        System.out.print("\u001B[30;0f");
    }
}
