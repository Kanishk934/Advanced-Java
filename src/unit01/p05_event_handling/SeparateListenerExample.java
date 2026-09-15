package unit01.p05_event_handling;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SeparateListenerExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Separate Listener Example");
        JButton button = new JButton("Press Me");

        button.addActionListener(new MyClickHandler());  // a DIFFERENT object as listener

        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}

// A standalone class dedicated purely to handling the event
class MyClickHandler implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("Handled by a separate class!");
    }
}