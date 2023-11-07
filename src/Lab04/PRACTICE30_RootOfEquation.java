package Lab04;
/**
 * два примера использования массивов для
 * передачи данных в метод и обратно
 * пример 2: решение квадратного уравнения
 *
 * @author Gedrevich E.A.
 * @version 1.0 10.10.2023
 */
public class PRACTICE30_RootOfEquation {
    public static void main(String[] args) {
        int[] var = new int[4];
// инициализируем массив var
        var[0] = 3;
        var[1] = 7;
        var[2] = 2;
        var[3] = 18;
        double[] var2 = func(var);
        if (var2 == null){
            System.out.println("Нет корней");
            return;
        }
        System.out.println("Элементы массива корней" +
                "\n\tx1 = " + var2[0] +
                "\n\tx2 = " + var2[1]);
    }
    // пример: нахождение корней квадратного уравнения
    private static double[] func(int[] arr){
        int a = arr[0];
        int b = arr[1];
        int c = arr[2];
        double dsc = Math.pow(b, 2) - 4 * a * c;
        if (dsc < 0) return null;
        double x1 = -b + Math.sqrt(dsc);
        double x2 = -b - Math.sqrt(dsc);
        return new double[]{x1, x2};
    }
}
