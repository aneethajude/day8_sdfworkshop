package sg.edu.nus.iss;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class ArraySortExample {

        
    
    public void example(){
        String name[] = { "darryl","Elaine","James","Zoanne","Chris","Mark","Sophia","Asher","Brandon","Helen","Daniel","Marcus"};

        System.out.println("UnSorted Array"+Arrays.toString(name));

        //sort the array in ascending order
        Arrays.sort(name);

        //print out sorted array
        System.out.println("Sorted Array"+Arrays.toString(name));

        //reversed Order
        Arrays.sort(name,Collections.reverseOrder());

        //print out the sorted Array
        System.out.println("Sorted arr in reverse order "+Arrays.toString(name));
    }
    
}
