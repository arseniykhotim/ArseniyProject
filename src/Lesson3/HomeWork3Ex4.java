package Less1.Lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3Ex4 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива:");
        Scanner s = new Scanner(System.in);
        int size = Integer.parseInt(s.nextLine());
        int bus[] = new int[size];
        {
            for (int i = 0; i < bus.length; i++) {
                bus[i] = (int) (Math.random() * 100) + 1;
            }
            String intAString = Arrays.toString(bus);
            System.out.println(intAString);
        }
    }
}
