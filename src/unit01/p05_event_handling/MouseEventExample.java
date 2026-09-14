package unit01.p05_event_handling;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventExample extends JFrame implements MouseListener {

    MouseEventExample() {
        setTitle("Mouse Event Example");
        addMouseListener(this);   // registering the FRAME itself as the source

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked at: (" + e.getX() + ", " + e.getY() + ")");
    }
    public void mousePressed(MouseEvent e) {  }
    public void mouseReleased(MouseEvent e) { }
    public void mouseEntered(MouseEvent e) {  }
    public void mouseExited(MouseEvent e) {   }

    public static void main(String[] args) {
        new MouseEventExample();
    }
}