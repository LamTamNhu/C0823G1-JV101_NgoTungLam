package ss6.circle;

public class Circle {
    private double radius;
    private String color;

    Circle() {
    }

    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return radius * Math.pow(Math.PI, 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "radius: " + radius
                + "\ncolor: " + color;
    }
}
