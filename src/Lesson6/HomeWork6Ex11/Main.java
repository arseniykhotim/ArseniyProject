package Less1.Lesson6.HomeWork6Ex11;

import Less1.Lesson6.ClassWork6Ex1.Car;

public class Main {
    public static void main(String[] args)
    {
        Computer computer1 = new Computer(15f, "ACER");
        computer1.show();
        HDD hdd = new HDD("Kingston", 512f, "SSD");
        RAM ram = new RAM("Kingston", 16f);
        Computer computer2 = new Computer(20f, "LENOVO", ram, hdd);
        computer2.show();
    }
}
