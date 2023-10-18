package ss7.prac.resizable_and_colorable;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[(int) Math.floor(Math.random() * 20)];
        for (int i = 0; i < shapes.length; i++) {
            if (i % 2 == 0) {
                shapes[i] = new Circle();
            } else {
                shapes[i] = new Rectangle();
            }
        }
        Circle circle;
        Rectangle rectangle;
        for (Shape ele : shapes) {
            if (ele instanceof Circle) {
                circle = (Circle) ele;
                System.out.println("Circle area before: " + circle.getArea());
                circle.resize(Math.random() * 100 + 100);
                System.out.println("Circle area after: " + circle.getArea());
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
