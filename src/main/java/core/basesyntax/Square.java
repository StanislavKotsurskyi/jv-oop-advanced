package core.basesyntax;

public class Square extends Figure {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }
     public double squareArea() {
         return (double) side * side;
     }
}
