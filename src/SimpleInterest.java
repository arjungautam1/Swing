import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

/**
 * Created By Arjun Gautam
 * Date :04/01/2022
 * Time :10:34 PM
 * Project Name :SwingDemo
 */

/*Program to calculate simple interest using Swing*/

public class SimpleInterest extends JFrame implements ActionListener {

    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3,t4;
    JButton b1;
    public SimpleInterest(){
        super("Simple Interest");


        l1=new JLabel("Principal:");
        l2=new JLabel("Time (Years):");
        l3=new JLabel("Rate:(%)");
        l4=new JLabel("Simple Interest :");

        t1=new JTextField(10);
        t2=new JTextField(10);
        t3=new JTextField(10);
        t4=new JTextField(10);

        b1=new JButton("calculate");
        b1.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.LEFT,150,10));

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(b1);
        setSize(400,400);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent eventListener){

        double p=Double.parseDouble(t1.getText());
        double t=Double.parseDouble(t2.getText());
        double r=Double.parseDouble(t3.getText());

        double i=(p*t*r)/100;

        t4.setText(String.valueOf(i));

    }

    public static void main(String[] args) {
        new SimpleInterest();
    }


}
