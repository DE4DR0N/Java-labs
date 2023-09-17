package Lab01;
/**
 * изучение операторов инкремент, декремент
 *
 * @author E.A. Gedrevich
 * @version 1.0
 */
public class IncrementDecrement {
    public static void main(String[] args) {
        int x = 5, y = 15;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("++x = " + ++x);
        System.out.println("y + ++x" + x+y);
        System.out.println("y++ = " + y++);
        System.out.println("y++ + x" + x+y);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}