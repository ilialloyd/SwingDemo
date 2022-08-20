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
public class JProgressBar_example {
    public static void main(String[] args) throws InterruptedException {
        Pbar pbar = new Pbar();
    }

}

class Pbar extends JFrame implements ActionListener {
    JProgressBar p;
    int i;

    public Pbar()  {
        JButton b = new JButton("Click for Calculator");
        p = new JProgressBar(0,10);//loading bar
        p.setValue(0);
        p.setBounds(0,0,420,50);//barin olculeri
        p.setStringPainted(true);//barin ustunde faiz yazisi
        Timer t = new Timer(100, this);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.start();
            }
        });

        add(b);
        add(p);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (i == 10) {
            new AddSub();
            dispose();
        }
        i++;
        p.setValue(i);
    }


}
