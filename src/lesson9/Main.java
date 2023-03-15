package Less1.lesson9;

import Less1.Lesson7.Cw1.Bus;

public class Main
{
    public static void main(String[] args) {
        Bus bus = null;
        Test test = new Test();
        try {
            test.testMethod(bus);
        } catch (NullPointerException exception)
        {
            System.out.println("Error null happened");
            //System.exit(1); выход из программы
        }
        catch (ArrayIndexOutOfBoundsException exception)
        {
            System.out.println("Error array happened");
        }
        finally{
            System.out.println("Finally");
        }
    }
}
