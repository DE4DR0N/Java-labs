package Lab09;

import javax.swing.*;
import java.awt.*;

/**
 * постороение графического приложения
 * менеджер компоновки GridLayout
 *
 * @author Gedrevich E.A.
 * @version 1.0 22.11.2023
 */
public class PRACTICE95_GridLayout extends JFrame {
    public  PRACTICE95_GridLayout() {
        setLayout(new GridLayout(3,2,5,5));

        add(new JLabel("Фамилия"));
        add(new JTextField(8));
        add(new JLabel("Имя"));
        add(new JTextField(1));
        add(new JLabel("Отчество"));
        add(new JTextField(8));
    }

    public static void main(String[] args) {
        PRACTICE95_GridLayout frame = new PRACTICE95_GridLayout();
        frame.setTitle("ShowGridLayout");
        frame.setSize(200, 125);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
