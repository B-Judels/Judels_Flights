package Constants;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class GUI_Constants {

    // main color theme
    public static Color blue = new Color(0, 152, 225);

    public static Color coolRed = new Color(249, 2, 70);

    //button styling
    public static void Button(JButton button){
        button.setBackground(Color.WHITE);
        button.setForeground(blue);
        button.setBorder(new LineBorder(blue, 2));
        button.setFocusable(false);

        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button.setForeground(Color.WHITE);
                button.setBorder(new LineBorder(Color.WHITE, 2));
                button.setBackground(coolRed);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                button.setForeground(Color.WHITE);
                button.setBorder(new LineBorder(Color.WHITE, 2));
                button.setBackground(coolRed);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                button.setForeground(Color.BLACK);
                button.setBorder(new LineBorder(Color.black, 2));
                button.setBackground(blue);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                button.setForeground(Color.BLACK);
                button.setBorder(new LineBorder(Color.black, 2));
                button.setBackground(blue);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setBackground(Color.WHITE);
                button.setForeground(blue);
                button.setBorder(new LineBorder(blue, 2));
            }
        });
    }

    public static void Input(JTextField textField){
        textField.setBackground(Color.WHITE);
        textField.setForeground(Color.BLACK);
        textField.setBorder(new LineBorder(blue, 2));

        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

                textField.setBorder(new LineBorder(coolRed, 2));
            }

            @Override
            public void focusLost(FocusEvent e) {

                textField.setBorder(new LineBorder(blue, 2));
            }
        });

    }

}
