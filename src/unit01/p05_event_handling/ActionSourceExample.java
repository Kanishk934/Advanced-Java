package unit01.p05_event_handling;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ActionSourceExample extends JFrame implements ActionListener {

    JButton redBtn, blueBtn;

    ActionSourceExample() {
        setTitle("getSource() Example");
        setLayout(new FlowLayout());

        redBtn = new JButton("Red");
        blueBtn = new JButton("Blue");

        redBtn.addActionListener(this);
        blueBtn.addActionListener(this);

        add(redBtn);
        add(blueBtn);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redBtn) {
            getContentPane().setBackground(Color.RED);
        } else if (e.getSource() == blueBtn) {
            getContentPane().setBackground(Color.BLUE);
        }
        repaint();   // forces the window to redraw with the new background color
    }

    public static void main(String[] args) {
        new ActionSourceExample();
    }
}