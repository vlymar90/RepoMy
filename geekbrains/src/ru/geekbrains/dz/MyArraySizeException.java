package ru.geekbrains.dz;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {
       String info;
       MyArraySizeException(String info) {
           this.info = info;
       }

    public String getInfo() {
        return info;
    }
}
