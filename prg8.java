public class prg8 {
    int n;
    public int calc()
    {
        n=n/10;
        return n%10;
    }

    public static void main(String[] args) {
        prg8 obj=new prg8();
        obj.n=Integer.parseInt(args[0]);
        System.out.println(obj.calc());
    }
}
