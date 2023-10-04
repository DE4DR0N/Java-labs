package Lab03;
/**
 * перегрузка методов
 * имена методов одинаковые, различные сигнатуры
 * количество параметров и их типы отличаются
 * на примере нахождения квадратного корня
 *
 * @author E.A. Gedrevich
 * @version 1.0 04.10.2023
 */
public class PRACTICE22_TestSqrt {
    public static void Main(String[] args){
        System.out.println("The result of sqrt of the num 4 is " + MySqrt(4));
        System.out.println("The result of sqrt of the num 16.44 is " + MySqrt(16.44));
    }
    public static double MySqrt(int x) {return Math.sqrt(x);}
    public static double MySqrt(double x) {return Math.sqrt(x);}
}
