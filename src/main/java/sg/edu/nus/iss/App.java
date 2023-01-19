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

        // CollectionSortExample cs = new CollectionSortExample();
        // cs.example01();
        CollectionSortExample cs1 = new CollectionSortExample();
         cs1.example03();
}

}
