package Less1.Lesson3;

import java.util.Arrays;

import static sun.management.MemoryUsageCompositeData.getMax;

class MinMaxExample {
    public class PR31 {
        public static void main(String[] args) {
            int mas[] = new int[]{25, 47, 34, 18, 96, 33, 28, 55, 87, 13};
            System.out.println(Arrays.toString(mas));

            int max = getMax(mas);
            System.out.println("Maximum Value is: " + max);

            int min = getMin(mas);
            System.out.println("Minimum Value is: "+min);
        }
        public static int getMax(int[] inputmas){
            int maxValue = inputmas[0];
            for(int i=1;i < inputmas.length;i++){ if(inputmas[i] > maxValue){
                maxValue = inputmas[i];
            }
            }
            return maxValue;
        }

        // здесь находим минимум
        public static int getMin(int[] inputmas){
            int minValue = inputmas[0];
            for(int i=1;i<inputmas.length;i++){
                if(inputmas[i] < minValue){
                    minValue = inputmas[i];
                }
            }
            return minValue;
        }
    }
}
