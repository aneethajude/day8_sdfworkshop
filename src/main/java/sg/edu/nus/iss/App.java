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

        ArraySortExample as = new ArraySortExample();
        as.example();

        CollectionSortExample cs = new CollectionSortExample();
        cs.example01();
    }
}
