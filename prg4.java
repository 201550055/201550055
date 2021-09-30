public class prg4 {
    String s1;
    String s2;

    public void display()
    {
        if( s1.equals("GLA") && s2.equals("Mathura") )
            System.out.println(s1+" University "+s2);
        else if(s1.equals("AAA") && s2.equals("Delhi"))
            System.out.println(s1+" Technologies "+s2);
    }

    public static void main(String[] args) {
      prg4 obj=new prg4();
      obj.s1=args[0];
      obj.s2=args[1];
      obj.display();
    }
}
