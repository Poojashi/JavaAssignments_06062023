package assignment_13;

public class Reversestring {


    public static void main (String[] agrs)
    {
        String originalStr = "Welcome To Java";
        String reversedStr = "";

        for (int i = 0; i < originalStr.length(); i++)
        {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }

        System.out.println("Reversed string: "+ reversedStr);
    }

}
