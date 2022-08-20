package org.example.swingdemo;

import javax.swing.*;
import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 8/17/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 * <p>
 * JFrame has by default invisible property
 * to make it visible we need to use setVisible method()
 */
public class FirstGUI {
    public static void main(String[] args) {
        Abc obj = new Abc();

    }

}


class Abc extends JFrame {

    public Abc() {


        //to show something we need components
        JLabel l = new JLabel("Hello World!");
        JLabel j = new JLabel("Welcome Ilham");

        //setLayout - there are some different Layouts, you to change
        //work-style of add() method by setting Layout

        setLayout(new FlowLayout());  // , FlowLayout,GridLayout,Null

        //now we need to add label to the application
        add(l);
        add(j);
        //CardLayout -
        // if you try to add again, you cant use add, then it takes the last one



        // to application visible we use setVisible() method
        //true will show, false will make it invisible
        setVisible(true);
        setSize(400, 400);


        //when you exit from the app it actually doesn't terminate process,
        //to close or terminate, we add exit operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setDefaultCloseOperation(3); same result with Exit


    }
}