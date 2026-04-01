package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String defaultColor = String.valueOf(Colors.values()[5]);
    private static final Circle defaultFigure = new Circle(defaultColor, 10);

    public Figure getDefaultFigure() {
        return defaultFigure;
    }

    public Figure getRandomFigure() {
        int index = new Random().nextInt(Figures.values().length);
        String randomColor = new ColorSupplier().getRandomColor();
        if (index == 0) {
            return new Circle(randomColor,
                    new Random().nextInt());
        }
        if (index == 1) {
            return new Square(randomColor,
                    new Random().nextInt());
        }
        if (index == 2) {
            return new Rectangle(randomColor,
                    new Random().nextInt(),
                    new Random().nextInt());
        }
        if (index == 3) {
            return new RightTriangle(randomColor,
                    new Random().nextInt(),
                    new Random().nextInt());
        }
        if (index == 4) {
            return new IsoscelesTrapezoid(randomColor,
                    new Random().nextInt(),
                    new Random().nextInt(),
                    new Random().nextInt());
        }
        return null;
    }
}
