package Lab09;

import javax.swing.*;
import java.awt.*;

/**
 * Игра крестики-нолики
 *
 * @author Gedrevich E.A.
 * @version 1.0
 */
public class TicTacToeBoard extends JFrame {
    private final ImageIcon xIcon;
    private final ImageIcon oIcon;
    private final ImageIcon emptyIcon;
    private JLabel[] labels;

    public TicTacToeBoard() {
        setLayout(new GridLayout(3, 3));
        xIcon = new ImageIcon("src/imgs/3.jpg");
        oIcon = new ImageIcon("src/imgs/4.jpg");
        emptyIcon = new ImageIcon("src/imgs/5.jpg");
        labels = new JLabel[9];
        for (int i = 0; i < 9; i++) {
            labels[i] = new JLabel();
            setIcon(labels[i]);
            add(labels[i]);
        }
    }

    private void setIcon(JLabel label) {
        int choice = (int) (Math.random() * 3);
        switch (choice) {
            case 1:
                label.setIcon(xIcon);
                break;
            case 2:
                label.setIcon(oIcon);
                break;
            case 0:
                label.setIcon(emptyIcon);
                break;
            default:
                System.out.println("Something's wrong");
                break;
        }
    }

    public static void main(String[] args) {
        TicTacToeBoard frame = new TicTacToeBoard();
        frame.setTitle("Exercise 4");
        frame.setSize(580, 200);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
