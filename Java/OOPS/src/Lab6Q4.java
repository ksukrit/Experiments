import java.awt.*;
import java.awt.event.*;

public class Lab6Q4 {
    public static void main(String args[]){
        Frame frame = new Frame("Q4");
        frame.setSize(600,500);
        frame.setLayout(null);

        TextField textField= new TextField();
        textField.setBounds(150,70,200,50);

        Button button1 = new Button("First");
        button1.setBounds(20,350,100,50);
        Button button2 = new Button(" Second");
        button2.setBounds(150,350,100,50);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("First pressed");
            }
        });
        List l = new List();
        l.add("Item 2");
        l.add("Item 3");

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("Second pressed");
            }
        });

        frame.add(textField);
        frame.add(button1);
        frame.add(button2);

        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
