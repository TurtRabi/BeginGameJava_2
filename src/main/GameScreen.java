package main;

import javax.swing.*;
import java.awt.*;

public class GameScreen extends JPanel {
    public  GameScreen(){

    }

    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.BLACK);
        g2d.fillRect(50,50,50,50);
    }
}
