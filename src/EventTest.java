import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created By Arjun Gautam
 * Date :04/01/2022
 * Time :9:24 PM
 * Project Name :SwingDemo
 */

public class EventTest extends JFrame implements ActionListener {

    private JTextField t1,t2,t3;
    JLabel l1,l2,l3;
    JButton b1,b2;

    public EventTest(){
        super("Handling Action Event");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l1=new JLabel("First Value:");
        l2=new JLabel("Second Value:");
        l3=new JLabel("Result:");

        t1=new JTextField(10);
        t2=new JTextField(10);
        t3=new JTextField(10);

        b1=new JButton("Add");
        b2=new JButton("Subtract");

        b1.addActionListener(this);
        b2.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.LEFT,150,10));
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
        setSize(400,300);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        int x,y,z;
        x=Integer.parseInt(t1.getText());
        y=Integer.parseInt(t2.getText());

        if(ae.getActionCommand()=="Add")
            z=x+y;

        else
            z=x-y;

        t3.setText(String.valueOf(z));
    }

    public static void main(String[] args) {
        new EventTest();
    }

}
