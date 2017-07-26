public class Rectangle extends Shape {

    double sideA;
    double sideB;


    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calcArea() {
        area = 2 * sideA * sideB;
        return area;
    }

    @Override
    public double calcCircumference() {
        circumference = (2 * sideA) + (2 * sideB);
        return circumference;
    }

    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public double getCircumference() {
        return this.circumference;
    }
}
