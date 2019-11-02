package russell__p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemover {

   private Set<String> uniqueWords;

   public DuplicateRemover() {

       uniqueWords = new HashSet<>();
   }

   public void remove(String dataFile) {

       try {
           Scanner scnr = new Scanner(new File(dataFile));

           while (scnr.hasNext()) {

               uniqueWords.add(scnr.next());
           }
           scnr.close();
           
       } 
       
       catch (FileNotFoundException except) {
           System.out.println("Caught IOException: " + except);
       }

   }

   public void write(String outputFile) {
       try {
           PrintWriter pt = new PrintWriter(new File(outputFile));

           for (String string : uniqueWords) {

               pt.println(string);
           }
           pt.flush();
           pt.close();
           
       } 
       
       catch (FileNotFoundException except) {
           System.out.println("Caught IOException: " + except);
       }
   }
}
