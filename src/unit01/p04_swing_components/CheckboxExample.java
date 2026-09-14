package unit01.p04_swing_components;
import java.awt.*;

public class CheckboxExample extends Frame {

    CheckboxExample() {
        Checkbox subscribeBox = new Checkbox("Subscribe to newsletter");

        add(subscribeBox);

        setTitle("AWT Checkbox Example");
        setSize(300, 200);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
        new CheckboxExample();
    }
}
