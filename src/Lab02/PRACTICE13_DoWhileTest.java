package Lab02;
import java.util.Scanner;
/**
 * Вычисление суммы чисел.
 * do-while цикл.
 *
 * @author E.A. Gedrevich
 * @version 1.0 17.09.2023
 */
public class PRACTICE13_DoWhileTest {
    public static void main(String[] args) {
        int data;
        int sum = 0;
// Создаем объект Scanner
        Scanner input = new Scanner(System.in);
// Вводим данные пока не 0
// Keep reading data until the input is 0
        do {
// Read the next data
            System.out.println("Вводите целое значение (выход, если 0): ");
            data = input.nextInt();
            sum += data;
        } while (data != 0);
        System.out.println("Сумма введенных чисел = " + sum);
    }
}
