package Less1.Lesson6.HomeWork6Ex11;

public class Computer
{
    float price;
    String model;
    RAM ram;
    HDD hdd;

    public Computer(float price, String model)
    {
        this.price = price;
        this.model = model;
        this.ram = new RAM();
        this.hdd = new HDD();
    }

    public Computer(float price, String model, RAM ram, HDD hdd)
    {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    void show()
    {
        System.out.println("Computer: " + price + " " + model + " ");
        if (ram != null)
        {
            ram.show();
        }
        if (hdd != null)
        {
            hdd.show();
        }
    }
}
