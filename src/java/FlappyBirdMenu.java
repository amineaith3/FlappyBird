package src.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlappyBirdMenu extends JPanel {
    private JButton startButton;
    private JButton exitButton;

    public FlappyBirdMenu(JFrame frame) {
        setLayout(new GridLayout(2, 1)); // 2 rows, 1 column

        startButton = new JButton("Start Game");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Start your game logic here
                startGame(frame);
            }
        });

        exitButton = new JButton("Exit");
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Exit the application
            }
        });

        add(startButton);
        add(exitButton);
    }

    private void startGame(JFrame frame) {
        // Code to start your Flappy Bird game
        frame.getContentPane().removeAll();
        FlappyBird flappyBird = new FlappyBird(frame, this);
        frame.add(flappyBird);
        frame.revalidate();
        frame.repaint();
        flappyBird.requestFocus();
        frame.setVisible(true);
    }
}
