package Lab12;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/**
 * Демонстрация работы Slider
 *
 * @author Gedrevich E.A.
 * @version 1.0 13.12.2023
 */
public class SliderDemoWell extends JFrame {
    SliderDemoWell() {
        super("JSlider Demo");

        final JSlider slider = new JSlider(JSlider.HORIZONTAL, 5, 55, 27);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setLabelTable(slider.createStandardLabels(10));

        setLayout(new FlowLayout());
        getContentPane().add(slider);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,200);
        setLocationRelativeTo(null);
        setVisible(true);

        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.println("Current value: " + slider.getValue());
            }
        });
    }

    public static void main(String[] args) {
        new SliderDemoWell();
    }
}
