/*
        Задание
        Изучите и законспектируйте теорию:
        1. Перегрузка методов.
        Повторите выполнение данного примера.
        Разберитесь в решаемой задаче.
        Самостоятельно:
        Задание 1. Написать метод getRandomCharacter(перегруженный), генерирующий
        целые числа в заданном интервале. Протестировать метод.
        Написать метод getRandomCharacter(перегруженный), генерирующий числа
        с двойной точностью в заданном интервале. Протестировать метод.
        Написать javadoc комментарий к методам.
        Задание 2. Написать код метода, осуществляюшего линейный поиск
        заданного элемента (числа) в массиве. Массив задать как целый в интервале
        целых чисел от 0 до 100. Размерность массива 50 (или на ваше
        усмотрение). Выполнить тестирование метода.
        Написать javadoc комментарий к методу.
        Контрольные вопросы (ответы также включить в отчет)
        1. Что такое сигнатура метода?
        2. Чем отличаются перегруженные методы?
*/
package Lab04;
/**
 * генерируем случайным образом числа
 * в интервале [0, 1)
 * а также символы в интервале от char1 до char2,
 * целых чисел в интервале от val1 до val2
 * с помощью соответствующих методов
 *
 * @author Gedrevich E.A.
 * @version 1.0 10.10.2023
 */
public class PRACTICE31_RandomCharacter {
    public static void main(String[] args) {
        System.out.println(Math.random());
        System.out.println(getRandomCharacter('f', 'h'));
        System.out.println(getRandomCharacter('A', 'Z'));
        System.out.println(getRandomLowerCaseLetter());
        System.out.println(getRandomUpperCaseLetter());
        System.out.println(getRandomDigitCharacter());
        System.out.println(getRandomCharacter());
        System.out.println(getRandomIntCharacter(0, 10));
        System.out.println(getDoubleCharacter(10, 40));
        int[] intArray = new int[50];
        initArray(intArray);
        System.out.println("Does the array contain 3? " + linerSearch(intArray, 3));
    }
    /**
     * генерируем случайным образом символы между ch1 и ch2
     */
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }
    /**
     * генерируем случайные lowercase letter
     */
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }
    /**
     * генерируем случайные uppercase letter
     */
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }
    /**
     * генерируем случайные digit character
     */
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }
    /**
     * генерируем случайные character
     */
    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
    public static int getRandomIntCharacter(int a, int b) {
        return a + (int) (Math.random() * (b - a + 1));
    }
    public static double getDoubleCharacter(double a, double b) {
        return a + Math.random() * (b - a + 1);
    }
    public static void initArray(int[] arr) {
        for (int i = 0; i < 50; i++){
            arr[i] = (int) (Math.random() * (100 + 1));
            System.out.print(arr[i] + "; ");
        }
        System.out.println();
    }
    public static boolean linerSearch(int[] arr, int key) {
        for (int item:
             arr) {
            if (item == key) return true;
        }
        return false;
    }
}