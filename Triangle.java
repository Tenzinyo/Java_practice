public class Triangle extends Shape{

    public Triangle(double x, double y) {
        super(x, y);
    }

    @Override
    public double getArea() {
        return (x*y)/2;
    }

    @Override
    public String toString() {
        return "The area is "+ getArea();
    }

}
