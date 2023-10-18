package Lab06;

/**
 * Управляющая программа TestCylinder для класса Cylinder
 *
 * @author Gedrevich E.A.
 * @version 1.0 18.10.2023
 */
public class PRACTICE61_TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        System.out.println("Радиус = " + cylinder1.getRadius() +
                "\nВысота = " + cylinder1.getHeight() +
                "\nЦвет = " + cylinder1.getColor() +
                "\nПлощадь основания = " + cylinder1.getArea() +
                "\nОбъём = " + cylinder1.getVolume());
        Cylinder cylinder2 = new Cylinder(5.0, 2.1);
        System.out.println("Радиус = " + cylinder2.getRadius() +
                "\nВысота = " + cylinder2.getHeight() +
                "\nЦвет = " + cylinder2.getColor() +
                "\nПлощадь основания = " + cylinder2.getArea() +
                "\nОбъём = " + cylinder2.getVolume());
    }
}
