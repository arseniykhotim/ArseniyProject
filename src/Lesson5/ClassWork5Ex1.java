package Less1.Lesson5;

import java.util.Arrays;

public class ClassWork5Ex1 {
    public static void main(String[] args)
    {
        int[][] arr1 = {{9, 5, 1},
                        {12, 5, 4},
                        {6, 8, 74}};
        for (int i = 0; i <arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
