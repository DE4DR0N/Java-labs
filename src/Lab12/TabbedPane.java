package Lab12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Демонстрация работы TabbedPane
 *
 * @author Gedrevich E.A.
 * @version 1.0 13.12.2023
 */
public class TabbedPane extends JFrame {
    public TabbedPane() {
        super("This is example for JTabbedPane");
        JTabbedPane tabPanel = new JTabbedPane(JTabbedPane.TOP,
                JTabbedPane.WRAP_TAB_LAYOUT);

        for (int i = 1; i <= 5; i++) {
            JPanel panel = new JPanel();
            // Устанавливаем GridLayout, 2 (3 для нечетных) строки, 2 столбца
            panel.setLayout(new GridLayout(2 + i % 2,1));
            panel.add(new JButton("Button № " + i));
            if (i % 2 == 1) {
                panel.add(new JLabel("This is panel number " + i));
                panel.add(new JCheckBox("JCheckBox №" + i));
            } else{
                panel.add(new JCheckBox("JCheckBox №" + i), true);
            }
            tabPanel.add("Panel" + i, panel);
        }

        tabPanel.setMnemonicAt(2, KeyEvent.VK_3);
        JLabel label = new JLabel("Simple Text", SwingConstants.CENTER);
        label.setPreferredSize(new Dimension(200, 100));
        tabPanel.add(label, 0);

        getContentPane().add(tabPanel);
        setSize(400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Метод main
    public static void main(String[] args) {
        new TabbedPane();
    }
}