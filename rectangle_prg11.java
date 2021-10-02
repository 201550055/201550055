import java.util.Scanner;

public class rectangle_prg11 {

    int breadth;
    int length;
    rectangle_prg11(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    int calc()
    {
        return length*breadth;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        rectangle_prg11 obj=new rectangle_prg11(sc.nextInt(), sc.nextInt());
        System.out.println(obj.calc());
    }
}
