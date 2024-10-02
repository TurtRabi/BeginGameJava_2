package main;

import javax.swing.*;

public class Game extends JFrame {
    GameScreen gameScreen;
    public Game(){
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        gameScreen = new GameScreen();
        add(gameScreen);
    }
    public static void main(String[] args) {
        Game game = new Game();

    }
}
