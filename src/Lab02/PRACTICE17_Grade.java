package Lab02;

import java.util.Scanner;

public class PRACTICE17_Grade {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        x /= 10;
        switch (x) {
            case 9:
                System.out.println('A');
                break;
            case 8:
                System.out.println('B');
                break;
            case 7:
                System.out.println('C');
                break;
            case 6:
                System.out.println('D');
                break;
            default:
                System.out.println('F');
        }
    }
}
