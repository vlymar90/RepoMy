package ru.geekbrains.dz;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButton extends JButton {
    private JButton[] myButton = initListNumder();


    private JButton[] initListNumder() {
        JButton[] button = new JButton[10];
        for (int i = 0; i < button.length; i++) {
            button[i] = new JButton(String.valueOf(i));
        }
        return button;
    }

    public JButton[] getMyButton() {
        return myButton;
    }
}



