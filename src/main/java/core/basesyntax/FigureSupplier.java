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
                    random.nextInt(100) + 1);
            case SQUARE -> new Square(randomColor,
                    random.nextInt(100) + 1);
            case RECTANGLE -> new Rectangle(randomColor,
                    random.nextInt(100) + 1,
                    random.nextInt(100) + 1);
            case RIGHTTRIANGLE -> new RightTriangle(randomColor,
                    random.nextInt(100) + 1,
                    random.nextInt(100) + 1);
            case ISOSCELESTRAPEZOID -> new IsoscelesTrapezoid(randomColor,
                    random.nextInt(100) + 1,
                    random.nextInt(100) + 1,
                    random.nextInt(100) + 1);
        };
    }
}
