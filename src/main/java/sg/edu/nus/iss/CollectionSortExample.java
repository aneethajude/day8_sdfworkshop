package sg.edu.nus.iss;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionSortExample {

    public void example01(){
        List<Integer> numbers = new ArrayList<Integer>();

        for(int i=0;i<10;i++ ){
            numbers.add((int)(Math.random()*100));

            System.out.println("Unsorted list"+numbers);

            Collections.sort(numbers);

            System.out.println("Sorted list "+numbers);

          //  Collections.sort(numbers,Collections.reverseOrder());
          numbers.sort(Comparator.reverseOrder());

            System.out.println("sorted list(reverse)"+numbers);           
        }

    }

    public void example03(){
        Employee emp1 = new Employee("12345", "Darryl Ng","SS","Lecturer","darryl@nus.edu.sg",20000);
        Employee emp2 = new Employee("12347", "Amaryl Ang","SS","Lecturer","arryl@nus.edu.sg",40000);
        Employee emp3 = new Employee("12343", "Dar Ng","SS","Lecturer","dryl@nus.edu.sg",30000);
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

     //   System.out.println("Employee before Sorting"+employees);
        Collections.sort(employees);
     //   System.out.println("Employees after sorting"+employees);

        employees.sort(Comparator.comparing(e->e.getSalary()));
        System.out.println("Sorted employees "+employees);
    }
    
}
