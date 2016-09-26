package tasks;

import tasks.pack1.Task1;
import tasks.pack2.Task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //задание 1 начало
        System.out.print("Введите начальный IP: ");
        String firstIP = in.nextLine();
        System.out.print("Введите конечный IP: ");
        String lastIP = in.nextLine();

        Task1 task1 = new Task1();
        task1.printIP(firstIP, lastIP);
        //задание 1 конец

        System.out.println("---------------------");

        //задание 2 начало
        System.out.print("Введите ФИО: ");
        String name = in.nextLine();

        Task2 task2 = new Task2();
        task2.printPhone(name);
        //задание 2 конец

    }

}


