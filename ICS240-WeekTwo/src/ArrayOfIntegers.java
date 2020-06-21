import java.util.Scanner;

public class ArrayOfIntegers {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int SIZE = 5;
		int[] integerArr = new int[SIZE];
		
	
		for (int i = 0; i < integerArr.length; i++) {
			System.out.println("Enter integer #" + i);
			integerArr[i] = scan.nextInt();
		}
		
		int max = integerArr[0];
		int min = integerArr[0];
		int sum = 0, evens = 0, odds = 0;
		boolean containsFifty = false;
		
		for(int i = 0; i < integerArr.length; i++) {
			int lookup = integerArr[i];
			sum += lookup;
			
			if(lookup % 2 == 0) { //evens
				evens++;
			}else {
				odds++;
			}
			if(lookup > max) {
				max = lookup;
			}
			if(lookup < min) {
				max = lookup;
			}
			if(lookup == 50) {
				containsFifty = true;
			}
		}
		
		//printing the array
		for (int i = 0; i < integerArr.length; i++) {
			System.out.println(integerArr[i] + " ");
		}
		System.out.println("Max: " + max + "\nMin: " + min + "\nEvens" + evens);
		System.out.println("Odds: " + odds + "\nSum: " + sum + "\n50? " + containsFifty);
		System.out.println("Average: " + (double)sum / integerArr.length);
	}	
}