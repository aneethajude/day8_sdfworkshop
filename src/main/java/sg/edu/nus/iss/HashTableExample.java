package sg.edu.nus.iss;

import java.io.Console;
import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

    public void example05(){
        Map<String,Integer> phones = new Hashtable<>();

        phones.put("iphone",10);
        phones.put("Huawei",2);
        phones.put("Oppo",4);
        phones.put("Samsung",20);
        
        System.out.println("Total phone types : "+phones.size());
        
        for(String key:phones.keySet()){
            System.out.println(key+"-"+phones.get(key));
        }
        Console con = System.console();
        String searchString ="";

        while(!searchString.equals("quit")){
        
        searchString = con.readLine("Enter searchString : ");

        
      //  searchString ="Oppo";
        if(phones.containsKey(searchString)){
            System.out.println(searchString + " -"+phones.get(searchString));
        }else{
            System.out.println("Item not found");

        }
      }

      phones.clear();
      System.out.println("Total phone types"+phones.size());

    }
    
}
