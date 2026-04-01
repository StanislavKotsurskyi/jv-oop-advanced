package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    String defaultColor = String.valueOf(Colors.values()[5]);
    Circle defaultFigure = new Circle(defaultColor, 10);

    public Figure getDefaultFigure() {
        return defaultFigure;
    }

    int index = new Random().nextInt(Figures.values().length);

    public Figures getRandomFigure() {
        return Figures.values()[index];
    }
}
