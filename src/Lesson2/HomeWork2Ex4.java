package Less1.Lesson2;

import java.util.Scanner;

public class HomeWork2Ex4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите температуру:");
        int number = Integer.parseInt(s.nextLine());
        if (number > -5) {
            System.out.println("Тепло");
        } else if (number >= -20) {
            System.out.println("Нормально");
        } else {
            System.out.println("Холодно");
        }
    }
}