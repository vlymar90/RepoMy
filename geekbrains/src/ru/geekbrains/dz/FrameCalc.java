package ru.geekbrains.dz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameCalc extends JFrame {
         MyButton myButton = new MyButton();

    FrameCalc() {
        //Отрисовываем окно

        setTitle("Калькулятор");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(600, 300, 300, 300);
        //Инициализируем панель ввода

        JPanel display = new JPanel(new BorderLayout());
        JTextField rows = myButton.getDisplay();
        display.add(rows);

        //Инициализируем панель цифр

        JButton[] number = myButton.getMyButton();
        JPanel numberPanel = initPanel(number);
        numberPanel.setLayout(new GridLayout(4,3));
        JButton removeButton = new JButton("C");
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rows.setText("");
            }
        });
        numberPanel.add(removeButton);

        //Инициализируем панель операции

        JButton[] operation = myButton.getMyOperation();
        JPanel panelOperation = initPanel(operation);
        panelOperation.setLayout(new GridLayout(5,1));
        JButton result = new JButton("=");
        result.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rows.setText(Calculator.operation(rows.getText()));
            }
        });
        panelOperation.add(result);

        //Добавляем панели в окно

        add(panelOperation, BorderLayout.EAST);
        add(numberPanel, BorderLayout.CENTER);
        add(display, BorderLayout.NORTH);

        setVisible(true);
    }

    //Инициализация панели
    public JPanel initPanel(JButton[] list) {
        JPanel panel = new JPanel();
        for(int i = 0; i < list.length; i++) {
            panel.add(list[i]);
        }
        return panel;
    }
}
