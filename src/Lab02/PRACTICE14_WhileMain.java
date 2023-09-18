package Lab02;
import java.util.Scanner;
public class PRACTICE14_WhileMain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int xMin = input.nextInt();
        int xMax = input.nextInt();
        int sum = 0;
        xMax *= 10;
        while (xMin <= xMax) {
            System.out.println(xMin);
            if (xMin % 2 != 0) {
                sum += xMin;
                System.out.println("Sum has been changed to " + sum);
            }
            xMin ++;
        }
        System.out.println("Final sum is " + sum);
    }
}
