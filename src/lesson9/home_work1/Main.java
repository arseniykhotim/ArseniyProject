package Less1.lesson9.home_work1;
import java.util.Date;
public class Main {
    public static void main(String[] args) {


    University university = new University();
    Date date = new Date();

        String str = String.format("Текущая дата и время: %tc", date);

        System.out.printf(str);
    }
}
