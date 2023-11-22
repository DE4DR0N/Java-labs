package Lab09;

import javax.swing.*;
import java.awt.*;

/**
 * постороение графического приложения
 * менеджер компоновки FlowLayout
 *
 * @author Gedrevich E.A.
 * @version 1.0 22.11.2023
 */

public class PRACTICE94_FlowLayout extends JFrame {
    public PRACTICE94_FlowLayout() {
        setLayout(new FlowLayout(FlowLayout.LEFT, 10,20));

        add(new JLabel("Фамилия"));
        add(new JTextField(8));
        add(new JLabel("Имя"));
        add(new JTextField(1));
        add(new JLabel("Отчество"));
        add(new JTextField(8));
    }

    public static void main(String[] args) {
        PRACTICE94_FlowLayout frame = new PRACTICE94_FlowLayout();
        frame.setTitle("ShowFlowLayout");
        frame.setSize(220, 150);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
