package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public double circleArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
