package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstParallel;
    private int secondParallel;
    private int height;

    public int getFirstParallel() {
        return firstParallel;
    }

    public void setFirstParallel(int firstParallel) {
        this.firstParallel = firstParallel;
    }

    public int getSecondParallel() {
        return secondParallel;
    }

    public void setSecondParallel(int secondParallel) {
        this.secondParallel = secondParallel;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public IsoscelesTrapezoid(String color, int firstParallel, int secondParallel, int height) {
        super(color);
        this.firstParallel = firstParallel;
        this.secondParallel = secondParallel;
        this.height = height;
    }

    public double isoscelesTrapezoidArea() {
        return (double) firstParallel + secondParallel / 2 * height;
    }
}
