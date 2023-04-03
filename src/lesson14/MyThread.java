package Less1.lesson14;

public class MyThread extends Thread
{
    @Override
    public void run()
    {
        for (int i =0; i < 1000; i++) {
            System.out.println("Thread " + getName() + " running" + i);
        }
    }
}
