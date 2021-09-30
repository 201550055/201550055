public class prg6 {
    int a,b;
    public int add()
    {
        return a+b;
    }

    public static void main(String[] args) {
        prg6 obj=new prg6();
        obj.a=Integer.parseInt(args[0]);
        obj.b=Integer.parseInt(args[1]);
        int result=obj.add();
        System.out.println(result);

    }
}
