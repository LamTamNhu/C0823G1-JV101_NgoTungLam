package ss7.prac.resizable_and_colorable;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[(int) Math.floor(Math.random() * 20)];
        for (int i = 0; i < shapes.length; i++) {
            if (i % 2 == 0) {
                shapes[i] = new Circle();
            } else {
                shapes[i] = new Rectangle();
            }
        }

        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                Rectangle tempRect = (Rectangle) shape;
                tempRect.howToColor();
            } else {
                System.out.println("Not a rectangle");
            }
            System.out.println(shape.getArea());
            System.out.println("-------------");
        }
    }
}
