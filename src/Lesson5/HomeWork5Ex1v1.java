package Less1.Lesson5;
public class HomeWork5Ex1v1 {
    public static void main(String[] args) {

        // test – трёхмерный массив
        int[][][] test ={
                {
                        {1, -2, 3},
                        {2, 3, 4}
                },
                {
                        {-4, -5, 6, 9},
                        {1},
                        {2, 3}
                }
        };

        // цикл for..each проходит по элементам трёхмерного массива
        for (int[][] array2D: test) {
            for (int[] array1D: array2D) {
                for(int item: array1D) {
                    System.out.println(item);
                }
            }
        }
    }
}
