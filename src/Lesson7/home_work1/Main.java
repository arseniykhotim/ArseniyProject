package Less1.Lesson7.home_work1;

import Less1.Lesson6.HomeWork6Ex11.Computer;

public class Main
{
    public static void main(String[] args)
    {
        Phone phone = new Phone("375296348700", "Redmi Note 11S", 180);
        phone.name = "Arseniy";
        phone.receiveCall("Piter", "37524342343");
        phone.getNumber();
        Phone phone1 = new Phone("375296801224", "S20 FE", 200);
        phone1.receiveCall("Valas");
        phone1.getNumber();
        Phone phone2 = new Phone("375291187127", "Iphone 12", 160);
        phone2.receiveCall("Valas");
        phone2.getNumber();
        phone.show2();
        phone1.sendMessage("375296348700", "375296552277", "375298887744");
    }
}
