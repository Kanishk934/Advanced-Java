package unit01.p05_event_handling;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ActionEventExample extends JFrame implements ActionListener {

    JButton okBtn, submitBtn, cancelBtn;

    ActionEventExample() {
        setTitle("ActionEvent Example");
        setLayout(new FlowLayout());

        okBtn = new JButton("OK");
        submitBtn = new JButton("SUBMIT");
        cancelBtn = new JButton("CANCEL");

        // registering the SAME listener (this) on all three buttons
        okBtn.addActionListener(this);
        submitBtn.addActionListener(this);
        cancelBtn.addActionListener(this);

        add(okBtn);
        add(submitBtn);
        add(cancelBtn);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();   // "OK", "SUBMIT", or "CANCEL"

        switch (command) {
            case "OK":
                System.out.println("OK button clicked!");
                break;
            case "SUBMIT":
                System.out.println("Form submitted!");
                break;
            case "CANCEL":
                System.out.println("Action cancelled!");
                break;
        }
    }

    public static void main(String[] args) {
        new ActionEventExample();
    }
}