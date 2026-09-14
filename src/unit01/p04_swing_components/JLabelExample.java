package unit01.p04_swing_components;

import javax.swing.*;

public class JLabelExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Label Example");
        JLabel label = new JLabel("Java is Amazing");

        frame.add(label);
        frame.setSize(300, 500);
        frame.setVisible(true);
    }
}