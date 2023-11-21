package Lab08;

public class Trapezoid extends Shape{
    private double height;
    private double width;

    public Trapezoid() {
        super();
        this.width = 0;
        this.height = 0;
    }
    public Trapezoid(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height*width;
    }

    @Override
    public String toString() {
        return "Trapezoid{" +
                "height=" + height +
                ", width=" + width +
                ", color=" + getColor() +
                ", area=" + getArea() +
                '}';
    }
}
