package ss6.circle;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(4, "red");
//        System.out.println(circle.toString());
        Cylinder cylinder = new Cylinder(5, 10, "yellow");
//        System.out.println(cylinder.toString());
        System.out.println(cylinder.getVolume());
    }
}
