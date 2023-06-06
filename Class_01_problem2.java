package assignment_2;

public class Class_01_problem2 {

    //making the obj1 as static because in static method you cannot have non static object.
    static Class_02_problem2 obj1;
    int sum =0;
    int finalamount=0;

    public static void main (String[] args) throws  Exception
    {
        Class_01_problem2 obj = new Class_01_problem2();
                 obj1 = new Class_02_problem2();
        obj.addition_of_two_numbers();

        System.out.println("The sum of two integer number is -->" +obj.sum);
        obj.pizza_order_amount();
        System.out.println("The final amount of pizza order is -->" +obj.finalamount);


    }

    public int pizza_order_amount()
    {
        int amount=101;
        int gst=20;
       // Part1-- From Class_01, calling an integer variable which is present is Class_02.
        finalamount= amount + gst + obj1.sgst;
        return finalamount;


    }
    public int addition_of_two_numbers()
    {



        int a=2;
        int b=3;
        //calling constructor of class_2 obj1.amount
        //using constructor to reset the value of the variable from Class_01 to Class_02.
        sum = a + b + obj1.amount;
        return sum;



    }
}
