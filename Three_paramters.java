package assignment_4;

public class Three_paramters {


    int outcome;
    int outcome1;
    int outcome2;
    int outcome3;

    public static void main(String[] agrs) throws Exception
    {
     Three_paramters obj = new Three_paramters();

        obj.three_param(100, 2,"add");
        System.out.println("The result of three parameters is -->" +obj.outcome);
        obj.three_param(100, 2,"subs");
        System.out.println("The result of three parameters is -->" +obj.outcome1);
        obj.three_param(100, 2,"multiplication");
        System.out.println("The result of three parameters is -->" +obj.outcome2);
        obj.three_param(100, 2,"division");
        System.out.println("The result of three parameters is -->" +obj.outcome3);

    }

    public void three_param(int a , int b, String Task)
    {





        if (Task == "add")
        {
         outcome = a + b;
        }

        if (Task == "subs")
        {
            outcome1 = a - b;
        }


        if (Task == "multiplication")
        {
            outcome2 = a * b;
        }

        if (Task == "division")
        {
            outcome3 = a / b;
        }

    }





    }



