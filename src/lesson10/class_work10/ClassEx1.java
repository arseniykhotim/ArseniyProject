package Less1.lesson10.class_work10;

import java.util.Arrays;
import java.util.Scanner;

public class ClassEx1
{
    public static void main(String[] args)
    {
    String[] arr = new String [3];
        Scanner s = new Scanner(System.in);
        System.out.println("Введите строки массива");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(Integer.parseInt(s.nextLine()));
        }
        System.out.println(Arrays.toString(arr));
    }
}
