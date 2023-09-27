package Lab02;

import javax.swing.*;
import java.util.Scanner;

public class PRACTICE17_Grade {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String answer = JOptionPane.showInputDialog(null,
                "Введите вариант ответа от 0 до 100",
                "Вариант ответа", JOptionPane.OK_CANCEL_OPTION);
// конвертируем символьную переменную input
// в целую variant
        int variant = Integer.parseInt(answer);
        variant /= 10;
        switch (variant) {
            case 9:
                System.out.println("Ваша оценка: A");
                break;
            case 8:
                System.out.println("Ваша оценка: B");
                break;
            case 7:
                System.out.println("Ваша оценка: C");
                break;
            case 6:
                System.out.println("Ваша оценка: D");
                break;
            default:
                System.out.println("Ваша оценка: F");
        }
    }
}
