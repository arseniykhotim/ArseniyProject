package Less1.Lesson8.home_work1;

public class Main
{
    public static void main(String[] args)
    {
        Figure[] figures = new Figure[5];

        Circle circle1 = new Circle(5);
        Rectangle rectangle1 = new Rectangle(2,4);
        Triangle triangle1 = new Triangle(3, 3, 5);
        Circle circle2 = new Circle(8);
        Triangle triangle2 = new Triangle(4, 4, 6);

        figures[0] = circle1;
        figures[1] = rectangle1;
        figures[2] = triangle1;
        figures[3] = circle2;
        figures[4] = triangle2;

        float sum = 0f;
        for (int i = 0; i < figures.length; i++)
        {
            sum += figures[i].perimeter();
        }
        System.out.println(sum);
    }
}
