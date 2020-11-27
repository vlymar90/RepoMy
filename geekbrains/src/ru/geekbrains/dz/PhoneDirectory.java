package ru.geekbrains.dz;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneDirectory {

   HashMap <String, ArrayList<String>> mapPhoneDirectory = new HashMap<>();

   public void add(Man man) {
       if (man.getSurName() != null) {
           mapPhoneDirectory.put(man.getSurName(), man.getNumberPhone());
       } else {
           System.out.println("Поле фамилия должно быть заполнено");
       }
   }
    public void get(String surname) {
       for (Map.Entry<String, ArrayList<String>> o : mapPhoneDirectory.entrySet()) {
           if(o.getKey().equals(surname)) {
               System.out.println(surname + ": " + o.getValue());
           }
       }
    }
}
