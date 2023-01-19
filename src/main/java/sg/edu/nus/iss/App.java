package sg.edu.nus.iss;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        //System.out.println("Hello World!");

        // ArraySortExample as = new ArraySortExample();
        // as.example();

        ArraySortExample as1 = new ArraySortExample();
        as1.example02();

         CollectionSortExample cs = new CollectionSortExample();
         cs.example01();
        CollectionSortExample cs1 = new CollectionSortExample();
         cs1.example03();

      //  HashMapExample hp = new HashMapExample();
        //hp.example04();

       // HashTableExample ht = new HashTableExample();
       // ht.example05();

      //  ConcurrentHashMapExample hmc = new ConcurrentHashMapExample();
        //hmc.example06();

       // LinkedListExample lle = new LinkedListExample();
      //  lle.example07();
      StackExample se = new StackExample();
      se.example08();


}

}
