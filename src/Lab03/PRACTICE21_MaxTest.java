/*
Задание
Изучите и законспектируйте теорию:
1. Методы, возвращающие и не возвращающие значения в java
Повторите выполнение данного примера.
Разберитесь в решаемой задаче.
Самостоятельно:
Написать код метода, находящего наименьшее значение
из двух целых чисел и печатающего его, но не возвращающего.
Метод разместить в этом же классе.
Написать обращение к методу и протестировать его.
Напишите код ввода данных с использованием консоли.
Оформите отчет с теорией и скриншотами ваших индивидуальных данных.
В отчете представьте глоссарий из 5-10 новых терминов для данной темы.
Контрольные вопросы (ответы также включить в отчет)
1. Какой оператор используется для возвращения значения из метода и его
сиинтаксис?
2. В чем отличия объявления методов, возвращающих и не возвращающих
значения?
*/
package Lab03;

import java.util.Scanner;

/**
 * пример метода возвращающего значение
 * метод max возвращает значение целое
 * тип возвращаемого значения перед именем метода
 * вместо void
 *
 * @author E.A. Gedrevich
 * @version 1.0 04.10.2023
 */
public class PRACTICE21_MaxTest {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int i = input.nextInt();
        int j = input.nextInt();
// call method max
        int maxn = max(i, j);
        min(i, j);
        System.out.println("The maximum between " + i +
                " and " + j + " is " + maxn);
    }
    /** Return the max between two numbers */
    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2)
            result = num1;
        else
            result = num2;
        return result;
    }
    public static void min(int num1, int num2){
        int result;
        if (num1 > num2)
            result = num2;
        else
            result = num1;
        System.out.println("The minimum between " + num1 +
                " and " + num2 + " is " + result);
    }
}
