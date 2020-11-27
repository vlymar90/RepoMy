package ru.geekbrains.dz;

import java.util.ArrayList;

public class Man {
    private String surName;
    private ArrayList<String> numberPhone;

    public Man(String surName, ArrayList numberPhone) {
        this.surName = surName;
        this.numberPhone = numberPhone;
    }

    public ArrayList<String> getNumberPhone() {
        return numberPhone;
    }

    public String getSurName() {
        return surName;
    }
    public void addNumberPhone(String number) {
        numberPhone.add(number);
    }
}
