package ss5.prac;

public class Circle {
    private double radius = 1;
    private String color = "red";

    Circle() {

    }

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * Math.pow(Math.PI, 2);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
    }
}
