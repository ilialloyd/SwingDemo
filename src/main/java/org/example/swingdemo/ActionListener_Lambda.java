package org.example.swingdemo;

import javax.swing.*;
import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 8/19/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class ActionListener_Lambda {
    public static void main(String[] args) {
        Action1 a = new Action1();

    }
}


class Action1 extends JFrame {
    JTextField t1;
    JTextField t2;
    JLabel l;
    JButton b;

    public Action1() {
        t1 = new JTextField(10);
        t2 = new JTextField(10);

        b = new JButton("OK");

        l = new JLabel("Result");

        add(t1);
        add(t2);
        add(b);
        add(l);

        b.addActionListener((e) -> {//public void actionPerformed(ActionEvent e) {
            int num1 = Integer.parseInt(t1.getText());//converting String to int
            int num2 = Integer.parseInt(t2.getText());

            int value = num1 + num2;
            l.setText(value + "");
            // this actually means this
            // public void actionPerformed(ActionEvent e) {
            //        int num1= Integer.parseInt(t1.getText());
            //        int num2=Integer.parseInt(t2.getText());
            //        int value = num1+num2;
            //        l.setText(value+"");

        });


        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
