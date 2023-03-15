package Less1.Lesson5;

import java.util.Arrays;

public class HomeWork5Ex2 {
    public static void main(String[] args) {
        String w = "W";
        String b = "B";


        String[][] arr = new String[8][8];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               int a = i % 2;
                int e = j % 2;

                if (a == 1)
                {
                    arr[i][j] = w;
                }
                else
                {
                    arr[i][j] = b;
                }
                if (e == 1)
                {
                    arr[i][j] = w;
                }
                else
                {
                    arr[i][j] = b;
                }
                System.out.print(arr[i][j] + " ");
            }
             System.out.println();
        }
        // System.out.println(Arrays.deepToString(arr));
    }
}
