package Lab02;
import java.util.Scanner;
public class PRACTICE19_MathClassMain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // y = a*x1 + b*x2 + c
        double dscr = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        double x1 = (-b + dscr) / 2 * a;
        double x2 = (-b - dscr) / 2 * a;

        System.out.printf("a = %d, b = %d, c = %d \n", a, b, c);
        System.out.printf("x1 = %.2f, x2 = %.2f\n", x1, x2);
    }
}
