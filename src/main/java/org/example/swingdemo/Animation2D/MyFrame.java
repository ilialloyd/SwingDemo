package org.example.swingdemo.Animation2D;

import javax.swing.*;
import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 8/19/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class MyFrame extends JFrame {
    MyPanel panel;//instance of MyPanel

    MyFrame() {
        panel = new MyPanel();


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel);
        pack();
        setLocationRelativeTo(null);//allow to appear meddle of the screen
        setVisible(true);
    }
}
