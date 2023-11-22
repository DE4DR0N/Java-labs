package Lab09;

import javax.swing.*;
import java.awt.*;

public class PRACTICE97_TestSwingCommonFeatures extends JFrame {
    public PRACTICE97_TestSwingCommonFeatures() {
        JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT,2, 2));
        JButton btnLeft = new JButton("Left");
        JButton btnCenter = new JButton("Center");
        JButton btnRight = new JButton("Right");
        btnLeft.setBackground(Color.WHITE);
        btnCenter.setForeground(Color.GREEN);
        btnRight.setToolTipText("Это Right button");
        panel1.add(btnLeft);
        panel1.add(btnCenter);
        panel1.add(btnRight);
        panel1.setBorder(BorderFactory.createTitledBorder(
                null,
                "Три Buttons"
        ));
        add(panel1, BorderLayout.NORTH);

        JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
        panel2.setBorder(BorderFactory.createTitledBorder(
                null,
                "Two Labels"
        ));
        JLabel label1 = new JLabel("Red");
        label1.setForeground(Color.red);
        label1.setFont(new Font(null, Font.BOLD, 20));
        label1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        label1.setPreferredSize(new Dimension(150, label1.getPreferredSize().height));
        panel2.add(label1);

        JLabel label2 = new JLabel("Orange");
        label2.setForeground(Color.orange);
        label2.setFont(new Font(null, Font.BOLD, 20));
        label2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        label2.setPreferredSize(new Dimension(150, label2.getPreferredSize().height));
        panel2.add(label2);

        add(panel2);
    }

    public static void main(String[] args) {
        PRACTICE97_TestSwingCommonFeatures frame = new PRACTICE97_TestSwingCommonFeatures();
        frame.setTitle("TestSwingCommonFeatures");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
