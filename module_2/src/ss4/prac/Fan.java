package ss4.prac;

public class Fan {
    final byte SLOW = 1;
    final byte MEDIUM = 2;
    final byte FAST = 3;
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
            return ("Speed: " + speed + "\nColor: " + color + "\nRadius: " + radius + "\nFan is off");
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println("fan1\n" + fan1.toString());
        System.out.println("fan2\n" + fan2.toString());
    }
}
