package Lab01;
/**
 * изучение примитивных типов
 * печать с использованием операторов
 * print println
 *
 * @author E.A. Gedrevich
 * @version 1.0
 */
public class TypesOfData {
    public static void main(String[] args) {
        // объявляем различные типы переменных
        // одновременно инициализируем их
        short s = 21; // переменная типа short
        int i = 521; // переменная типа int
        long l = 7654321; // переменная типа long
        float f = 98.321f; // переменная типа float
        double d = 634634.687; // переменная типа double
        char c = 'E'; // переменная типа char
        String str = "Java"; // переменная типа string
        boolean b = true; // переменная типа boolean
        System.out.print("short s = " + s);
        System.out.print(" int i = " + i);
        System.out.print(" long l = " + l);
        System.out.println(" float f = " + f);
        System.out.println("double d = " + d);
        System.out.println("char c = " + c);
        System.out.println("String str = " + str);
        System.out.println("boolean b = " + b);
    }
}