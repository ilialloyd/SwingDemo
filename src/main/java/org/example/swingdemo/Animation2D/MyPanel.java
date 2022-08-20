package org.example.swingdemo.Animation2D;

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
public class MyPanel extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 1900;
    final int PANEL_HEIGHT = 1000;
    Image image;
    Image backgroundImage;
    Timer timer;
    int xVelocity =2;//moving direction of catbus
    int yVelocity = 1;
    int x =0;// starting point
    int y = 0;
    MyPanel() {

        setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        setBackground(Color.black);
        image = new ImageIcon("catbus1.png").getImage();
        backgroundImage = new ImageIcon("nature.jpg").getImage();
        timer = new Timer(10 ,this );
        timer.start();

    }

    //
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(backgroundImage,0,0,null);
        g2D.drawImage(image,x,y,null);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //normalda herecek eden cisim frame serhedlerinden kenara cixmasin deye cerciveni
        // nezere alacaq statement yaziriq
        //sagdan sola
        if(x>= PANEL_WIDTH - image.getWidth(null)  || x<0 ){//frame olcusunden item olcusunu cixiriq
            xVelocity = xVelocity* -1;
        }
        x=x+xVelocity;//position of moving item
        repaint();

        // yuxaridan asaqi
        if(y>= PANEL_HEIGHT - image.getHeight(null)  || y<0 ){//frame olcusunden item olcusunu cixiriq
            yVelocity = yVelocity* -1;
        }
        y=y+yVelocity;//position of moving item
        repaint();



    }
}
