package Lab01;
import java.util.Scanner;
/**
 * Conditional expressions
 * дает тот же результат, что и использование
 * например выбора с оператором if
 * однако запись короче - в одну строку
 * тернарный оператор
 *
 * @author E.A. Gedrevich
 * @version 1.0
 */
public class ConditionalOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y;
        System.out.print("Enter the num(int): " + x);
// первый вариант
        if (x > 0)
            y = 1;
        else
            y = -1;
        System.out.println("Первый вариант " + "x = " + x + " y = " + y);
// второй вариант с использованием тернарного оператора
        y = (x > 0) ? 1 : -1;
        System.out.println("Второй вариант " + "x = " + x + " y = " + y);
// пример проверка четности
        int number = 3;
        System.out.println(number % 2 == 0 ? "число четное" : "число нечетное");
// пример выбор наибольшего из двух чисел
        double num1 = 3.4;
        double num2 = 8.24;
        double max = (num1 > num2) ? num1 : num2;
        System.out.println("Наибольшее из двух чисел равно " + max);
    }
}