public class Trapezoid extends Shape {

    double sideA;
    double sideB;
    double sideC;
    double sideD;
    double h;

    public Trapezoid(double sideA, double sideB, double sideC, double sideD, double h) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
        this.h = h;
    }

    @Override
    public double calcArea() {
        area = ((sideA + sideC) * h) / 2;
        return area;
    }

    @Override
    public double calcCircumference() {
        circumference = sideA + sideB + sideC + sideD;
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
