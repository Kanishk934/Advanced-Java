package unit01.p04_swing_components;
import java.awt.*;

public class ChoiceExample extends Frame {

    ChoiceExample() {
        Label cityLabel = new Label("Select your city:");
        Choice cityChoice = new Choice();

        cityChoice.addItem("Delhi");
        cityChoice.addItem("Bhind");
        cityChoice.addItem("Bangalore");
        cityChoice.addItem("Dehradun");

        add(cityLabel);
        add(cityChoice);

        setTitle("AWT Choice Example");
        setSize(300, 200);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
        new ChoiceExample();
    }
}