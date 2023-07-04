import ComprePrac.Test1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

public class AWTPrac extends Frame {

    AWTPrac(){
        Button b = new Button("Open Dialog");
        b.addActionListener(new CustomAdapter(this));
        b.setBounds(100,200,30,40);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setSize(300,400);
        add(b);
        setLayout(null);
        setVisible(true);
    }

    class CustomAdapter implements ActionListener {
        Frame frame;
        CustomAdapter(Frame frame){

            this.frame = frame;
        }

        public void actionPerformed(ActionEvent e) {
            System.out.println("Button pressed");
            System.out.println(e.getActionCommand());
            new DialogChoice(frame);
        }
    }
    public static void main(String args[]){
        new AWTPrac();
    }
}
