package Less1.Lesson6.ClassWork6Ex1;

public class Car {
    String vin;
    float engineCapacity;
    String mark;

    public Car()
    {
    }

    public Car(String vin, float engineCapacity, String mark)
    {
        this.vin = vin;
        this.engineCapacity = engineCapacity;
        this.mark = mark;
    }

    void drive(String name, int speed)
    {
        System.out.println("Car " + vin + " is driving with driver " + name + " speed " + speed);
    }
}