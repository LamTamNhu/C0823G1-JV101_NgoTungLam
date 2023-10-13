package ss4.prac.fan;

public class Fan {
    private final byte SLOW = 1;
    private final byte MEDIUM = 2;
    private final byte FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public byte getFAST() {
        return FAST;
    }

    public byte getMEDIUM() {
        return MEDIUM;
    }

    public byte getSLOW() {
        return SLOW;
    }

    public double getRadius() {
        return radius;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        if (on) {
            return ("Speed: " + speed + "\nColor: " + color + "\nRadius: " + radius + "\nFan is on");
        } else {
            return ("Color: " + color + "\nRadius: " + radius + "\nFan is off");
        }
    }
}
