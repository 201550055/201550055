import java.util.Scanner;
public class employee_prg10 {
    String[] name=new String[3];
    String[] add=new String[3];
    int year[]=new int[3];
    public void display()
    {
        Scanner sc=new Scanner(System.in);
        for (var i = 0; i <3 ; i++) {
           name[i]=sc.next();
           add[i]=sc.next();
           year[i]=sc.nextInt();
        }
        System.out.println("Name     Year of joining     Address");
        for (var i = 0; i <3 ; i++) {
            System.out.println(name[i]+"    "+year[i]+"    "+add[i]);

        }
    }

    public static void main(String[] args) {
        employee_prg10 obj=new employee_prg10();
        obj.display();
    }
}
