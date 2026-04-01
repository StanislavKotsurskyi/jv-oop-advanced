package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String defaultColor = String.valueOf(Colors.values()[5]);
    private static final Circle defaultFigure = new Circle(defaultColor, 10);
    private final Random random = new Random();

    public Figure getDefaultFigure() {
        return defaultFigure;
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(Figures.values().length);
        String randomColor = new ColorSupplier().getRandomColor();
        return switch (Figures.values()[index]) {
            case CIRCLE -> new Circle(randomColor,
                    new Random().nextInt());
            case SQUARE -> new Square(randomColor,
                    new Random().nextInt());
            case RECTANGLE -> new Rectangle(randomColor,
                    new Random().nextInt(),
                    new Random().nextInt());
            case RIGHTTRIANGLE -> new RightTriangle(randomColor,
                    new Random().nextInt(),
                    new Random().nextInt());
            case ISOSCELESTRAPEZOID -> new IsoscelesTrapezoid(randomColor,
                    new Random().nextInt(),
                    new Random().nextInt(),
                    new Random().nextInt());
        };
    }
}
