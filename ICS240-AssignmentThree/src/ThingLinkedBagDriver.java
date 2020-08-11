
public class ThingLinkedBagDriver {

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
	

	
	
	public static void main(String[] args) {
		
		Paycheck p1 = new Paycheck("Keith Check 1", 350);
		Paycheck p2 = new Paycheck("Keith Check 1", 1350);
		Paycheck p3 = new Paycheck("Adam Check 1", 350);
		Paycheck p4 = new Paycheck("Adam Check 1", 1350);
		Paycheck p5 = new Paycheck("Keith Check 1", 50);
		Paycheck p6 = new Paycheck("Keith Check 1", 350);
		
		PaycheckNode tail = new PaycheckNode(p1,null);
		PaycheckNode n2 = new PaycheckNode(p2,tail);
		PaycheckNode head = new PaycheckNode(p3,n2);
		PaycheckNode newHead = new PaycheckNode(p4,head);


		PaycheckNode cursor = newHead;
		System.out.println(cursor.getData());
		cursor.print(cursor);
		System.out.println("\n\nAfter Add");
		cursor.addNodeAfter(p5);
		cursor.print(cursor);
		System.out.println("\n\nAfter Remove");
		cursor.removeNodeAfter(p4);
		cursor.print(cursor);
		
		
	}

}
