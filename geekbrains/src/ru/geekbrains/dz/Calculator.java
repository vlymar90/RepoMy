package ru.geekbrains.dz;

public class Calculator {

     public static String operation(String line) {
         String[] numberAndOperation = line.split(" ");
           String total = "";
           double result = 0;
           double numberOne = Double.parseDouble(numberAndOperation[0]);
           double numberTwo = Double.parseDouble(numberAndOperation[2]);
           char[] chars = numberAndOperation[1].toCharArray();
           char operation = chars[0];

           if(operation == '+') {
                result = numberOne + numberTwo;
                total += result;
           }
           if(operation == '-') {
               result = numberOne - numberTwo;
               total += result;
           }
           if(operation == '*') {
               result = numberOne * numberTwo;
               total += result;
           }
           if(operation == '/') {
               try {
                   result = numberOne/numberTwo;
                   total += result;
               }
               catch (Exception e) {
                   return "Ошибка!";
               }
           }

             return total;
           }


     }

