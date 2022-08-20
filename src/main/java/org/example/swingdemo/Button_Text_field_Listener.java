package org.example.swingdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 8/18/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class Button_Text_field_Listener {

    public static void main(String[] args) {
        Addition obj = new Addition();
    }
}


class Addition extends JFrame implements ActionListener {
    // we define all variables outside, because then they can store data from one method and
    // another method can refer as well
JTextField t1, t2;
JButton b;
JLabel l;

    public Addition() {
         t1 = new JTextField(20);//for text field
         t2 = new JTextField(20);

        //We will do some event, so we need a button
         b = new JButton("OK");

      //so, we added button, but just button has not action, that is why we need
      // to add listener to the button. so then button can listen and act

       //ActionListener is an interface. To create int interface we have 2 ways:
       // We need to search the class that implements action listener, or we implement our class
       b.addActionListener(this);


         l = new JLabel("Result");

        add(t1);
        add(t2);
        add(b);//adding button
        add(l);


        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // everytime we click button, button will call this method
    @Override
    public void actionPerformed(ActionEvent e) {
        int num1= Integer.parseInt(t1.getText());//converting String to int
        int num2=Integer.parseInt(t2.getText());

        int value = num1+num2;
        int i = num1*num2;


        // we're sending data to outside of scope
        l.setText(value+"");// because sendText wants string, we add int+String.

    }
}
