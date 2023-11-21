package Lab08;

public class Shape {
    private String color;

    public Shape() {this.color = "default color";}
    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return 0;
    }
    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
