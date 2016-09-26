package tasks.pack2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2 {

    private Map<String, List<String>> phoneBook = new HashMap<>();

    public Task2() {
        ArrayList<String> phones1 = new ArrayList<>();
        phones1.add("+8 800 2000 500");
        phones1.add("+8 800 2000 600");
        ArrayList<String> phones2 = new ArrayList<>();
        phones2.add("+8 800 2000 700");
        ArrayList<String> phones3 = new ArrayList<>();
        phones3.add("+8 800 2000 800");
        phones3.add("+8 800 2000 900");
        phones3.add("+8 800 2000 000");

        phoneBook.put("Иванов И.И.", phones1);
        phoneBook.put("Петров П.П.", phones2);
        phoneBook.put("Сидоров С.С.", phones3);
    }

    public void printPhone(String name) {
        if (phoneBook.containsKey(name)) {
            System.out.println(phoneBook.get(name));
        }
        else {
            System.out.println("ФИО не найдено");
        }
    }


}
