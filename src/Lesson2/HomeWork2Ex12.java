package Less1.Lesson2;

public class HomeWork2Ex12 {
    public static void main(String[] args){
        int a = 1;
        int b = 1;
        int c;
        System.out.print(a+" "+b+" ");
        for(int i = 3; i <= 11; i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
        System.out.println();
    }
}
