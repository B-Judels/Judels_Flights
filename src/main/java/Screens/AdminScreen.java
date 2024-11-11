package Screens;

import javax.swing.*;

public class AdminScreen {

    private JFrame frame;
    private JPanel panel;

    public AdminScreen() {
        frame = new JFrame("Admin Panel");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(new ImageIcon("src/Images/Flight.png").getImage());


        panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);
    }

    public void show(){
        frame.setVisible(true);
    }
}
