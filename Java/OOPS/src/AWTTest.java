
import ComprePrac.Test1;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;

public class AWTTest {

    Checkbox c1,c2,c3;
    AWTTest(){
        Frame frame = new Frame("My Frame");
        frame.setSize(600,500);

        frame.add(new Label("Buttons"));
        frame.add(new TextField(20));
        frame.add(new Button("ONE"));
        frame.add(c1 = new Checkbox("book"));
        frame.add(c2 = new Checkbox("bag"));
        frame.add(c3 = new Checkbox("laptop"));
        c1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println(e.getStateChange() == ItemEvent.SELECTED);
            }
        });
        Choice c = new Choice();

        c.addItem("OS");
        c.addItem("OOPS");

        c.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println(e.getItem());
                System.out.println(e.getItemSelectable().getSelectedObjects()[0]);
            }
        });
        frame.add(c);

        List l = new List();
        l.add("Ram");
        l.add("Mohan");
        l.add("John");
        l.setMultipleMode(true);
        l.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println(Arrays.toString(e.getItemSelectable().getSelectedObjects()));
            }
        });

        TextArea textArea = new TextArea(30,50);
        textArea.setSize(30,40);
        frame.add(textArea);
        frame.add(l);

        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

    }

    public static void main(String[] args) {
        new AWTTest();
    }
}
