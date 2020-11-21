package ru.geekbrains.dz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    Display display = new Display();

    MyWindow() {
        //Отрисовываем окно
        setTitle("Калькулятор");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(600, 300, 300, 300);

        //Добавляем панель ввода
        JPanel panelLine = new JPanel(new BorderLayout());
        panelLine.add(display);
        add(panelLine, BorderLayout.NORTH);

        //Добавляем панель набора цифр
        JPanel panelNumber = new JPanel(new GridLayout(4, 3));
        MyButton button = new MyButton();
        JButton[] listButton = button.getMyButton();
        for (int i = 1; i < listButton.length; i++) {
            int finalI = i;
            listButton[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    display.setText(display.getText() + listButton[finalI].getText());
                }
            });

            panelNumber.add(listButton[i]);
        }
        JButton removeButton = new JButton("C");
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
            }
        });
        panelNumber.add(removeButton);

        listButton[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + listButton[0].getText());
            }
        });
        panelNumber.add(listButton[0]);
        JButton floatButton = new JButton(".");
        floatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + floatButton.getText());
            }
        });
        panelNumber.add(floatButton);

        // Добавляем операции
        JPanel panelOperation = new JPanel();
        panelOperation.setLayout(new GridLayout(5,1));
        JButton[] listOperation = new JButton[5];
        listOperation[0] = new JButton(" + ");
        listOperation[1] = new JButton(" - ");
        listOperation[2] = new JButton(" * ");
        listOperation[3] = new JButton(" / ");
        listOperation[4] = new JButton(("="));

        listOperation[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + listOperation[0].getText());
            }
        });
        listOperation[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + listOperation[1].getText());
            }
        });
        listOperation[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + listOperation[2].getText());
            }
        });
        listOperation[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + listOperation[3].getText());
            }
        });
        listOperation[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(Calculator.operation(display.getText()));
            }
        });

        for (int countOperation = 0; countOperation < listOperation.length; countOperation++) {
            panelOperation.add(listOperation[countOperation]);
        }

        add(panelOperation, BorderLayout.EAST);
        add(panelNumber, BorderLayout.CENTER);
        setVisible(true);
    }

}
