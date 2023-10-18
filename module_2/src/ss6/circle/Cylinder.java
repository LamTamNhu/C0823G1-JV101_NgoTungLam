package ss6.circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "radius: " + getRadius()
                + "\ncolor: " + getColor()
                + "\nheight: " + height;
    }
}
