package Lab9;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GraphicsFrame extends Frame {
    Boolean readyToPaint = false;
    GraphicsFrame(){
        Button b = new Button("Click me");
        b.setBounds(150,100,50,50);
        setBackground(Color.YELLOW);
        add(b);
        setTitle("Graphics demo");
        setLayout(null);
        setSize(400,500);
        setVisible(true);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button pressed");
                readyToPaint = true;
                repaint();
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void paint(Graphics g) {
        if (readyToPaint) {
            g.setColor(Color.BLUE);
//            g.drawRect(150, 250, 200, 80);
            g.fillRect(150,250,200,80);
        }
    }

}
