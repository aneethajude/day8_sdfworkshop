package sg.edu.nus.iss;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        //System.out.println("Hello World!");

        // ArraySortExample as = new ArraySortExample();
        // as.example();

      //  ArraySortExample as1 = new ArraySortExample();
      //  as1.example02();

     //    CollectionSortExample cs = new CollectionSortExample();
       //  cs.example01();
        //CollectionSortExample cs1 = new CollectionSortExample();
         //cs1.example03();

      //  HashMapExample hp = new HashMapExample();
        //hp.example04();

       // HashTableExample ht = new HashTableExample();
       // ht.example05();

      //  ConcurrentHashMapExample hmc = new ConcurrentHashMapExample();
        //hmc.example06();

       // LinkedListExample lle = new LinkedListExample();
      //  lle.example07();
     // StackExample se = new StackExample();
     // se.example08();

        String dirPath = "./data";
        String fileName ="data.txt";

        File newDir = new File(dirPath);
        boolean isDirCreated = newDir.mkdir();

        if(isDirCreated){
            System.out.println("New Directory"+dirPath+"created");

        }else{
            System.out.println("Directory "+dirPath+"alredy exists");
        }

        File newFile = new File(dirPath+File.separator+fileName);
        boolean isFilecreated = newFile.createNewFile();
        if(isFilecreated){
            System.out.println("New File"+fileName+"created");
        }else{
            System.out.println("File"+fileName+"already exists");
        }
       File fileList[] =  newDir.listFiles();
       for(File f:fileList){
        System.out.println("File"+f.getPath()+":"+f.getCanonicalFile());
       }

     
      File file1;
      String mycontent = "This is my Data which needs" +
	     " to be written into the file";
      file1 = new File("./data/data.txt");
	  FileOutputStream fos = new FileOutputStream(file1);
      byte[] bytesArray = mycontent.getBytes();

	  fos.write(bytesArray);
	  fos.flush();
	  System.out.println("File Written Successfully");

      //writing number to file

      FileOutputStream foos = new FileOutputStream(newFile,true);
      for(int i=0;i<10;i++){
        char str[] = Integer.toString(i).toCharArray();
        fos.write(str[0]);
        fos.write('\n');
        fos.flush();

      }
      
      fos.close();
      foos.close();
}

}
