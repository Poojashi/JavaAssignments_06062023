package assignment_8;

public class Countspace {


                public static void main(String[] args)
                {
                    String a = "Welcome To Java";

                    int spaceCount = 0;
                    for (int i = 0; i < a.length(); i++)
                    {
                        if (a.charAt(i) == ' ')
                        {
                            spaceCount++;
                        }
                    }

                    System.out.println("Number of spaces: " + spaceCount);

                    String[] words = a.split(" ");
                    String firstWord = words[0];

                    System.out.println("First word: " + firstWord);
                }



        }






