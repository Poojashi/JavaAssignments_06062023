package assignment_15;

import java.util.Random;

public class RandomAlphaNumericExample

    {
    public static void main(String[] args)
    {
        String randomAlphaNumeric = generateRandomAlphaNumeric(10);
        System.out.println("Random AlphaNumeric: " + randomAlphaNumeric);
    }

    public static String generateRandomAlphaNumeric(int length)
    {
        String alphanumericChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++)
        {
            int index = random.nextInt(alphanumericChars.length());
            char randomChar = alphanumericChars.charAt(index);
            sb.append(randomChar);
        }

        return sb.toString();
    }
}