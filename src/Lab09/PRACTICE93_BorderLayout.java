package Lab09;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

/**
 * Построение графического интерфейса
 * менеджер компоновки BorderLayout
 *
 * @author Gedrevich E.A.
 * @version 1.0 22.11.2023
 */

public class PRACTICE93_BorderLayout extends JFrame {
    public PRACTICE93_BorderLayout() {
        setLayout(new BorderLayout(5, 10));

        add(new JButton("20 y.o"), BorderLayout.EAST);
        add(new JButton("178 sm"), BorderLayout.SOUTH);
        add(new JButton("56 kg"), BorderLayout.WEST);
        add(new JButton("dark hair"), BorderLayout.NORTH);
        add(new JButton("green eyes"), BorderLayout.CENTER);
    }
    public static void main(String[] args) {
        PRACTICE93_BorderLayout frame = new PRACTICE93_BorderLayout();
        frame.setTitle("ShowBorderLayout");
        frame.setSize(640, 480);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
