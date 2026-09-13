package unit01.p03_swing_components;
import java.awt.*;

public class ListExample extends Frame {

    ListExample() {
        Label label = new Label("Select your favorite fruit:");
        List fruitList = new List(4);          // shows 4 rows, single-select by default

        fruitList.addItem("Apple");
        fruitList.addItem("Banana");
        fruitList.addItem("Mango");
        fruitList.addItem("Orange");
        fruitList.addItem("Grapes");

        add(label);
        add(fruitList);

        setTitle("AWT List Example");
        setSize(300, 250);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
        new ListExample();
    }
}