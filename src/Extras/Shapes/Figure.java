package Extras.Shapes;

import java.awt.Color;

public class Figure {
    public final Color green = Color.GREEN;
    public final Color red = Color.RED;
    public final Color blue = Color.BLUE;

    protected int x;
    protected int y;
    protected Color color;

    public Figure(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Figure(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = switch (color) {
        case "red" -> this.red;
        case "blue" -> this.blue;
        case "green" -> this.green;
        default -> Color.PINK;
        };
    }

    @Override
    public String toString() {
        return "Figure( x =" + x + " , y =" + y + " , color=\"" + color + "\")";
    }

}
