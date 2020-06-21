import java.util.Scanner;

public class ArrayQuestion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] values = new double[100] ;
		Scanner scan = new Scanner(System.in);
		
		values = new double[] {0,1,2,3,4,5,6,7,8,9,
				10,11,12,13,14,15,16,17,18,19,
				20,21,22,23,24,25,26,27,28,29,
				30,31,32,33,34,35,36,37,38,39,
				40,41,42,43,44,45,46,47,48,49,
				50,51,52,53,54,55,56,57,58,59,
				60,61,62,63,64,65,66,67,68,69,
				70,71,72,73,74,75,76,77,78,79,
				80,81,82,83,84,85,86,87,88,89,
				90,91,92,93,94,95,96,97,98,99};
		
		//System.out.println(values[-1]);
		int x = 5/0;
		System.out.println(x);
		//Asking for the person to choose the index
		System.out.println("What index are you trying to look up?");
		double lookup = scan.nextInt();
		System.out.println("");//Clearing the cache thing from 141 I believe - could be wrong
		double total = 0;
		if (lookup <= 99) {
			for(int i = 0; i<lookup; i++) {
				//System.out.println(values[i]);
				total = values[i];
			}
			System.out.println(total);
		}
		else{
			System.out.println("You are out of bounds with search");
		}
	}

}