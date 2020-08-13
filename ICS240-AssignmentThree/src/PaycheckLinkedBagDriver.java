
public class PaycheckLinkedBagDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paycheck p1 = new Paycheck("Keith Check 1", 450);
		Paycheck p2 = new Paycheck("Keith Check 1", 1350);
		Paycheck p3 = new Paycheck("Adam Check 1", 550);
		Paycheck p4 = new Paycheck("Adam Check 1", 1650);
		Paycheck p5 = new Paycheck("Test 2", 50);
		Paycheck p6 = new Paycheck("Test 1", 2350);
		Paycheck p7 = new Paycheck("Quack", 950);
		Paycheck p8 = new Paycheck("Doggy", 2222);
		
//		PaycheckNode tail = new PaycheckNode(p1,null);
//		PaycheckNode n2 = new PaycheckNode(p2,tail);
//		PaycheckNode head = new PaycheckNode(p3,n2);
//		PaycheckNode newHead = new PaycheckNode(p4,head);

		PaycheckNode newHead = new PaycheckNode(p4,null);

		PaycheckLinkedBag bag = new PaycheckLinkedBag(newHead);

		//THIS IS ALL PAYCHECK NODE
//		System.out.println("-----------PaycheckNode-----------------");
//		PaycheckNode cursor = newHead;
//		System.out.println(cursor.getData());
//		cursor.print(cursor);
//		System.out.println("\n\nlist length "+ PaycheckNode.listLength(cursor));	
//		System.out.println("\n\nAfter Add");
//		cursor.addNodeAfter(p5);
//		cursor.print(cursor);
//		System.out.println("\n\nAfter Remove");
//		cursor.removeNodeAfter(p4);
//		cursor.print(cursor);
//		System.out.println("display");
		

		System.out.println("-------------------BAG-----------------\n");
		System.out.println("ADDING:\n-------");
//		bag.display();
		bag.add(p1); //p1 to front - Keith Check 1 350
		bag.add(2,p5); //p5 to index 2 (3rd on list) [Test 2, 50]
		bag.add(3,p6); //p6 to index 3 (4rd on list) [Test 1, 2350]
		bag.addLast(p7); //p7 to last index (last on list) [Quack, 950]
		bag.display();
		System.out.println("\n\nChanged index 3 (3rd on the list) from [Test 2, 50] to [Doggy, 2222]");
		bag.set(3, p8);
		bag.display();
		

//		System.out.println("\n\nBAG INFO:\n---------");
//		System.out.println("bag size: "+bag.size());
//		System.out.println("Biggers check amount: " + bag.getMax());
//		System.out.println("All the money thats in the bag: " + bag.totalValue());
//		System.out.println("third object in the list: "+ bag.grab(2));
//		System.out.println("position of object p6: " + bag.positionOf(p6));
//		
//
//		System.out.println("\n\nREMOVING:\n---------");
//		System.out.println(bag.remove(p5));// removing ("Test 2", 50)
//		System.out.println(bag.remove(1));
//		bag.removeLast();
//		bag.display();
//		bag.display();
//		bag.addLast(p2);
//		bag.display();
//		bag.add(1,p1);
		

	}

}
