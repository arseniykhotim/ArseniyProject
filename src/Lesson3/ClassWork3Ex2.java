package Less1.Lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class ClassWork3Ex2 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива:");
        Scanner s = new Scanner(System.in);
        int size = Integer.parseInt(s.nextLine());
        int bus[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Введите Число массива:");
            bus[i] = Integer.parseInt(s.nextLine());
        }
        System.out.println(Arrays.toString(bus));
    }
}
