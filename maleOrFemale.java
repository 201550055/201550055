public class maleOrFemale {
    String gender;
    short age;

    public double percentage() {
        double result = 0.0;
        if (gender.equals("Female") && (age >= 1 && age <= 58))
            result = 8.2;
        else if (gender.equals("Female") && (age >= 59 && age <= 100))
            result = 9.2;
        else if (gender.equals("Male") && (age >= 1 && age <= 58))
            result = 8.4;
        else if (gender.equals("Male") && (age >= 59 && age <= 100))
            result = 10.5;

        return result;
    }



    public static void main(String[] args)
    {
        maleOrFemale obj =new maleOrFemale();
        obj.gender=args[0];
        obj.age=Short.parseShort(args[1]);
        System.out.println(obj.percentage()+"%");
    }
}
