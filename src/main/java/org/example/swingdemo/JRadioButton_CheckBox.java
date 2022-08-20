package org.example.swingdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 8/19/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class JRadioButton_CheckBox {

    public static void main(String[] args) {
        RadioDemo rd = new RadioDemo();
    }
}

class RadioDemo extends JFrame{
    JTextField t1;
    JButton b;
    JRadioButton r1,r2; //RadioButton
    JCheckBox c1,c2;
    JLabel l;



    public RadioDemo() {
        t1 = new JTextField(15);
        b = new JButton("Choose");
        r1= new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        c1 = new JCheckBox("Dancing");
        c2 = new JCheckBox("Singing");
        l = new JLabel("Greeting");

        // DarioButton da birini seçərkən digərinin deselect olması üçün
        // mütləq bu metodu əlavə etməliyik.
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        add(t1);
        add(r1);
        add(r2);
        add(c1);
        add(c2);
        add(b);
        add(l);




        b.addActionListener(ae ->{
            String name = t1.getText();
            // Is selected method bize deyesek hansi radiobutton secilib
            if(r1.isSelected())
                name = "Mr. "+ name;
            else
                name = "Ms. "+name;

            if(c1.isSelected())
                // name+name edirik ki evvelki datani alaq ustune yeni stringi elave edek
                name = name+ " Dancer";
            if(c2.isSelected())
                name = name+ " Singer";

            l.setText(name);
        });

        //Checkbox has  ItemListener
        c1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                    System.out.println("Dancer");
            }
        });

        c2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Singer");
            }
        });


        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
