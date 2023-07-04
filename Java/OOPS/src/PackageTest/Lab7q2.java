package PackageTest;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Lab7q2 extends Frame {
    private int count = 0;
    static int Fl = 0;

    public void increment(){
        Fl++;
        System.out.println("Fl value now is " + Fl);
    }

    public Lab7q2() {
        setSize(400, 100);
        setLayout(null);
        Label countLabel = new Label("Count: ", Label.LEFT);
        countLabel.setBounds(25, 50, 100, 20);
        TextField counter = new TextField();
        counter.setEditable(false);
        counter.setBounds(150, 50, 100, 20);
        counter.setColumns(1);
        Button addCount = new Button("Count");
        addCount.setBounds(275, 50, 100, 20);
        add(countLabel);
        add(counter);
        add(addCount);
        setVisible(true);
        setTitle("My useless app");
        addCount.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                count = count + 1;
                increment();
                counter.setText(String.valueOf(count));
            }
        });
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        Lab7q2 p2 = new Lab7q2();

    }
}
