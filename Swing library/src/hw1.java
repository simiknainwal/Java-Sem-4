import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Swing2 extends JFrame implements ActionListener{
    JButton red = new JButton("RED");
    JButton blue = new JButton("GREEN");
    JButton green = new JButton("BLUE");

    public void actionPerformed(ActionEvent e){
        String cmd=e.getActionCommand();
        if(cmd.equals("RED")) getContentPane().setBackground(Color.RED);
        else if(cmd.equals("GREEN")) getContentPane().setBackground(Color.GREEN);
        else if(cmd.equals("BLUE")) getContentPane().setBackground(Color.BLUE);
    }

    Swing2(){
        add(red);
        add(blue);
        add(green);
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(500,400);
        red.addActionListener(this);
        blue.addActionListener(this);
        green.addActionListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
    }
}


public class hw1 {
    public static void main(String[] args){
    Swing2 ob = new Swing2();
    }
}
