package assignment_7;

public class returnnumber {
public static void main (String[] agrs) throws Exception
{
    returnnumber obj= new returnnumber();
    obj.returnNumber();

}
    public int returnNumber()
    {



        int c = 0;

        float a = 7.8f;

        float b = 4.4f;

        float f = Float.sum(a, b);

         c = (int) f;

        // c=a+b;


        System.out.println("The value of c is --> " +c );
        return c;



    }


}
