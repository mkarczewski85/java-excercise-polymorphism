public class Square extends Shape {

    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calcArea() {
        area = side * side;
        return area;
    }

    @Override
    public double calcCircumference() {
        circumference = 4 * side;
        return circumference;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getCircumference() {
        return circumference;
    }
}
