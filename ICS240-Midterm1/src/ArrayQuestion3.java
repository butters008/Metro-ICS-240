import java.util.Scanner;

public class ArrayQuestion3 {

	public static void main(String[] args) {
		int[] books = new int[20];
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("How many books do you want to enter?");
		int userInput = scan.nextInt();
		
		if (userInput<= 20) {
			//adding the values in array, also <= to make sure all values are added
			for (int i = 0; i <= userInput; i++) {
				books = new int[i]; //only adding 0 for some reason
			}
			//checking to see if the values where added in the loop or not
			for (int i = 0; i <= books.length; i++) {
				System.out.println(books[i] + " means in for " + "book " + i);
			}
		}
		else
		{
			System.out.println("You are out of bounds");
		}

	}

}