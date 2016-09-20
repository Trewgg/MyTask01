package pack2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        String inputText = in.nextLine();


        ArrayList<String> phones = new ArrayList<String>();

        phones.add("+8 800 2000 500");
        phones.add("+8 800 2000 600");
        phones.add("+8 800 2000 700");
        phones.add("+8 800 2000 800");
        phones.add("+8 800 2000 900");
        phones.add("+8 800 2000 000");

//        for(String phone : phones){
//            System.out.println(phone);
//        }

        //переделать. Это временный вариант
        //сделать чтоб в contacts хранились данные из phones
        String name1 = phones.get(0) + " " + phones.get(1);
        String name2 = phones.get(2);
        String name3 = phones.get(3) + " " + phones.get(4) + " " + phones.get(5);

        Map<String, String> contacts = new HashMap<String, String>();
        contacts.put("Иванов И.И.", name1);
        contacts.put("Петров П.П.", name2);
        contacts.put("Сидоров С.С.", name3);
        ////


        for (String key : contacts.keySet()) {
            if (key.equals(inputText)) {
                System.out.println(key + " " + contacts.get(inputText));
            }
            else {
                System.out.println("ФИО не найдено");
            }
        }

    }

}


