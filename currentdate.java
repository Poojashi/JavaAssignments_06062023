package assignment_14;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class currentdate {
        public static void main(String args[])
        {
            Date current_Date = new Date();

            System.out.println(current_Date);

            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
            String strDate = dateFormat.format(current_Date);
            System.out.println("Converted String: " + strDate);
        }
    }

