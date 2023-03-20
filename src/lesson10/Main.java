package Less1.lesson10;

import Less1.Lesson6.ClassWork6Ex1.Car;

public class Main {
    public static void main(String[] args)
    {

        StringBuilder sb = new StringBuilder("Example");
        for (int i = 0; i <10; i++)
        {
            sb.append("[").append(i).append("]");
        }

        System.out.println(sb.append("456"));
    }
}
