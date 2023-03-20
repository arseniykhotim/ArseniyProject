package Less1.Lesson5;

import java.util.Scanner;

public class HomeWork5Ex0 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int[][][] arr1 = {{{9, 5}, {12, 5}}, {{6, 8}, {1, 3}}};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                for (int x = 0; x < arr1[i][j].length; x++) {

                    System.out.print(arr1[i][j][x] + " ");
                }
                System.out.println();
            }
        }
        System.out.println("Введите число на которое увеличить массив: ");
        int sum = Integer.parseInt(s.nextLine());
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                for (int x = 0; x < arr1[i][j].length; x++) {
                    arr1[i][j][x] = arr1[i][j][x] + sum;
                    System.out.print(arr1[i][j][x] + " ");
                }
                System.out.println();
            }
        }
    }
}
