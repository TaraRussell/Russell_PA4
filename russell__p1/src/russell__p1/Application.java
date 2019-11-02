package russell__p1;

public class Application {

	   public static void main(String[] args) {
	      
	       DuplicateRemover dR = new DuplicateRemover();
	      
	       dR.remove("problem1.txt");
	       dR.write("unique_words.txt");
	      
	   }
	}