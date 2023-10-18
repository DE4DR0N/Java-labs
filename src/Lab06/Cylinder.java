package Lab06;
import Lab05.Circle;

/**
 * Класс Cylinder является подклассом Circle
 *
 * @author Gedrevich E.A.
 * @version 1.0 18.10.2023
 */
public class Cylinder extends Circle {
    private double height; //Private member variable

    public Cylinder() { // Constructor 1
        super(); //выхов конструктора super класса
        height = 1.0;
    }
    public Cylinder(double radius, double height) { // Constructor 2
        super(radius);
        this.height = height;
    }
    public Cylinder(double radius, String color) {
        super(radius, color);
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override // Переопределяем метод getArea родительского класса
    public double getArea() {
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
    }
    public double getVolume() {
        return super.getArea() * height;
    }
    @Override // Переопределяем метод toString родительского класса
    public String toString() {
        return "Цилиндр: радиус = " + getRadius() + " высота = " + height;
    }
    @Override
    public double getLength() {
        return super.getLength() * height;
    }
}
