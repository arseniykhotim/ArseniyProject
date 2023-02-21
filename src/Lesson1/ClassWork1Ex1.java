package Less1.Lesson1;

import java.io.Console;

public class ClassWork1Ex1 {
    static String name ="";
    public static void main(String[] arg) {
        String name;
        Console con = System.console();
        name = con.readLine("Please, enter your name: ");
        System.out.println("Welcome to java, " + name);
    }
}
