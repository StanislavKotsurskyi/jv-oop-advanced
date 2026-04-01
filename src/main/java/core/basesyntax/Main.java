package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int index = 6;
        FigureSupplier figures = new FigureSupplier();

        Figure[] array = new Figure[index];
        for (int i = 0; i < array.length / 2; i++) {
            array[i] = figures.getRandomFigure();
        }

        for (int i = array.length / 2; i < array.length; i++) {
            array[i] = figures.getDefaultFigure();
        }

        for (Figure figure : array) {
            figure.draw();
        }
    }
}
