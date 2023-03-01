package Less1.Lesson5;

public class HomeWork5Ex0 {
    public static void main(String[] args) {
        int sum = 3;
        int[][][] arr1 = {{{9, 5}, {12, 5}}, {{6, 8}, {1, 3}}};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                for (int x = 0; x < arr1[j].length; x++) {

                    System.out.print(arr1[i][j][x] + " ");
                }
                System.out.println();
            }
        }
    }
}