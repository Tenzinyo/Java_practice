public class Rectangle extends Shape {

    public Rectangle(double x, double y) {
        super(x, y);
    }

    @Override
    public double getArea() {
        return (x*y);
    }

    @Override
    public double getPerimeter() {
        return (x+y+x+y);
    }

    @Override
    public String toString() {
        return "The area of rectangle is " + getArea();
    }
}
