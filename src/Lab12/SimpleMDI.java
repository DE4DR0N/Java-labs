package Lab12;

import javax.swing.*;

/**
 * Демонстрация работы внутренних фреймов
 *
 * @author Gedrevich E.A.
 * @version 1.0 13.12.2023
 */
public class SimpleMDI extends JFrame {
    //Конструктор
    public SimpleMDI() {
        super("SimpleMDI");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // создаем рабочий стол Swing
        JDesktopPane desktopPane = new JDesktopPane();

        // добавляем его на главный фрейм
        add(desktopPane);

        // создаем 3 внутренних фрейма с различным кол-вом кнопок
        JInternalFrame frame1 = new JInternalFrame("Frame1",
                true);
        JInternalFrame frame2 = new JInternalFrame("Frame2",
                true, true, true, true);
        JInternalFrame frame3 = new JInternalFrame("Frame3",
                true, true, true);

        JLabel label1 = new JLabel("Для фрейма 1");
        JButton btnOK1 = new JButton("OK1");
        JPanel panel1 = new JPanel();
        panel1.add(label1);
        panel1.add(btnOK1);
        frame1.add(panel1);

        // задаем размеры и расположения, делаем фрейм видимыми
        frame1.setSize(200, 100);
        frame1.setLocation(20, 100);
        frame1.setVisible(true);

        frame2.setSize(200, 60);
        frame2.setVisible(true);

        frame3.setLocation(250, 20);
        frame3.setVisible(true);

        // Добавляем внутренние фреймы на рабочий стол
        desktopPane.add(frame1);
        desktopPane.add(frame2);
        desktopPane.add(frame3);
        frame3.setSize(200, 120);

        // главный фрейм делаем видимым
        setVisible(true);
    }

    // Метод main
    public static void main(String[] args) {
        new SimpleMDI();
    }
}

