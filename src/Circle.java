public class Circle extends Shape {

    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calcArea() {
        return Math.PI * (r * r);
    }

    @Override
    public double calcCircumference() {
        return 2 * Math.PI * r;
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
