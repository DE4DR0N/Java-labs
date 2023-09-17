package Lab02;
import java.util.Scanner;
/**
 * Ввод данных с консоли с использованием Scanner.
 * Конструкции для
 * operator if
 * - one-way
 * - two-way
 * - nested
 *
 * @author E.A. Gedrevich
 * @version 1.0 17.09.2023
 */
public class PRACTICE11_IfTestSmall {
    public static void main(String[] args) {
// создаем экземпляр класса Scanner для ввода
        Scanner input = new Scanner(System.in);
// подсказка вводить x
        System.out.println("Введите целое значение х");
        int x = input.nextInt();
// подсказка вводить у
        System.out.println("Введите целое значение y");
        int y = input.nextInt();
// Вариант 1: one-way
        if (x > y)
            System.out.println("x больше y");
// Вариант 2: one-way
// если операторов несколько используем скобки
        if (x > y) {
            System.out.println("x больше y");
            System.out.println("Разность x - y = " + (x - y));
        }
// Вариант 3: two-way
        if (x > y) {
            System.out.println("x больше y");
            System.out.println("Разность x - y = " + (x - y));
        } else {
            System.out.println("x меньше или равно y");
        }
    }
}
