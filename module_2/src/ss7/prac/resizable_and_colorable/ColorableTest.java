package ss7.prac.resizable_and_colorable;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[(int) Math.floor(Math.random() * 20)];
        for (int i = 0; i < shapes.length; i++) {
            if (i % 2 == 0) {
                shapes[i] = new Circle();
            } else {
                shapes[i] = new Square();
            }
        }

        for (Shape shape : shapes) {
            if (shape instanceof Square) {
                Square tempSquare = (Square) shape;
                tempSquare.howToColor();
            } else {
                System.out.println("Not a square");
            }
            System.out.println(shape.getArea());
            System.out.println("-------------");
        }
    }
}
