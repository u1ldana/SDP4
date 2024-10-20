package task8;

public class ShapeAreaCalculatorApp {

    public static void main(String[] args) {

        Shape circle = new Circle(6);
        Shape rectangle = new Rectangle(5, 8);
        Shape triangle = new Triangle(4, 9);

        Drawing drawing = new Drawing();
        drawing.addShape(circle);
        drawing.addShape(rectangle);
        drawing.addShape(triangle);

        AreaCalculator areaCalculator = new AreaCalculator();

        drawing.calculateAreas(areaCalculator);
    }
}
