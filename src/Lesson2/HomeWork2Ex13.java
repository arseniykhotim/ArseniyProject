package Less1.Lesson2;

import java.util.Scanner;

public class HomeWork2Ex13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите сумму вклада: ");
        float sum = Integer.parseInt(s.nextLine());
        System.out.println("Введите колличество месяцев: ");
        int month = Integer.parseInt(s.nextLine());
        float b = 1.07f;
        for (int i = 0; i <= month; i++) {
            sum *= b;
            System.out.println(sum);
        }
    }
}
