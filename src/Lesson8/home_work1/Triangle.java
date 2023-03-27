package Less1.Lesson8.home_work1;

public class Triangle extends Figure {
    int side1 = 3;
    int side2 = 3;
    int side3 = 5;
    float formul = 0.5f;
    int sumPrT;
    float sumPlT;

    void podschet()
    {
        sumPrT = side1 + side2 + side3;
        System.out.println(sumPrT);
    }

    void podschetPl()
    {
        sumPlT = side1 * side2 * formul;
        System.out.println(sumPlT);
    }
}
