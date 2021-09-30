public class patient {
    String patientName;
    double height,width;

    public double BMI()
    {
        double result=width/height*height;
        return result;
    }

    public static void main(String[] args)
    {
       patient obj=new patient();
       obj.patientName=args[0];
       obj.height=Double.parseDouble(args[1]);
       obj.width=Double.parseDouble(args[2]);
       double result= obj.BMI();
       System.out.println(result);
    }

}
