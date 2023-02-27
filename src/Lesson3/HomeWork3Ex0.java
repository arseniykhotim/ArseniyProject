package Less1.Lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3Ex0 {
    public static void main(String[] args) {
        boolean j = false;
        int[] arr = {25, 47, 34, 18, 96};
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = Integer.parseInt(s.nextLine());
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                j = true;
                System.out.println("Число входит в массив");
                break;
            }
            }

        if (j == false) {
            System.out.println("Число не входит в массив");
        }

        }

    }
