package unit01.p04_swing_components;

import java.awt.*;

public class TextFieldExample extends Frame {

    TextFieldExample() {
        Label nameLabel = new Label("Enter your name:");
        TextField nameField = new TextField(20);   // empty field, ~20 chars wide

        add(nameLabel);
        add(nameField);

        setTitle("AWT TextField Example");
        setSize(300, 200);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextFieldExample();
    }
}