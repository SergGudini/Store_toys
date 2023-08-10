package org.example;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Raffle r = new Raffle();
        Scanner sc = new Scanner(System.in, "UTF-8");
        while (true) {
            System.out.print("Меню работы приложения розыгрыша:\n"
                    + "1 - Добавить игрушку.\n"
                    + "2 - Изменить вероятность игрушки.\n"
                    + "3 - Розыгрыш\n"
                    + "0 - Выход.\n");
            var selection = sc.next();
            switch (selection) {
                case "1" -> r.addToy();
                case "2" -> r.setFrequency();
                case "3" -> r.raffle();
                case "0" -> {
                    System.out.println("Работа окончена.");
                    System.exit(0);
                }
                default -> System.out.println("Неверно");
            }
        }
    }
}
