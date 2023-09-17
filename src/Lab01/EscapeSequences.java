package Lab01;
/**
 * форматирование вывода
 * работа с EscapeSequences
 * \b backspace
 * \t Tab
 * \n Linefeed
 * \f Formfeed
 * \r Carriage Return
 * \\ Backslash
 * \' single Quate
 * \" Double Quate *
 *
 * @author E.A. Gedrevich
 * @version 1.0
 */
public class EscapeSequences {
    public static void main(String[] args) {
        // Prompt the user for input
        System.out.println("\t Hellow \"Java\"");
        System.out.print("\n\t Hellow \'Java\' ");
        System.out.print("\b My name is \'Eugene\'");
        System.out.print("\n\\ This is only Remark \\");
    }
}