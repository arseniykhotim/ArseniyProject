package Less1.Lesson8.home_work1;

public class Circle extends Rectangle{
    private int rad = 2;
    private final float pi = 3.14f;
    private float sCrC;
    private float pCrC;

    void sCircle ()
    {
        sCrC = 2 * pi * rad;
        System.out.println(sCrC);
    }

    void pCircle ()
    {
        pCrC = pi * (rad * rad);
        System.out.println(pCrC);
    }

}
