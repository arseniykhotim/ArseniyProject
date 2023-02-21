package Less1.Lesson3;

import java.util.Arrays;

public class ClassWork3Ex3v1 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
        }
        String intAString = Arrays.toString(arr);
        System.out.println(intAString);
    }
}
