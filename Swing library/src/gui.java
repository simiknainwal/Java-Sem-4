import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Swing1 extends JFrame implements ActionListener {
JLabel l1 = new JLabel("Enter first number");
JTextField tf1 = new JTextField(10);
JLabel l2 = new JLabel("Enter second number");
JTextField tf2 = new JTextField(10);
JLabel l3 = new JLabel("Result");
JTextField tf3 = new JTextField(10);

JButton b1 = new JButton("Add");
JButton b2 = new JButton("Subtract");

public void actionPerformed(ActionEvent e){
    int x=Integer.parseInt(tf1.getText());
    int y=Integer.parseInt(tf2.getText());
//    if(e.getSource()==b1)
//    tf3.setText(" "+(x+y));
//    else tf3.setText(" "+(x-y));
    String cmd=e.getActionCommand();
    if(cmd.equals("Add"))tf3.setText(String.valueOf(x+y));
    else tf3.setText(String.valueOf(x-y));
}

Swing1(){
    add(l1);
    add(tf1);
    add(l2);
    add(tf2);
    add(l3);
    add(tf3);
    add(b1);
    add(b2);
    getContentPane().setBackground(Color.GREEN);
b1.addActionListener(this);
b2.addActionListener(this);
    setSize(500,500);
    setLayout(new FlowLayout());
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
}
}


public class gui {
    public static void main(String args[]){
    Swing1 ob = new Swing1();

    }
}
