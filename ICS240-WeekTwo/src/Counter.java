import java.util.Arrays;

public class Counter {
	private String id;
	private int count;
	
	public Counter() { }
	
	public Counter(String id, int count) {
		this.id = id;
		this.count = count;
	}
	
	public void increment() {
		count++;
	}
	
	public int tally() {
		return count;
	}
	
	public String toString() {
		return id + " : " + count;
	}
	
	public static String maximum(Counter c1, Counter c2) {
		int count1 = c1.tally();
		int count2 = c2.tally();
		if(count1 > count2) {
			return c1.id;
		}
		else if(count2 > count1) {
			return c2.id;
		}

		return "No Maximum";
	}
	
	public static void main(String args[]) {
		Counter heads = new Counter("heads", 0);
		Counter tails = new Counter("tails", 0);

		
		for(int i = 0; i < 100; i++) {
			int randomVal = (int) (Math.random() * 100);
			
			if(randomVal % 2 == 0) { // even
				heads.increment();
			}
			else { // odd
				tails.increment();
			}
		}
		
		System.out.println(heads);
		System.out.println(tails);
		
		System.out.println(maximum(heads, tails));
		
		int[] arr = {1,2,3,4,5};
		
		int[] arr2 = Arrays.copyOf(arr, 1);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
}
