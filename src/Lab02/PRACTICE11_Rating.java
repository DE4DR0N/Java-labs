package Lab02;
import java.util.Scanner;

public class PRACTICE11_Rating {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        if (x > 100 || x < 0){
            System.out.println("Incorrect num");
        }else if(x >= 90){
            System.out.println('A');
        } else if (80 <= x) {
            System.out.println('B');
        } else if (70 <= x) {
            System.out.println('C');
        } else if (60 <= x) {
            System.out.println('D');
        } else {
            System.out.println('F');
        }
    }
}
