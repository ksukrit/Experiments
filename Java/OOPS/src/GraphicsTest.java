import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class SuperClass {
    int x = 2;

    void Test(){
        System.out.println("SuperClass");
    }
}

class SubClass extends SuperClass {
    int x = 3;

    void Test(){
        System.out.println("SubClass");
    }
    SubClass() {

    }
}

class test2 {
    public static void main(String[] args) {
        SuperClass sc = new SubClass();
        sc.Test();
        System.out.println(sc.x);
    }
}

public class GraphicsTest extends Frame{
    public void paint(Graphics g){
        Font f = new Font("TimesRoman",Font.BOLD,30);
        g.setFont(f);
        g.drawString("Hello",30,150);
        g.drawRect(50,50,20,20);
        g.setColor(Color.PINK);
        g.fillRect(300,200,50,100);
    }

    GraphicsTest(){
        setSize(600,600);
        setBackground(Color.BLUE);
        setVisible(true);
        Button b = new Button("Sample Button");
        setLayout(null);
        b.setBounds(30,400,30,30);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBackground(Color.ORANGE);
                repaint();
            }
        });

        add(b);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        GraphicsTest g = new GraphicsTest();

    }
}
