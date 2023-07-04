import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DialogChoice extends Dialog {

    public DialogChoice(Frame owner) {
        super(owner);

        Choice c = new Choice();
        c.add("Choice 1");
        c.add("Choice 2");
        c.setBounds(100, 100, 75, 75);
        add(c);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        c.addItemListener(new B1());
        setSize(400,300);
        setLayout(null);
        setVisible(true);
    }

    public static class B1 implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            if((String)e.getItem() == "New Item"){
                System.out.println("He;;p ");
            }
        }
    }
}
