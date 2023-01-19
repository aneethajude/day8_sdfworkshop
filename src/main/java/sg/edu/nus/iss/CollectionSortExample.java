package sg.edu.nus.iss;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSortExample {

    public void example01(){
        List<Integer> numbers = new ArrayList<Integer>();

        for(int i=0;i<10;i++ ){
            numbers.add((int)(Math.random()*100));

            System.out.println("Unsorted list"+numbers);

            Collections.sort(numbers);

            System.out.println("Sorted list "+numbers);

            Collections.sort(numbers,Collections.reverseOrder());

            System.out.println("sorted list(reverse)"+numbers);


            
        }

    }
    
}
