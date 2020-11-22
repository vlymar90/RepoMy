package ru.geekbrains.dz;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButton extends JButton {
    private String[] number = {"7","8","9","4","5","6","1","2","3",".","0"};
    private String[] operation = {" / "," * "," + "," - "};
    private JButton[] myButton = initList(number);
    private JButton[] MyOperation = initList(operation);
    Display display = new Display();

    public JButton[] getMyOperation() { return MyOperation; }

    public Display getDisplay() { return display; }

    public JButton[] getMyButton() { return myButton; }

    //Инициализация и добавления копок

    private JButton[] initList(String[] list) {
        JButton[] button = new JButton[list.length];
        for (int i = 0; i < list.length; i++) {
            button[i] = new JButton(list[i]);
            int finalI = i;
            button[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    display.setText(display.getText() + button[finalI].getText());
                }
            });
        }
        return button;
    }

    //Внутренний класс для отрисовки дисплея

    public class Display extends JTextField {
        Display() {
            setBackground(Color.LIGHT_GRAY);
            setFont(new Font("Areal", Font.BOLD, 20));
            setPreferredSize(new Dimension(50, 40));
        }
    }
}



