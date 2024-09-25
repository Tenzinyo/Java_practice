import java.util.Objects;

public class Circle {
    public double coordinateX,coordinateY,radius;

    public static void main(String []args){
        Circle newCircle= new Circle();
        System.out.println(newCircle.toString());
        Circle circle1= new Circle();
        Circle circle2= new Circle(1,2,3);
        System.out.println(circle1);
        System.out.println(circle2.equals(circle1));
    }
    public Circle(){
        radius=1.0;
        coordinateX=0.0;
        coordinateY=0.0;
    }

    public Circle(double radius){
        this.radius=radius;
        this.coordinateX=0.0;
        this.coordinateY=0.0;
    }

    public Circle(double newRadius, double x, double y){
        radius= newRadius;
        coordinateX=x;
        coordinateY=y;
    }

    @Override
    public String toString() {
        return "Circle with radius: "+ radius + "coordinate x: " +coordinateX + "and coordinate y: " + coordinateY;
    }

    public boolean equals(Circle circle){
        return Double.compare(circle.coordinateX, coordinateX)==0&&
                Double.compare(circle.coordinateY, coordinateY) ==0&&
                Double.compare(circle.radius,radius)==0;
    }
}
