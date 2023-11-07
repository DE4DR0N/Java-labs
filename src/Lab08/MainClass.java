package Lab08;

public class MainClass {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle("green", 2, 3.5);
        System.out.println(rectangle);
        Shape triangle = new Triangle("yellow", 4, 2.4);
        System.out.println(triangle);
        Shape trapezoid = new Trapezoid("blue", 4, 7.8);
        System.out.println(trapezoid);
    }
}
