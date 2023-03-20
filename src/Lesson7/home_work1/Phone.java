package Less1.Lesson7.home_work1;

import java.util.Arrays;

public class Phone
{
   protected String number;
   protected String model;
   protected int weight;
   protected String name;


    public Phone() {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    void receiveCall(String name)
    {
        System.out.println("Звонит " + name);
    }

    void receiveCall(String name, String number)
    {
        System.out.println("Звонит " + name + " с номером " + number);
    }

    public String getNumber()
    {
        return number;
        //System.out.println(number + " is " + "Calling");
    }

    public void setNumber(String number) {
        this.number = number;
    }

    void show()
    {
        System.out.println(" is " + "Calling");
        }
void show2() {
    System.out.println(model + name + weight + number);
}
void sendMessage(String ...number)
{
    System.out.println(Arrays.toString(number)+ "Send message");
}

}
