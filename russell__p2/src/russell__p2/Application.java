package russell__p2;

public class Application {
	   public static void main(String[] args) {
		   
	       String inFilename = "problem2.txt";
	       String outFilename = "unique_word_counts.txt";
	       
	       DuplicateCounter dC = new DuplicateCounter();
	       
	       dC.count(inFilename);
	       dC.write(outFilename);
	   }
	}
