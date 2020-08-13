
public class PaycheckLinkedBag {
	private PaycheckNode head;
	private int manyItems;
	
	public PaycheckLinkedBag(PaycheckNode head) {
		this.head = head;
		manyItems++;
	}
	
	public int size() {
		return manyItems;
	}
	
	public void display() {
		PaycheckNode cursor = head;
		while (cursor != null){
			System.out.print(cursor.getData() + " -> ");
			cursor = cursor.getLink();
		}
	}
	
	public void add (Paycheck object) {
		PaycheckNode cursor = head;
		PaycheckNode newNode = new PaycheckNode();
		newNode.setData(object);
		newNode.setLink(cursor);
		head = newNode;
		manyItems++;
	}
	
	public void add (int position, Paycheck node) {
		PaycheckNode cursor = head;
		PaycheckNode newNode = new PaycheckNode(); 
		int counter = 0;

		while (cursor != null){
			counter++;
			if (counter == position) {
				newNode.setData(node);
				cursor.setLink(newNode);
				manyItems++;
				break;
			}
			else {
				cursor = cursor.getLink();
			}
		}
	}
	
	public void addLast (Paycheck node) {
		PaycheckNode cursor = head;
		PaycheckNode temp = new PaycheckNode();
		PaycheckNode newNode = new PaycheckNode(node, null); 	
		
		while (cursor != null){
			temp = cursor;
			cursor = cursor.getLink();
			if(cursor == null) {
				temp.setLink(newNode);				
			}
		}
		manyItems++;
	}
	 
	public boolean remove(Paycheck node) {
		PaycheckNode cursor = head;
		PaycheckNode temp = new PaycheckNode();
		boolean gone = false;
		
		while (cursor != null){
			if(cursor.getData().equals(node)) {
				cursor = cursor.getLink();
				temp.setLink(cursor);
				cursor = temp;
				manyItems--;
				gone = true;
			}
			else{
				temp = cursor;
				cursor = cursor.getLink();			
			}
		}
		return gone;
	}
	
	public boolean remove(int position) {
		PaycheckNode cursor = head;
		PaycheckNode temp = new PaycheckNode();
		int counter = 0;
		boolean gone = false;
		
		while (cursor != null){		
			if (counter == position) {
				cursor = cursor.getLink();
				temp.setLink(cursor);
				cursor = temp;
				manyItems--;
				gone = true;
				counter++;
			}
			else {
				temp = cursor;
				cursor = cursor.getLink();
				counter++;
			}
		}
		return gone;
	}
	
	//TODO:
	public void removeLast() {
		PaycheckNode cursor = head;
		System.out.println(manyItems);
		System.out.println(head.getData());
		while(cursor != null ) {
			System.out.println(cursor.getData());
			cursor = cursor.getLink();
			if (cursor.getLink() != null) {
				if (cursor.getLink().getLink() == null) {
					cursor.setLink(null);
					return;
				}
			}
		}
	}
	
	public Paycheck grab(int position) {
		PaycheckNode cursor = head;
		int counter = 0;
		
		while(cursor != null) {
			if (counter == position) {
				return cursor.getData();
			}else {
				counter++;
				cursor = cursor.getLink();
			}
		}
		return cursor.getData();
	}
	
	public int positionOf(Paycheck node) {
		int counter = 0;
		PaycheckNode cursor = head;
		
		while(cursor != null) {
			if(cursor.getData().getPaycheckName().equals(node.getPaycheckName()) &&
					cursor.getData().getPaycheckAmount() == node.getPaycheckAmount()) {
				return counter;
			}
			else {
				counter++;
				cursor = cursor.getLink();
			}
		}
		
		return counter;	
	}
	
	public void set(int position, Paycheck node) {
		PaycheckNode cursor = head;
		int counter = 0;

		while (cursor != null){
			counter++;
			if (counter == position) {
				cursor.setData(node);
				return;
			}
			else {
				cursor = cursor.getLink();
			}
		}
		
	}
	
	public int totalValue() {
		PaycheckNode cursor = head;
		int total = 0;
		
		while(cursor != null) {
			total += cursor.getData().getPaycheckAmount();
			cursor = cursor.getLink();
		}
		return total;
	}
	
	public Paycheck getMax() {
		PaycheckNode cursor = head;
		Paycheck temp = new Paycheck();
		PaycheckNode compare = head; //just to get this working - I know it forgien but for right now 
		
		if(cursor != null) {
			temp = cursor.getData();
		}else{
			return temp;
		}
		while(cursor != null) {
			if (cursor.getData().getPaycheckAmount() > compare.getData().getPaycheckAmount()) {
				temp = cursor.getData();
			}
			cursor = cursor.getLink();
		}
		return temp;
		
	}
}
