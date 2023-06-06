package assignment_3;

public class Throw_exception {


    public static void main (String[] agrs)
    {
        Throw_exception obj= new Throw_exception();
        obj.Allowed_age_for_rollercoaster(67);
    }


    public int Allowed_age_for_rollercoaster(int AGE)
    {
        if (AGE <25 || AGE >55)
        {
            throw new ArithmeticException("This is not the allowed age for rollercoaster");

        }

        else
        {
            System.out.println("Have a fun ride...!!!!");
        }
            return AGE;
    }







}
