package core.basesyntax;

public class Rectangle extends Figure {
    private int length;

    private int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public double findArea() {
        return (double) length * width;
    }
}
