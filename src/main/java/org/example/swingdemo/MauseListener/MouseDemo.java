package org.example.swingdemo.MauseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 8/19/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class MouseDemo extends JFrame implements MouseListener {

    JLabel label;
    ImageIcon happy;
    ImageIcon pain;
    ImageIcon covid;

    ImageIcon dizz;



    public MouseDemo() {


        label = new JLabel();
        label.addMouseListener(this);


        happy = new ImageIcon("happy.jpeg");
        covid = new ImageIcon("covid.jpeg");
        pain = new ImageIcon("pain.jpg");
        dizz = new ImageIcon("dizz.jpeg");

        label.setIcon(happy);//default it will show happy emoji
        add(label);

        setLayout(new FlowLayout());
        setVisible(true);
      setSize(500, 500);
        pack();
        setLocationRelativeTo(null);// this method applicationu ekranin merkezinde sabitleyir
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Oh NOOOOO!");
    }

    @Override
    public void mousePressed(MouseEvent e) {
label.setIcon(pain);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setIcon(dizz);

    }

    @Override
    public void mouseEntered(MouseEvent e) {
label.setIcon(covid);
    }

    @Override
    public void mouseExited(MouseEvent e) {
label.setIcon(dizz);
    }
}
