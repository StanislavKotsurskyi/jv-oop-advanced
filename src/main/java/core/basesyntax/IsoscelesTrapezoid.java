package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstParallel;

    private int secondParallel;
    private int height;

    public IsoscelesTrapezoid(String color, int firstParallel, int secondParallel, int height) {
        super(color);
        this.firstParallel = firstParallel;
        this.secondParallel = secondParallel;
        this.height = height;
    }

    public int getFirstParallel() {
        return firstParallel;
    }

    public int getSecondParallel() {
        return secondParallel;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double findArea() {
        return (double) firstParallel + secondParallel / 2 * height;
    }
}
