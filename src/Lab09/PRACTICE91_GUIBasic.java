package Lab09;

import javax.swing.*;

/**
 * Программа для тестирования Frame
 *
 * @author Gedrevich E.A.
 * @version 1.0 22.11.2023
 */
public class PRACTICE91_GUIBasic {
    public static void main(String[] args) {
        JFrame jframe = new JFrame("Gedrevich 10702221");
        jframe.setSize(800, 600);
        jframe.setLocationRelativeTo(null);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);
    }
}
