
class ClassWork3Ex1 {

    public static void main(String[] args) {
        int[] mas = {25, 47, 34, 18, 96, 33, 28, 55, 96, 13};
        int max = mas[0];
        int min = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
            }
        }
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
            }
        }
        System.out.println("Максимальное чиссло в массиве "+max);
        System.out.println("Минимальное чиссло в массиве "+min);
    }
}