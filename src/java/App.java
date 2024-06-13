package src.java;

import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Flappy Bird");
        frame.setSize(640, 640);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create and add menu to the frame
        FlappyBirdMenu menu = new FlappyBirdMenu(frame);
        frame.add(menu);

        frame.setVisible(true);
    }
}
