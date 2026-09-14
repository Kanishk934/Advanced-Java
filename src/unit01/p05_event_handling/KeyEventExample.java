package unit01.p05_event_handling;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyEventExample extends JFrame implements KeyListener {

    KeyEventExample() {
        setTitle("Key Event Example");
        addKeyListener(this);
        setFocusable(true);   // IMPORTANT: frame must be focusable to receive key events

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void keyTyped(KeyEvent e) { }
    public void keyPressed(KeyEvent e) {
        System.out.println("Key pressed: " + e.getKeyChar());
    }
    public void keyReleased(KeyEvent e) { }

    public static void main(String[] args) {
        new KeyEventExample();
    }
}