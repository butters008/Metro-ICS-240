
public class PaycheckSortedArrayBag {
	private int numPaychecks = 0; //initializing to 0 here for add function this should be more than Paycheck
	private Paycheck[] paycheck;

	public PaycheckSortedArrayBag(int numPaychecks) {
		this.paycheck = new Paycheck[numPaychecks];
	}
	
	public void add (String payName, int payAmount) {
		Paycheck compare = new Paycheck();
		Paycheck p1 = new Paycheck(payName, payAmount);
		System.out.println(p1.toString()); //delete this for final

		if(numPaychecks == 0) {
			paycheck[0] = p1;
			numPaychecks++;
			compare = p1;
		}
		else {
			for(int i = 0; i < numPaychecks; i++) {
				paycheck[i] = p1;
				//put if in there
			}
//			if (compare.compareTo(p1) == 1) {
//				compare = p1;
//			}
//			if (compare.compareTo(p1) == -1) {
//
//			}
			numPaychecks++;
		}
	}
	
	public int size() {
		int count = 0;
		for (int i=0; i<numPaychecks; i++) {
			count++;
			
		}
		return count;
	}
	
	public String toString() {
		String output = "";
		Paycheck temp;
		for (int i=0; i<numPaychecks; i++) {
			output += paycheck[i].toString();	
		}
		return output;
	}
	
	public void remove(Paycheck p1) {
		//its goes off of the equals in Paycheck class
		Paycheck tempArr[] = new Paycheck[paycheck.length];
		for(int i = 0; i < numPaychecks; i++) {
			if(paycheck[i] == p1) {
				System.out.println("found it");
			}
		}
	}
	

}//end of class
