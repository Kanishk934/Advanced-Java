package unit01.p07_layout_managers;

import java.awt.*;
import javax.swing.*;

public class GridLayoutExample extends JFrame {

    GridLayoutExample() {
        setTitle("GridLayout Example — Simple Calculator Buttons");
        setLayout(new GridLayout(4, 3, 5, 5));   // 4 rows, 3 columns, 5px gaps

        String[] buttons = {
                "7", "8", "9",
                "4", "5", "6",
                "1", "2", "3",
                "0", "=", "+"
        };

        for (String label : buttons) {
            add(new JButton(label));
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutExample();
    }
}