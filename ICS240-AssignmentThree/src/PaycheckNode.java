
public class PaycheckNode {
	private Paycheck data;
	private PaycheckNode link;
	
	public PaycheckNode(Paycheck initialData, PaycheckNode initialLink){
		this.data = initialData;
		this.link = initialLink;
	}
	
	public Paycheck getData() { return this.data;}
	public void setData(Paycheck data) { this.data = data;}
	
	public PaycheckNode getLink() {return this.link; }
	public void setLink(PaycheckNode link) { this.link = link; }
	
//	public void addNodeAfter(PaycheckNode afterNode, Paycheck object, PaycheckNode link) {
//		while(afterNode != null) {
//			data = new Paycheck(data, link);
//			System.out.println("found it");
//		}
//	}
	
	public void addNodeAfter(Paycheck object) {
		link = new PaycheckNode(object, link);
}

	public void removeNodeAfter(Paycheck object) {
		link = link.link;
	}
	
	public void print(PaycheckNode cursor) {
		while (cursor != null){
			System.out.print(cursor.getData() + " -> ");
			cursor = cursor.getLink();
		}
	}
	
}
