package Lab02;
/**
 * for - цикл на примерах
 * Example 2 - цикл контролируется по двум переменным !!!
 *
 * @author E.A. Gedrevich
 * @version 1.0 17.09.2023
 */
public class PRACTICE12_ForLoopTest {
    public static void main(String[] args) {
// Example 1
// Initialize sum
        float sum = 0;
// Add 0.01, 0.02, ..., 0.99, 1 to sum
        for (float x = 0.01f; x <= 1.0f; x = x + 0.01f)
            sum += x;
// Display result
        System.out.println("The sum is " + sum);
// Example 2
// в примере контролируется цикл по двум переменным !!!
        for (int i = 0, j = 3; (i + j < 10); i++, j++) {
            System.out.println("\nТекущие значения i = " + i + " j = " + j);
            System.out.println("\tСумма i + j = " + (i + j));
        }
    }
}
