package ru.geekbrains.dz;



public class Work {

    public static void main(String[] args) {
        int[] list = {0, 1, 1, 1, 0, 1, 0, 1};
        int[] emptyList = new int[8];
        int[][] listDouble = new int[5][5];
        //неправильно выводит массив
        int [] list2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int [] list3 = {2,2,2,2,2,2,2,2,2,2,2,2};
       reverse(list);
       fullList(emptyList);
       multiplication(list2);
       d2(listDouble);
       max(list2);
       min(list2);
       comparison(list3);


        }


    // Задание 1.
    public static void reverse(int[] list) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == 0) list[i] = 1;
            else list[i] = 0;
        }
    }
    // Задание 2.
    public static void fullList(int[] list) {

        int [] list2 = {0, 3, 6, 9, 12, 15, 18, 21};
        for (int y = 0; y < list.length; y++) {
            list[y] = list2[y];
        }
    }
    // Задание 4.
    public static void d2(int [][] list) {
        int[][] listDouble = new int[5][5];
        for (int i = 0; i < list.length; i++) {
            list[i][i] = 1;
            list[i][list.length - i - 1] = 1;
        }
    }

    // Задание 3.
    public static void multiplication(int[] list) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] < 6) list[i] *= 2;
        }
    }

    // Задание 5.
    public static int max(int [] list) {
        int max = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] > max) max = list[i]; }
        return max;
    }
    public static int min(int [] list) {
        int min = list[0];
        for(int i = 0; i < list.length;i++) {
            if(list[i]<min) min = list[i];
        }
        return min;
    }

    // Задание 6.
    public static boolean comparison(int [] list) {
        int count;
        if(!(list.length%2==0)) {
            count = list.length / 2 + 1;
        }
        else
            count =  list.length / 2;
        int [] numberOne = new int[count];
        int [] numberTwo = new int[count];
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i<count;i++) {
            numberOne[i] = list[i];
            sum1 +=numberOne[i];
        }
        for(int i = 0;i<list.length - count;i++) {
            numberTwo[i] = list[i + count];
            sum2 += numberTwo[i];
        }
        if(sum1==sum2) return true;
        else return false;

    }
}

