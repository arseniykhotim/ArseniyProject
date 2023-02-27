package Less1.Lesson3;

import java.util.Arrays;
import java.util.Scanner;


public class HomeWork3Ex1 {
    public static void main(String[] args){
        int[] arr = {3,1,6,5,2,8,4};
        int[] newArr = null;
        int elementToBeDeleted = 0;
        Scanner s = new Scanner(System.in);
        System.out.println(Arrays.toString(arr));
        System.out.println("Введите число которе нужно удалить из массива: ");
        int number = Integer.parseInt(s.nextLine());
        elementToBeDeleted = number;
        System.out.println("Оригинальный массив: "+Arrays.toString(arr));

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == elementToBeDeleted) {
                newArr = new int[arr.length - 1];
                for (int index = 0; index < i; index++) {
                    newArr[index] = arr[index];
                }
                for (int j = i; j < arr.length - 1; j++) {
                    newArr[j] = arr[j + 1];
                }
                break;
            }

        }
        if (newArr == null) {
            System.out.println("Числа нет в массиве");
        }
        System.out.println("Новый массив без элемента = "+elementToBeDeleted+" выглядит так: "+ Arrays.toString(newArr));
    }
}
