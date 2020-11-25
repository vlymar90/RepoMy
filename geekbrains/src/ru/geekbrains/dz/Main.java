package ru.geekbrains.dz;


import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        int result = 0;
        String[][] list = {{"15","2","24","2"},{"24","3","23","7"},{"5","6","8","10"},{"21","20","21","32","2"}};
        try {
            result = transformationArrays(list);
        } catch (MyArraySizeException e) {
          System.out.println(e.getInfo());
        }
        catch (MyArrayDataException ex) {
            System.out.println("Результат работы программы: " + ex.result);
            System.out.println(ex.getS());
            return;
        }

        System.out.println("Результат работы программы: " + result);
    }

    public static int transformationArrays(String[][] list) throws MyArraySizeException, MyArrayDataException {
        int index = 0;
        int number = 0;
        int sum = 0;

        for (String[] upList : list) {
            if(list.length > 4 || upList.length > 4) {
                throw new MyArraySizeException("Длина массива должна быть не больше 4 на 4");
            }
            for (String line : upList) {
                     try {
                         number = Integer.parseInt(line);
                         sum += number;
                     }
                     catch (NumberFormatException e) {
                         throw new MyArrayDataException("Ошибка в ячейки номер " + index, sum);
                     }
                index++;
            }
        }
        return sum;
    }
}



