package unit01.p02_awt;

import java.awt.Frame;

public class BasicFrame {

    public static void main(String[] args) {

        Frame frame = new Frame("My First GUI");

        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}