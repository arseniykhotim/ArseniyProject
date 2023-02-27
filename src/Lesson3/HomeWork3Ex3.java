package Less1.Lesson3;

import java.util.Arrays;

public class HomeWork3Ex3 {
    public static void main(String[] args) {
        double avr = 0;
        double avr1 = 0;
        double sum = 5;
        int[] arr = {3, 1, 6, 5, 2};
        int[] arr1 = {12, 76, 22, 14, 77};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        if (arr.length > 0)
        {

            for (int j = 0; j < arr.length; j++) {
                sum += arr[j];
            }
            avr = sum / arr.length-1;
        }
        if (arr1.length > 0)
        {

            for (int j = 0; j < arr1.length; j++) {
                sum += arr1[j];
            }
            avr1 = sum / arr1.length-1;
        }
        System.out.println("Среднее чиссло в массиве "+avr);
        System.out.println("Среднее чиссло в массиве "+avr1);
        if (avr > avr1) {System.out.println("Массив arr больше arr1");}
        if (avr < avr1) {System.out.println("Массив arr меньше arr1");}


    }
}
