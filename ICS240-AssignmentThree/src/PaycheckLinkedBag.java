
public class PaycheckLinkedBag {
	private PaycheckNode head;
	private int manyItems;
	
	public PaycheckLinkedBag() {}
	
	public int size() {
		int counter = 0;
		while(head != null) {
			counter++;
		}
		return counter;
	}
	
	public void display() {
		
	}

}
