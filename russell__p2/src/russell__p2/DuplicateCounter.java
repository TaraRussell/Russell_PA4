package russell__p2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter {
   private Map<String, Integer> wordCounter;
  
   public DuplicateCounter() {
       wordCounter = new HashMap<String,Integer>();
   }
  
   public void count(String dataFile) {
       
       Scanner infile = null;
       
       try {
           infile = new Scanner(new File(dataFile));
       } 
       
       catch (FileNotFoundException except) {
           System.out.println("IO Exception found: " + except.getMessage());
           return;
       }
       
       infile.useDelimiter("([0-9]|[.,!?:;'\"-]|\\s)+"); 
       
       while(infile.hasNext()) {
           String word = infile.next().toLowerCase();
           Integer count = wordCounter.get(word); 
           
           if(count == null)
               count = 1;
           else
               count = count + 1;
           wordCounter.put(word, count);
       }
       
       infile.close();
   }
  
   public void write(String outputFile){
       
       try {
           PrintWriter outfile = new PrintWriter(new File(outputFile));
           
           for (String k : wordCounter.keySet()) {
               outfile.println(k + " " + wordCounter.get(k));
           }
           
           outfile.close(); 
       } 
       
       catch (FileNotFoundException except) {
           System.out.println("IO Excpetion found: " + except.getMessage());
       }
   }
  
}
