package assignment_6;



    import java.util.*;

    public class sumarraylist {


        public static void main (String[] args) throws Exception {
            List intList = new ArrayList();
            for (int i=200; i <=500; i++) {
                intList.add(i);
            }

            for (int j=0; j<=intList.size()-1 ; j++) {
                System.out.println(intList.get(j));
            }
        }

    }

