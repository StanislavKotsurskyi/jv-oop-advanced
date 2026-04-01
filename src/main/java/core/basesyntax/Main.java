package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] array = new Figure[6];
        for (int i = 0; i < array.length / 2; i++) {
            Figure figure = new FigureSupplier().getRandomFigure();
            array[i] = figure;
        }

        for (int i = array.length / 2; i < array.length; i++) {
            Figure figure = new FigureSupplier().getDefaultFigure();
            array[i] = figure;
        }

        for (Figure figure : array) {
            System.out.println("Figure: "
                    + 1
                    + ", area: "
                    + figure.findArea() + "sq. units, side: "
                    + figure.getColor());
        }
    }
}
