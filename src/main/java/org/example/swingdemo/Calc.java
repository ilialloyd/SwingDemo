package org.example.swingdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 8/19/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class Calc {
    public static void main(String[] args) {
        AddSub as = new AddSub();
    }
}
class AddSub extends JFrame {
    JTextField t1, t2;
    JButton b1, b2;
    JLabel l;


    public AddSub() { //also we need to implement ActionListener if we will do the seperate method
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        b1 = new JButton("Add");
        b2 = new JButton("Sub");
        l = new JLabel("Result");

        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(l);

        //there are 2 ways to define
        // we can do this way . in this way  we also need to implement ActionListener As well
        // b1.addActionListener(this);
        //b2.addActionListener(this);

        b1.addActionListener(new ActionListener() {// with anonymous - inner class
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(t1.getText());//converting String to int
                int num2 = Integer.parseInt(t2.getText());
                int value = num1 + num2;
                l.setText(value + "");
            }
        });

        b2.addActionListener(ae -> {// with Lambda
            int num1 = Integer.parseInt(t1.getText());//converting String to int
            int num2 = Integer.parseInt(t2.getText());
            int value = num1 - num2;
            l.setText(value + "");
        });


        setLayout(new FlowLayout());
        setVisible(true);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //also we will use if statement to get source from Action Event
//    public void actionPerformed(ActionEvent e) {
//        int num1 = Integer.parseInt(t1.getText());//converting String to int
//        int num2 = Integer.parseInt(t2.getText());
//        int value = 0;
//
//        if (e.getSource() == b1) value = num1 + num2;
//        else value = num1 - num2;
//
//        l.setText(value + "");
//    }
}