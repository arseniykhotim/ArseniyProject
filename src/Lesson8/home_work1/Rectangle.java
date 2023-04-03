package Less1.Lesson8.home_work1;

public class Rectangle extends Triangle{
    private int side1;
    private int side2;

    public Rectangle() {
    }

    public Rectangle(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    @Override
    public float perimeter()
    {
        return (float) ((side1 + side2) * 2);
    }

    @Override
    public float square()
    {
        return (float) (side1 * side2);
    }

}
