import java.util.Scanner;

public class prg9 {

    public static void powerint()
    {
        Scanner sc=new Scanner(System.in);
        int num1=0,num2=0;
        num1=sc.nextInt();
        num2=sc.nextInt();

        System.out.println(Math.pow(num1,num2));
    }
    public static void powerdouble()
    {
        Scanner sc=new Scanner(System.in);
        double num1 = 0,num2=0;
        num1=sc.nextDouble();
        num2=sc.nextDouble();
        System.out.println(Math.pow(num1,num2));
    }

    public static void main(String[] args) {

        prg9 obj=new prg9();
        obj.powerint();
        obj.powerdouble();
    }
}
