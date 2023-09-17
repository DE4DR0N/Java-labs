package Lab02;
/**
 * break оператор
 * используется для выхода из цикла
 * в данном случае за пределы цикла!!!
 * Пример суммирования чисел по условию
 *
 * @author E.A. Gedrevich
 * @version 1.0 17.09.2023
 */
public class PRACTICE15_BreakeTest {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;
        while (number < 20) {
            number++;
            sum += number;
// выход из цикла при выполнения условия
            if (sum >= 100) break;
        }
        System.out.println("Значение переменной number = " + number);
        System.out.println("Значение переменной sum = " + sum);
    }
}
