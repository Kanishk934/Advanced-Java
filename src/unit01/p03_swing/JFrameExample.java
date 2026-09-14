package unit01.p03_swing;

import javax.swing.*;

public class JFrameExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame();          // Swing's version of a top-level window
        frame.setTitle("My First Swing Window");
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
