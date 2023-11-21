package Lab08;

public class MainClass {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle("green", 2, 3.5);
        Shape defRect = new Rectangle();
        System.out.println(rectangle);
        System.out.println(defRect);
        Shape triangle = new Triangle("yellow", 4, 2.4);
        Shape defTriangle = new Triangle();
        System.out.println(triangle);
        System.out.println(defTriangle);
        Shape trapezoid = new Trapezoid("blue", 4, 7.8);
        Shape defTrapez = new Trapezoid();
        System.out.println(trapezoid);
        System.out.println(defTrapez);
    }
}
