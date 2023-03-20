package Less1.Lesson7.Cw1;

public class Bus extends Car
{
    public boolean getVin;
    private float capacity;

    public Bus()
    {
    }

    public Bus(String vin, float capacity)
    {
        super(vin);
        this.capacity = capacity;
    }

    public Bus(float capacity)
    {
        this.capacity = capacity;
    }

    @Override
    public void drive()
    {
        System.out.println("Bus driving");
    }
}
