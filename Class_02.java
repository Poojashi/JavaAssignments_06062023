package assignment_10;

public class Class_02 {

    public static void main(String[] args) {
        // create an object of Test
        Class_01 test = new Class_01();

        // set value of private variables
        test.setAge(1007046);
        test.setName("Pooja");

        // get value of private variables
        System.out.println("Age: " + test.getAge());
        System.out.println("Name: " + test.getName());
    }
}
