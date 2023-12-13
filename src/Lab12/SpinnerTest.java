package Lab12;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
import java.util.Date;

/**
 * Демонстрация работы Spinner
 *
 * @author Gedrevich E.A.
 * @version 1.0 13.12.2023
 */
public class SpinnerTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Spinner Demo");

        // Spinner with number
        SpinnerNumberModel snm = new SpinnerNumberModel(50, 0, 100, 1);
        JSpinner spnNumber = new JSpinner(snm);

        // Spinner with Dates
        SpinnerModel snd = new SpinnerDateModel(
                new Date(),
                null,
                null,
                Calendar.DAY_OF_MONTH
        );
        JSpinner spnDate = new JSpinner(snd);

        // Spinner with List
        String[] colors = {"Red", "Green", "Blue"};
        SpinnerModel snl = new SpinnerListModel(colors);
        JSpinner spnList = new JSpinner(snl);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 100);

        Container cont = frame.getContentPane();

        cont.setLayout(new FlowLayout());
        cont.add(new JLabel("Select Number:"));
        cont.add(spnNumber);

        cont.add(new JLabel("Select Date:"));
        cont.add(spnDate);

        cont.add(new JLabel("Select Color:"));
        cont.add(spnList);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
