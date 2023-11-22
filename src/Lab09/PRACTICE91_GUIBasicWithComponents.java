package Lab09;

import javax.swing.*;
import java.awt.*;

/**
 * Программа для тестирования Frame
 * с компонентами
 *
 * @author Gedrevich E.A.
 * @version 1.0 22.11.2023
 */
public class PRACTICE91_GUIBasicWithComponents {
    public static void main(String[] args) {
        JFrame jframe = new JFrame("Eugene 10702221");

        JPanel jpanel = new JPanel();

        JButton jbtOK = new JButton("OK");
        JButton jbtNO = new JButton("NO");
        JButton jbtCancel = new JButton("Cancel");

        jpanel.add(jbtOK);
        jpanel.add(jbtNO);
        jpanel.add(jbtCancel);

        jframe.add(jpanel);
        jframe.setSize(800, 600);
        jframe.setLocationRelativeTo(null);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);
    }
}
