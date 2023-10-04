/*
Задание
Изучите и законспектируйте теорию:
1. Методы, не возвращающие значения в java
Повторите выполнение данного примера.
Разберитесь в решаемой задаче.
Самостоятельно:
Написать код метода, printGrade, печатающего рейтинг
в соответствии с символьной шкалой A, B, C, D, F.
Код разместить в методе printGrade.
Протестировать код с различными данными.
Напишите код ввода данных с использованием консоли
Контрольные вопросы (ответы также включить в отчет)
1. Какое ключевое слово в объявлении отличает методы,
возвращающие и не возвращающие значения?
2. Может ли метод возвращать несколько значений?
*/
package Lab03;
/**
 * пример метода void (не возвращающего значение)
 * это не метод main !!!
 * метод просто печатает рейтинг по набранному баллу
 *
 * @author E.A. Gedrevich
 * @version 1.0 04.10.2023
 */
public class PRACTICE24_VoidMethodTest {
    public static void main(String[] args) {
        System.out.print("The grade is ");
        printGrade(92.5);
        System.out.print("The grade is ");
        printGrade(54.5);
    }
    public static void printGrade(double score) {
        int flag = (int) (score / 10);
        switch (flag){
            case (9):
                System.out.println("A");
                break;
            case (8):
                System.out.println("B");
                break;
            case (7):
                System.out.println("C");
                break;
            case (6):
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
        }
    }
}
