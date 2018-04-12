package net.ttk1.rubikscube;

public class Panel {
    private final String color;
    private final String label;

    public Panel(String color, String label) {
        this.color = color;
        this.label = label;
    }

    @Override
    public String toString(){
        return Color.ANSI_BLACK + color + " " + label + " " + Color.ANSI_RESET;
    }
}
