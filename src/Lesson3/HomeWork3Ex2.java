import java.util.Arrays;
import java.util.Scanner;

class HomeWork3Ex2 {

    public static void main(String[] args) {
        System.out.println("Введите размер массива:");
        Scanner s = new Scanner(System.in);
        int size = Integer.parseInt(s.nextLine());
        int bus[] = new int[size];
        double avr = 0;
        double sum = size;
        {
            for (int i = 0; i < bus.length; i++) {
                bus[i] = (int) (Math.random() * 100) + 1;
            }
            String intAString = Arrays.toString(bus);
            System.out.println(intAString);
        }
        int max = bus[0];
        int min = bus[0];
        for (int i = 0; i < bus.length; i++) {
            if (bus[i] > max) {
                max = bus[i];
            }
        }
        for (int i = 0; i < bus.length; i++) {
            if (bus[i] < min) {
                min = bus[i];
            }
        }

        if (bus.length > 0)
        {

            for (int j = 0; j < bus.length; j++) {
                sum += bus[j];
            }
            avr = sum / bus.length-1;
        }
        System.out.println("Среднее чиссло в массиве "+avr);
        System.out.println("Максимальное чиссло в массиве "+max);
        System.out.println("Минимальное чиссло в массиве "+min);
    }
}
