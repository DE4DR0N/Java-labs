package Lab02;

public class PRACTICE15_BreakeMain {
    public static void main(String[] args) {
        int Nmax = 12 + 10 + 2003;
        double prdctNums = 1;

        for (int i = 14; i < Nmax; i++){
            if (prdctNums % 79 == 0) break;
            prdctNums *= i;
            System.out.println("Prdct Nums = " + prdctNums);
        }
    }
}
