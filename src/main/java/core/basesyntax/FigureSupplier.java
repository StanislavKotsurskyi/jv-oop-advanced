package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_COLOR = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX = 100;
    private static final String defaultColor = String.valueOf(Colors.values()[DEFAULT_COLOR]);
    private static final Circle defaultFigure = new Circle(defaultColor, DEFAULT_RADIUS);
    private final Random random = new Random();

    public Figure getDefaultFigure() {
        return defaultFigure;
    }

    public Figure getRandomFigure() {
        String randomColor = new ColorSupplier().getRandomColor();
        return switch (Figures.values()[random.nextInt(Figures.values().length)]) {
            case CIRCLE -> new Circle(randomColor,
                    random.nextInt(MAX) + 1);
            case SQUARE -> new Square(randomColor,
                    random.nextInt(MAX) + 1);
            case RECTANGLE -> new Rectangle(randomColor,
                    random.nextInt(MAX) + 1,
                    random.nextInt(MAX) + 1);
            case RIGHTTRIANGLE -> new RightTriangle(randomColor,
                    random.nextInt(MAX) + 1,
                    random.nextInt(MAX) + 1);
            case ISOSCELESTRAPEZOID -> new IsoscelesTrapezoid(randomColor,
                    random.nextInt(MAX) + 1,
                    random.nextInt(MAX) + 1,
                    random.nextInt(MAX) + 1);
        };
    }
}
