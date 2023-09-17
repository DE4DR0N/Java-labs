package Lab02;
/**
 * оператор continue не прерывает цикл
 * исключаются только действия в цикле
 * при выполнении данного условия.
 * Пример вычисления суммы чисел.
 *
 * @author E.A. Gedrevich
 * @version 1.0 17.09.2023
 */
public class PRACTICE16_ContinueTest {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;
        while (number < 20) {
            number++;
            if (number == 10 || number == 11) continue;
            sum += number;
            System.out.println("number = " + number + " sum = " + sum);
        }
        System.out.println("The sum is " + sum);
// закомментируйте строку с оператором continue
// Проверьте, результат должен быть 210
    }
}
