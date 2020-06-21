import java.util.Scanner;

public class ArrayOfLines {
	
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		final int SIZE = 3;
		Line[] lineArr = new Line[SIZE];
	
		for (int i = 0; i < lineArr.length; i++) {
			System.out.println("Enter start-x of line #" + i);
			int startX = scan.nextInt();
			System.out.println("Enter start-y of line #" + i);
			int startY = scan.nextInt();
			System.out.println("Enter end-x of line #" + i);
			int endX = scan.nextInt();
			System.out.println("Enter end-y of line #" + i);
			int endY = scan.nextInt();
			lineArr[i] = new Line(startX, startY, endX, endY);
		}
		
		//Code I am working on
		//Had to initial vars, set to first line as a start point since there has to be one line
		//for this to program to run - if not, program will crash
		double max = lineArr[0].length();
		double min = lineArr[0].length();
		double sum = 0;
		int overFifty = 0;
		boolean anyZero = false;
		String maxPoints = "";
		Point checkZero =  new Point(0,0);
				
		for(int i = 0; i < lineArr.length; i++) {
			sum += lineArr[i].length();
			System.out.println(lineArr[i].length());
			
			//Checking for the longest line and storing the point values
			if(lineArr[i].length() > max) {
				max = lineArr[i].length();
				maxPoints = lineArr[i].printPoints();
				
			}
			//Checking for the smallest line
			if(lineArr[i].length() < min) {
				min = lineArr[i].length();
			}
			//Checking to see if the line is greater than 50
			if(lineArr[i].length() > 50) {
				overFifty++;
			}
			//Checking for starting or ending point of 0,0
			if(lineArr[i].getStart().equals(checkZero) || lineArr[i].getEnd().equals(checkZero)) {
				anyZero = true;
			}
			
		}
		
		//printing the array
		for (int i = 0; i < lineArr.length; i++) {
			System.out.println(lineArr[i]);
		}
		System.out.println("");
		System.out.println("Longest Line: " + max + "\nSmallest Line: " + min);
		System.out.println("The starting and end points of the longest line " + max + " are "  + maxPoints);
		System.out.println("Average length of line: " + sum / lineArr.length);
		System.out.println("Lines that are over 50: " + overFifty);
		System.out.println("Any Zeros: " + anyZero);
		
		
	}
}