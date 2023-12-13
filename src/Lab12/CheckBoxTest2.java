package Lab12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;

/**
 * Демонстрация работы JCheckBox
 *
 * @author Gedrevich E.A.
 * @version 1.0 13.12.2023
 */
public class CheckBoxTest2 {
    public static void main(String[] args) {
        final JFrame frame = new JFrame("JCheck Demo");
        JCheckBox chkSwing = getjCheckBox();
        // Add checkbox on the panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(chkSwing);

        // Properties for frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static JCheckBox getjCheckBox() {
        JCheckBox chkSwing = new JCheckBox("JCheckBox Example");
        chkSwing.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                System.out.println("CheckBox marked");
            }
            else {
                System.out.println("CheckBox marked disabled");
            }
        });
        return chkSwing;
    }
}
