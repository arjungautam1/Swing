import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarEntry;

/**
 * Created By Arjun Gautam
 * Date :04/01/2022
 * Time :10:11 PM
 * Project Name :SwingDemo
 */

public class AddNum extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1, b2, b3;

    public AddNum() {
        super("Handling Action Event");

        l1 = new JLabel("First Value:");
        l2 = new JLabel("Second Value:");
        l3 = new JLabel("Result");

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);

        b1 = new JButton("Add");

        b1.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.LEFT,150,10));
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);

        add(b1);

        setSize(400, 300);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent actionEvent) {

        int x = Integer.parseInt(t1.getText());
        int y = Integer.parseInt(t2.getText());

        int result = x + y;

        t3.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        new AddNum();
    }

}
