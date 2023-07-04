import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Lab6Q2 {
    public static void main(String[] args){
        Frame frame = new Frame("My Frame");
        frame.setSize(600,500);
        frame.setLayout(null);

        TextField name= new TextField();
        name.setBounds(150,70,200,50);
        Label nameLabel = new Label("Name");
        nameLabel.setBounds(50,70,100,50);

        TextField password = new TextField();
        password.setBounds(150,200,200,50);
        password.setEchoChar('*');
        Label passwordLabel = new Label("Password");
        passwordLabel.setBounds(50,200,100,50);

        Button button = new Button("Submit");
        button.setBounds(20,350,100,50);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getActionCommand());
            }
        });
        Label label = new Label("Please Login");
        label.setBounds(150,350,100,50);
        frame.add(name);
        frame.add(nameLabel);
        frame.add(password);
        frame.add(passwordLabel);
        frame.add(button);
        frame.add(label);

        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

    }


}
