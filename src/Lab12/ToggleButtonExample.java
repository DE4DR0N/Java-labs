package Lab12;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Демонстрация работы JToggleButton
 *
 * @author Gedrevich E.A.
 * @version 1.0 13.12.2023
 */
public class ToggleButtonExample extends JFrame implements ActionListener {
    private JPanel display;

    public ToggleButtonExample() {
        initUI();
    }

    private void initUI() {
        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        JToggleButton redButton = new JToggleButton("red");
        redButton.addActionListener(this);

        JToggleButton greenButton = new JToggleButton("green");
        greenButton.addActionListener(this);

        JToggleButton blueButton = new JToggleButton("blue");
        blueButton.addActionListener(this);

        display = new JPanel();
        display.setPreferredSize(new Dimension(120,120));
        display.setBorder(LineBorder.createGrayLineBorder());
        display.setBackground(Color.black);

        gl.setAutoCreateContainerGaps(true);
        gl.setAutoCreateGaps(true);

        gl.setHorizontalGroup(gl.createSequentialGroup()
                .addGroup(gl.createParallelGroup()
                        .addComponent(redButton)
                        .addComponent(greenButton)
                        .addComponent(blueButton))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(display)
        );

        // Создание вертикальной группы
        gl.setVerticalGroup(gl.createParallelGroup(GroupLayout.Alignment.CENTER)
                .addGroup(gl.createSequentialGroup()
                        .addComponent(redButton)
                        .addComponent(greenButton)
                        .addComponent(blueButton))
                .addComponent(display)
        );

        gl.linkSize(redButton, greenButton, blueButton);

        pack();

        setTitle("JToggleButton");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Color color = display.getBackground(); // цвет фона дисплея
        int red = color.getRed();              // значение красного цвета на фоне дисплея
        int green = color.getGreen();          // значение зеленного цвета на фоне дисплея
        int blue = color.getBlue();            // значение синего цвета на фоне дисплея

        // проверяем какая нажата кнопка
        if (e.getActionCommand().equals("red")) {
            red = 255;
            green = 0;
            blue = 0;
        }

        if (e.getActionCommand().equals("green")) {
            red = 0;
            green = 255;
            blue = 0;
        }

        if (e.getActionCommand().equals("blue")) {
            red = 0;
            green = 0;
            blue = 255;
        }

        // устанавливаем цвета фона на основе модели RGB
        Color setCol = new Color(red,green, blue);
        display.setBackground(setCol);
    }

    // Метод main
    public static void main(String[] args) {
        // последовательное выполнение Runnable
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Создаем фрейм
                ToggleButtonExample ex = new ToggleButtonExample();
                ex.setVisible(true);
            }
        });
    }
}