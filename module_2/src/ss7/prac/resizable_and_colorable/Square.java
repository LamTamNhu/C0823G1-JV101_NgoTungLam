package ss7.prac.resizable_and_colorable;

public class Square extends Rectangle implements Colorable {
    public Square() {
        setWidth(getLength());
    }

    public Square(double side) {
        setLength(side);
        setWidth(side);
    }

    public Square(double side, String color, boolean filled) {
        setLength(side);
        setWidth(side);
        setColor(color);
        setFilled(filled);
    }

    public double getPerimeter() {
        return getLength() * 4;
    }

    @Override
    public double getArea() {
        return getLength() * getLength();
    }

    @Override
    public String toString() {
        return "A Square with length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        setLength(getLength() * percent / 100);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
