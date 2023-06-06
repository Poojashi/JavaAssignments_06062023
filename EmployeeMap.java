package assignment_11;

import java.util.HashMap;

public class EmployeeMap {

    public static void main(String[] args)
    {
  HashMap<Integer, String> employeeMap = new HashMap<>();

// Adding employee names with their IDs to the map
        employeeMap.put(123, "Jadeja");
        employeeMap.put(456, "Smith");
// Add more employee names and IDs here...

// Retrieving the name of an employee with a specific ID
        int empIdToFind = 123;
        String empName = employeeMap.get(empIdToFind);

// Printing the name of the employee
        System.out.println("Employee ID: " + empIdToFind);
        System.out.println("Employee Name: " + empName);
    }
}