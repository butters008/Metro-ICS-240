
public class Paycheck //implements Comparable <Paycheck> 
{
	private String checkName;
	private int checkAmount;
	
	public Paycheck() {
		this.checkName = "";
		this.checkAmount = 0;
	}
	
	public Paycheck(String checkName, int checkAmount) {
		this.checkName = checkName;
		this.checkAmount = checkAmount;
	}

	public String getCheckName() {
		return checkName;
	}

	public void setCheckName(String checkName) {
		this.checkName = checkName;
	}

	public int getCheckAmount() {
		return checkAmount;
	}

	public void setCheckAmount(int checkAmount) {
		this.checkAmount = checkAmount;
	}

	@Override
	public String toString() {
		return "Paycheck [checkName=" + checkName + ", checkAmount=" + checkAmount + "]";
	}
	
	public boolean equals(String s1) {
		if(this.getCheckName().equalsIgnoreCase(s1)) {
			return true;
		}
		return false;
	}
//	public boolean equals(Paycheck p1) {
//		if(this.getCheckName().equalsIgnoreCase(p1.getCheckName()) && this.getCheckAmount() == this.getCheckAmount()) {
//			return true;
//		}
//		
//		return false;
//	}
	
//	public int compareTo(Paycheck p1) {
//		if(this.getCheckName().equalsIgnoreCase(p1.getCheckName()) && this.getCheckAmount() == p1.getCheckAmount()) {
//			System.out.println(this.getCheckName() + " with " + this.getCheckAmount() +
//					" has the same as " + p1.getCheckName() + " with " + p1.getCheckAmount());
//			return 0;
//		}
//		//Comparing the amount first and then checking for name
//		else if(this.getCheckAmount() > p1.getCheckAmount()) {
//			String checkOg = this.getCheckName();
//			String checkP1 = p1.getCheckName();
//			
//			if(checkOg.compareTo(checkP1)) {
//				System.out.println(this.getCheckName() + " with " + this.getCheckAmount() +
//						" has less money than " + p1.getCheckName() + " with " + p1.getCheckAmount());
//				return 1;	
//			}
//			
//		else if(this.getCheckName().equalsIgnoreCase(p1.getCheckName()) || this.getCheckAmount() > p1.getCheckAmount()) {
//			System.out.println(this.getCheckName() + " with " + this.getCheckAmount() +
//					" has less money than " + p1.getCheckName() + " with " + p1.getCheckAmount());
//			return 1;
//		}
//		else {
//			return 2;
//		}
//	}
	
}
