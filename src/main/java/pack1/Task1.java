package pack1;

import java.util.Scanner;

public class Task1 {

    private static final int BEGIN_INDEX = 0;
    private static final int END_INDEX = 10;

    public static void main(String[] args) {

        String firstIP;
        String lastIP;
        int lastNumberIP1;
        int lastNumberIP2;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите начальный IP: ");
        firstIP = in.nextLine();
        System.out.print("Введите конечный IP: ");
        lastIP = in.nextLine();

        lastNumberIP1 = Integer.parseInt(firstIP.substring(END_INDEX));
        lastNumberIP2 = Integer.parseInt(lastIP.substring(END_INDEX));

        for(int i = lastNumberIP1 + 1; i < lastNumberIP2; i++) {
            System.out.println(firstIP.substring(BEGIN_INDEX, END_INDEX) + i);
        }
        //это самый простой вариант с изменением только последнего числа IP
        //можно еще добавить проверку для третьего, второго и первого числа в IP
        //и вынести метод в отдельный класс

    }

}


