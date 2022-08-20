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
public class Caller {
    public static void main(String[] args) {
        Call c = new Call();

    }


}


class Call extends JFrame {

    public Call(){
         JButton b = new JButton("Click for Calculator");

         b.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 new AddSub();
                 dispose(); // it close first frame
             }
         });
        add(b);

          setLayout(new FlowLayout());
          setVisible(true);
          setSize(400, 400);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}