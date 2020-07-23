
public class IntNodeDriver {

	public static int max(IntNode cursor) {		
		int temp = -1;
		if(cursor != null) {
			temp = cursor.getData();
		}else{
			return temp;
		}
		
		while(cursor != null) {
			if (cursor.getData() > temp) {
				temp = cursor.getData();
			}
			cursor = cursor.getLink();
		}
		return temp;
	}
	
	public static void print(IntNode cursor) {
		while (cursor != null){
			System.out.print(cursor.getData() + " -> ");
			cursor = cursor.getLink();
		}
	}
	
	
	
	public static void main(String[] args) {

		IntNode tail = new IntNode(787,null);
		IntNode n2 = new IntNode(30,tail);
		IntNode head = new IntNode(5,n2);
		IntNode newHead = new IntNode(1093,head);

		int sum = 0;
		IntNode cursor = newHead;
		
		while (cursor!= null){
			sum = sum + cursor.getData();
			cursor = cursor.getLink();
		}
		
		System.out.println(sum);
		
		cursor = newHead;
		print(cursor);
		cursor = newHead;
		System.out.println("\nGoing to use the max: " + max(cursor));
	}

}
