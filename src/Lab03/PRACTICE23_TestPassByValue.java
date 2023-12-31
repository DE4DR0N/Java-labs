/*
Задание
Изучите и законспектируйте теорию:
1. Методы и их параметры в java
Повторите выполнение данного примера.
Разберитесь в решаемой задаче.
Самостоятельно:
Самостоятельно написать код swapFlag, меняющего местами
две переменные при передаче третьей перменной, инициализированной TRUE
Контрольные вопросы (ответы также включить в отчет)
1. Как передать данные в метод?
2. Может ли метод возвращать несколько значений?
*/
package Lab03;
/**
 * другой пример передачи по значению
 * на примере метода swap
 *
 * @author E.A. Gedrevich
 * @version 1.0 04.10.2023
 */
public class PRACTICE23_TestPassByValue {
    /** Main method */
    public static void main(String[] args) {
// Объявляем и инициализируем переменные
        int num1 = 1;
        int num2 = 2;
        System.out.println("Перед вызовом метода swap, num1 = " +
                num1 + " и num2 = " + num2);
// Вызываем метод swap в попытке поменять местами две переменные
        swap(num1, num2);
        System.out.println("После вызова метода swap, num1 = " +
                num1 + " и num2 = " + num2);
        boolean flag = true;
        System.out.println("Перед вызовом метода swapflag, num1 = " +
                num1 + " и num2 = " + num2);
        swapflag(num1, num2, flag);
        System.out.println("После вызова метода swapflag, num1 = " +
                num1 + " и num2 = " + num2);
    }
    /** Swap two variables */
    public static void swap(int n1, int n2) {
        System.out.println("\tВнутри метода swap");
        System.out.println("\t\tПеред перестановкой n1 = " + n1
                + " n2 = " + n2);
// Swap n1 with n2
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("\t\tПосле перестановки n1 = " + n1
                + " n2 = " + n2);
    }
    public static void swapflag(int n1, int n2, boolean f){
        System.out.println("\tВнутри метода swapflag");
        System.out.println("\t\tПеред перестановкой n1 = " + n1
                + " n2 = " + n2 + "flag = " + f);
        if (f) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
            System.out.println("\t\tПосле перестановки n1 = " + n1
                    + " n2 = " + n2);
        } else {
            System.out.println("Перестановка не произошла");
        }
    }
}
