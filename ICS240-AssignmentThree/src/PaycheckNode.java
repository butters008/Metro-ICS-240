
public class PaycheckNode {
	private Paycheck data;
	private PaycheckNode link;
	
	public PaycheckNode(Paycheck initialData, PaycheckNode initialLink){
		this.data = initialData;
		this.link = initialLink;
	}
	
	public PaycheckNode() {
		this.data = null;
		this.link = null;
	}


	public Paycheck getData() { return this.data;}
	public void setData(Paycheck data) { this.data = data;}
	
	public PaycheckNode getLink() {return this.link; }
	public void setLink(PaycheckNode link) { this.link = link; }
	
	public void addNodeAfter(Paycheck object) {
		link = new PaycheckNode(object, link);
}

	public void removeNodeAfter(Paycheck object) {
		link = link.link;
	}
	
	//This is my display
	public void print(PaycheckNode cursor) {
		while (cursor != null){
			System.out.print(cursor.getData() + " -> ");
			cursor = cursor.getLink();
		}
	}
	
	public static int listLength(PaycheckNode head){
		PaycheckNode cursor = head;
		int answer = 0;
		
		while (cursor != null){
			answer++;
			cursor = cursor.link;
		}
		
		return answer;
	}
	
	

	public static PaycheckNode listSearch(PaycheckNode head, int target){
		PaycheckNode cursor = head;
		int counter = 0;
		
		while (cursor != null){
			if (counter == target) {
				return cursor;
			}
			else {
				cursor = cursor.getLink();
				counter++;
			}
		}
		return null;
	}
	
	public static PaycheckNode listPosition(PaycheckNode head, int position){
		PaycheckNode cursor = head;
		int index = 1;
		
		while (cursor != null && index < position){
			index++;
			cursor = cursor.getLink();
		}		
		return cursor;
	}
}
