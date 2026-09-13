package unit01.p03_swing_components;

import java.awt.*;

public class LabelExample extends Frame {

    LabelExample() {
        Label greeting = new Label("Welcome to AWT!");   // create a Label with text

        add(greeting);                                    // add it to this Frame

        setTitle("AWT Label Example");
        setSize(300, 200);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
        new LabelExample();
    }
}