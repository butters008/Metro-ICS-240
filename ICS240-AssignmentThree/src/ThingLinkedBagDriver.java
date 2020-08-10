
public class ThingLinkedBagDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Paycheck p1 = new Paycheck("Keith Check 1", 350);
		Paycheck p2 = new Paycheck("Keith Check 1", 1350);
		Paycheck p3 = new Paycheck("Adam Check 1", 350);
		Paycheck p4 = new Paycheck("Adam Check 1", 1350);
		Paycheck p5 = new Paycheck("Keith Check 1", 50);
		Paycheck p6 = new Paycheck("Keith Check 1", 350);

		System.out.println("Comparing p1 to p2 " + p1.compareTo(p2) + "\n");
		System.out.println("Comparing p1 to p5 " + p1.compareTo(p5) + "\n");
		System.out.println("Comparing p1 to p3 " + p1.compareTo(p3) + "\n");
		System.out.println("Comparing p3 to p4 " + p3.compareTo(p4) + "\n");
		System.out.println("Comparing p3 to p2 " + p3.compareTo(p2) + "\n");
		System.out.println("Comparing p3 to p2 " + p1.compareTo(p6) + "\n");


	}

}
