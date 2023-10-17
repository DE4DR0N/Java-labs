package Lab05;
/**
 * Define the main class
 *
 * @author Gedrevich E.A.
 * @version 1.0 17.10.2023
 */
public class PRACTICE41_TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(3.5);
        Circle circle3 = new Circle("green");
        Circle circle4 = new Circle(4.5, "white");
        System.out.println("The radius of circle1 is " + circle1.getRadius());
        System.out.println("The color of circle2 is " + circle2.getColor());
        System.out.println("The length of circle3 is " + circle3.getLength());
        System.out.println("The area of circle4 is " + circle4.getArea());
        System.out.println("Change the radius of circle1 to 6.5");
        circle1.setRadius(6.5);
        System.out.println("Change the color of circle2 to black");
        circle2.setColor("black");
        System.out.println("The radius of circle1 is " + circle1.getRadius());
        System.out.println("The color of circle2 is " + circle2.getColor());
    }
}
/**
 * Define the Circle class
 *
 * @author Gedrevich E.A.
 * @version 1.0 17.10.2023
 */
    class Circle {
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
    public  Circle(String color) {
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
}
