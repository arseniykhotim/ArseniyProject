package Less1.Lesson2;

import java.util.Scanner;

public class HomeWork2Ex2 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Введите номер месяца:");
        int number = Integer.parseInt(s.nextLine());
        if (number == 12 || number == 1 || number == 2) {
            System.out.println("Это зима");
        }
        else if (number == 3 || number == 4 || number == 5) {
            System.out.println("Это весна");
        }
        else if (number == 6 || number == 7 || number == 8) {
            System.out.println("Это лето");
        }
        else if (number == 9 || number == 10 || number == 11) {
            System.out.println("Это осень");
        }
        else if (number >= 13) {
            System.out.println("Нет такой поры года");
        }
    }
}
