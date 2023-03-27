package Less1.Lesson8.home_work1;

public class Main {
    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle();
        rectangle.podschet();
        rectangle.podschetPl();
        Triangle triangle = new Triangle();
        triangle.podschet();
        triangle.podschetPl();
        Circle circle = new Circle();
        circle.sCircle();
        circle.pCircle();
        int sum = 0;
        float[] mas = {8, 11, 12};
        for (int i = 0; i < mas.length; i++)
        {
            sum = (int) (sum + mas[i]);
        }
        System.out.println(sum);
    }
}
