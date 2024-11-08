package Screens;

import Constants.GUI_Constants;

import javax.swing.*;
import java.awt.*;
import java.util.jar.JarEntry;

public class LoginScreen {

    private JFrame frame;
    private JPanel panel;
    private JTextField username;
    private JPasswordField password;
    private JButton login;
    private JLabel label;

    public LoginScreen(){
        frame = new JFrame("Login Screen");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(new ImageIcon("src/Images/Flight.png").getImage());


        panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);

        //Image label
        ImageIcon icon = new ImageIcon("src/Images/flight.png");
        Image image = icon.getImage();
        Image scaled = image.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        icon = new ImageIcon(scaled);

        label = new JLabel();
        label.setIcon(icon);
        label.setBounds(10, 10, 100, 100);
        panel.add(label);

        // Welcome Text
        label = new JLabel("Welcome to Judels Flights!");
        label.setBounds(120, 40, 350, 30);
        label.setFont(new Font("Tahoma", Font.BOLD, 26));
        panel.add(label);

        label = new JLabel("Login");
        label.setBounds(210, 90, 100, 40);
        label.setForeground(GUI_Constants.blue);
        label.setFont(new Font("Tahoma", Font.BOLD, 30));
        panel.add(label);

        // username input
        label = new JLabel("Username:");
        label.setBounds(150, 182, 100, 20);
        label.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel.add(label);

        username = new JTextField();
        username.setBounds(150, 200, 200, 30);
        panel.add(username);

        //password input
        label = new JLabel("Password:");
        label.setBounds(150, 232, 100, 20);
        label.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel.add(label);

        password = new JPasswordField();
        password.setBounds(150, 250, 200, 30);
        panel.add(password);

        login = new JButton("Login");
        login.setBounds(200, 300, 100, 30);
        panel.add(login);
    }
    public void show(){
        frame.setVisible(true);
    }
}
