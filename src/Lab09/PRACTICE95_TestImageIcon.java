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
public class PRACTICE95_TestImageIcon extends JFrame {
    private ImageIcon catIcon = new ImageIcon("src/imgs/cat.jpg");
    private ImageIcon carIcon = new ImageIcon("src/imgs/car.jpg");
    private ImageIcon manIcon = new ImageIcon("src/imgs/man.jpg");
    private ImageIcon javaDevIcon = new ImageIcon("src/imgs/avrgJavaDev.jpg");

    public PRACTICE95_TestImageIcon() {
        setLayout(new GridLayout(3, 2, 5, 5));
        JLabel label = new JLabel("Java swing label demo", JLabel.CENTER);
        add(label);
        add(new JLabel(catIcon));
        add(new JLabel(manIcon));
        add(new JButton(carIcon));
        JLabel label2 = new JLabel("Label + Icon + Text");
        label2.setIcon(javaDevIcon);
        add(label2);
        add(new JButton(javaDevIcon));
    }

    public static void main(String[] args) {
        PRACTICE95_TestImageIcon frame = new PRACTICE95_TestImageIcon();
        frame.setTitle("TestImageIcon");
        frame.setSize(1400, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
