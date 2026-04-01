package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int FIGURE_COUNT = 6;
        FigureSupplier defaultFigure = new FigureSupplier();
        FigureSupplier randomFigure = new FigureSupplier();

        Figure[] array = new Figure[FIGURE_COUNT];
        for (int i = 0; i < array.length / 2; i++) {
            array[i] = randomFigure.getRandomFigure();
        }

        for (int i = array.length / 2; i < array.length; i++) {
            array[i] = defaultFigure.getDefaultFigure();
        }

        for (Figure figure : array) {
            figure.draw();
        }
    }
}
