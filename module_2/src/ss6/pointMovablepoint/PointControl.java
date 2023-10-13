package ss6.pointMovablepoint;

public class PointControl {
    public static void main(String[] args) {
        Point point = new Point(11, 23);
        MovablePoint movablePoint = new MovablePoint(1f, 2f, 3f, 4f);
        System.out.println(point);
        System.out.println(movablePoint);
        System.out.println(movablePoint.move());
        System.out.println(movablePoint.move());
    }
}
