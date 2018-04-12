package net.ttk1.rubikscube;

import java.util.ArrayList;
import java.util.List;

public class Face {
    private Direction direction;
    private List<Panel> panels;

    public Face(Direction direction) {
        this.direction = direction;

        panels = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            Panel panel = new Panel(direction.color, String.valueOf(i));
            panels.add(panel);
        }
    }

    public void printRow(int rowNum) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            stringBuilder.append(panels.get(rowNum + i*3).toString() + " ");
        }

        String rowString = stringBuilder.toString();
        moveCursor(direction.getPosRow() + 2*rowNum + 1, direction.posCol + 1);
        System.out.print(rowString);
    }

    public void printCol(int colNum) {

    }

    public void print() {
        for (int i =0; i < 3; i++) {
            printRow(i);
        }
    }

    private void moveCursor(int row, int col) {
        String rowString = String.valueOf(row);
        String colString = String.valueOf(col);

        System.out.print("\u001B[" + rowString + ";" + colString +"f");
    }

    public static enum Direction {
        UP(Color.ANSI_PURPLE_BACKGROUND, 0, 12),
        DOWN(Color.ANSI_RED_BACKGROUND, 6*2, 12),
        FRONT(Color.ANSI_WHITE_BACKGROUND, 6, 12),
        BACK(Color.ANSI_YELLOW_BACKGROUND, 6, 12*3),
        LEFT(Color.ANSI_GREEN_BACKGROUND, 6, 0),
        RIGHT(Color.ANSI_CYAN_BACKGROUND, 6, 12*2);

        private String color;
        private int posRow;
        private int posCol;

        private Direction(String color, int posRow, int posCol){
            this.color = color;
            this.posRow = posRow;
            this.posCol = posCol;
        }

        public String getColor() {
            return this.color;
        }

        public int getPosRow() {
            return this.posRow;
        }

        public int getPosCol() {
            return this.posCol;
        }
    }
}
