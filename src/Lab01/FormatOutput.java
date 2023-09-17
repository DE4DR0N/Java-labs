package Lab01;
/**
 * форматируем данные вывода для разных типов
 * спецификаторы вывода на консоль переменных разных типов
 * используется метод printf
 * %b - booleen (true false)
 * %c - char ('a')
 * %d - decimal integer (200)
 * %f - floating-point number (45542.6723)
 * %e - scietific notation
 * %s - string
 * ширина поля вывода определяется цифрой
 * если символов меньше, заполняется пробелами
 *
 * @author E.A. Gedrevich
 * @version 1.0
 */
public class FormatOutput {
    public static void main(String [] args) {
        boolean ans = false;
        char letter = 'a';
        float sum = 54.98f;
        System.out.printf("\nЭто пример boolean \n ans = %8b", ans);
        System.out.printf("\nЭто пример char \n letter = %4c", letter);
        System.out.printf("\nЭто пример float \n sum = %5.2f", sum);
        System.out.printf("\nЭто пример boolean char and float" +
                        "\n ans = %8b \n letter = %4c \n sum = %5.2f", ans, letter,
                sum);
        // самостоятельно для оставшихся типов
        double disc = 2343462.90673498;
        String text = "this is my text";
        System.out.printf("\nThis is the example of double \n disc = %4.3f", disc);
        System.out.printf("\nThis is the example of string \n text = %5s", text);
    }
}