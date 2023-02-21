package Less1.Lesson3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class ClassWork3Ex1v1
{
    public static void main(String[] args)
    {
        int[] mas = {25, 47, 34, 18, 96, 33, 28, 55, 87, 13};
        System.out.println(Arrays.toString(mas));

        List<Integer> ints = Arrays.stream(mas)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Min element is " + Collections.min(ints));
        System.out.println("Max element is " + Collections.max(ints));
    }
}
