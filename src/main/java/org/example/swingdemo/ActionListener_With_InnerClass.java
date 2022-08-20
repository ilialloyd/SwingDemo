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
public class ActionListener_With_InnerClass {
    public static void main(String[] args) {
        Action2 a =new Action2();
    }
}
class Action2 extends JFrame {
    JTextField text1, text2;
    JButton button;
    JLabel label;

    public Action2(){
        text1 = new JTextField(10);
        text2 = new JTextField(10);
        button = new JButton("Click here!");
        label = new JLabel("cavab");

        add(text1);
        add(text2);
        add(button);
        add(label);


        button.addActionListener( new ActionListener() {//anonymous-inner class version
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(text1.getText());//converting String to int
                int num2 = Integer.parseInt(text2.getText());

                int value = num1 + num2;
                label.setText(value + "");
            }
        });
        //lambda version
        //  b.addActionListener((e) -> {//public void actionPerformed(ActionEvent e) {
        //            int num1 = Integer.parseInt(t1.getText());//converting String to int
        //            int num2 = Integer.parseInt(t2.getText());
        //
        //            int value = num1 + num2;
        //            l.setText(value + "");
        //            });





        setLayout(new FlowLayout());
        setVisible(true);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

}
