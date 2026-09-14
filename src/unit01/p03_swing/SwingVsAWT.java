package unit01.p03_swing;

import java.awt.Frame;
import java.awt.Button;
import javax.swing.JFrame;
import javax.swing.JButton;

public class SwingVsAWT {

    public static void main(String[] args) {
        // AWT version — heavyweight, native-looking button
        Frame awtFrame = new Frame("AWT Frame");
        Button awtButton = new Button("AWT Button");
        awtFrame.add(awtButton);
        awtFrame.setSize(300, 150);
        awtFrame.setVisible(true);

        // Swing version — lightweight, drawn entirely by Java
        JFrame swingFrame = new JFrame("Swing JFrame");
        JButton swingButton = new JButton("Swing Button");
        swingFrame.add(swingButton);
        swingFrame.setSize(300, 150);
        swingFrame.setLocation(350, 0);  // move it so it doesn't overlap the AWT window
        swingFrame.setVisible(true);
    }
}