/*
Задание
Изучите и законспектируйте теорию:
1. Что такое метод и правила его создания в java
2. передача данных по ссылке и по значению
Повторите выполнение данного примера.
Разберитесь в решаемой задаче.
Самостоятельно:
Изменить постфиксную форму n++ на префиксную.
Проверить, изменится ли результат.
Изменить постфиксную форму n++ на выражение n = 3.
Проверить, изменится ли результат.
Изменить в методе main идентификатор x на n.
Проверить, изменится ли результат.
Напишите и выполните код ввода данных с использованием консоли.
Оформите отчет с теорией и скриншотами ваших индивидуальных данных.
В отчете представьте глоссарий из 5-10 новых терминов для данной темы.
Контрольные вопросы (ответы также включить в отчет)
1. В чем отличие передачи данных по ссылке и по значению?
*/
package Lab03;
import java.util.Scanner;
/**
 * демонстрация передачи by value (по значению)
 *
 * @author E.A. Gedrevich
 * @version 1.0 04.10.2023
 */
public class PRACTICE20_Increment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = input.nextInt();
        System.out.println("Before the call, x is " + x);
        increment_post(x);
        System.out.println("after the call, x is " + x);
        increment_pre(x);
        System.out.println("after the call, x is " + x);
        equals(x);
        System.out.println("after the call, x is " + x);
    }
    public static void increment_post(int n) {
        n++;
        System.out.println("n inside the method increment_post is " + n);
    }
    public static void increment_pre(int n) {
        ++n;
        System.out.println("n inside the method increment_pre is " + n);
    }
    public static void equals(int n) {
        n = 3;
        System.out.println("n inside the method equals is " + n);
    }

}
