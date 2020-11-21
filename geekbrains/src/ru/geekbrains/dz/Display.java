package ru.geekbrains.dz;

import javax.swing.*;
import java.awt.*;

public class Display extends JTextField {
    JTextField textField;


        Display() {
            setBackground(Color.LIGHT_GRAY);
            setFont(new Font("Areal", Font.BOLD, 40));
            setPreferredSize(new Dimension(50, 40));
        }


    public JTextField getTextField() {
        return textField;
    }

}
