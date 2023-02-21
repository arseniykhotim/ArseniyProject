package Less1.Lesson2;

import java.util.Scanner;

public class HomeWork2Ex8 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Введите любое число:");
        int number = Integer.parseInt(s.nextLine());
        int j = 0;
        int sum = 0;
        while (j <= number) {
            sum =(sum + j);
            j = j+1;

        }
        System.out.println("Сумма всех чисел от 1 до введённого "+sum);
    }
}
