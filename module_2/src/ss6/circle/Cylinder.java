package ss6.circle;

public class Cylinder extends Circle {
    double height;

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
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        return "radius: " + radius
                + "\ncolor: " + color
                + "\nheight: " + height;
    }
}
