package Lab02;
import java.util.Scanner;

public class PRACTICE13_DoWhileMain {
    public static void main(String[] args) {
        int data, sum = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter the number: ");
            data = input.nextInt();
            if (data != 12 && data != 10) sum += data;
            System.out.println("sum = " + sum);
        } while (data != 0);
    }
}
