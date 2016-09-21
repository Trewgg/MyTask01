package tasks.pack2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2 {

    private Map<String, List<String>> phonebook = new HashMap<>();

    private ArrayList<String> phones1 = new ArrayList<String>();
    private ArrayList<String> phones2 = new ArrayList<String>();
    private ArrayList<String> phones3 = new ArrayList<String>();

    public void getPhone(String name) {

        phones1.add("+8 800 2000 500");
        phones1.add("+8 800 2000 600");
        phones2.add("+8 800 2000 700");
        phones3.add("+8 800 2000 800");
        phones3.add("+8 800 2000 900");
        phones3.add("+8 800 2000 000");

        phonebook.put("Иванов И.И.", phones1);
        phonebook.put("Петров П.П.", phones2);
        phonebook.put("Сидоров С.С.", phones3);

        if (phonebook.containsKey(name)) {
            System.out.println(phonebook.get(name));
        }
        else {
            System.out.println("ФИО не найдено");
        }
    }


}
