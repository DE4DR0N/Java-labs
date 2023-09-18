package Lab02;

public class PRACTICE12_ForLoopMain {
    public static void main(String[] args){
        for (int i = 0, j = 200; i < 100 || j < 500;i++, j++){
            double z = i + j;
            if (z % 22 == 0){
                System.out.printf("%d + %d = %.0f \n", i, j, z);
            }
        }
    }
}
