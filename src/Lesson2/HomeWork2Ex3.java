package Less1.Lesson2;

import java.util.Scanner;

public class HomeWork2Ex3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = Integer.parseInt(s.nextLine());
        int b = number % 2;
        if (b == 1) {
            System.out.println("Не чётное " + number);
        } else {
            System.out.println("Чётное " + number);
        }

    }
}
