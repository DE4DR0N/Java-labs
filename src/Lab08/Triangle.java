package Lab08;

public class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle() {
        super();
        this.height = 0;
        this.base = 0;
    }
    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return base*height/2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                ", color=" + getColor() +
                ", area=" + getArea() +
                '}';
    }
}
