package Lab02;
/**
 * while - оператор цикла
 * На примере вычисления суммы чисел от 0 до xMax
 *
 * @author E.A. Gedrevich
 * @version 1.0 17.09.2023
 */
public class PRACTICE14_WhileTest {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int xMax = 10;
        while (i < xMax){
            sum += i;
            i++;
        }
        System.out.println("Сумма чисел sum = " + sum);
        System.out.println("Последнее число i = " + i);
    }
}
