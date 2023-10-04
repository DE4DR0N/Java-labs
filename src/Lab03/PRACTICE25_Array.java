/*
Задание
Изучите и законспектируйте теорию:
1. Массивы в java
Повторите выполнение данного примера.
Разберитесь в решаемой задаче.
Самостоятельно:
Самостоятельно задать массив из от 10 до 30 элементов и инициализировать
Написать метод сортировки массива по возрастанию (убыванию)
Написать javadoc комментарий к методу
Контрольные вопросы (ответы также включить в отчет)
1. Как объявляются массивы?
2. Какие существуют варианты объявления массивов?
*/
package Lab03;
/**
 * демонстрация массивов
 *
 * @author E.A. Gedrevich
 * @version 1.0 04.10.2023
 */
public class PRACTICE25_Array {
    public static void main(String[] args) {
        int[] numbers;
        char[] letters, symbols;
        long[] bigNumbers;
        String[] countries;
        numbers = new int[3];
        String[] currencies = new String[3];
        numbers[0] = 100;
        numbers[1] = 200;
        numbers[2] = 300;
        int[] numbers2 = {1, 8, 5, 4, 2, 6, 74, 8, 9, 10};
        int[] newNumbers = {1, 2, 3};
//Трассировка метода
        int[] list = {1, 4, 4, 2, 5, -3, 6, 2};
        int i = linearSearch(list, 4); // returns 1
        int j = linearSearch(list, -4); // returns -1
        int k = linearSearch(list, -3); // returns 5
        System.out.println(i + " " + j + " " + k);
        sortmintomax(numbers2);
        for (int obj:
             numbers2) {
            System.out.print(obj + "; ");
        }
        System.out.println();
        sortmaxtomin(numbers2);
        for (int obj:
                numbers2) {
            System.out.print(obj + "; ");
        }
    }
    /**
     * метод поиска key в списке
     */
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++)
            if (key == list[i])
                return i;
        return -1;
    }
    public static int[] sortmintomax(int[] list){
        boolean isSorted = false;
        int buf;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < list.length - 1; i++){
                if (list[i] > list[i+1]) {
                    isSorted = false;
                    buf = list[i];
                    list[i]=list[i+1];
                    list[i+1]=buf;
                }
            }
        }
        return list;
    }
    public static int[] sortmaxtomin(int[] list){
        boolean isSorted = false;
        int buf;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < list.length - 1; i++){
                if (list[i] < list[i+1]) {
                    isSorted = false;
                    buf = list[i];
                    list[i]=list[i+1];
                    list[i+1]=buf;
                }
            }
        }
        return list;
    }
}
