package Less1.Lesson8.home_work1;

public class Rectangle extends Triangle{
    int side1 = 2;
    int side2 = 4;
    int sumPrR;
    int sumPlR;

    void podschet()
    {
        sumPrR = side1 + side2;
        System.out.println(sumPrR);
    }

    void podschetPl()
    {
        sumPlR = side1 * side2;
        System.out.println(sumPlR);
    }

}
