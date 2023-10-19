package ss7.prac.resizable_and_colorable;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        int count = 1;
        for (int i = 0; i < shapes.length; i++) {
            if (count == 1) {
                shapes[i] = new Circle();
                count++;
            } else if (count == 2) {
                shapes[i] = new Rectangle();
                count++;
            } else {
                shapes[i] = new Square();
                count = 1;
            }
        }

        Circle circle;
        Rectangle rectangle;
        Square square;
        for (Shape ele : shapes) {
            if (ele instanceof Circle) {
                circle = (Circle) ele;
                System.out.println("Circle area before: " + circle.getArea());
                circle.resize(Math.random() * 100 + 100);
                System.out.println("Circle area after: " + circle.getArea());
                System.out.println("------------------");
            } else if (ele instanceof Square) {
                square = (Square) ele;
                System.out.println("Square area before: " + square.getArea());
                square.resize(Math.random() * 100 + 100);
                System.out.println("Square area after: " + square.getArea());
                System.out.println("------------------");
            } else {
                rectangle = (Rectangle) ele;
                System.out.println("Rectangle area before: " + rectangle.getArea());
                rectangle.resize(Math.random() * 100 + 100);
                System.out.println("Rectangle area after: " + rectangle.getArea());
                System.out.println("------------------");
            }
        }
    }
}
