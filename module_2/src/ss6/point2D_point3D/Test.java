package ss6.point2D_point3D;

public class Test {
    public static void main(String[] args) {
        Point3D my3DPointer = new Point3D(1, 2, 3);
        Point2D myFake3D = new Point3D(4, 5, 6);
        Point2D my2DPointer = new Point2D(7, 8);
        System.out.println(my3DPointer.toString());
        System.out.println(myFake3D.toString());
        System.out.println(my2DPointer.toString());
    }
}
