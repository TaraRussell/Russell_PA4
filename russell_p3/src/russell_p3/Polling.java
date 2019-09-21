package russell_p3;

import java.util.Scanner;

public class Polling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
	
		
		String[] topics = {"School", "Family", "Career", "Hobbies", "Friends"}; // topics array
		
		int[][] ratings = new int[topics.length][]; // ratings array
		
		int a;
		int b;
		int people;
		int rating;
		
		// initializing arrays
		
		for (a = 0; a < ratings.length; a++) {
			
			ratings[a] = new int[10];
			
			for (b = 0; b < ratings[a].length; b++)
				ratings[a][b] = 0;
		}
		
		
		System.out.print("Enter the number of people rating the poll: ");
		
		people = scnr.nextInt();
		
		// loop allowing user to input rating for each topic
		
		for (a = 0; a < people; a++) {
			
			System.out.println("On a scale from 1 (least important) to 10 (most important), rate the following " + topics.length + " topics: ");
			
			for (b = 0; b < topics.length; b++) {
				
				System.out.print("Enter your rating for " + topics[b] + ": ");
				
				rating = scnr.nextInt();
				
				while (rating < 1 || rating > 10)
					
				{ 
					System.out.println("Invalid entry, rating should be between 1-10, inclusive");
					System.out.print("Enter your rating for " + topics[b] + ":");
					
					rating = scnr.nextInt();
	
				}
			
			ratings[b][rating - 1] ++; // incrementing the corresponding ratings
			
			
			}
			
		}
		
		int avgRating[] = new int[topics.length]; // creating array for the average rating
		
		String highestIssue = "", lowestIssue = "";
		
		int highestTotalPoints = 0;
		int lowestTotalPoints = 0;
		
		// creating a loop for the average rating and highest/lowest total points
		
		for (a = 0; a < ratings.length; a++) {
			
			avgRating[a] = 0;
			
			for (b = 0; b < ratings[a].length; b++)
				avgRating[a] += (ratings[a][b] * (b + 1));
			
			// initializing the variables for the first entry
			
			if (a == 0) { 
				
				highestTotalPoints = avgRating[a];
				lowestTotalPoints = avgRating[a];
				highestIssue = topics[a];
				lowestIssue = topics[a];
			
			}
			else {
				
				if (avgRating[a] > highestTotalPoints) {
					highestIssue = topics[a];
					highestTotalPoints = avgRating[a];
				}
				if (avgRating[a] < lowestTotalPoints) {
					lowestIssue = topics[a];
					lowestTotalPoints = avgRating[a];
				}
			}
			
			avgRating[a] = avgRating[a] / people;				
			
			
		}
		
		// outputting the topics and data in a tabular format
		
		System.out.printf("\n%-20s", "");
		
		for (a = 0; a < 10; a++)
			System.out.printf("%-10d",  (a + 1));
		
		System.out.printf("%20s", " Average Rating");
		System.out.println();
		
		for (a = 0; a < ratings.length; a++) {
			
			System.out.printf("\n%-20s", topics[a]);
			
			for (b = 0; b < ratings[a].length; b++)
				System.out.printf("%-10d",  ratings[a][b]);
			
			System.out.printf("%20d",  avgRating[a]);
			
		}
		
		
		// outputting the highest and lowest point totals
		
		System.out.println("\n\nThe " + highestIssue + " issue had the highest point total of " + highestTotalPoints);
		System.out.println("The " + lowestIssue + " issue had the lowest point total of " + lowestTotalPoints);
		
		scnr.close();
	
		
	}
}
