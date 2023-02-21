package Less1.Lesson2;

import java.util.Scanner;

public class HomeWork2Ex5 {
    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);
        System.out.println("Введите номер цвета радуги:");
        int number = Integer.parseInt(s.nextLine());
        switch (number) {
            case 1:
                System.out.println("Красный");
                break;
            case 2:
                System.out.println("Ораньжевый");
                break;
            case 3:
                System.out.println("Жёлтый");
                break;
            case 4:
                System.out.println("Зелёный");
                break;
            case 5:
                System.out.println("Голубой");
                break;
            case 6:
                System.out.println("Синий");
                break;
            case 7:
                System.out.println("Фиолетовый");
                break;
            default:
                System.out.println("У радуги всего 7 цветов, введите от 1 до 7");
        }
    }
}
