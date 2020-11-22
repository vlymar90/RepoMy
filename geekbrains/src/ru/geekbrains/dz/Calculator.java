package ru.geekbrains.dz;

//Класс расчета

public class Calculator {
   static double result;
   static double numberOne;
   static double numberTwo;
   static char operation;

    public static String operation(String line) {
        String[] numberAndOperation = line.split(" ");
        String total = "";

        try {
            numberOne = Double.parseDouble(numberAndOperation[0]);
            numberTwo = Double.parseDouble(numberAndOperation[2]);
            char[] chars = numberAndOperation[1].toCharArray();
            operation = chars[0];
        } catch (NumberFormatException e) {
            return "Неправильный ввод!";
        }
        if(numberTwo == 0) {
            return "Ошибка!";
        }
        if (operation == '+') {
            result = numberOne + numberTwo;
            total += result;
        }
        if (operation == '-') {
            result = numberOne - numberTwo;
            total += result;
        }
        if (operation == '*') {
            result = numberOne * numberTwo;
            total += result;
        }
        if (operation == '/') {
            result = numberOne / numberTwo;
            total += result;

        }
            return total;
        }
    }

