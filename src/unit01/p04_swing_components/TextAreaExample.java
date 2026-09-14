package unit01.p04_swing_components;
import java.awt.*;

public class TextAreaExample extends Frame {

    TextAreaExample() {
        Label commentLabel = new Label("Comments:");
        TextArea commentArea = new TextArea(5, 15);   // 5 rows, 25 columns

        add(commentLabel);
        add(commentArea);

        setTitle("AWT TextArea Example");
        setSize(300, 250);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextAreaExample();
    }
}
