package sg.edu.nus.iss;

import java.util.LinkedList;

public class LinkedListExample {

    public void example07(){
        LinkedList<String> ll =new LinkedList<String>();

        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");
        ll.add("E");
        ll.add("F");
        ll.add("G");

        System.out.println(" Linked list datas "+ll);

        ll.forEach(itm->System.out.println(itm));
        ll.removeFirst();
        ll.removeLast();
        System.out.println(" Linked list datas "+ll);

        
    }

    
}
