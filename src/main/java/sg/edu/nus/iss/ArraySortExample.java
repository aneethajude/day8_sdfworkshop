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

    public void example02(){
        Integer numbers[] = {10,5,1,2,4,3,6,7,9,8};
        int[] number = {10,5,1,2,4,3,6,7,9,8};
        Arrays.sort(number);

        System.out.println("Sorted numbers"+Arrays.toString(number));

        Arrays.sort(numbers,Collections.reverseOrder());
        System.out.println("Sorted numbers"+Arrays.toString(numbers));

    }
    
}
