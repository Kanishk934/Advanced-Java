package unit01.p02_awt;

import java.awt.*;
public class ButtonExample extends Frame  {
    ButtonExample() {
        Button okButton = new Button ("ok");

        add(okButton);
        setTitle("click me");
        setSize(300,200);
        setVisible(true);
        setLayout(new FlowLayout());
    }
    public static void main(String[] args){
        new ButtonExample();
    }
}
