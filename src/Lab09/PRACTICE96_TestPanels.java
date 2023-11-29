package Lab09;

import javax.swing.*;
import java.awt.*;

/**
 * построение графического интерфейса
 * применение панелей
 * программа создаёт интерфейс для
 * микроволновой печи
 *
 * @author Gedrevich E.A.
 * @version 1.0 22.11.2023
 */
public class PRACTICE96_TestPanels extends JFrame {
    public PRACTICE96_TestPanels() {
        setLayout(new GridLayout(1,  2));
        JPanel left = new JPanel(new BorderLayout());
        JButton btn = new JButton("Food to be placed here");
        btn.setPreferredSize(new Dimension(230,  230));
        left.add(btn);
        add(left);

        JPanel right = new JPanel(new BorderLayout());
        right.add(new JLabel("Time to be displayed here"), BorderLayout.NORTH);
        JPanel numpad = new JPanel(new GridLayout(4, 3));
        for (int i = 1; i < 10; i++) {
            JButton button = new JButton(Integer.toString(i));
            button.setPreferredSize(new Dimension(50, 50));
            numpad.add(button);
        }
        String[] labels = new String[] {"0", "Start", "Stop"};
        for (var label : labels) {
            JButton button = new JButton(label);
            button.setPreferredSize(new Dimension(50, 50));
            numpad.add(button);
        }
        right.add(numpad);
        add(right);
    }

    public static void main(String[] args) {
        PRACTICE96_TestPanels frame = new PRACTICE96_TestPanels();
        frame.setTitle("TestPanels");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
