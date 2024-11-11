package Screens;

import Constants.GUI_Constants;

import javax.swing.*;
import java.awt.*;

public class FlightSearchScreen {

    private JFrame frame;
    private JPanel panel;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem f1, f2, f3, f4;
    private JTextField flightSearch;
    private JButton searchButton;

    public FlightSearchScreen() {
        frame = new JFrame("Flight Search");
        frame.setSize(700, 550);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(new ImageIcon("src/Images/Flight.png").getImage());


        panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);

        flightSearch = new JTextField();
        flightSearch.setBounds(250, 20, 180, 20);
        GUI_Constants.Input(flightSearch);
        panel.add(flightSearch);


        ImageIcon searchIcon = new ImageIcon("src/Images/magnifying-glass.png");
        Image searchIconImage = searchIcon.getImage();
        Image scaledImage = searchIconImage.getScaledInstance(18, 18, Image.SCALE_SMOOTH);
        searchIcon = new ImageIcon(scaledImage);

        searchButton = new JButton(searchIcon);
        searchButton.setBounds(430, 20, 20, 20);
        GUI_Constants.Button(searchButton);
        panel.add(searchButton);




    }

    public void show(){
        frame.setVisible(true);
    }
}
