package ru.geekbrains.dz;


import java.util.*;

public class Main {

    public static void main(String[] args) {
////        PhoneDirectory phoneDirectory = new PhoneDirectory();
////        Man man = new Man("Петров", new ArrayList(Arrays.asList("+79296452345")));
////        phoneDirectory.add(man);
//        man.addNumberPhone("+79772445682");
//        Man man2 = new Man("Иванов", new ArrayList(Arrays.asList("+79772465637")));
//        phoneDirectory.add(man2);
//        phoneDirectory.get("Петров");
//    }
//}

        int count = 0;
        ArrayList<String> list = new ArrayList<>(Arrays.asList("ошибка", "исключение", "исключение", "ошибка",
                "массив", "переменная", "мышь", "мышь", "принтер", "свет", "телефон", "работа", "дом", "машина",
                "машина", "ошибка"));
        HashSet<String> set = new HashSet<>(list);
        System.out.println(set);
        for (String line : set) {
            //System.out.println(line + " встречается: " + countRepeat(line, list) + " раз(а).");
            for(int i = 0; i < list.size(); i++) {
                if(line.equals(list.get(i))) {
                    count++;
                }
            }
            System.out.println(line + " встречается: " + count + " раз(а).");
            count = 0;
        }

    }

    public static int countRepeat(String line, ArrayList<String> list) {
        int countLine = 0;
        for (String lineList : list) {
            if (line.equals(lineList)) {
                countLine++;
            }
        }
        return countLine;
    }
}




