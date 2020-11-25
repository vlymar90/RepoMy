package ru.geekbrains.dz;

public class MyArrayDataException extends NumberFormatException {
        int result;
        String s;
    public MyArrayDataException(String s, int result) {
        this.s = s;
        this.result = result;
    }

    public String getS() {
        return s;
    }

    public int getResult() {
        return result;
    }
}
