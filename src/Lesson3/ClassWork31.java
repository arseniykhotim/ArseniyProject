package Less1.Lesson3;

import java.util.Arrays;

public class ClassWork31 {public class CW3 {             // пузырёк не доделан
    public static void main(String[] args) {
        int arr[] = {5, 8 , 0 , 10 , 2};

        int count = 0;
        int buf;
        for (int i =0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length - 1 - i; j++)
            {
                if (arr[j] < arr[j + 1])
                {
                    buf = arr[j];
                    arr[j + 1] = buf;
                }
                }
            System.out.println(Arrays.toString(arr));
            System.out.println(Arrays.toString(arr) + count);
            }
        }
    }
}
