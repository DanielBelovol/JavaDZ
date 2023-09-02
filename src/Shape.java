
public abstract class Shape {
    public abstract String getShapeName();
}
class Circle extends Shape{
    @Override
    public String getShapeName() {
        return "Circle";
    }
}
//Square triangle rectangle
class Cube extends Shape{
    @Override
    public String getShapeName() {
        return "Cube";
    }
}
class Square extends Shape{
    @Override
    public String getShapeName() {
        return "Square";
    }
}
class Triangle extends Shape{
    @Override
    public String getShapeName() {
        return "Triangle";
    }
}
class Rectangle extends Shape{
    @Override
    public String getShapeName() {
        return "Rectangle";
    }
}
interface ShapePrinter{
    void printShapeName(Shape shape);
}
class ShapeNamePrinter implements ShapePrinter{
    @Override
    public void printShapeName(Shape shape) {
        System.out.println(shape.getShapeName());
    }
}
class Tester{
    public static void main(String[] args) {
        ShapeNamePrinter shapeNamePrinter = new ShapeNamePrinter();

        Shape circle = new Circle();
        Shape cube = new Cube();
        Shape square = new Square();
        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();

        shapeNamePrinter.printShapeName(circle);
        shapeNamePrinter.printShapeName(cube);
        shapeNamePrinter.printShapeName(square);
        shapeNamePrinter.printShapeName(triangle);
        shapeNamePrinter.printShapeName(rectangle);
    }
}
