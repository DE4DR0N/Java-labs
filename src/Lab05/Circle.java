package Lab05;

/**
 * Define the Circle class
 *
 * @author Gedrevich E.A.
 * @version 1.0 17.10.2023
 */
public class Circle {
    //Private variables
    private double radius;
    private String color;

    //Constructors (перегруженные)
    //1st Constructor
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    //2nd Constructor
    public Circle(double radius) {
        this.radius = radius;
        color = "red";
    }

    //3rd Constructor
    public Circle(String color) {
        radius = 1.0;
        this.color = color;
    }

    //4th Constructor
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }


    //Public methods
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getLength() {
        return 2 * Math.PI * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString() { return "Окружность: радиус = " + radius + " цвет = " + color +
            " длина = " + getLength(); }
}
