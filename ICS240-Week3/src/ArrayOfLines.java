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
		
		boolean found = false;
		Point p1 = new Point(0,0);
		for(int i = 0; i < lineArr.length; i++) {
			if(lineArr[i].getStart().equals(p1) || lineArr[i].getEnd().equals(p1)) {
				found = true;
				break;
			}	
		}
		
		System.out.println("Found it? " + found);
		
		
		//printing the array
		for (int i = 0; i < lineArr.length; i++) {
			System.out.println(lineArr[i]);
		}
	}
}