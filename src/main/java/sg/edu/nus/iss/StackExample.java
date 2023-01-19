package sg.edu.nus.iss;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {
    public void example08(){
        Stack<Integer> stack = new Stack<Integer>();

        for(int i=0;i<10;i++){
            stack.push(i);
        }
        for(int i=0;i<5;i++){
        Integer stackItem =stack.pop();
        System.out.println("StackItem(pop)  "+stackItem);
    }

    Integer item = stack.peek();
    System.out.println(item);

    Integer firstItem = stack.firstElement();
    System.out.println("First element of Stack  "+firstItem);

    Integer idxElement = stack.search(2);
    System.out.println("Stack element found at Index "+idxElement);

    Iterator<Integer> its = stack.iterator();
    while(its.hasNext()){
        Integer stackIt = its.next();
        System.out.println("Iterator stack item"+stackIt);
    }
    
    }
    
}
