package Lab01;
import java.util.Scanner; // Scanner is in the java.util package
/**
 * ввод данных с консоли
 * на примере вычисления длины окружности
 *
 * @author E.A. Gedrevich
 * @version 1.0
 *
 */
public class RelationalOperators {
    public static void main(String[] args) {
// Create a Scanner object
        Scanner input = new Scanner(System.in);
// Prompt the user to enter a radius
        System.out.print("Enter a number for radius: ");
// Enter radius
        double radius = input.nextDouble();
// Compute length
        double length = 2 * 3.14159 * radius;
// Display result
        System.out.println("The length for the circle of radius " +
                radius + " is " + length);
        // Enter the type double
        System.out.print("Enter a number for the side of square: ");
        int i = input.nextInt();
        // Display the result
        System.out.println("The square is " + (i * i));
    }
}