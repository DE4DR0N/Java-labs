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
        System.out.println(circle1.toString());
        System.out.println(circle2.toString());
        System.out.println("Цвет экземпляра 3 = " + circle3.getColor());
        System.out.println(circle4.toString() + " площадь = " + circle4.getArea());
        System.out.println("Change the radius of circle1 to 6.5");
        circle1.setRadius(6.5);
        System.out.println("Change the color of circle2 to black");
        circle2.setColor("black");
        System.out.println(circle1.toString());
        System.out.println(circle2.toString());
    }
}
