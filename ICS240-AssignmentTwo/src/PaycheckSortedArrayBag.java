
public class PaycheckSortedArrayBag {
	private int numPaychecks = 0; //initializing to 0 here for add function this should be more than Paycheck
	private Paycheck[] paycheck;
	
	//Putting this out here for now
	Paycheck compare = new Paycheck();
	
	public PaycheckSortedArrayBag(int numPaychecks) {
		this.paycheck = new Paycheck[numPaychecks];
	}
	
	public void add (String payName, int payAmount) {

		Paycheck p1 = new Paycheck(payName, payAmount);
		System.out.println(p1.toString()); //delete this for final

		if(numPaychecks == 0) {
			paycheck[0] = p1;
			numPaychecks++;
			compare = p1;		
			System.out.println("\nThis is the compare: " + compare.toString() + "\n"); //delete this for final
		}
		else {			
//			paycheck[numPaychecks] = p1;
//			numPaychecks++;
			
			if(compare.compareTo(p1) < 0) {
				System.out.println("In the IF\n");
				compare = p1;
				System.out.println("Compare object is now: " + compare);
				paycheck[numPaychecks] = p1;
				numPaychecks++;
			}
			else {
				System.out.println("In the ELSE\n");
				paycheck[numPaychecks] = p1;
				numPaychecks++;
			}
		
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
		String output = "The Array has: \n";
		for (int i=0; i<numPaychecks; i++) {
			output += paycheck[i] + " \n";
		}
		return output;
	}
	
	public int indexOf(Paycheck p1) {
		int indexNumber = 0;
		for(int i = 0; i < numPaychecks; i++) {
			if(paycheck[i].getCheckName() == p1.getCheckName()) {
				break;				
			}
			indexNumber++; //accidently works, since index actually starts at 0
		}
		return indexNumber;
	}
	
	public void remove(Paycheck p1) {
		Paycheck[] tempArr = new Paycheck[paycheck.length - 1];
		for(int i = 0, k = 0; i < numPaychecks; i++) {
			if(paycheck[i].getCheckName() == p1.getCheckName() && paycheck[i].getCheckAmount() == p1.getCheckAmount()) {
				continue;
			}
			else {
				tempArr[k++] = paycheck[i];
				
			}
		}
		paycheck = tempArr;
		return;
	}
	
	public int countOccurance(String name) {
		int indexNumber = 0;
		for(int i = 0; i < numPaychecks; i++) {
			if(paycheck[i].getCheckName() == name) {
				indexNumber++;				
			}
		}
		return indexNumber;
	}
	
	
	public String grab(int index) {
		String output = "";
		for(int i = 0; i < index; i++) {
			if(i == index) {
				output = paycheck[i].toString();
				System.out.println(output);
			}
		}
		return output;
	}
	

	public int total() {
		int total = 0;
		for(int i = 0; i < numPaychecks; i++) {
			if(paycheck[i] == null) {
				continue;
			}
			total += paycheck[i].getCheckAmount();
		}
		return total;
	}
	
	public void replace(Paycheck oldThing, Paycheck newThing) {
		for(int i = 0; i < numPaychecks; i++) {
			if(paycheck[i].getCheckName().equals(oldThing.getCheckName()) && paycheck[i].getCheckAmount() == oldThing.getCheckAmount()) {
				System.out.println("found it: " + paycheck[i]);
				paycheck[i] = newThing;
				System.out.println("changed it: " + paycheck[i]);
			}
		}
	}

	
	//My way to grab elements out of array
	public Paycheck grabElement(int index) {
		Paycheck output = null;
		for(int i = 0; i < index+1; i++) {
			if(i >= index) {
				output = paycheck[i];
			}
		}
		return output;
	}

	
	
	//TODO: Need to figure out the contents of this method
	public boolean sameContents(PaycheckSortedArrayBag bag) {
		boolean same = false;
		System.out.println(bag.size());
		System.out.println("________________________________________________");
		System.out.println("INSIDE METHOD BEFORE LOOP");
		//FOR LOOP 1
		for(int i = 0; i < numPaychecks; i++) {
			Paycheck toBeChecked = paycheck[i];
			//FOR LOOP 2 - WTF!!!!!
			for(int k = 0; k < bag.size(); k++) {
				System.out.println("BEFORE LOGIC");
				if(toBeChecked.equals(bag.grabElement(k))) {
					System.out.println(bag.grabElement(k).toString());
					System.out.println(paycheck[i]);
					same = true;
					System.out.println("IF " + same + "\n");
					break;

				}
				else 
				{
					same = false;
					System.out.println("ELSE " + same + "\n");
				}
			}//end of loop 2

		}//end of loop 1
		System.out.println("RETURN " + same);
		return same;
	}//END OF METHOD
	
}//end of class
