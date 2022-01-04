import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created By Arjun Gautam
 * Date :04/01/2022
 * Time :9:13 PM
 * Project Name :SwingDemo
 */

public class HelloWorldFrame extends JFrame implements ActionListener {

    JLabel l;
    JTextField t;
    JTextField result;
    JButton b;

    HelloWorldFrame() {
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setTitle("GUI Test");

        setLayout(null);
        l = new JLabel("Your Name");
        t = new JTextField(15);
        b = new JButton("Click here");
        result = new JTextField(15);

        b.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.LEFT, 150, 10));
        add(l);
        add(t);
        add(b);
        add(result);
        setSize(500, 200);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent actionEvent) {

        String name = t.getText();
        result.setText(String.valueOf(name));

    }

    public static void main(String[] args) {
        new HelloWorldFrame();
    }
}
